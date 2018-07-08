package com.wp.algorithm.sort;
/**
 * 
 * @author wangpeng
 *
 */
public class Search {
	
	/**
	 * 
	 * @param array 有序数组
	 * @param target 待查找的目标
	 * @return
	 */
	public static int binarySearch(int[] array, int target) {
		int length = array.length;
		if (length == 0) {
			return -1;
		}
		int low = 0;
		int height = length - 1;
		int mid = 0;
		while (low <= height) {
			mid = (low + height) / 2;
			if (array[mid] == target) {
				return mid;
			}
			if (array[mid] > target) {
				height = mid - 1;
			}
			if (array[mid] < target) {
				low = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] array = {0, 1, 3, 6, 7, 8, 10, 20, 27, 30};
		System.out.println(binarySearch(array, 10));
	}

}
