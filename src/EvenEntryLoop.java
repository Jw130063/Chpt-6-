import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args){

        int userEntry;
        String result;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a even number.");
        System.out.println("Enter a whole number>>>");
        userEntry = input.nextInt();

        if (userEntry%2 == 0) {
            result = userEntry + "number is even";
        }
        else
            result = userEntry + "number is odd";
        System.out.println("Error");






    }

}
