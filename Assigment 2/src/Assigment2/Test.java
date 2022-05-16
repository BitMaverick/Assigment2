package Assigment2;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {

	public static Scanner input = new Scanner(System.in);
	public static int choose,quantity=1;
	//public static String address[] = {"47 Aydoteaux Avenue, Hurstville", "2/55 Ashab Street, Ashfield", "8 Henry Court, Punchbowl", "", "", "", "", "", ""};
	public static String houseId[] = {"0", "1", "2"};
	public static String housePrice[] = {"0", "0", "0"};
	public static int housequantity = 3;
	public static int newhouse = 0;
	public static String newaddress = "";
	public static ArrayList<String> address = new ArrayList<String>();
	 
	 
	public static void menu() {
		// TODO Auto-generated method stub
		
		 System.out.println("Welcome to Your Real Estate, Please Select the type of Operation you want to do");
		    System.out.println("\t\t\t\t   1. Add New Property");
		    System.out.println("\t\t\t\t   2. Get a list if properties to enter valuation");
		    System.out.println("\t\t\t\t   3. Get a list if properties to enter valuation");
		    System.out.println("\t\t\t\t   4. Get a list of houses that requires photos");
		    System.out.println("\t\t\t\t   5. List of houses that are ready for inspection");
		   
		   
		    choose = input.nextInt();
		    
		    if(choose==1){
		    	System.out.println("Whats the house address you want to add it?");
		    	
		    	
		    	newhouse = housequantity;
		    	
		    	input.nextLine();
		    	newaddress = input.nextLine();
		    	 address.add(newaddress);
		    	//address[newhouse] = input.nextLine();
		    	
		    	housequantity = housequantity + 1;
		    	
		    	System.out.println("House succesfully added, press 0 to go back to the menu");
		    	 choose = input.nextInt();
		    	 
		    	 if (choose==0){
		    		 menu();
		    		 
		    	 }else {
		    		 

		    	 }
		    	
		        }else if (choose==2) {
		        	
		        	for (int i = 0; i < housequantity; i++) {
		        		System.out.println(address.get(i));
		        		}
		         
			    	
			    	 System.out.println("\t\t\t\t   Please enter the number of the house you want to make changes or press 0 to go back to the menu:");
					
			    	 choose = input.nextInt();
			    	 
			    	 System.out.println("You chose " + address.get(choose));
			    	 System.out.println("What changes do you want to make?");
			    	 System.out.println("Option 1 - enter valuation");
			    	 System.out.println("Option 2 - Mark as requiring photo");
			    	 System.out.println("Option 3 - Schedule an inspection");
			    	 System.out.println("Option 4 - Cancel a inspection");
			    	 System.out.println("Option 5 - Mark as ready for inspection");
			    	 
			    	 
			    	 
			    	 if (choose==0){
			    		 menu();
			    		 
			    	 }
			    	 else {

			    	 } 
			    	 
		        }
else if (choose==1) {
		        	
	 System.out.println("Option 1 selected");
			    	 
			    	 if (choose==0){
			    		 menu();
			    		 
			    	 }
			    	 else {

			    	 } 
			    	 
		        }

		    else{
	        	
		        	menu();
		            
		        }
	}

	public static void main(String[] args) {
		address.add("47 Aydoteaux Avenue, Hurstville");
		address.add("2/55 Ashab Street, Ashfield");
		address.add("8 Henry Court, Punchbowl");
	       menu();
	    
	    } 
}
