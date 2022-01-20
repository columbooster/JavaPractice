package programmers;

class Solution11 {
    public String solution(int n) {
        String answer = "";
        
        for(int i = 1; i < n+1; i++){
            if(i%2 == 1) {
                answer += "¼ö";
            } if(i%2 == 0) {
                answer += "¹Ú";
            }
        }
        
        
        
        return answer;
    }
}

public class practicestring {

	public static void main(String[] args) {
		
		Solution11 answer = new Solution11();
		
		String a = answer.solution(4);
		
		System.out.print(a);
		
	}

}	