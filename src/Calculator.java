public class Calculator {
    public int sum(int first, int second) {
        return first + second;
    }
    public float sum(float first, float second) {
        return first + second;
    }

    public float sum(float first, float second, float third) {
        return first + second + third;
    }
    public int sum(int first, int second, int third) {
        return first + second + third;
    }

    public float substract (float first, float second){return first - second;}

    public float substract (float first, float second, float third) {
        return first - second - third;
    }

    public int substract (int first, int second, int third) {
        return first - second - third;
    }
    public int substract (int first, int second, int third, int fourth) {
        return first - second - third - fourth;
    }

    public float multiplicate(float first, float second){
        return first * second;
    }
    public float multiplicate (int first, int second, int third, int fourth) {
        return first * second * third * fourth;
    }
    public float multiplicate (float first, float second, float third, float fourth) {
        return first * second * third * fourth;
    }
    public float division(float first, float second){
        return first / second;
    }
    public float division(float first, float second, float third) {
        return first / second / third;
    }
    public float division(int first, int second, int third) {
        return (float) first / second / third;
    }
    public float division(int first, int second, int third, int fourth) {
        return (float) first / second / third / fourth;
    }
    public float divisionReminder(float first, float second){
        return first % second;
    }

    public float convertFahrenheitToCelsius(float value)
    {
        return (float) 5/9 * (value - 32);
    }

    public float convertInchToMeter(float value)
    {
        return value * 0.0254f;
    }

    public float convertKilometersToMiles(float kilometers) {
        return kilometers * 0.62137f;
    }

    public int calculateTotalSeconds(int hours, int minutes, int seconds) {
        return seconds + 60 * minutes + ( 60 * 60 ) * hours;
    }

    public float convertMetersToKilometers(float meters) {
        return meters / 1000;
    }

    public float convertSecondsToHours(float seconds) {
        return seconds / (60 * 60);
    }

    public float calculateMetersPerSecond(float meters, float seconds) {
        return meters / seconds;
    }

    public float calculateKilometersPerHour(float kilometers, float hours) {
        return kilometers / hours;
    }
}
