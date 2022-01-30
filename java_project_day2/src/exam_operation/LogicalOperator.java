package exam_operation;

public class LogicalOperator {

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		
		System.out.println((x == 3) && ( y == 7)); //x=3참이라서 뒤에꺼 확인하는데 y=4 이라서 false
		System.out.println((x == 3) || (y == 4)); // x=3 참이라서 둘중하나만 참이면 되니까 true 뒤에꺼까지 넘어가지 않는다. 앞에서 참뜨면 바로 true 출력
		
		boolean result = (++x == 3) && (y++ == 7); //전위증가연산자 붙어서 x=4라서 false라서 바로 false 출력되므로 뒤에 y후위증가연산자는 동작x
		
		System.out.println("x= "+ x + ", y = " + y); // 위 result의 영향을 받아 x=4 이고 y는 그대로 4
		System.out.println("result = " + result); // result는 flase
		
		result = (x++ == 4 ) || (++y == 7); //현재 x는 4이고 x==4이므로 true. 둘장하나만 treu면 되는데 처음부터 바로 true니까 뒤에꺼 식 동작x 그리고 x는 후위증가연산자떄문에 5로 변화
		
		System.out.println("x= "+ x + ", y = " + y); // 위 result의 영향을 받아 x=5이고 y는 그대로 4
		System.out.println("result = " + result); // result 는 true
		

	}

}
