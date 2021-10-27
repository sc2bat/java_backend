// package days07;

public class ControllOpFor151 {

	public static void main(String[] args) {
		/**/
		// 
		//
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
		System.out.println("\n//--------------------------------------------------------");
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.printf("#");
				if(i == j)break;
			}
			System.out.println();
		}
		/*
		#
		##
		###
		####
		#####
		######
		#######
		########
		#########
		##########*/

		System.out.println("\n//--------------------------------------------------------");
		int k = 1;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= k; j++) {
				System.out.printf("#");
			}
			k++;
			System.out.println();
		}

		System.out.println("\n//--------------------------------------------------------");
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}

		System.out.println("\n//--------------------------------------------------------");
		/*
		##########
		#########
		########
		#######
		######
		#####
		####
		###
		##
		#
		 */

		for(int i = 1; i <= 10; i++) {
			for(int j = 10; j >= i; j--) {
				System.out.printf("#");
			}
			System.out.println();
		}

		System.out.println("\n//--------------------------------------------------------");

		for(int i = 10; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}

		System.out.println("\n//--------------------------------------------------------");
		/*
		##########
		  #########
		    ########
		      #######
		        ######
		          #####
		            ####
		              ###
		                ##
		                  #*/

		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if(i <= j)System.out.printf("#");
				else System.out.printf("  ");
			}
			System.out.println();
		}

		System.out.println("\n//--------------------------------------------------------");
		
		
		
		
		
	}

}
