import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("--- Exercitiu #1 ---");

        exercitiuTemaVeche1();
        exercitiuTemaVeche2(10, 15);
        exercitiuTemaVeche3(10, 3);
        exercitiuTemaVeche4a();
        exercitiuTemaVeche4b();
        exercitiuTemaVeche4c();
        exercitiuTemaVeche4d();

        System.out.println("--- Exercitiu #2 ---");

        System.out.println("Rezultatul adunarii este: " + calculator.sum(2, 3.4f));
        System.out.println("Rezultatul scaderii este: " + calculator.substract(2.5f, 3));
        System.out.println("Rezultatul inmultirii este: " + calculator.multiplicate(4f, 3));
        System.out.println("Rezultatul impartirii este: " + calculator.division(6, 3));

        System.out.println("--- Exercitiu #3 ---");

        exercitiu3();

        System.out.println("--- Exercitiu #4 ---");

        System.out.println("Rezultatul mediei aritmetice este: " + exercitiu4(2, 7, 5));

        System.out.println("--- Exercitiu #5 ---");

        exercitiu5();

        System.out.println("--- Exercitiu #6 ---");

        System.out.println("Restul impartirii este: " + calculator.divisionReminder(4, 3));

        System.out.println("--- Exercitiu #7 ---");

        System.out.println("Restul conversiei este: " + calculator.convertFahrenheitToCelsius(77));

        System.out.println("--- Exercitiu #8 ---");

        System.out.println("Restul conversiei este: " + calculator.convertInchToMeter(7));

        System.out.println("--- Exercitiu #9 ---");

        printSpeed(180_000, 2, 30, 15);

        LogicalOp op = new LogicalOp();

        System.out.println("The biggest number is: " + op.getBiggestNumber(2, 3));

        System.out.println("FastTrackIt valid: " + op.checkFastTractIt("FastTrackIT"));
        System.out.println("FastTrackIt invalid: " + op.checkFastTractIt("random"));

        System.out.println("FastTrackIt and number: " + op.checkFastTractItAndNumber("FastTrackIT", 3));
        System.out.println("FastTrackIt and number: " + op.checkFastTractItAndNumber("random", 10));
        System.out.println("FastTrackIt and number: " + op.checkFastTractItAndNumber("FastTrackIT", 5));
        System.out.println("FastTrackIt and number: " + op.checkFastTractItAndNumber("random", 2));

        System.out.println("SnowForecast: " + op.snowForecast(10));
        System.out.println("SnowForecast: " + op.snowForecast(6));
        System.out.println("SnowForecast: " + op.snowForecast(7));

        System.out.println("CompareWithThreeAndFour: " + op.compareWithThreeAndFour(5));
        System.out.println("CompareWithThreeAndFour: " + op.compareWithThreeAndFour(4));
        System.out.println("CompareWithThreeAndFour: " + op.compareWithThreeAndFour(2));
        System.out.println("CompareWithThreeAndFour: " + op.compareWithThreeAndFour(3));

        System.out.println("isNumberEven: " + op.isNumberEven(2));
        System.out.println("isNumberEven: " + op.isNumberEven(3));

        System.out.println("isEligibleToVote: " + op.isEligibleToVote(18));
        System.out.println("isEligibleToVote: " + op.isEligibleToVote(17));

        System.out.println("biggestNumber: " + op.biggestNumber(2, 7, 3));
        System.out.println("biggestNumber: " + op.biggestNumber(3, 1, 2));
        System.out.println("biggestNumber: " + op.biggestNumber(3, 1, 5));
        System.out.println("biggestNumber: " + op.biggestNumber(3, 3, 3));

        System.out.println("--- Tema for loops ---");

        System.out.println("--- Exercitiu #1 ---");

        op.printFromNumberTo100(20);

        System.out.println("--- Exercitiu #2 ---");

        op.printFromNumberToMinus100(10);

        System.out.println("--- Exercitiu #3 ---");

        op.printFromNumberToNumber(5, 15);

        System.out.println("--- Exercitiu #4 ---");

        op.printFromNumberToNumberIntelligent(2, 5);

        System.out.println();

        op.printFromNumberToNumberIntelligent(15, 5);

        System.out.println("--- Exercitiu #5 ---");

        op.printEvenNumbers();

        System.out.println("--- Exercitiu #6 ---");

        op.printOddNumbers();

        System.out.println("--- Exercitiu #7 ---");

        System.out.println("printSumInRange: " + op.printSumInRange(17));

        System.out.println("--- Exercitiu #8 ---");

        System.out.println("printAverageInRange: " + op.printAverageInRange(53));

        System.out.println("--- Exercitiu #9 ---");

        op.printAsterisk(7);

        System.out.println("--- Tema while loops ---");

        System.out.println("--- Exercitiu #1 ---");

        op.printFromNumberTo100WithWhile(7);

        System.out.println("--- Exercitiu #2 ---");

        op.printFromNumberToMinus100WithWhile(7);

        System.out.println("--- Exercitiu #3 ---");

        op.printForNumberToNumberWithWhile(2, 8);

        System.out.println("--- Exercitiu #4 ---");

        op.printForNumberToNumberWithWhileIntelligent(8, 2);

        System.out.println("--- Exercitiu #5 ---");

        op.printEvenNumbersFromOneToOneHundred();

        System.out.println("--- Exercitiu #6 ---");

        op.printOddNumbersFromOneToHundred();

        System.out.println("--- Exercitiu #7 ---");

        op.printAverageSumFromInterval(111, 8899);

        System.out.println("--- Exercitiu #8 ---");

        System.out.println("getAverageOfNumberInRageDivisibleBySeven: " + op.getAverageOfNumberInRageDivisibleBySeven(1, 1000));

        System.out.println("--- Exercitiu #9 ---");

        op.printFibonacciNumbers(20);

        System.out.println("--- Exercitiu #10 ---");
        op.getprintCozaLozaWoza();

        System.out.println("--- Tema arrays ---");

        System.out.println("--- Exercitiu #1 ---");

        System.out.println("sum 2 int: " + calculator.sum(3, 5));
        System.out.println("sum 2 float: " + calculator.sum(3, 5.7f));
        System.out.println("sum 3 float: " + calculator.sum(2.5f, 3, 5.7f));
        System.out.println("sum 3 int: " + calculator.sum(2.8f, 6, 5.9f));
        System.out.println("substract 2 float: " + calculator.substract(2.5f, 3.5f));
        System.out.println("substract 3 float: " + calculator.substract(1.2f, 2.4f, 5.5f));
        System.out.println("substract 3 int: " + calculator.substract(3, 5, 9));
        System.out.println("substract 4 int: " + calculator.substract(2, 8, 10, 20));
        System.out.println("multiplicate 4 int: " + calculator.multiplicate(2, 4, 5, 3));
        System.out.println("multiplicate 4 float: " + calculator.multiplicate(3.1f, 3.2f, 3.3f, 3.4f));
        System.out.println("divison 3 float: " + calculator.division(100f, 70f, 10f));
        System.out.println("divison 3 int: " + calculator.division(1000, 100, 10));
        System.out.println("divison 4 int: " + calculator.division(100000, 1000, 100, 10));

        System.out.println("--- Exercitiu #2 ---");

        op.printGenerateArray();

        System.out.println("--- Exercitiu #3 ---");
        int[] array = op.printEvenNumbersWithArray();
        for (int x : array) {
            System.out.println(x);
        }

        System.out.println("--- Exercitiu #4 ---");
        int[] arrayOfNumbers = {3, 4, 5};

        System.out.println("getArrayAverage: " + op.getArrayAverage(arrayOfNumbers));

        System.out.println("--- Exercitiu #5 ---");
        String[] arrayOfStrings = {"a", "b", "c"};

        System.out.println(op.checkElemInArray(arrayOfStrings, "a") ? "found" : "not found");
        System.out.println(op.checkElemInArray(arrayOfStrings, "d") ? "found" : "not found");

        System.out.println("--- Exercitiu #6 ---");
        System.out.println(op.getPositionInArray(arrayOfNumbers, 4));

        System.out.println("--- Exercitiu #7 ---");
        op.getGridDisplay();

        System.out.println("--- Exercitiu #8 ---");

        int[] rez = op.getArrayWithoutNumber(arrayOfNumbers, 4);
        for (int y : rez) {
            System.out.println(y);
        }

        System.out.println("--- Exercitiu #9 ---");
        arrayOfNumbers = new int[]{3, 2, 4, 1, 5, 6};
        System.out.println(op.getSecondMinimNumber(arrayOfNumbers));

        System.out.println("--- Exercitiu #10 ---");

        int[] secondArray = new int[arrayOfNumbers.length];
        op.copyArrayInArray(arrayOfNumbers, secondArray);

        System.out.println("--- Tema optionala arrays ---");

        System.out.println("--- Exercitiu #1 ---");

        op.elementOnSpecificPositionArray(77, arrayOfNumbers, 3);

        System.out.println("--- Exercitiu #2 ---");
        int[] testArray = {2, 6, 8, 1, 9, 3};
        op.findLargestSmallestNumber(testArray);

        System.out.println("--- Exercitiu #3 ---");
        int[] testArray2 = {6, 7, 8, 9, 10};
        op.reverseTheValueOfAnarrayofInts(testArray2);

        System.out.println("--- Exercitiu #4 ---");
        int[] testArray3 = {4, 5, 6, 7, 8, 2, 5, 4};
        op.duplicateElementsOfAnArray(testArray3);

        System.out.println("--- Exercitiu #5 ---");
        String[] arr1 = {"abc", "asd"};
        String[] arr2 = {"zds", "bcd", "sl", "tst", "asd"};
        op.commonElementsInArray(arr1, arr2);

        System.out.println("--- Exercitiu #6 ---");
        int[] arr = {9, 7, 4, 8, 6};
        int[] response = op.receiveTheSortedArray(arr);
        for (int i = 0; i < response.length; i++) {
            System.out.println(response[i]);
        }
        Lists lists = new Lists();
        System.out.println("--- Tema lists ---");
        System.out.println("--- Exercitiu #1 ---");

        List<Integer> test = new ArrayList<Integer>();
        test.add(5);
        test.add(6);
        test.add(2);

        lists.listAddExamples(test);

        System.out.println("--- Exercitiu #2 ---");
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        lists.addElementToList(list, 5);
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("--- Exercitiu #3 ---");
        List<Integer> displaylist = new ArrayList<Integer>();
        displaylist.add(6);
        displaylist.add(5);
        displaylist.add(4);
        displaylist.add(3);
        displaylist.add(2);
        displaylist.add(1);
        lists.displayListValues(displaylist, 3);

        System.out.println("--- Exercitiu #4 ---");
        List<Integer> Reverse = new ArrayList<Integer>();
        Reverse.add(10);
        Reverse.add(8);
        Reverse.add(6);
        lists.displayListInReverse(Reverse);


        System.out.println("--- Exercitiu #5 ---");
        List<String> List = new ArrayList<>();
        List.add("pisica");
        List.add("soricel");

        lists.addStringToList(List, 1, "flori");

        System.out.println(List);

        System.out.println("--- Exercitiu #6 ---");
        List<Integer> element = new ArrayList<>();
        element.add(10);
        element.add(11);
        element.add(12);

        lists.addNumberToFirstPosition(element, 9);
        System.out.println(element);

        System.out.println("--- Exercitiu #7 ---");
        List<Object> myList = Arrays.asList("valoare1", "valoare2", "valoare3");
        lists.printListAndElements(myList);

        System.out.println("--- Exercitiu #8 ---");
        List<Integer> numbers = Arrays.asList(6, 7, 8, 9, 10);
        int biggest = lists.findBiggestNumber(numbers);
        System.out.println("Biggest number: " + biggest);
    }

    private static void printSpeed(float meters, int hours, int minutes, int seconds) {
        Calculator calculator = new Calculator();

        float totalSeconds = calculator.calculateTotalSeconds(hours, minutes, seconds);

        float kilometers = calculator.convertMetersToKilometers(meters);

        float totalHours = calculator.convertSecondsToHours(totalSeconds);

        float kilometersPerHour = kilometers / calculator.convertSecondsToHours(totalSeconds);

        System.out.println("Meters per second: " + calculator.calculateMetersPerSecond(meters, totalSeconds));
        System.out.println("Kilometers per hour: " + calculator.calculateKilometersPerHour(kilometers, totalHours));
        System.out.println("Miles per hour: " + calculator.convertKilometersToMiles(kilometersPerHour));
    }


    private static void exercitiu3() {
        System.out.println("   J    a  V     V  a");
        System.out.println("   J   a a  V   V  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
    }

    private static float exercitiu4(int number1, int number2, int number3)
    {
        int sum = number1 + number2 + number3;

        return (float) sum / 3;
    }

    private static void exercitiu5() {
        System.out.println("  +\"\"\"\"\"\"\"+  ");
        System.out.println("[ | O   O | ]");
        System.out.println("  |   ^   |  ");
        System.out.println("  |  '-'  |  ");
        System.out.println("  +-------+  ");
    }

    private static void exercitiuTemaVeche1()
    {
        System.out.println("--- Exercitiu tema veche #1 ---");

        System.out.println("Hello");
        System.out.println("Eusebia");
    }
    private static void exercitiuTemaVeche2(int number1, int number2)
    {
        System.out.println("--- Exercitiu tema veche #2 ---");

        int result1 = number1 + number2;

        System.out.println("Rezultatul sumei dintre " + number1 + " si " + number2 + " este: " + result1);
    }

    private static void exercitiuTemaVeche3(int number1, int number2)
    {
        System.out.println("--- Exercitiu tema veche #3 ---");

        float result2 = (float) (number1) / (number2);

        System.out.println("Rezultatul impartirii dintre " + number1 + " si " + number2 + " este: " + result2);
    }

    private static void exercitiuTemaVeche4a()
    {
        System.out.println("--- Exercitiu tema veche #4.a---");

        int result3 = -5 + 8 * 6;

        System.out.println("Rezultatul este: " + result3);
    }
    private static void exercitiuTemaVeche4b()
    {
        System.out.println("--- Exercitiu tema veche #4.b---");
        float result4 = (55 + 9) % 9;
        System.out.println("Rezultatul este: " + result4);
    }

    private static void exercitiuTemaVeche4c()
    {
        System.out.println("--- Exercitiu tema veche #4.c---");
        float result5 = 20 + (float) -3 * 5 / 8;
        System.out.println("Rezultatul este: " + result5);
    }

    private static void exercitiuTemaVeche4d()
    {
        System.out.println("--- Exercitiu tema veche #4.d---");
        float result6 = 5 + (float) 15 / 3 * 2 - 8 % 3;
        System.out.println("Rezultatul este: " + result6);
    }
}