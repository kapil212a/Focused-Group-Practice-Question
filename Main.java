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

    //Question -- 4
    public static void Equation(){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();  // not used but taken as per question

        int result = (a*a*a) + (a*a*b) + (2*a*a*b) + (2*a*b*b) + (a*b*b) + (b*b*b);

        System.out.println("Result = " + result);
    }


    //Question -- 5

    public static void Tyres(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int cars = sc.nextInt();
            int bikes = sc.nextInt();

            int tyres = (cars * 4) + (bikes * 2);

            System.out.println(tyres);
        }
    }

    //Question -- 6

    public static void MinDiscount(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String itemName = "";
        double minDiscount = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            String[] parts = line.split(",");

            String name = parts[0];
            double price = Double.parseDouble(parts[1]);
            double discount = Double.parseDouble(parts[2]);

            double discountAmount = price * discount / 100;

            if (discountAmount < minDiscount) {
                minDiscount = discountAmount;
                itemName = name;
            }
        }

        System.out.println(itemName);
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

        Equation();

        Tyres();

        MinDiscount();
    
    }
}

