//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    System.out.println(isWeekend("Saturday"));
    }

    public static boolean isWeekend(String weekday) {
        switch (weekday) {
            case "Monday":
                return false;
            case "Tuesday":
                return false;
            case "Wednesday":
                return false;
            case "Thursday":
                return false;
            case "Friday":
                return false;
            case "Saturday":
                return true;
            case "Sunday":
                return true;
            default:
                return false;
        }
    }
}