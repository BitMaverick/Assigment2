package Assigment2;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {

	public static Scanner input = new Scanner(System.in);
	public static int choose,quantity=1;
	public static String chooses;
	public static int housequantity = 3;
	public static int newhouse = 0;
	public static String newvalue;
	public static String newaddress = "";
	public static String owner = "";
	public static String phone = "";



	public static void menu() {
		// TODO Auto-generated method stub
		
		 System.out.println("Welcome to Your Real Estate, Please Select the type of Operation you want to do");
		    System.out.println("\t\t\t\t   1. Add New Property");
		    System.out.println("\t\t\t\t   2. Get a list of properties to enter valuation");
		    System.out.println("\t\t\t\t   3. Get a list of houses that requires photos");
		    System.out.println("\t\t\t\t   4. Record a house as ready for inspection");
		    System.out.println("\t\t\t\t   5. Scheduele an inspection");
		    System.out.println("\t\t\t\t   6. Record an offer");
		    System.out.println("\t\t\t\t   7. See house prices");
	   
		    choose = input.nextInt();	    
	
		   
		    switch (choose) {
		      case 1:
		    	  System.out.println("Whats the house address you want to add it?");

			    	
			    	input.nextLine();
			    	newaddress = input.nextLine();
			    	houses.address.add(newaddress);	    	
			    	System.out.println("Address succesfully added, Please place the Owner Name");
			    	owner = input.nextLine();
			    	houses.owner.add(owner);
			    	
			    	System.out.println("Name succesfully added, Please place the Owner phone number");
			    	phone = input.nextLine();
			    	houses.phone.add(phone);
			    	houses.values.add("");
			    	
			    	//int size = houses.address.size()+1;
			    	houses.price.add(false);
			    	houses.photos.add(false);

			    	System.out.println("Phone succesfully added, press 0 to go back to the menu");
			    	choose = input.nextInt();
			    	 
			    	 if (choose==0){
			    		 menu();		 
			    	 }else {
			    	 }
		        break;
		      case 2:
		    	  for (int i = 0; i < houses.owner.size(); i++) {
		        		System.out.println("house number: " + i+ " - " + houses.address.get(i)+ " - " + houses.values.get(i));
		        		}
	    	
			    	 System.out.println("\t\t\t\t   Please enter the number of the house you want to valuate");
			    	 
					
			    	choose = input.nextInt();
			    	boolean check = houses.price.get(choose);
			    	
			    	 if (check == true) {
			    		 System.out.println("\t\t\t\t   This house already have a price, press 0 to go back to the menu");
			    		 
			    		 choose = input.nextInt();
			    		 if (choose==0){
				    		 menu();
				    	 }
				    	 else {
				    		 System.out.println("\t\t\t\t   Invalid Option");
				    	 } 
			    		 
			    	 } else {
			    	 

			    	 System.out.println("You chose " + houses.address.get(choose));
			    	 System.out.println("\t\t\t\t   Please enter the value of the house");
			    	 input.nextLine();
			    	 newvalue = input.nextLine();
			    	 houses.values.set(choose, newvalue);
			    	 houses.price.set(choose, true);
 	 
			    	 System.out.println("\t\t\t\t   The new price was recorded, press 0 to go back to the Menu");

			    	 choose = input.nextInt();
			    	 if (choose==0){
			    		 menu();
			    	 }
			    	 else {
			    		 System.out.println("\t\t\t\t   Invalid Option");
			    	 } 
			    	 }
		        break;
		      case 3:
		        
		    	  
		    	  for (int i = 0; i < houses.photos.size(); i++) {
		    		 check = houses.photos.get(i);
		    		boolean checkvaluation = houses.price.get(i);
		    		 
		    		  if (check == true & checkvaluation == true) {
		    			  
		    			  System.out.println(houses.address.get(i)+" has photos");
		    			    
		    			} else {
		    				 
		    			}
  		
		        		}
		    	  
		    	  System.out.println("\t\t\t\t   Press 0 to go back to the Menu");
		    		
			    	 choose = input.nextInt();
			    	 if (choose==0){
			    		 menu();
			    		 
			    	 }
			    	 else {

			    	 } 
		    	  
		        break;
		      case 4:
		    	  for (int i = 0; i < houses.photos.size(); i++) {
			    		 check = houses.photos.get(i);
			    		boolean checkvaluation = houses.price.get(i);
			    		 
			    		  if (check == true & checkvaluation == true) {
			    			  System.out.println("Insert the number of the house that is ready");
			    			  System.out.println("Options:");
			    			  System.out.println("house number: "+ i + " - " + houses.address.get(i));
			    			  
			    			  
			    			  
			    			  choose = input.nextInt();
			    			  houses.ready.set(choose, true);
			    			  houses.photos.set(choose, true);
			    			} else {
			    				 
			    			}
	  		
			        		}
			    	  
			    	  System.out.println("\t\t\t\t   Press 0 to go back to the Menu");
			    		
				    	 choose = input.nextInt();
				    	 if (choose==0){
				    		 menu();
				    		 
				    	 }
				    	 else {

				    	 } 
		        break;
		      case 5:
		    	  for (int i = 0; i < houses.photos.size(); i++) {
			    		 check = houses.ready.get(i);
			    		
			    		 
			    		  if (check == true) {
			    			  System.out.println("house number: "+ i + " - " + houses.address.get(i));
			    			  System.out.println("Insert the number of the house that you want to schedule");
			    			  
			    			  
			    			  
			    			  
			    			  
			    			  choose = input.nextInt();
			    			  
			    			  System.out.println("Insert the time that you want scheduele");
			    			  chooses = input.nextLine();
			    			  houses.time.set(choose, chooses);
			    			  
			    			  System.out.println("Insert the day that you want scheduele");
			    			  chooses = input.nextLine();
			    			  houses.day.set(choose, chooses);
			    			  
			    			} else {
			    				 
			    			}
	  		
			        		}
			    	  
			    	  System.out.println("\t\t\t\t   Press 0 to go back to the Menu");
			    		
				    	 choose = input.nextInt();
				    	 if (choose==0){
				    		 menu();
				    		 
				    	 }
				    	 else {

				    	 } 
		        break;
		      case 6:
		        System.out.println("Saturday");
		        break;
		      case 7:
		    	  for (int i = 0; i < houses.address.size(); i++) {
		        		System.out.println(houses.address.get(i)+": $" +houses.values.get(i));
		        		}
		         
			    	 System.out.println("\t\t\t\t   Press 0 to go back to the Menu");
	
			    	 choose = input.nextInt();
			    	 if (choose==0){
			    		 menu();
			    		 
			    	 }
			    	 else {

			    	 } 
		        break;
		    }
	}
		

	public static void main(String[] args) {
		
	       menu();
	    
	    } 
}
