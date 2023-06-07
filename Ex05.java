package arrayTest;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// 연도와 월을 입력받아 해당 월의 날짜수를 출력하다가 월 입력 때 0을 입력하면 종료하는 프로그램
		// (월을 잘못 입력하면 "잘못 입력하였습니다" 출력)
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		while (true) {
			System.out.print("년 : ");
			int year = sc.nextInt();	// 년도 입력
			System.out.print("월 : ");
			int month = sc1.nextInt();	// 월 입력
			
			if (month==0) {	// 월이 0이면 종료
				System.out.println("시스템을 종료합니다.");
				break;
			} else if (month<1 || month>12) {	// 월이 1보다 작거나 12보다 크면 다시 입력받기
				System.out.println("오류입니다. 다시 입력하세요.");
				continue;
			}
			
			if (year%100!=0 && year%4==0 && month==2 || year%400==0) {
				// 년도가 100의 배수가 아니고 년도가 4의 배수이고 2월일 때나 년도가 400의 배수일 때 29일 출력
				System.out.println(year + "년 " + month + "월 29일");
			} else if (month==2) {	// 위 조건 충족하지 않고 2월일 때 28일 출력
				System.out.println(year + "년 " + month + "월 28일");
			} else if (month%2!=0 && month<8) {	// 8월 미만이고 월이 2의 배수가 아닐 때(1, 3, 5, 7) 31일 출력
				System.out.println(year + "년 " + month + "월 31일");
			} else if (month%2==0 && month<8) {	// 8월 미만이고 월이 2의 배수일 때(2, 4, 6) 30일 출력
				System.out.println(year + "년 " + month + "월 30일");
			} else if (month%2!=0 && month>=8) {	// 8월 이상이고 월이 2의 배수가 아닐 때(9, 11) 30일 출력
				System.out.println(year + "년 " + month + "월 30일");
			} else if (month%2==0 && month>=8) {	// 8월 이상이고 월이 2의 배수일 때(8, 10, 12) 31일 출력
				System.out.println(year + "년 " + month + "월 31일");
			}
		}
		
	}
}
