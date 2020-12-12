public class NumbersOutput {

    public static void writeNumbers() {
        int rowCounter = 0;

        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 0) {
                rowCounter++;
                System.out.print(i + " ");

                if (rowCounter == 10) {
                    System.out.println("");
                    rowCounter = 0;
                }
            }
        }
    }
}
