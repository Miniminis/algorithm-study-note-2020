package test;

public class SortSelection {

	public static void main(String[] args) {
		int[] arr = {1, 100, 44, 72, 3};
		printArr(arr);
		System.out.println();
		selectionSort(arr, 0);
		printArr(arr);
	}
		
	//선택정렬 함수 
	public static void selectionSort(int[] arr, int sidx) {
		if(sidx < arr.length-1) {
			int minidx = sidx;
			for(int i = sidx; i<arr.length; i++) {
				if(arr[minidx] > arr[i]) {
					minidx = i;
				}
			} 
			swap(arr, sidx, minidx); 
			selectionSort(arr, sidx+1);
		}
	}
	
	//순서 바꿔주는 함수 
	public static void swap(int[] arr, int sidx, int minidx) {
		int temp = arr[sidx];
		arr[sidx] = arr[minidx];
		arr[minidx] = temp;  
	}
	
	//배열 출력 함수 
	public static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	}

}

/* 개념 
 * 오름차순으로 정렬하는데, 최솟값을 찾으면 맨앞의 요소와 swap 하는 방식으로 정렬을 진행한다. 
 * 길이가 5인 배열을 정렬한다면, 
 * - 우선 최솟값 선택: 0번지 
 * - 0 - 4 인덱스까지 돌고 진짜 최솟값 찾음 
 * - 0번지 요소와 위치를 바꿔줌 
 * 
 * 이제 0번지는 최솟값. 
 * - 다시 1번지를 최솟값으로 잡고 
 * - 1번지-4번지까지 다시 순회 후 최솟값 찾기 
 * - 진짜 최솟값과 다시 swap 
 * 
 * 이제 0, 1번지는 최솟값. 
 * --- 과정을 반복하면 자연스럽게 배열은 오름차순으로 정렬된다. 
 * - 소요시간 : O(2^N);
 * */
