package Day6_Practice;
import java.util.Scanner;
public class StopWatch {
		static long start=0,stop=0;
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter 1 to start");
				sc.next();
				start=System.currentTimeMillis();
				System.out.println("start time " +start);
				
				System.out.println("enter to stop");
				sc.next();
				stop=System.currentTimeMillis();
				
				
				System.out.println("stop time" +stop);
		        System.out.println("elapsed " +(stop-start)/1000);

}
}
