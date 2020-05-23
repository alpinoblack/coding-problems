package org.orca.leetcode.sorting_searching;

import java.util.Arrays;

public class MergeSortedArrays {

  public void merge(int[] nums1, int m, int[] nums2, int n) {

    int nums1Index = 0;
    int nums2Index = 0;
    int mergedArrayIndex = 0;

    final int[] mergedArray = new int[m + n];

    while(nums1Index < m && nums2Index < n){

      while(nums2Index < n && nums1[nums1Index] >= nums2[nums2Index]){
        mergedArray[mergedArrayIndex] = nums2[nums2Index];
        nums2Index++;
        mergedArrayIndex++;
      }

      if (nums2Index >= n) {
        break;
      }

      while(nums1Index < m && nums1[nums1Index] <= nums2[nums2Index]){
        mergedArray[mergedArrayIndex] = nums1[nums1Index];
        nums1Index++;
        mergedArrayIndex++;
      }

    }

    if (nums1Index < m){
      while(nums1Index < m){
        mergedArray[mergedArrayIndex] = nums1[nums1Index];
        nums1Index++;
        mergedArrayIndex++;
      }
    }

    if (nums2Index < n){
      while(nums2Index < n){
        mergedArray[mergedArrayIndex] = nums2[nums2Index];
        nums2Index++;
        mergedArrayIndex++;
      }
    }

    System.arraycopy(mergedArray, 0, nums1, 0, n + m);

  }

  public static void main(String[] args) {
    final MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();

    final int[] array1 = new int[]{2,0};
    final int[] array2 = new int[]{1};

    mergeSortedArrays.merge(array1, 1, array2, array2.length);

    System.out.println(Arrays.toString(array1));

  }

}
