import java.util.Scanner;

public class EnumMain {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Укажите день для расчета оставшихся рабочих часов: ");
        String userAnswer = sc.nextLine();
        if (userAnswer.equals("Monday")) {
            System.out.println("Рабочих часов на этой неделе осталось: " + WorkingDays.Monday.getWorkingHours());

        }
        if (userAnswer.equals("Tuesday")) {
            System.out.println("Рабочих часов на этой неделе осталось: " + WorkingDays.Tuesday.getWorkingHours());

        }
        if (userAnswer.equals("Wednesday")) {
            System.out.println("Рабочих часов на этой неделе осталось: " + WorkingDays.Wednesday.getWorkingHours());

        }
        if (userAnswer.equals("Thursday")) {
            System.out.println("Рабочих часов на этой неделе осталось: " + WorkingDays.Thursday.getWorkingHours());

        }
        if (userAnswer.equals("Friday")) {
            System.out.println("Рабочих часов на этой неделе осталось: " + WorkingDays.Friday.getWorkingHours());

        }
        if (userAnswer.equals("Saturday")) {
            System.out.println("Рабочих часов на этой неделе осталось: " + WorkingDays.Saturday.getWorkingHours() + " Сегодня выходной");

        }
        if (userAnswer.equals("Sunday")) {
            System.out.println("Рабочих часов на этой неделе осталось: " + WorkingDays.Sunday.getWorkingHours() + " Сегодня выходной");

        }
    }
}
