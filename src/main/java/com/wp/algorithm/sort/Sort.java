package com.wp.algorithm.sort;
/**
 * 排序算法实现
 * @author wangpeng
 *
 */
public class Sort {
	
	/**
	 * 快速排序
	 * @param array int[] 
	 */
	public static void QuickSort(int[] array) {
		if (array.length == 0) {
			return ;
		}
		QuickSort(array, 0, array.length - 1);
	}
	
	private static void QuickSort(int[] array, int start, int end) {
		if (start >= end) {
			return ;
		}
		int s = start;
		int e = end;
		int tmp = array[s];
		while (s < e) {
			while ( e > s && array[e] >= tmp  ) {
				e--;
			}
			array[s] = array[e];
			while (s < e && array[s] < tmp ) {
				s++;
			}
			array[e] = array[s];
		}
		array[s] = tmp;
		QuickSort(array, start, s-1);
		QuickSort(array, e+1, end);
		
	}
	/**
	 * 冒泡排序
	 * @param array int[]
	 */
	public static void BubbleSort(int[] array) {
		int length = array.length;
		if (length == 0) {
			return ;
		}
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
	}
	

}
