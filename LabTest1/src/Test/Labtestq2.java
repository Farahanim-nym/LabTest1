package Test;
import java.util.Scanner;
public class Labtestq2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		System.out.print("Enter sales \t\t: RM");
		int sales=obj.nextInt();
		System.out.print("Enter hours worked \t: ");
		int hours=obj.nextInt();
		double commission=0;
		if(sales>=150 && sales<=300 ) {
			commission=sales*0.05;
		}
		else if(sales>=301 && sales<=500) {
		    commission=sales*0.10;
	}
	    else if(sales>=500) {
		commission=sales*0.15;
		}
		
		
		double dailywages=(hours*5)+commission;
		System.out.println();
		System.out.println("Commission \t:RM"+commission);
		System.out.println("Daily wages \t:RM"+dailywages);
		
			
			
		

	}

}
