package edu.wku.workingday;

public class WorkingDay {
    public static String isWorkingDay(int initDayOfWeek, int dayNum) {
        if (!(initDayOfWeek + "").matches("[0-6]") && !(dayNum + "").matches("[1-30]"))
            return "Incorrect Initial Day of Week";
        if (!(initDayOfWeek + "").matches("[0-6]")) return "Incorrect Initial Day of Week";
        if (!(dayNum + "").matches("[1-30]")) return "Incorrect Day of Month";
        if ((initDayOfWeek + dayNum % 7 - 1) % 7 == 0 || (initDayOfWeek + dayNum % 7 - 1) % 7 == 6)
            return "Non-working Day";
        return "Working Day";
    }
}
