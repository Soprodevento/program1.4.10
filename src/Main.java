//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(isWeekend("Monday"));
    }

    public static boolean isWeekend(String weekday) {
        switch (weekday) {
            case "Saturday":
                return true;
            case "Sunday":
                return true;
            default:
                return false;
        }
    }
}