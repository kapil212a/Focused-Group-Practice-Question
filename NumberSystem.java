import java.util.*;

public class NumberSystem {
    
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
        System.out.print("Enter the Value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the Value of b : ");
        int b = sc.nextInt();
        // System.out.print("Enter the Value of c : ");
        // int c = sc.nextInt();  

        int result = (a*a*a) + (a*a*b) + (2*a*a*b) + (2*a*b*b) + (a*b*b) + (b*b*b);

        System.out.println("Result = " + result);
    }


    //Question -- 5

    public static void Tyres(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter The Number Of Cars:");
            int cars = sc.nextInt();
            System.out.print("Enter The Number Of Bikes:");
            int bikes = sc.nextInt();

            int tyres = (cars * 4) + (bikes * 2);

            System.out.println(tyres);
        }
    }

    //Question -- 6

    public static void MinDiscount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number of Product :");
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

    //Question -- 7
    public static void findFactor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = sc.nextInt();

        n = Math.abs(n);

        if (n == 0) {
            System.out.println("No Factors");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
    }

    //Question -- 8
    public static void matrixRotation(int matrix[][]){
        int n = matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }

        for(int[] row : matrix){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    //Question -- 9
    public static int binarySearch(int [] arr , int target){
            int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;

            else if (arr[mid] < target)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return -1;
    }

    //Question -- 10
    public static void FrequencyCount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for(int key : map.keySet()){
            System.out.println(key + " occurs " + map.get(key) + " times");
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

        Equation();

        Tyres();

        MinDiscount();

        findFactor();

        int matrix[][] = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
        };
        matrixRotation(matrix);

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 4;
        System.out.println(binarySearch(arr, target));

        FrequencyCount();
    
    }
}

