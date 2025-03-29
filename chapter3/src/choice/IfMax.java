package choice;

import java.util.Scanner;

public class IfMax {

	public static void main(String[] args) {
		// 두 수중 큰 수 비교
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int n1 = sc.nextInt();
		
		System.out.print("두번째 수 입력: ");
		int n2 = sc.nextInt();
		
		int max;
		max = n1 > n2 ? n1 : n2;
		
		/*
		 if(n1 > n2){
			max = n1
		} 
		 else{
			max = n2
		}
		 */
		System.out.println("두 수 중 큰 수는" + max + "입니다.");
	}

}
