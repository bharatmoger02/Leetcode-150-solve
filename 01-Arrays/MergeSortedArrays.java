import java.util.Arrays;

class MergeSortedArrays
{
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m=3;
        int[] nums2 = {2,5,6};
        int n=3;
        mergeArr(nums1, nums2, m, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void mergeArr(int[] nums1, int[] nums2, int m, int n)
    {
        int p=m-1;
        int q=n-1;
        int merge = m+n-1;
        while (q>=0) {
            if(p>=0 && nums1[p]>nums2[q]){
                nums1[merge]=nums1[p];
                p--;
            }
            else
            {
                nums1[merge]=nums2[q];
                q--;
            }
            merge--;
        }
    }
}