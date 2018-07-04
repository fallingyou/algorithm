package algorithm;

import org.junit.Test;

import com.wp.algorithm.sort.Sort;
import com.wp.util.RandomUtil;

/**
 * 
 * @author wangpeng
 *
 */
public class SortTest {
	
	private int length = 15;
	
	private int tesNum = 100;
	
	@Test
	public void quickSortTest() {
		
		for (int i=0; i<tesNum; i++) {
			System.out.println("样例数据" + i);
			int[] array = RandomUtil.randomIntArray(length);
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();
			Sort.quickSort(array);
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
	@Test
	public void bubbleSortTest() {
		for (int i=0; i<tesNum; i++) {
			System.out.println("样例数据" + i);
			int[] array = RandomUtil.randomIntArray(length);
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();
			Sort.bubbleSort(array);
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void insertSortTest() {
		for (int i=0; i<tesNum; i++) {
			System.out.println("样例数据" + i);
			int[] array = RandomUtil.randomIntArray(length);
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();
			Sort.insertSort(array);
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void selectionSortTest() {
		
		for (int i=0; i<tesNum; i++) {
			System.out.println("样例数据" + i);
			int[] array = RandomUtil.randomIntArray(length);
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();
			Sort.selectionSort(array);
			boolean isSucces = true;
			// 判断排序后的数组是否为单调序列
			for (int k = 0; k < array.length; k++) {
				if (k == 0) {
					continue;
				}
				if (array[k] < array[k-1]) {
					isSucces = false;
					break;
				}
			}
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();
			System.out.println(isSucces);
		}
	}
	
	@Test
	public void heapSortTest() {
		
		for (int i=0; i<tesNum; i++) {
			System.out.println("样例数据" + i);
			int[] array = RandomUtil.randomIntArray(length);
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();
			Sort.heapSort(array);
			boolean isSucces = true;
			// 判断排序后的数组是否为单调序列
			for (int k = 0; k < array.length; k++) {
				if (k == 0) {
					continue;
				}
				if (array[k] < array[k-1]) {
					isSucces = false;
					break;
				}
			}
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();
			System.out.println(isSucces);
		}
	}
	@Test
	public void mergeSortTest() {
		
		for (int i=0; i<tesNum; i++) {
			System.out.println("样例数据" + i);
			int[] array = RandomUtil.randomIntArray(length);
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();
			Sort.selectionSort(array);
			boolean isSucces = true;
			// 判断排序后的数组是否为单调序列
			for (int k = 0; k < array.length; k++) {
				if (k == 0) {
					continue;
				}
				if (array[k] < array[k-1]) {
					isSucces = false;
					break;
				}
			}
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();
			System.out.println(isSucces);
		}
	}
	

}
