package parityOutlier;

public class Main {

	public static void main(String[] args) {
		
		int[] exampleTest1 = {2,6,8,-10,3}; 
	    int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}; 
	    int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
	    
	    System.out.println(find(exampleTest1));
	    System.out.println(find(exampleTest2));
	    System.out.println(find(exampleTest3));
	}
	
		  static int find(int[] integers){
		    int evenCount = 0;
				int oddCount = 0;
				int eHolder= 0;
				int oHolder = 0;
				int temp;
				
				for(int i = 0; i < integers.length; i++) {
					temp = integers[i] % 2;
					if(temp == 0) {
						evenCount++;
						eHolder = i;
					}else {
						oddCount++;
						oHolder = i;
					}
				}
				
				if (evenCount < oddCount) {
					return integers[eHolder];
				} else {
					return integers[oHolder];
				}
		}
	

}


