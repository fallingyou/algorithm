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
			//有序序列的最后一个元素
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
	/**
	 * 简单选择排序
	 * @param array int[]
	 */
	public static void selectionSort(int[] array) {
		int length = array.length;
		if (length == 0) {
			return ;
		}
		for (int i = 0; i < length; i++) {
			int key = array[i];
			int maxIndex = i;
			int j = i + 1;
			while (j < length) {
				if (array[j] < key) {
					key = array[j];
					maxIndex = j;
				}
				j++;
			}
			array[maxIndex] = array[i];
			array[i] = key;
		}
	}
	/**
	 * 堆排序
	 * @param array int[]
	 */
	public static void heapSort(int[] array) {
		if (array.length == 0 || array.length == 1) {
			return ;
		}
		//从最后一个非叶子节点进行调整，初始化堆
		final int divisor = 2;
		for (int i = array.length / divisor - 1; i >= 0; i--) {
			heapAdjust(array, i, array.length);
		}
		for (int j = array.length - 1; j > 0; j--) {
			int tmp = array[j];
			array[j] = array[0];
			array[0] = tmp;
			heapAdjust(array, 0, j);
		}
		
	}
	/**
	 * 调整堆节点,使其成为大根堆
	 * @param array int[]
	 * @param s 节点编号
	 * @param length
	 */
	private static void heapAdjust(int[] array, int s, int length) {
		//左节点
		int lchild = s * 2 + 1; 
		//如果不存在左节点调整结束
		if (lchild >= length) {
			return ; 
		}
		//右节点
		int rchild = s * 2 + 2; 
		//最大节点的编号
		int maxIndex = s;  
		// 判断是否存在右节点
		if (rchild < length) { 
			maxIndex = array[rchild] > array[s] ? rchild : s;
			maxIndex = array[lchild] > array[maxIndex] ? lchild : maxIndex;
		} else {
			maxIndex = array[lchild] > array[maxIndex] ? lchild : maxIndex;
		}
		if (maxIndex != s) {
			int tmp = array[s];
			array[s] = array[maxIndex];
			array[maxIndex] = tmp;
			heapAdjust(array, maxIndex, length);
		}
	}
	
	public static void mergeSort(int[] array) {
		if (array.length <= 1) {
			return ;
		}
		mergeSort(array, 1);
		
	}
	
	/**
	 * 
	 * @param array int[] 待排序数组
	 * @param len 归并有序集合的长度
	 */
	public static void mergeSort(int[] array, int len) {
		int size = array.length;
		// 分组合并的数量
		int groupCount = size / (len * 2);
		if (groupCount == 0) {
			return ;
		}
		// 分组剩余的元素个数
		int remainder = size - (len * 2 * groupCount);
		int i;
		for (i = 0; i < groupCount; i++) {
			int s = i * len * 2;
			merge(array, s, s + len, s + len + len);
		}
		if (remainder != 0) {
			merge(array, size - remainder - len * 2, size - remainder, size);
		}
		mergeSort(array, len * 2);
	}
	/**
	 * 二路归并
	 * @param array 待排序数组
	 * @param s 第一个有序序列的起始位置
	 * @param m 第二个有序序列的起始位置
	 * @param e 第二个有序序列结束的位置
	 */
	private static void merge(int[] array, int s, int m, int e) {
		int i = s;
		int j = m;
		int[] tmp = new int[e - s];
		int k = 0;
		while (i < m && j < e) {
			if (array[i] < array[j]) {
				tmp[k]  = array[i];
				i++;
				k++;
			} else {
				tmp[k] = array[j];
				j++;
				k++;
			}
		}
		while (i < m) {
			tmp[k] = array[i];
			i++;
			k++;
		}
		while (j < e) {
			tmp[k] = array[j];
			j++;
			k++;
		}
		System.arraycopy(tmp, 0, array, s, k);
	}
}
