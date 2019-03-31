import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;



public class Test {
	
	static bal b = new bal();
	static bal b2 = new bal();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// fibonacci print out
	/*	int max  = 10;
		int n1 = 0;
		int n2 =1;
		for(int i =1; i <=max; i++) {
			
			
			System.out.println(n1+ " ");
			int sum = n1+n2;
			n1= n2;
			n2 = sum;
		
	}
		*/	
		
		
		bal b = new bal();
		bal b2 = new bal();
		b2.setI(5);
		b2.setS("new b2");
		
		b.setS("bala");
        b.setI(12);
	
		
		System.out.println(b);
		System.out.println(b2);

		/*
		 * int ndisks =3; String steps = hanoi(ndisks, 1,3);
		 * 
		 * for(String s : steps.split(" , ")) { System.out.print(s);
		 * 
		 * }
		 */
		}
	
	
	// towers of hanoi
	
	public static String hanoi(int ndisks, int from, int to) {
		  if(ndisks  == 1) {
			  return from +" - > " + to + ", "; 
		  
		  }
		  else {
			  		  
			  String sol1, sol2, sol3;
			  
			  int helper = 6 - from - to;
			  
			  sol1 = hanoi(ndisks-1, from,helper);
			  sol2 = from + " - > " + to + ", ";
			  sol3= hanoi(ndisks-1, helper, to);
			  
			 return  sol1+sol2+sol3;
					  
		  }
		
	}	

}
