
public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 for(int i = 1; i<= 1000000; i++){  //in dieser Zeile wird festgelegt f�r 
			                                //welchen Zahlenbereich die Collatzvermutung
			                                //�berpr�ft wird i= Hochz�hlvariable
		
			 int n = i;   //Hier wird die Hochz�hlvariable nach n 
			              //kopiert damit diese nicht durch folgenden 
			              //Algorhytmus nicht �berschrieben wird
			 
		System.out.print(n+"; "); 
	
	do{	
		
		if (n%2==0) {
			n=n/2;}
		
					
		  else {n=3*n+1;}	
		
				
				System.out.print(n +"; ");}
			while(n>1);
			
	System.out.println();
				
		
		 }
	}

}

