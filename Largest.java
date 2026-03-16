import java.util.Arrays;

public class Largest {
    public static void secondLargest(){
        int[] arr = {1,2,4,7,7,5};

        Arrays.sort(arr);

        int n = arr.length;

        int secondSmallest = -1;
        int secondLargest = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[0]) {
                secondSmallest = arr[i];
                break;
            }
        }

        for (int i = n-2; i >= 0; i--) {
            if (arr[i] != arr[n-1]) {
                secondLargest = arr[i];
                break;
            }
        }

        System.out.println("Second Smallest : " + secondSmallest);
        System.out.println("Second Largest : " + secondLargest);
    }
    
    

    public static void main(String[] args) {
        secondLargest();
        int arr[] = {10, 5, 8, 20, 15,30};
        second(arr);
    }
}

