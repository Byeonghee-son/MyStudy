package baekjoon;

import java.util.Scanner;

public class 알람시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시를 입력하세요 : ");
		int H = sc.nextInt();
		System.out.println("분을 입력하세요 : ");
		int M = sc.nextInt();

		if (M < 45) {
			H--;
			M += 15;
			if (H < 0) {
				H = 23;

			}
		} else {
			M -= 45;
		}
		System.out.println("알람울리는 시간은 " + H + "시" + M + "분입니다.");
	}
}