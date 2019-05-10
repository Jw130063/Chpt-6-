import java.util.Scanner;
public class CountDown {
    public static void main(String[] args){

        System.out.println("FINAL COUNTDOWN!!!!");
        int count=10;
        while(count !=0){
            System.out.println(count);
            --count;

        }
        int count2=0;
        while(count2<=10);
        System.out.println(count2);
        ++count2;

    }
    public static void displayDoWhile() {
        int count = 10;
        int count2 = 0;
        do {
            System.out.println(count);
            --count;
        } while (count != 10);
        do {
            System.out.println(count2);
            ++count2;
            }while(count2<=10);
    }
    public static void displayforloop(){
        for(int i=0; i <= 10; i++) {
            System.out.println(i);
            for (int j = 0; j <= 10; j++) {
            }
        }
    }
}
