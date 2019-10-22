package test;

import java.util.Arrays;

public class ArraysTest {
	//java.util.Arrays 클래스의 모든 매소드는  전역. 따로 객체를 생성하지 않고도 바로 사용 가능하다! 
	
	public static void main(String[] args) {
		
		
		sortedNums();
		System.out.println("");
		fillNums();
		System.out.println("");
		isequal();
		System.out.println("");
		search();
		System.out.println("");
		copy();
		
 	}
	
	public static void sortedNums() {
		int[] arr = {5, 500, 1, 48, 20};
		Arrays.sort(arr);
		
		for(int e : arr) {
			System.out.print(e + " "); 
		}
	}
	
	public static void fillNums() {
		int[] arr = new int[10];
		Arrays.fill(arr, 5249);
		
		for(int e : arr) {
			System.out.print(e + " "); 
		}
	}
	
	
	public static void isequal() {
		int[] arr = new int[1000];
		int[] arr2 = {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.equals(arr, arr2)); //false 
	}
	
	public static void search() {
		int[] arr = new int[1000];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		
		//1. Arrays.binarySearch(배열, 찾으려는 index)
		System.out.println("Arrays.binarySearch() 결과 : ");
		System.out.println(Arrays.binarySearch(arr, 437));	
		
	}
	
	public static void copy() {
		//2. Arrays.copyOf(배열, 길이)
		int[] arr2 = {1, 2, 3, 4, 5};
		int[] arr3 = Arrays.copyOf(arr2, 3);
		
		System.out.println("Arrays.copyOf(arr2, 3) 결과 : ");
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + "  ");
		}
		
		//3. Arrays.copyOf(배열, 길이)
		int[] arr4 = Arrays.copyOf(arr2, 10);
		
		System.out.println();
		System.out.println("Arrays.copyOf(arr2, 10) 결과 : ");
		for (int i = 0; i < arr4.length; i++) {
		    System.out.print(arr4[i] + " ");
		}
	}
	
}


