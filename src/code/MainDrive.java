package code;

public class MainDrive {
	
	public static void main(String[] args) {
		
//		1. 12345를 5번출력
		
//		바깥에 위치하는 for문 > 상대적으로 느리게 반복
//		문제에서는 가로와 세로중? 세로 툴바를 담당
//		for (int i = 0; i < 5; i++) {
//			
////			바쁘게 돌아가는 반복을 안쪽에 중첩
////			문제에서는 가로로 숫자를 찍는 역할 담당
//			for (int j = 0; j < 5; j++) {
//			   System.out.print(j+1);
//			}
//			
////			가로로 1~5를 찍고나면 줄을 바꿈.
//			System.out.println();
//		}
//		
//		2. 구구단 2단까지 찍기. -> 2~9단까지 출력하기.
		
//		2 X 1 = 2
//		2 X 1 = 4
//		~
//		9 X 9 = 81
//		반복요소 2개.
//		1) 각 단의 내용을 출력
//		 - 2 * 1 = 2, 2*2=4....
//		2) 단 자체를 출력.
//		 - 3*1, 4*1 
//		둘중에 1 반복이 더바쁨 > 안으로 들어감> J
//		2) 반복을 먼저 작성 : i
		
//		단 자체를 담당. i
//		for (int i = 2; i <= 9; i++) {
////			각 단의 내용을 출력 : j
//			for (int j = 1; j <=9 ; j++) {
////				string format을 이용하여 상황에 따라 문장 출력
//				System.out.println(String.format("%d X %d = %d",i,j,i*j));
//				
//				
//			}
//			
//			
//		}
//		3. 별찍기
//		3.1) 정사각형 5X5사이즈의 별 찍기. 연습문제.
//		*****
//		*****
//		*****
//		*****
//		*****
		
//		세로 줄바꿈
//		for (int i = 0; i < 5; i++) {
			
////			가로 별찍기
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
//				
//			}
//			
//			System.out.println();
//			
//		}

//     3.2) 기초 삼각형 병찍기
//			*
//			**
//			***
//			****
//			*****
		
//		   가로 출력 담당 변수 : j 안쪽 for
//		세로 줄바꿈 담당 변수 : i 바깥 for
		
//		반복문의 반복 횟수? 조건식이 담당. => 조건식의 조건을 변수로 활용하자!
		
//			for (int i = 0; i < 5; i++) {
//				for (int j = 0; j < i+1; j++) {
//					System.out.print("*");
//								}
//							System.out.println();
//			}
	
	
//		3. 3 역방향 별찍기
//		*****
//		****
//		***
//		**
//		*
		
//		첫번째 방법
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5-i; j++) {
//				System.out.print("*");
//								
//			}
//			System.out.println();
//		}
		
//		두번째 방법 j형 돌리는 for문을 감소형으로 
//		for (int i = 5; i > 0; i--) {
////			j가 도는 횟수를 5,4,3,2,1로 줄어들도록
//            for (int j = 0; j < i; j++) {
//			System.out.print("*");
//							
//		}
//		System.out.println();
//	}
		
		
	
	}
}
