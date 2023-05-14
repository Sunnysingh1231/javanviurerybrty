import java.util.*;
class Main {
	public static void main(String[] args) {
		System.out.println("plz enter your number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("input number is even");
		}
		else {
			System.out.println("input number is odd");
		}
	}
}