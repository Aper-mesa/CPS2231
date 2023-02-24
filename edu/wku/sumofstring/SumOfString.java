package edu.wku.sumofstring;

public class SumOfString {
    public static int sumOfString(String orgText) {
        if (orgText.matches("\\D+")) return -1;
        int sum = 0;
        for (int i = 0; i < orgText.length(); i++)
            if (orgText.substring(i, i + 1).matches("\\d")) sum += Integer.parseInt(orgText.substring(i, i + 1));
        return sum;
    }
}
