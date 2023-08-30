import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean go = true;
        Scanner sc = new Scanner(System.in);
        double min=0;
        double max=0;
        ArrayList<Double> numbersEntered = new ArrayList<>();
        do{
            System.out.println("Enter any number, or any character to quit.");
            String input = sc.nextLine();

            try {
                double number = Double.parseDouble(input);
                if (numbersEntered.contains(number)){
                    go = false;
                }
                numbersEntered.add(number);
                if (number > max){
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            }catch (NumberFormatException nfe){
                go = false;
            }
        } while (go);
        System.out.println("The minimum number entered is: " + min);
        System.out.println("The maximum number entered is: " + max);
    }
}