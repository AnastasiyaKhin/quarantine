

public class Util {


    static int min(int[] nums){
       int result = 0;
        for (int i = 0; i < 10; i++) {
         if(nums[i] < result) result = nums[i] ;
        }
       return result;
    }

    static int max(int[] nums){
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if(nums[i] > result) result = nums[i] ;
        }

        return result;
    }
}
