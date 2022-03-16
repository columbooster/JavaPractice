package example;

// ���� �迭���� ���� ���� ���� ���� �����ض�. �����Ϸ��� �迭�� ��迭�� �汸 -1 ���� -->> �ߺ��� ���� ����. �ߺ� �Ű澲������ �ص� �ȴ�.
// 1. �迭���� ���� ���� ���� ���Ѵ�.
// 1-1. ���� �ε����� ���Ѵ�. -> �ε���0��
// 1-2. �ݺ����� ���� ũ�⸦ ���Ѵ�. -> if���� ����Ͽ� Ŭ���� ������� (��õ� �䱸���׿� ���� �������� ����)�� ������.
// 1-3. ���� ���� ���� ���� ����
// 1-4. ��迭�ϰ�� ���� -1
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
