package arrayTest;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 10개의 정수를 입력받아 nums에 저장한다
		// 입력받은 10개의 정수 중 가장 큰 수를 출력하는 프로그램을 생성
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		int max;
		
		for (int i=0; i<nums.length; i++) {	// 10번 반복
			nums[i] = sc.nextInt();	// 입력 값을 nums배열 안에 차례대로 집어넣음
		}
		
		max = nums[0];	// max 변수에 nums[0] 값을 집어넣고
		
		for (int i=0; i<nums.length; i++) {
			if (max<nums[i]) {	// 비교 시작
				max = nums[i];	// nums[i]의 값이 max보다 크다면 max 안에 nums[i]의 값을 넣기
			}
			
		}
		System.out.println(max);	// 가장 큰 수 출력
	}
}
