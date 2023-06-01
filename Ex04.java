package arrayTest;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 100개의 정수를 저장할 수 있는 배열을 선언하고
		// 정수를 차례로 입력하다가 0이 입력되면 입력을 멈추고
		// 가장 마지막에 입력된 수 부터 역순으로 출력
		
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
		
		for (int i=cnt; i>0; i--) {
			System.out.print(arr[i-1] + " ");
		}
		
		
	}
}
