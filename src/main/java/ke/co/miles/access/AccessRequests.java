/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.miles.access;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Ben Siech
 */
public class AccessRequests implements ClipboardOwner {

    /**
     * @param args the command line arguments
     * @throws java.security.NoSuchAlgorithmException
     */
    public static void main(String[] args) throws NoSuchAlgorithmException {

        String randomPassword = generateRandomPassword();
        LOGGER.log(Level.INFO, "Random password: {0}\n", new Object[]{randomPassword});
        StringSelection stringSelection = new StringSelection(randomPassword);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println("Password encrypted using BCryptPasswordEncoder is: "
                + encoder.encode(randomPassword));

//        LOGGER.log(Level.INFO, "Password: {0}", new Object[]{addCredentials("0723144351").getPassword()});
//        LOGGER.log(Level.INFO, "Hashed password: {0}", new Object[]{addCredentials("0723144351").getHashedPassword()});
//        LOGGER.log(Level.INFO, "Hashed password: {0}", new Object[]{generateSaltedSHAPassword("21247837841").getHashedPassword()});
    }

    public static AccessCredentials addCredentials(String username) throws NoSuchAlgorithmException {

        //Generate the password
        String password = generateRandomPassword();

        //Hash the password
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        String hashedPassword = generateSHAPassword(md, password);

        //Create and populate the access credential data
        AccessCredentials credentials = new AccessCredentials();
        credentials.setUsername(username);
        credentials.setPassword(password);
        credentials.setHashedPassword(hashedPassword);

        //Return
        return credentials;

    }

    /**
     * Generate a random String suitable for use as a temporary password.
     *
     * @return String suitable for use as a temporary password
     */
    private static String generateRandomPassword() {

        // Pick from some letters that won't be easily mistaken for each
        // other. So, for example, omit o O and 0, 1 l and L, s S and 5.
        String letters = "abcdefghjkmnpqrtuvwxyzABCDEFGHJKMNPQRTUVWXYZ2346789+@";

        String pw = "";
        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int index = (int) (new Random().nextDouble() * letters.length());
            pw += letters.substring(index, index + 1);
        }
        return pw;
    }

    private static String generateSaltedSHAPassword(MessageDigest md, String password, String salt) {
        String generatedPassword;
        md.update(salt.getBytes());
        byte[] bytes = md.digest(password.getBytes());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        generatedPassword = sb.toString();
        return generatedPassword;
    }

    public static String generateSHAPassword(MessageDigest md, String password) {
        md.update(password.getBytes());
        byte byteData[] = md.digest();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        //Return
        return sb.toString();
    }

    private String generateSalt() throws NoSuchAlgorithmException {

        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[16];
        sr.nextBytes(salt);
        return Arrays.toString(salt);
    }

    private static final int PASSWORD_LENGTH = 8;
    private static final Logger LOGGER = Logger.getLogger(AccessRequests.class.getName());

    @Override
    public void lostOwnership(Clipboard clipboard, Transferable contents) {
    }

}
