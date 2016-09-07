/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.miles.string;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author siech
 */
public class RandomString {

    public static void main(String[] args) {
        int shortest = 10;
        int i = 0;
//        while (i++ < 100000000) {
//            int shorterLength = generateRandomPhoneNumber(1).length();
//            if (shorterLength < shortest) {
//                shortest = shorterLength;
//            }
//            System.out.println("Length is: " + shorterLength);
//        }
        System.out.println("Shortest length generated was: " + shortest);
    }

    private static String generateRandomPhoneNumber(int id) {
        String reversedTime = new StringBuilder(String.valueOf(new Date().getTime())).reverse().toString();
        Random random = new Random();
        String randomPhoneNumber = "0" + "7" + id + reversedTime.substring(random.nextInt(3), random.nextInt(7) + 7) + random.nextInt(id) + random.nextInt(id);

        return randomPhoneNumber.length() > 11 ? randomPhoneNumber.substring(0, 11) : randomPhoneNumber;
    }

}
