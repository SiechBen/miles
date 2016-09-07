/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.miles.generator;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author siech
 */
public class Generator {

    public static String generateRandomPhoneNumber(Integer id) {

        String reversedTime = new StringBuilder(String.valueOf(new Date().getTime())).reverse().toString();
        Random random = new Random();
        String randomPhoneNumber = id + reversedTime.substring(random.nextInt(3), random.nextInt(4) + 3) + random.nextInt(id);

        return randomPhoneNumber;
    }

}
