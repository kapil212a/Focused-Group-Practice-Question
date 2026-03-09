import java.util.*;

//Question -- 1
public class Main {
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    //Question -- 2
    public static void PythagoreanTriplets(int limit){
        for (int a = 1; a <= limit; a++) {
            for (int b = 1; b <= limit; b++) {
                for (int c = 1; c <= limit; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int num = 29;

        if (isPrime(num))
            System.out.println("True");
        else
            System.out.println("False");
    }
}

