package ch13_stream_1025;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		// 최종연산만 사용했음. 해당 데이터를 스트림에 담아서.
		int sumVal = Arrays.stream(arr).sum();
		int count = (int) Arrays.stream(arr).count();
		
		System.out.println(sumVal);
		System.out.println(count);
		
		//System.out.println(Arrays.stream(arr).reduce(0, (a,b)->a+b));
		
	}
}
