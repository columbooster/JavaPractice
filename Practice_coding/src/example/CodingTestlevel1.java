package example;

// 정수 배열에서 가장 작은 수를 빼고 리턴해라. 리턴하려는 배열이 빈배열일 경구 -1 리턴 -->> 중복된 수는 없다. 중복 신경쓰지말고 해도 된다.
// 1. 배열에서 가장 작은 수를 구한다.
// 1-1. 기준 인덱스를 정한다. -> 인덱스0번
// 1-2. 반복문을 돌려 크기를 비교한다. -> if문을 사용하여 클경우와 작을경우 (명시된 요구사항에 따라서 같은경우는 배제)로 나눈다.
// 1-3. 가장 작은 수를 빼고 리턴
// 1-4. 빈배열일경우 리턴 -1
// 

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int min = arr[0];
		
		if(arr.length == 1) {
			answer = null;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			} else {
				min = arr[0];
			}
		}
        
		for (int i = 0; i < answer.length; i++) {
			if(arr[i]!=min) {
				answer[i] = arr[i];
			} else {
				arr[i] = 0;
			}
		}
        
        
        return answer;
    }
}



public class CodingTestlevel1 {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		int[] arr = {4,3,2,1};
		
		s.solution(arr);
		
		
	}

}
