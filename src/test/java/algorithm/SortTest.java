package algorithm;

import org.junit.Test;

import com.wp.algorithm.sort.Sort;
import com.wp.util.RandomUtil;

public class SortTest {
	
	@Test
	public void QuickSortTest() {
		
		for (int i=0; i<100; i++) {
			System.out.println("样例数据" + i);
			int[] array = RandomUtil.RandomIntArray(15);
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();
			Sort.QuickSort(array);
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
	@Test
	public void BubbleSortTest() {
		for (int i=0; i<100; i++) {
			System.out.println("样例数据" + i);
			int[] array = RandomUtil.RandomIntArray(15);
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();
			Sort.BubbleSort(array);
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
