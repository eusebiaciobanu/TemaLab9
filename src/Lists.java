import java.util.List;

public class Lists {
    public void listAddExamples(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public void addElementToList(List<Integer> list, int number) {
        list.add(number);
    }

    public void displayListValues(List<Integer> list, int startIndex) {
        for (int i = startIndex; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void displayListInReverse(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public void addStringToList(List<String> list, int index, String text) {
        list.add(index, text);
    }

    public void addNumberToFirstPosition(List<Integer> list, int element) {
        list.add(0, element);
    }

    public void printListAndElements(List<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index" + i + ":" + list.get(i));
        }
    }

    public int findBiggestNumber(List<Integer> myList) {
        int biggest = myList.get(0);
        for (int number : myList) {
            if (number > biggest) {
                biggest = number;
            }

        }
        return biggest;
    }
}
