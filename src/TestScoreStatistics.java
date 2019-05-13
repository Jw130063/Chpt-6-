import java.util.Scanner;

public class TestScoreStatistics {
    public static void main(String [] args){
       Scanner input= new Scanner(System.in);
        int score;
        int count=0;
        int high=0;
        int low=100;
        int userEntry=0;
        while (userEntry != 999)

        {
            System.out.println("Please enter your test score");
            userEntry = input.nextInt();
            if(userEntry> high){
                high= userEntry;
            }
            else if(userEntry<low){
                low=userEntry;
            }
            count++;
        }

    }
}
