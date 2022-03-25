package Day6_Practice;
import java.util.Scanner;
public class Perfect_No {

	public static void main(String[] args) {
		int n, sum=0;
		System.out.println("Enter The Number");
		Scanner r= new Scanner(System.in);
		n=r.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
			
		}
		if(sum==n) {
			System.out.println("Perfect no");
			}else {
				System.out.println("Not Perfect");
		}
	}

}
