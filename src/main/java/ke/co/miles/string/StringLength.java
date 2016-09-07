/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.miles.string;

import javax.swing.JOptionPane;

/**
 *
 * @author siech
 */
public class StringLength {

    public static void main(String[] args) {
        int length = JOptionPane.showInputDialog("Enter string").length();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Length of string is ").append(String.valueOf(length));
        JOptionPane.showMessageDialog(null, String.valueOf(stringBuilder));

    }
}
