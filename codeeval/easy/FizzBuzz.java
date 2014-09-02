//This code is w.r.t codeval site.
if (lineArray.length > 0) {
    for(int i = 1; i <= Integer.valueOf(lineArray[2]); i++) {                    
	if (((i % Integer.valueOf(lineArray[0])) == 0) && ((i % Integer.valueOf(lineArray[1])) == 0))
	System.out.print("FB");    
	else if ((i % Integer.valueOf(lineArray[0])) == 0) System.out.print("F"); 
	else if ((i % Integer.valueOf(lineArray[1])) == 0) System.out.print("B");
	else System.out.print(i);                        
	System.out.print(" "); 
    }
	
}
      System.out.println();
