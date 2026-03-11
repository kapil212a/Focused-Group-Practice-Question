import java.util.HashMap;

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
    
    
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(MaxProduct(nums));

        countPair();

    }
}
