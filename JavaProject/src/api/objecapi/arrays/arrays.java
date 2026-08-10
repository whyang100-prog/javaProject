package api.objecapi.arrays;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		//배열 비교(깊은 비교, 얕은 비교)
		int[][] orignal = {{1,2},{3,4}};
		
		//얕은 복사
		System.out.println("얕은 복제 후 비교");
		int[][] cloned1=Arrays.copyOf(orignal, orignal.length);
		System.out.println("배열 번지 비교:"+ orignal.equals(cloned1));
		System.out.println("1차 배열 항목 값 비교:"+Arrays.equals(orignal, cloned1));
		System.out.println("중첩 배열 항목 값 비교:"+Arrays.deepEquals(orignal, cloned1));
		
		
		
		//깊은 복사
		System.out.println("얕은 복제 후 비교");
		int[][] cloned2=Arrays.copyOf(orignal, orignal.length);
		cloned2[0] = Arrays.copyOf(orignal[0],orignal[0].length);
		System.out.println("배열 번지 비교:"+ orignal.equals(cloned1));
		System.out.println("1차 배열 항목 값 비교:"+Arrays.equals(orignal, cloned1));
		System.out.println("중첩 배열 항목 값 비교:"+Arrays.deepEquals(orignal, cloned1));



	}

}
