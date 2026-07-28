import java.util.*;
class RemoveDuplicatesFromSortedArray
{
    public static void main(String[] args)
    {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums)
    {
        int j=1;
        if(nums.length<=1)
        {
            return nums.length;
        }
        for(int i=1; i<nums.length; i++)
        {
           if(nums[i]!=nums[j-1])
           {
              nums[j]=nums[i];
              j++;
           }
        }  
        return j;  
    }

                //1.using ArrayList
    /*public static int removeDuplicates(int[] nums)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            if(i==nums.length-1)
            {
                arr.add(nums[i]);
                return arr.size();
            }
            if(nums[i]!=nums[i+1])
            {
                arr.add(nums[i]);
            }
        }
        return arr.size();
    }*/

            //2.Using 2 pointer(optimal)
    /*public static int removeDuplicates(int[] nums)
    {
        if(nums.length == 0)
            return 0;
        int k=0;
        for(int i=0; i<nums.length; i++)
        {
            if (i==nums.length-1) {
                nums[k]=nums[i];
                return k+1;
            }
            if(nums[i]!=nums[i+1])
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k+1;
    }*/
}