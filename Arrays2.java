import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Arrays2 {

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

    //Question -- 26

    public static void moveHash(){
        String str = "Move#Hash#to#Front";

        int count = 0;
        String result = "";

        for(char c : str.toCharArray()){
            if(c == '#'){
                count++;
            }
            else{
                result += c;
            }
        }

        String hashes = "";

        for(int i=0;i<count;i++){
            hashes += "#";
        }

        System.out.println(hashes + result);
    }

    //Question -- 27

    public static void SeasonFinder(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number of Month: ");
        int month = sc.nextInt();

        if(month < 1 || month > 12){
            System.out.println("Invalid Month Entered");
        }
        else if(month >= 3 && month <= 5){
            System.out.println("Season: Spring");
        }
        else if(month >= 6 && month <= 8){
            System.out.println("Season: Summer");
        }
        else if(month >= 9 && month <= 11){
            System.out.println("Season: Autumn");
        }
        else{
            System.out.println("Season: Winter");
        }
    }

    //Question -- 28

    public static void valleys(){
        String path = "UDDDUDUU";

        int level = 0;
        int valleys = 0;

        for(char step : path.toCharArray()){

            if(step == 'U'){
                level++;
            }
            else{
                level--;
            }

            if(level == 0 && step == 'U'){
                valleys++;
            }
        }

        System.out.println(valleys);
    }

    //Question -- 29

    public static void StringCompression(){
        String str = "aabbbbeeeeffggg";

        int count = 1;

        for(int i=0;i<str.length();i++){

            if(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else{
                System.out.print(str.charAt(i) + "" + count);
                count = 1;
            }
        }
    }

    //Question -- 30

    public static void ReverseString(){
        String s = "Capgemini";

        String reversed = "";

        for(int i=s.length()-1;i>=0;i--){
            reversed += s.charAt(i);
        }

        System.out.println(reversed);
    }
    
    
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(MaxProduct(nums));

        countPair();

        movesZero();

        int[] num = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(num));

        IntersectionArrays();

        moveHash();

        SeasonFinder();

        valleys();

        StringCompression();

        ReverseString();
    }
}
