import java.util.*;
public class Arrayss {

    //Question -- 11

    public static void SpiralMatrix(int matrix[][]){
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++){
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++){
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--){
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--){
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    //Question -- 12

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

    //Question -- 13

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

    //Question -- 14

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

    //Question -- 15

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

    //Question -- 16

    public static void KthLargest(){
        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        Arrays.sort(nums);

        System.out.println(nums[nums.length - k]);
    }

    //Question -- 17

    public static void MissingNumber(){
        int[] nums = {3,0,1};

        int n = nums.length;
        int expected = n * (n + 1) / 2;

        int sum = 0;

        for(int num : nums)
            sum += num;

        System.out.println(expected - sum);
    }

    //Question -- 18
    
    
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


    //Question -- 19

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

    //Question -- 21
    public static int MaxProduct(int nums[]){
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            result = Math.max(result, max);
        }

        return result;
    }

    //Question -- 22

    public static void countPair(){
        int[] arr = {1,5,7,-1,5};
        int target = 6;

        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){

            int complement = target - num;

            if(map.containsKey(complement))
                count += map.get(complement);

            map.put(num, map.getOrDefault(num,0) + 1);
        }

        System.out.println(count);
    }

    //Question -- 23
    public static void movesZero(){
         int[] nums = {0,1,0,3,12};

        int index = 0;

        for(int i=0;i<nums.length;i++){

            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }

        while(index < nums.length){
            nums[index++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }

    //Question -- 24

    public static int majorityElement(int nums[]){
        int candidate = 0;
        int count = 0;

        for(int num : nums){

            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }
            else{
                count--;
            } 
            
        }

        return candidate;
    }

    //Question -- 25

    public static void IntersectionArrays(){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }

        for(int num : nums2){
            if(set1.contains(num)){
                result.add(num);
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20}
        };
        SpiralMatrix(matrix);

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

        int[] nums1 = {2,3,-2,4};
        System.out.println(MaxProduct(nums1));

        countPair();

        movesZero();

        int[] num = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(num));

        IntersectionArrays();

    }
}

