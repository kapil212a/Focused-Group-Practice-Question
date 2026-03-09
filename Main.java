import java.util.*;

public class Main {
    //Question -- 1
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

    // Question -- 3
    public static void maxMarks(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of semesters: ");
        int sem = sc.nextInt();

        for (int i = 1; i <= sem; i++) {

            System.out.print("Enter no of subjects in semester " + i + ": ");
            int subjects = sc.nextInt();

            int max = -1;

            System.out.println("Enter marks:");

            for (int j = 0; j < subjects; j++) {

                int mark = sc.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("You have entered invalid mark.");
                    return;
                }

                if (mark > max)
                    max = mark;
            }

            System.out.println("Maximum mark in semester " + i + ": " + max);
        }
    }

    public static void main(String[] args) {
        int num = 29;

        if (isPrime(num)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        int limit = 20;
        PythagoreanTriplets(limit);

        maxMarks();
    
    }
}

