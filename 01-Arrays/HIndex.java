import java.util.Arrays;

public class HIndex
{
    public static void main(String[] args) {
        int[] nums = {1,3,1};
        System.out.println(hIndex(nums));
    }

    //optimal
    public static int hIndex(int[] nums)
    {
        int n= nums.length;
        int[] buckets = new int[n+1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<n)
            {
                buckets[nums[i]]++;
            }
            else {
                buckets[n]++;
            }
        }

        int count=buckets[n];

        for (int i = n; i >=0 ; i--) {
            if(count>=i)
            {
                return i;
            }
            else {
                count=count+buckets[i-1];
            }
        }
        return 0;
    }

    /*public static int hIndex(int[] nums){
        int h=0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            int temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }

        for(int i=0; i< nums.length; i++)
        {
            int citation=nums[i];
            int rank=i+1;
            if(citation>=rank)
            {
                h=rank;
            }
        }
        return h;*/
}
