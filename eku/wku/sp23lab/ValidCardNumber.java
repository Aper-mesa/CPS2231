package eku.wku.sp23lab;

public class ValidCardNumber {
    public static boolean isValidCard(long number) {
        String str = number + "";
        if (!(str.startsWith("4") || str.startsWith("5") || str.startsWith("37") || str.startsWith("6"))) return false;
        String strR = new StringBuilder(str).reverse().toString();
        int sum1 = 0;
        for (int i = 0; i < strR.length(); i++) {
            int digit = Integer.parseInt(strR.substring(i, i++ + 1)) * 2;
            if (digit > 9) digit = digit % 10 + digit / 10;
            sum1 += digit;
        }
        System.out.println(sum1);
        return true;
    }
}
