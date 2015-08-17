//import java.io.*;
import java.util.*;
//import java.text.*;
import java.math.*;
//import java.util.regex.*;
//import java.util.ArrayList;

public class Problem1 {
	
	 
	
	 	  //BigDecimal s;
	  
	public static void main(String[] args)
	{  
	  Scanner scanner = new Scanner(System.in);
	  int n = scanner.nextInt();
	   System.out.println("You entered integer "+n);
	   
	  List<BigDecimal> BD = new ArrayList<BigDecimal>();
    //System.out.println("Enter a string");
	 // n = scanner.nextInt();
	/*  while(scanner.hasNext()){
		  BD.add(new BigDecimal(scanner.next()));
		  break;
	} 
	
	  for(BigDecimal bd :BD){
		  System.out.println(bd);
		  }  */
	  
	  for(int i=0;i<n;i++){
		  BD.add(new BigDecimal(scanner.next()));
	  }
	  
	  
	 
	  //Collections.reverse(BD);
	 Collections.sort(BD,Collections.reverseOrder());
	  for(BigDecimal bd :BD){
	  System.out.println(bd);
	  }
	}
	
}

	  
	