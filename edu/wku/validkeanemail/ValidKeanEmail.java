package edu.wku.validkeanemail;

public class ValidKeanEmail {
    public static int isValidKeanEmail (String address) {
        //先判断美肯邮箱格式，再判断邮箱格式
        if(address.matches("([\\d+a-zA-Z])")) return 2;
        if(address.matches("")) return 1;
        return -1;
    }
}
