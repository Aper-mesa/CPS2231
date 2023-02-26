package edu.wku.arknights;

public class Arknights {
    public static boolean isSecure(int[] monsters) {
        for (int monster : monsters) {
            for (int i = 1; i < monsters.length; i++) {
                if (monsters[i] == monster * -1) return false;
            }
        }
        return true;
    }
}
