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

    //Question -- 14

    public static void ReverseArray(){
        int[] arr = {5,4,3,2,1};

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }

    //Question -- 15

    public static void KthLargest(){
        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        Arrays.sort(nums);

        System.out.println(nums[nums.length - k]);
    }

    //Question -- 16

    public static void MissingNumber(){
        int[] nums = {3,0,1};

        int n = nums.length;
        int expected = n * (n + 1) / 2;

        int sum = 0;

        for(int num : nums)
            sum += num;

        System.out.println(expected - sum);
    }

    //Question -- 17

    public static void FindDuplicate(){
        int[] arr = {1,3,4,2,2};

        Set<Integer> set = new HashSet<>();

        for(int num : arr){

            if(set.contains(num)){
                System.out.println(num);
                break;
            }

            set.add(num);
        }
    }

    //Question -- 18

    public static void MergeSortedArrays(){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int m = 3;
        int n = 3;

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {

            if (i >= 0 && nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }

        System.out.println(Arrays.toString(nums1));
    }

    //Question -- 20

    public static void reverse(int[] nums, int start, int end){
        while(start < end){

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        secondLargest();
        mergeInternal();
        matrixIdentical();
        ReverseArray();
        KthLargest();
        MissingNumber();
        MissingNumber();
        FindDuplicate();

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        k = k % nums.length;

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

        System.out.println(Arrays.toString(nums));

    }
}

