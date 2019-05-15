public class Factorials {
    public static void main(String[] args){
        factorial(5);
    }
    public static int factorial(int n)
    {
        int res= 1, i;
        for (i=2; i<=n; i++)
            res *= i;
        return res;


    }

}
