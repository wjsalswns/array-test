package arrayTest;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 최대 100개까지의 정수를 차례로 입력받다가
		// 0이 입력되면 입력을 중단하고,
		// 짝수번째 입력된 정수를 모두 출력하는 프로그램 작성
		// 5 9 12 16 78 18 98 35 15 0
		// 9 16 18 35
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100];
		int cnt = 0;
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i]==0) {
				break;
			}
			cnt++;
		}
		
		for (int i=0; i<cnt; i+=2) {
			System.out.print(arr[i+1] + " ");
		}
		
	}
}
