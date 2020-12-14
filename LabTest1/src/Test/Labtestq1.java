package Test;
import java.util.Scanner;
public class Labtestq1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num[]= {"first","second","third"};
		//input items
	    System.out.print("Enter the number of items: ");
	    int items=sc.nextInt();
	    //input price and qty and total
	    double total=0;
	    for(int i=0;i<items;i++) {
	    System.out.print("Enter price of "+num[i]+ " item: ");
	    int price=sc.nextInt();
	    System.out.print("Enter quantity of " +num[i]+ " : ");
	    int qty=sc.nextInt();
	    System.out.println();
	    total=total+(price*qty);
	    
	    }
	    //count discount
	   double discount;
	   if(total>=100) {
		   discount=total*0.20;
	   }
	   else
		   discount=total*0.10;
			   
	   
	    //calculate price to be paid
	   double pricetobepaid=total-discount;
	   
	   
	   
	   
	   //output
	   
	   System.out.println();
	   System.out.println("Total price \t\t: RM"+total);
	   System.out.println("Dicount received \t: RM"+discount);
	   System.out.println("Price to be paid \t: RM"+pricetobepaid);
	   
	    
		    

	}

}

