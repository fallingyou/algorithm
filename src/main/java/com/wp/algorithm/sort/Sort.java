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
	public static void quickSort(int[] array) {
		if (array.length == 0) {
			return ;
		}
		quickSort(array, 0, array.length - 1);
	}
	
	private static void quickSort(int[] array, int start, int end) {
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
		quickSort(array, start, s-1);
		quickSort(array, e+1, end);
		
	}
	/**
	 * 冒泡排序
	 * @param array int[]
	 */
	public static void bubbleSort(int[] array) {
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
	
	/**
	 * 直接插入排序
	 * @param array int[]
	 */
	public static void insertSort(int[] array) {
		int length = array.length;
		if (length == 0) {
			return ;
		}
		for (int i = 1; i < length; i++) {
			// 取哨兵
			int key = array[i]; 
			int j = i - 1;
			if (key < array[j]) {
				// 哨兵和已经有序的序列比较，并移动有序列中的元素
				while (j >= 0 && key < array[j]) { 
					array[j + 1] = array[j];
					j--;
				}
				// 插入记录到正确位置
				array[j + 1 ] = key;
			}
		
		}
	}
	

}
