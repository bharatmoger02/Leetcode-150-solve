public class JumpGame2
{
    public static void main(String[] args) {
        int[] nums = {7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
        System.out.println(minJumps(nums));
    }

    public static int minJumps(int[] nums)
    {
        int jumps=0;
        int farthestpt=0;
        int maxDistance=0;
        for (int i = 0; i < nums.length-1; i++)
        {
            maxDistance=Math.max(maxDistance, i+nums[i]);
            if(i==farthestpt)
            {
                if(maxDistance==farthestpt)
                {
                    return -1;
                }
                jumps++;
                farthestpt=maxDistance;
            }
        }
        return jumps;
    }
}
