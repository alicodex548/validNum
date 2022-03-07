package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println(validnum("6"));
    }

    public static String validnum(String num) {
        boolean valid = true;
        int z = 0;
        for (int i = 0;i < num.length();i++) {
            if (num.charAt(i) == '-' || num.charAt(i) == '+') {
                z++;
            }
        }
        for (char a = 'a'; a <= 'z'; a++){
            if (num.toLowerCase().contains(String.valueOf(a)) || z >= 2) {
                valid = false;
            }
            if (valid) {
                return num + " is a valid number";
            }else {
                return num + " is not a valid number";
            }
        }
        return num;
    }
}
