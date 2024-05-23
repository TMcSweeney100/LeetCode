import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int height1 = nums1.length;
        int height2 = nums2.length;
        int arrayLength = height1 + height2;

        int [] mergedArray = new int[arrayLength];

        int i = 0;
        int j = 0;
        int arrayIndex = 0;

        //fill in all the numbers from nums1 first
        while(i < nums1.length){
            mergedArray[arrayIndex] = nums1[i];
            arrayIndex++;
            i++;
        }

        //fill in nums2
        while(j<nums2.length){
            mergedArray[arrayIndex] = nums2[j];
            arrayIndex++;
            j++;
        }

        Arrays.sort(mergedArray);

        if(arrayLength % 2 == 0){

            double middle1 = mergedArray[(arrayLength/2) - 1 ]; 
            double middle2 = mergedArray[arrayLength/2 ];

            double median = (middle1 + middle2) / 2 ; 
            return median;
        }else{
            int middleOdd = mergedArray[arrayLength/2];
            return middleOdd;

        }
    }
}