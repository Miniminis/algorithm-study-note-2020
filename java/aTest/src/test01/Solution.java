package test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//2019.09.28
class Solution {
	// 1. 입력받은 goods, boxes 배열 정렬 
    // --> 각 배열의 첫번째 요소가 최댓값!
    //2. goods의 최댓값과 박시즈의 최댓값 비교 : 
    //  굿즈의 최댓값 <= 박시즈의 최댓값 : answer+1
    //3. 이하 반복문으로 계속 반복 
	public static int solution(int[] goods, int[] boxes){
        //int answer = 0;  //0. answer : 포장된 물건의 갯수 
        int n = goods.length;
        int k = boxes.length; //boxes.length = k;
        
        Arrays.sort(goods);
        Arrays.sort(boxes);
    	List<Integer> temlist = new ArrayList<Integer>();
    	for(int i=0; i<k; i++) {
    		for(int j=0; j<n; j++) {
    			boolean isPackable = goods[j]<=boxes[i];
    			if(isPackable) {
    				temlist.add(goods[j]);
    				break;
    			} else {
    				continue;
    			}
    		}
    	}
    	
    	List<Integer> resultList = new ArrayList<Integer>();
    	for (int i =0; i < temlist.size(); i++) {
    	    if (!resultList.contains(temlist.get(i))) {
    	    	resultList.add(temlist.get(i));
    	    }
    	}
    	
    	//answer = resultList.size();
        return resultList.size();
    }
    
    public static void main(String[] args) {
    	int[] goods = {3,8,6};
    	int[] boxes = {5,6,4};
    	System.out.println(solution(goods, boxes));
    	//test(goods);
    	
    }
    
    public static void test(int[] goods) {
//    	int[] newgoods = Arrays.copyOf(goods, 3);
//    	for(int i=0; i<newgoods.length; i++) {
//    		System.out.println(newgoods[i]);
//    	}
    	Integer[] integerGoods = Arrays.stream(goods).boxed().toArray(Integer[]::new);
    	Arrays.sort(integerGoods, Comparator.reverseOrder());
    	for(int i=0; i<integerGoods.length; i++) {
    		System.out.println(integerGoods[i]);
    	}
    }

}


