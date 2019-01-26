package code;

public class MainDrive {
	
	public static void main(String[] args) {
		
//		1. 12345를 5번출력
		
//		바깥에 위치하는 for문 > 상대적으로 느리게 반복
//		문제에서는 가로와 세로중? 세로 툴바를 담당
		for (int i = 0; i < 5; i++) {
			
//			바쁘게 돌아가는 반복을 안쪽에 중첩
//			문제에서는 가로로 숫자를 찍는 역할 담당
			for (int j = 0; j < 5; j++) {
			   System.out.print(j+1);
			}
			
		}
		
		
		

		
	}

}
