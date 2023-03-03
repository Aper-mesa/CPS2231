package edu.wku.validkeanemail;

public class ValidKeanEmail {
    public static int isValidKeanEmail(String address) {
        if (address.matches("([a-zA-Z\\d]+)(.[a-zA-Z\\d]+)*@kean.edu")) return 2;
        if (address.matches("([a-zA-Z\\d]+)(.[a-zA-Z\\d]+)*@([a-zA-Z\\d]+)(.[a-zA-Z\\d]+)*")) return 1;
        return -1;
    }
}
