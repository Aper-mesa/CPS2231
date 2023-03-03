package edu.wku.validkeanemail;

public class ValidKeanEmail {
    public static int isValidKeanEmail(String address) {
<<<<<<< Updated upstream
        if (address.matches("([a-zA-Z\\d]+)(.[a-zA-Z\\d]+)*@kean.edu")) return 2;
        if (address.matches("([a-zA-Z\\d]+)(.[a-zA-Z\\d]+)*@([a-zA-Z\\d]+)(.[a-zA-Z\\d]+)*")) return 1;
=======
        if (address.matches("([a-zA-Z\\d]+)(.[a-zA-Z\\d]+)?@kean.edu") && address.length() >= 16 && address.length() <= 32)
            return 2;
        if (address.matches("([a-zA-Z\\d]+)(.[a-zA-Z\\d]+)?@([a-zA-Z\\d]+)(.[a-zA-Z\\d]+)?")) return 1;
>>>>>>> Stashed changes
        return -1;
    }
}
