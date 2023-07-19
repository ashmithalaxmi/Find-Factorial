import java.util.Scanner;

public class FindFactorial {
    public static int factorial(int n){
        if(n <= 1)
            return 1;
        return factorial(n-1) * n;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(factorial(a));
    }
}
