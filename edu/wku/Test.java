package edu.wku;

import edu.wku.computemode.ComputeMode;
import edu.wku.validkeanemail.ValidKeanEmail;

public class Test {
    public static void main(String[] args) {
        System.out.println(ValidKeanEmail.isValidKeanEmail("zoush@kean.edu"));
        System.out.println(ValidKeanEmail.isValidKeanEmail("zoush12345@kean.edu"));
        System.out.println(ValidKeanEmail.isValidKeanEmail("1235425@kean.edu.cn"));
        System.out.println(ValidKeanEmail.isValidKeanEmail("1235425@kean.edu.cn.wku"));
        System.out.println(ValidKeanEmail.isValidKeanEmail("1.2.3.5.4.2.5@kean.edu.cn.wku"));
    }
}
