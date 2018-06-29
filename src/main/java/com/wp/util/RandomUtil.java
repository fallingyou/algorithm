package com.wp.util;

import org.apache.commons.lang3.RandomUtils;

/**
 * 
 * @author wangpeng
 *
 */
public class RandomUtil {

	public static int[] randomIntArray(int length) {
		int[] array = new int[length];
		for (int i=0; i<length; i++) {
			array[i] = RandomUtils.nextInt(0, 1000);
		}
		return array;
	}
}
