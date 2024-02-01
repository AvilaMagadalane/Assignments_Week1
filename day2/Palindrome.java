package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		/*
		 * num=34343
		 * re=num%10
		 * rev=0*10+re
		 * num=num/10
		 */
		int num=34343;
		int temp=num;
		int rem = 0;
		for(;num!=0;num=num/10) {
			rem=rem*10+num%10;
		}
		if(temp==rem) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}



