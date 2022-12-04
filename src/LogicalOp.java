public class LogicalOp {
    public int getBiggestNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String checkFastTractIt(String value) {
        if (value.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String checkFastTractItAndNumber(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3){
            return text + " " + number;
        } else if(!text.equals("FastTrackIT") && number >= 4)
        {
            return number + " " + text;
        }

        return "not available";
    }

    public String snowForecast(int i) {
        if (i > 8 || i == 6) {
            return "The amount of snow this winter was(cm):" + i;
        } else {
            return "The forecast snow is(cm):" + i;
        }
    }

    public String compareWithThreeAndFour(int i) {
        if (i > 3 && i != 4) {
            return "The number is greater than 3 and not equal to 4";
        }
        else if (i == 4) {
            return "The number is equal to 4";
        }
        else if (i < 3) {
            return "The number is lower than 3";
        } else {
            return "not available";
        }
    }

    public boolean isNumberEven(int i) {
        return i % 2 == 0;
    }

    public boolean isEligibleToVote(int i) {
        return i >= 18;
    }

    public int biggestNumber(int x, int y, int z) {
        if (x>y && x>z) {
            return x;
        }
        else if (y>x && y>z) {
            return y;
        }
        else
        {
            return z;
        }
    }

    public void printFromNumberTo100(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void printFromNumberToMinus100(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void printFromNumberToNumber(int number1, int number2) {
        for (int i = number1; i <= number2; i++) {
            System.out.println(i);
        }
    }

    public void printFromNumberToNumberIntelligent(int number1, int number2) {
        // invert numbers
        if (number1 > number2) {
            int aux = number1;
            number1 = number2;
            number2 = aux;
        }

        for (int i = number1; i <= number2; i++) {
            System.out.println(i);
        }
    }

    public void printEvenNumbers() {
        for (int i = 2; i <= 100; i=i+2) {
            System.out.println(i);
        }
    }

    public void printOddNumbers() {
        for (int i = 1; i <= 100; i=i+2) {
            System.out.println(i);
        }
    }

    public int printSumInRange(int number) {
        int sum = 0;

        for (int i = number; i <= 100; i = i + 1) {
            sum = sum + i;
        }

        return sum;
    }

    public float printAverageInRange(int number) {
        int sum = 0;

        for(int i= number; i <= 100; i++) {
            sum = sum+i;
        }

        int countNumbers = 100 - number + 1;

        return (float) sum / countNumbers ;
    }

    public void printAsterisk (int numberOfLines){
        for (int i = numberOfLines; i >= 1; i-- ) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}
