package com.softspark.hospital.validation;

/**
 *
 * @author abdo_(O_o)
 */
public class Validation {

    public static boolean isEmpty(String... text) { //check if textfield is empty from type text
        for (String s : text) {
            if (s.isEmpty()) {
                return true;
            }
        }
        return false;
    }
//V_L_P

    public static boolean isEmpty(int... value) {  //check if textfield is empty from type number
//check if textfield is empty for integer value 
        for (int i : value) {
            if (i < 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDigit(String... text) {      //method check if text contains number or not

        for (String s : text) {
            if (!s.matches("[0-9]+")) {               //+means more than one number (regex hadoop)
                return false;
            }
        }
        return true;
    }
        public static boolean isText(String... text) {      //method check if text contains literal or not

        for (String s : text) {
            if (!s.matches("[a-z]+")) {               //+means more than one char (regex hadoop)
                return false;
            }
        }
        return true;
    }
}
