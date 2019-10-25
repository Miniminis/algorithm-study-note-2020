package test;

public class SortQuick {

	public static void main(String[] args) {
		/* 순서 
		 * 1. pivot 설정 
		 * 2. pivot 값 기준 좌 정렬 
		 * 3. pivot 값 기준 우 정렬
		 *- 여기까지 sidx : pivot 값 바로 왼쪽 
		 * 4.   
		 * */
		
		int[] arr= {1, 20, 54, 11, 6};
		printArr(arr);
		
		quickSort(arr, 0, arr.length-1);
		printArr(arr);
	}

	private static void quickSort(int[] arr, int sidx, int eidx) {
		int part2 = partition(arr, sidx, eidx);
		
		if(sidx<part2 -1) {
			quickSort(arr, sidx, part2-1);
		} 
		
		if(part2 < eidx) {
			quickSort(arr, part2, eidx);
		}
	}

	//피봇값 기준으로 퀵정렬하는 메소드 : 중간 피봇값 기준으로 왼쪽에는 작은값, 오른쪽에는 큰 값이 오게 된다. 
	private static int partition(int[] arr, int sidx, int eidx) {
		// 피봇값 설정 : 가운데 
		int pivot = arr[(sidx+eidx)/2];
		
		//시작점과 끝점이 교차하는 순간 반복 종료  
		while(sidx<=eidx) {
			//피봇보다 값이 작으면 인덱스 이동 - 값이 크면 그 자리에 idx 멈춰있게 된다. 
			while(arr[sidx]<pivot) {
				sidx++;
			}
			//피봇보다 값이 크면 인덱스 이동 - 값이 크면 그 자리에 idx 멈춰있게 된다. 
			while(arr[eidx]>pivot) {
				eidx--;
			}
			if(sidx<=eidx) {
				//멈춰져있는 idx 기준으로 swap 진행 
				swap(arr, sidx, eidx);	
				sidx++;
				eidx--;
			}
		}
		return sidx; //???
	}

	//swap() 
	private static void swap(int[] arr, int sidx, int eidx) {
		int temp = arr[sidx];
		arr[sidx] = arr[eidx];
		arr[eidx] = temp; 
	}
	
	//배열 출력 함수 
	private static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	}	  
}

/* 개념 
 * 정렬이 안된 배열이 있다. 
 * 해당 정렬의 가운데 점을 잡는다. 
 * 그 포인트보다 왼쪽에는 작은값들을, 오른쪽이는 큰 값들을 정렬한다.  
 * 
 * 한번 나눈 배열을 각각 또 가운데 점을 기준으로 두개로 나눈다. 
 * 결국 배열의 요소 수 만큼 나누고 한번 나눌때마다 연산할 데이터의 수는 절반으로 줄어드므로, 
 * 시간복잡도는 : n*log N 만큼 걸리게 된다. 
 * 
 * 선택한 pivot 값이 가장 작은 값이었을 경우에는 파티션이 불균형하게 나뉘어 최악의 경우 2^N 가능 
 * - 하지만 이런 경우는 확률적으로 낮음 
 * 
 * 시작점 - 피봇 - 끝점 
 * 피복보다 작은값 | 피봇 | 피봇보다 큰값 
 * 이때, 시작점과 끝점이 서로 교차하는 시기 : 반복문 조건에 맞지 않아서 루프 빠져나옴 
 * */
