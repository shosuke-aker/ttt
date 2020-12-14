package 練習;

import java.util.Scanner;

public class Birthday2 {

	public static void main(String[] args) {
		int[] days = new int[6];
		int day = 0;
		int result = 0;
		days = SCANNER();
		result = Result(days);
		System.out.println("あなたの年齢は"+result+"才です。");

	}

	public static int[] SCANNER() {
		//	int day=0;
		//	int day1=0;
		//	int day2=0;
		//	int day3=0;
		//	int day4=0;
		//	int day5=0;
		//	int[] day6=new int [6];
		int[] days = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.print("今日の年をを入力してください。");
		days[0] = sc.nextInt();
		System.out.print("今日の月を入力してください。");
		days[1] = sc.nextInt();
		System.out.print("今日の日を入力してください。");
		days[2] = sc.nextInt();
		System.out.print("誕生日を西暦で入力してください。");
		days[3] = sc.nextInt();
		System.out.print("誕生月を入力してください。");
		days[4] = sc.nextInt();
		System.out.print("誕生日を入力してください。");
		days[5] = sc.nextInt();

		return days;
	}

	public static int Result(int[] days) {
		int year = 0;
		int month = 0;
		int day = 0;
		year = days[0] - days[3];
		if (days[4] >= days[1] && days[5] > days[2]) {
			year--;
		}
		return year;
	}	
	
}


//	public static void REsult(result) {
//		
//	}
//	


