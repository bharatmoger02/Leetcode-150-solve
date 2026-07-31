public class JumpGame
{
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(targetReachable(nums));
    }

    public static boolean targetReachable(int[] nums)
    {
        int maxDistance=0;
        for (int i = 0; i < nums.length; i++)
        {
            if (maxDistance <i) {
                return false;
            }

            maxDistance=Math.max(maxDistance, i+nums[i]);

            if(maxDistance>= nums.length-1)
                return true;
        }
        return true;
    }
}