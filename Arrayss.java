import java.util.*;
public class Arrayss {
    //Question -- 11
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

    //Question -- 12

    public static void mergeInternal(){
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];

        for (int[] interval : intervals) {

            if (interval[0] <= current[1]) {
                current[1] = Math.max(current[1], interval[1]);
            } else {
                result.add(current);
                current = interval;
            }
        }

        result.add(current);

        for (int[] i : result)
            System.out.println(Arrays.toString(i));
    }

    //Question -- 13

    public static void matrixIdentical(){
        int[][] A = {
                {1,1,1,1},
                {2,2,2,2},
                {3,3,3,3},
                {4,4,4,4}
        };

        int[][] B = {
                {1,1,1,1},
                {2,2,2,2},
                {3,3,3,3},
                {4,4,4,4}
        };

        boolean identical = true;

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(A[i][j] != B[i][j]){
                    identical = false;
                    break;
                }
            }
        }
        if(identical){
            System.out.println("Matrices are identical");
        }
        else{
            System.out.println("Matrices are not identical");
        }
    }

    public static void main(String[] args) {
        secondLargest();
        mergeInternal();
        matrixIdentical();
    }
}

