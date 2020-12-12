public class NumberSequence {

    public static void writeSequence() {
        int counter = 0;
        int number = 0;

        do {
            System.out.print(number + " ");
            number -= 5;
            counter++;
        }
        while(counter < 10);
    }
}
