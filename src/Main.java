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

        System.out.println("Rezultatul adunarii este: " + calculator.sum(2,3.4f));
        System.out.println("Rezultatul scaderii este: " + calculator.substract(2.5f,3));
        System.out.println("Rezultatul inmultirii este: " + calculator.multiplicate(4f,3));
        System.out.println("Rezultatul impartirii este: " + calculator.division(6,3));

        System.out.println("--- Exercitiu #3 ---");

        exercitiu3();

        System.out.println("--- Exercitiu #4 ---");

        System.out.println("Rezultatul mediei aritmetice este: " + exercitiu4(2, 7, 5));

        System.out.println("--- Exercitiu #5 ---");

        exercitiu5();

        System.out.println("--- Exercitiu #6 ---");

        System.out.println("Restul impartirii este: " + calculator.divisionReminder(4,3));

        System.out.println("--- Exercitiu #7 ---");

        System.out.println("Restul conversiei este: " + calculator.convertFahrenheitToCelsius(77));

        System.out.println("--- Exercitiu #8 ---");

        System.out.println("Restul conversiei este: " + calculator.convertInchToMeter(7));

        System.out.println("--- Exercitiu #9 ---");

        printSpeed(180_000, 2, 30, 15);

        LogicalOp op = new LogicalOp();

        System.out.println("The biggest number is: " + op.getBiggestNumber(2,3));

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