import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isContinue = true;
        try (Scanner scanner = new Scanner(System.in)) {
            while (isContinue) {
                System.out.println("\n1 - Week days");
                System.out.println("2 - Seasons detector");
                System.out.println("3 - Output numbers");
                System.out.println("4 - Sequence of numbers");
                System.out.println("0 - Exit");

                System.out.print("Choose variant of tasks: ");
                int taskNumber = scanner.nextInt();

                switch (taskNumber) {
                    case 1: {
                        System.out.print("Input number of the day [1-7]: ");
                        System.out.println(WeekDay.getDayByNumber(scanner.nextInt()));
                        break;
                    }
                    case 2: {
                        System.out.print("Input number of the month [1-12]: ");
                        System.out.println(Season.getSeasonOfTheYear(scanner.nextInt()));
                        break;
                    }
                    case 3: {
                        System.out.println("Even numbers from 100 to 0:");
                        NumbersOutput.writeNumbers();
                        break;
                    }
                    case 4: {
                        System.out.println("Sequence of numbers 0,-5,-10,-15...");
                        NumberSequence.writeSequence();
                        break;
                    }
                    case 0: {
                        isContinue = false;
                        break;
                    }
                    default: {
                        System.out.println("Incorrect input! Try again.");
                    }
                }
            }
        }
    }
}
