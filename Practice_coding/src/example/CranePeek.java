package example;

import java.util.Stack;

public class CranePeek {

	public static void main(String[] args) {
		  int[][] board = new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
	        int[] moves = new int[]{1,5,3,5,1,2,1,4};
	        System.out.println(solution(board, moves));
	    }
	    static int solution(int[][] board, int[] moves) {
	        int score = 0;
	        Stack<Integer> st = new Stack<>();
	        for (int i : moves)
	            for(int j=0; j<board.length; j++)
	                if(board[j][i-1] != 0){
	                    if(!st.empty() && board[j][i-1] == st.peek()){
	                        st.pop(); score+=2;
	                    }else{
	                        st.push(board[j][i-1]);
	                    }
	                    board[j][i-1] = 0;
	                    break;
	                }
	        return score;

	}

}
