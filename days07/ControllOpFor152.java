//package days07;

public class ControllOpFor152 {

	public static void main(String[] args) {
		/**/
		// 
		//
		/*									#
										##
        							###
        						####
      						#####
    					######
    				#######
				########
			#########
		##########*/
		for(int i = 10; i >= 1; i--) {
			for(int j = 1; j <= 10; j++) {
				if(i <= j)System.out.printf("#");
				else System.out.printf(" "); 	
			}
			System.out.println();
		}

		System.out.println("\n//8--------------------------------------------------------");
		
		
		
	}

}
