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
}
