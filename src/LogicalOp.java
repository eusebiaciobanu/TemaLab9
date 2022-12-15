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
        if (text.equals("FastTrackIT") && number <= 3) {
            return text + " " + number;
        } else if (!text.equals("FastTrackIT") && number >= 4) {
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
        } else if (i == 4) {
            return "The number is equal to 4";
        } else if (i < 3) {
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
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else {
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
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }

    public void printOddNumbers() {
        for (int i = 1; i <= 100; i = i + 2) {
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

        for (int i = number; i <= 100; i++) {
            sum = sum + i;
        }

        int countNumbers = 100 - number + 1;

        return (float) sum / countNumbers;
    }

    public void printAsterisk(int numberOfLines) {
        for (int i = numberOfLines; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }

    public void printFromNumberTo100WithWhile(int number) {
        int i = number;

        while (i <= 100) {
            System.out.println(i);

            i++;
        }
    }

    public void printFromNumberToMinus100WithWhile(int number) {
        int i = number;

        while (i >= -100) {
            System.out.println(i);

            i--;
        }
    }

    public void printForNumberToNumberWithWhile(int x, int y) {
        int i = x;

        while (i <= y) {
            System.out.println(i);
            i++;
        }
    }

    public void printForNumberToNumberWithWhileIntelligent(int x, int y) {
        int i = x;
        int last = y;

        if (x > y) {
            i = y;
            last = x;
        }

        while (i <= last) {
            System.out.println(i);
            i++;
        }
    }

    public void printEvenNumbersFromOneToOneHundred() {
        int number = 2;
        while (number <= 100) {
            System.out.println(number);

            number += 2;
        }
    }

    public void printOddNumbersFromOneToHundred() {
        int number = 1;
        while (number <= 99) {
            System.out.println(number);

            number += 2;
        }
    }

    public void printAverageSumFromInterval(int start, int end) {
        int count = end - start + 1;

        int sum = 0;

        int i = start;

        while (i <= end) {
            sum += i;

            i++;
        }

        System.out.println("Suma este:" + sum);

        System.out.println("Media este:" + (float) sum / count);
    }

    public float getAverageOfNumberInRageDivisibleBySeven(int first, int second) {
        int count = second - first + 1;

        int sum = 0;
        int i = first;
        while (i <= second) {
            if (i % 7 == 0) {
                sum += i;
            }
            i++;
        }
        return (float) sum / count;
    }

    public void printFibonacciNumbers(int count) {
        int a = 0;
        int b = 1;

        int sum = 0;

        System.out.println(a);
        System.out.println(b);

        int i = 3;
        while (i <= count) {
            sum = a + b;

            System.out.println(sum);

            a = b;
            b = sum;

            i++;
        }
    }

    public void getprintCozaLozaWoza() {
        int number = 1;
        while (number <= 110) {
            if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
                System.out.print("CozaLozaWoza");
            } else if (number % 5 == 0 && number % 7 == 0) {
                System.out.print("WozaLoza");
            } else if (number % 3 == 0 && number % 7 == 0) {
                System.out.print("CozaWoza");
            } else if (number % 3 == 0 && number % 5 == 0) {
                System.out.print("CozaLoza");
            } else if (number % 7 == 0) {
                System.out.print("Woza");
            } else if (number % 5 == 0) {
                System.out.print("Loza");
            } else if (number % 3 == 0) {
                System.out.print("Coza");
            } else {
                System.out.print(number);
            }

            System.out.print(" ");

            if (number % 11 == 0) {
                System.out.println();
            }
            number += 1;
        }
    }

    public void printGenerateArray() {
        int[] array = new int[100];

        for (int i = 1; i <= 100; i++) {
            array[i - 1] = i;

            System.out.println(array[i - 1]);
        }
    }

    public int[] printEvenNumbersWithArray() {
        int[] array = new int[50];

        int poz = 0;
        for (int i = 2; i <= 100; i += 2) {
            array[poz] = i;

            poz++;
        }

        return array;
    }

    public float getArrayAverage(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return (float) sum / numbers.length;
    }

    public boolean checkElemInArray(String[] array, String search) {
        for (String value : array) {
            if (search == value) {
                return true;
            }
        }

        return false;
    }

    public int getPositionInArray(int[] Numbers, int number) {
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == number) {
                return i;
            }
        }

        return 0;
    }

    public void getGridDisplay() {
        char[] data = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'};

        for (int i = 1; i <= 10; i++) {
            for (char elem : data) {
                System.out.print(elem);
            }

            System.out.println();
        }
    }

    public int[] getArrayWithoutNumber(int[] Numbers, int number) {
        int[] helpNumbers = new int[Numbers.length];

        int poz = 0;
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] != number) {
                helpNumbers[poz++] = Numbers[i];
            }
        }

        int[] newNumbers = new int[poz];

        for (int i = 0; i < poz; i++) {
            newNumbers[i] = helpNumbers[i];
        }

        return newNumbers;
    }

    public int getSecondMinimNumber(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (secondMin > numbers[i] && numbers[i] > min) {
                secondMin = numbers[i];
            }
        }

        return secondMin;
    }


    public void copyArrayInArray(int[] first, int[] second) {

        for (int i = 0; i < first.length; i++) {
            second[i] = first[i];
        }

        for (int i = 0; i < second.length; i++) {
            System.out.println(second[i]);
        }
    }
}
