import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class zzz {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 7, 9};
        int target = 9;
        System.out.println(Arrays.toString(xiangjia(nums, target)));

    }

    public static int[] xiangjia(int[] nums, int target) {


        int n = nums.length;
        int[] k = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] ==  target) {

                    k[0] = i;
                    k[1] = j;
                    return  k;
                }


            }


        }
        return null;

    }

}


