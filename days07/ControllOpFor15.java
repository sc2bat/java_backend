package days07;

public class ControllOpFor15 {

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
		System.out.println("\n//1--------------------------------------------------------");
		
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

		System.out.println("\n//2--------------------------------------------------------");
		int k = 1;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= k; j++) {
				System.out.printf("#");
			}
			k++;
			System.out.println();
		}

		System.out.println("\n//3--------------------------------------------------------");
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}

		System.out.println("\n//4--------------------------------------------------------");
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

		System.out.println("\n//5--------------------------------------------------------");

		for(int i = 10; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}

		System.out.println("\n//6--------------------------------------------------------");
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
				else System.out.printf("  "); // 이클립스 콘솔창 기준 2칸띄우면 나름 정렬되게 보임 cmd 에서는 1칸만띄워도 정렬 잘 되어 있음	
			}
			System.out.println();
		}

		System.out.println("\n//7--------------------------------------------------------");
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
				else System.out.printf("  "); 	
			}
			System.out.println();
		}

		System.out.println("\n//8--------------------------------------------------------");
		/* for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 20; j+=2) {
				if(j <= 20 && j%2>0)System.out.printf("#");
				else System.out.printf(" ");
			}
			System.out.println();
		} */

		System.out.println("\n//9--------------------------------------------------------");
		/*	 								#
       									###
      								#####
     							#######
    						#########
   						###########
  					#############
 				###############
			#################
		###################*/
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i+9; j++) {
				if(j >= 11-i)System.out.printf("#");
				else System.out.printf(" ");
			}
			System.out.println();
		}

		System.out.println("\n//10--------------------------------------------------------");
	}

}
