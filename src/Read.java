import java.util.*;

public class Read {
    public int readInt() {
       boolean repeat = true;
       int number = 0;
       while(repeat){
           try{System.out.print("Please enter a number: ");
               Scanner scanner =new Scanner(System.in);
               number = scanner.nextInt();
               repeat = false;
           }catch ( InputMismatchException e){
               System.out.println("Invalid value, please enter a number: ");
           }finally {
               System.out.println("Thank you for asking for help!");
           }
       }
        return number;
    }

    public double readDouble() {
        boolean repeat = true;
        double number = 0;
        while(repeat){
            try{
                System.out.print("Please enter a number: ");
                Scanner scanner =new Scanner(System.in);
                number = scanner.nextDouble();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid value, please enter a number: ");
            }finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }

    public float readFloat() {
        boolean repeat = true;
        float number = 0;
        while(repeat){
            try{
                System.out.print("Please enter a number: ");
                Scanner scanner =new Scanner(System.in);
                number = scanner.nextFloat();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid value, please enter a number: ");
            }finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }
    public String readString(){
        boolean repeat = true;
        String text = "";
        while(repeat){
            try{
                System.out.print("Please enter a number: ");
                Scanner scanner =new Scanner(System.in);
                text = scanner.next();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid value, please enter a number: ");
            }finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return text;
    }

    public int getNumbersFromKeyboard(int numPositions) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[numPositions];
        for (int i = 0; i < numPositions; i++) {
            System.out.println("Enter number for position " + (i + 1) + ":");
            numbers[i] = input.nextInt();
        }

        return numPositions;
    }
    public List<Integer>getNumberFromKeyboard(){
        List<Integer> list = new ArrayList<>();
        while (true) {
            try {
                System.out.print("Please enter a number: ");
                Scanner scanner =new Scanner(System.in);
                int number = scanner.nextInt();
                list.add(number);
            }catch (InputMismatchException e){
                System.out.println("An invalid value was entered.");
                break;
            }
        }
        return list;
    }
}
