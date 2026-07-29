import java.util.Arrays;

public class BuyAndSellStock2
{
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] nums)
    {
        int maxgain=0;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1])
            {
                maxgain= maxgain+(nums[i]-nums[i-1]);
            }
        }
        return maxgain;
    }
}
