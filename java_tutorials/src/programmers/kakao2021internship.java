package programmers;

import java.util.HashMap;


public class kakao2021internship {

		    public int solution(String s) {
		        int answer = 0;
		        
		        HashMap<String, Integer> map = new HashMap<String, Integer>();
		        
		        map.put("zero",0);
		        map.put("one",1);
		        map.put("two",2);
		        map.put("three",3);
		        map.put("four",4);
		        map.put("five",5);
		        map.put("six",6);
		        map.put("seven",7);
		        map.put("eight",8);
		        map.put("nine",9);
		        
		        for(String num : map.keySet()) {
			        	if(s.contains(num)) {
			        		s = s.replace(num, ""+map.get(num));
			        	}
			        }
		        
		        answer = Integer.parseInt(s);
		        
		        return answer;

	}

}
