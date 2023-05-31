package arrayTest;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 5칸 정수형 생성 후
		// 아무 정수나 5개를 입력받아 출력
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for (int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
//		for (int i=0; i<num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
		
		for (int nums : num) {
			System.out.print(nums + " ");
		}
		
	}
}
