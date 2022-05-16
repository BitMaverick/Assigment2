package Assigment2;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {

	public static Scanner input = new Scanner(System.in);
	public static int choose,quantity=1;
	public static String chooses;
	public static int housequantity = 3;
	public static int newhouse = 0;
	public static int remove = 0;
	public static String newvalue;
	public static String newaddress = "";
	public static String owner = "";
	public static String phone = "";
	public static String offer = "";
	public static Boolean accepted = false;


	public static void menu() {
		// TODO Auto-generated method stub
		
		 System.out.println("Welcome to Your Real Estate, Please Select the type of Operation you want to do");
		    System.out.println("\t\t\t\t   1. Add New Property");
		    System.out.println("\t\t\t\t   2. Get a list of properties to enter valuation");
		    System.out.println("\t\t\t\t   3. Get a list of houses that requires photos");
		    System.out.println("\t\t\t\t   4. Record a house as ready for inspection");
		    System.out.println("\t\t\t\t   5. Scheduele an inspection");
		    System.out.println("\t\t\t\t   6. Record an offer");
		    System.out.println("\t\t\t\t   7. See house offers");
		    System.out.println("\t\t\t\t   8. See  Scheduele inspections");
		    System.out.println("\t\t\t\t   9. Cancel inspections");
		    System.out.println("\t\t\t\t   10. Accept offer");
		    System.out.println("\t\t\t\t   11. See list of all houses that have been contracted for sale ");
		    
	   
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
			    	photos.photos.add(false);
			    	int id = houses.owner.size();
			    	photos.id.add(id);
			    	houses.id.add(id);

			    	System.out.println("Phone succesfully added, press 0 to go back to the menu");
			    	choose = input.nextInt();
			    	 
			    	 if (choose==0){
			    		 menu();		 
			    	 }else {
			    	 }
		        break;
		      case 2:
		    	  for (int i = 0; i < houses.owner.size(); i++) {
		        		System.out.println("house number: " +  houses.id.get(i) + " - " + houses.address.get(i)+ " - " + houses.values.get(i));
		        		}
	    	
			    	 System.out.println("\t\t\t\t   Please enter the number of the house you want to valuate");
			    	 
					
			    	choose = input.nextInt() - 1;
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
		        
		    	  
		    	  for (int i = 0; i < photos.photos.size(); i++) {
		    		 check = photos.photos.get(i);
		    		boolean checkvaluation = houses.price.get(i);
		    		 
		    		  if (check == false & checkvaluation == true) {
		    			  
		    			  System.out.println(houses.address.get(i)+" requires photos");
		    			    
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
		    	  for (int i = 0; i < photos.photos.size(); i++) {
			    		 check = photos.photos.get(i);
			    		boolean checkvaluation = houses.price.get(i);
			    		 
			    		  if (check == true & checkvaluation == true) {
			    			  System.out.println("Insert the number of the house that is ready");
			    			  System.out.println("Options:");
			    			  System.out.println("house number: "+ Integer.sum(i, 1) + " - " + houses.address.get(i));
			    			  
			    			  
			    			  
			    			  choose = input.nextInt()-1;
			    			 
			    			} else {
			    				 
			    			}
			    
			        		}
				  houses.ready.set(choose, true);
    			  photos.photos.set(choose, true);
			    	  System.out.println("\t\t\t\t   Press 0 to go back to the Menu");
			    		
				    	 choose = input.nextInt();
				    	 if (choose==0){
				    		 menu();
				    		 
				    	 }
				    	 else {

				    	 } 
		        break;
		      case 5:
		    	  for (int i = 0; i < photos.photos.size(); i++) {
			    		 check = houses.ready.get(i);
			    		
			    		 
			    		  if (check == true) {
			    			  System.out.println("house number: "+ houses.id.get(i) + " - " + houses.address.get(i));
			    			
			    			  
			    			  
			    			  
			    
			    			  
			    			} else {
			    				 
			    			}
	  		
			        		}
		    	  System.out.println("Insert the number of the house that you want to schedule");
		    	  choose = input.nextInt();    	  
		    	  Inspections.id.add(choose);
		    	  
		    	 System.out.println("Insert the time that you want scheduele");
		    	 input.nextLine();
		    	 chooses = input.nextLine();
		    	 Inspections.time.add(chooses);
		    	  
		    	 System.out.println("Insert the day that you want scheduele");
		    	chooses = input.nextLine();
		        Inspections.day.add(chooses);
		    	  
		        System.out.println("Insert your name");
		    	chooses = input.nextLine();
		        Inspections.clientName.add(chooses);
		    	  
			    	  System.out.println("\t\t\t\t All recorded. Press 0 to go back to the Menu");
			    		
				    	 choose = input.nextInt();
				    	 if (choose==0){
				    		 menu();
				    		 
				    	 }
				    	 else {

				    	 } 
		        break;
		      case 6:
		    	  
		 
		    	  System.out.println("Whats the house id you want to make an offer?");

			    
			    	int newid = input.nextInt();
			    	offers.id.add(newid);
			    	
			    	System.out.println("How much you would like to offer");
			    	input.nextLine();
			    	offer = input.nextLine();
			    	offers.price.add(offer);
			    	
			    	
			    	System.out.println("offer succesfully added, Please place your name");
			    	owner = input.nextLine();
			    	offers.owner.add(owner);
			    	offers.accepted.add(false);
			    	
			    	

			    	System.out.println("All recorded succesfully, press 0 to go back to the menu");
			    	choose = input.nextInt();
			    	 
			    	 if (choose==0){
			    		 menu();		 
			    	 }else {
			    	 }
		        break;
		      case 7:
		    	  
		    	  if (offers.id.size() > 0) {
		    	  for (int i = 0; i < offers.id.size(); i++) {
		        		System.out.println("house number:"+offers.id.get(i)+" - Offer: $" +offers.price.get(i)+" - Name of who offered:"+offers.owner.get(i));
		        		}
		         
			    	 System.out.println("\t\t\t\t   Press 0 to go back to the Menu");
	
			    	 choose = input.nextInt();
			    	 if (choose==0){
			    		 menu();
			    		 
			    	 }
			    	 else {
			    		 
			    	 } 
		    	  } else {
		    		  System.out.println("\t\t\t\t   There's no offer yet, press 0 to go back");
		    		  choose = input.nextInt();
		    		  if (choose==0){
				    		 menu();
				    		 
				    	 }
				    	 else {
				    		 
				    	 } 
		    	  }
		        break;
 case 8:
	  if (Inspections.id.size() > 0) {
    	  for (int i = 0; i < Inspections.id.size(); i++) {
        		System.out.println("house number:"+Inspections.id.get(i)+" - Time:" +Inspections.time.get(i)+" - Client Name:"+Inspections.clientName.get(i)+" - Day:"+Inspections.day.get(i));
        		}
         
	    	 System.out.println("\t\t\t\t   Press 0 to go back to the Menu");

	    	 choose = input.nextInt();
	    	 if (choose==0){
	    		 menu();
	    		 
	    	 }
	    	 else {
	    		 
	    	 } 
    	  } else {
    		  System.out.println("\t\t\t\t   There's no inspections scheduele");
    		  choose = input.nextInt();
    		  if (choose==0){
		    		 menu();
		    		 
		    	 }
		    	 else {
		    		 
		    	 } 
    	  }	  
	 break;
	 
 case 9:
	 
	 if (Inspections.id.size() > 0) {
   	  for (int i = 0; i < Inspections.id.size(); i++) {
       		System.out.println("Inspection id:"+Integer.sum(i, 1)+" - Time:" +Inspections.time.get(i)+" - Client Name:"+Inspections.clientName.get(i)+" - Day:"+Inspections.day.get(i));
       		}
        
	    	 System.out.println("\t\t\t\t Insert the inspection id that you want to cancel - Press 0 to go back to the Menu");
	    	 
	    	 choose = input.nextInt();
	    	 remove = choose-1;
	    	 Inspections.id.remove(remove);
	    	 System.out.println("\t\t\t\t Inspection successfully deleted, press 0 to go back to the menu");
	    	 choose = input.nextInt();
	    	 
	    	 if (choose==0){
	    		 menu();
	    		 
	    	 }
	    	 else {
	    		 
	    		 System.out.println("\t\t\t\t Inspection successfully deleted, press 0 to go back to the menu");
	    		 if (choose==0){
		    		 menu();
		    		 
		    	 }
		    	 else {
		    		 
		    		 System.out.println("\t\t\t\t Inspection successfully deleted, press 0 to go back to the menu");
		    	 } 
	    	 } 
   	  } else {
   		  System.out.println("\t\t\t\t   There's no inspections scheduele");
   		  choose = input.nextInt();
   		  if (choose==0){
		    		 menu();
		    		 
		    	 }
		    	 else {
		    		 
		    	 } 
   	  }	  
	  
	 break;
 case 10:
	  
	  if (offers.id.size() > 0) {
	  for (int i = 0; i < offers.id.size(); i++) {
   		System.out.println("house id:"+Integer.sum(i, 1)+" - house number:"+offers.id.get(i)+" - Offer: $" +offers.price.get(i)+" - Name of who offered:"+offers.owner.get(i));
   		}
    
	  System.out.println("\t\t\t\t Insert the offer id that you want to accept - Press 0 to go back to the Menu");

   	 choose = input.nextInt();
   	 remove = choose - 1;
   	 offers.accepted.set(remove, true);
   	 System.out.println("\t\t\t\tOffer accepeted, press 0 to go back to the menu");
	 choose = input.nextInt();
   	 if (choose==0){
   		 menu();
   		 
   	 }
   	 else {
   		 
   	 } 
	  } else {
		  System.out.println("\t\t\t\t   There's no offer yet, press 0 to go back");
		  choose = input.nextInt();
		  if (choose==0){
	    		 menu();
	    		 
	    	 }
	    	 else {
	    		 
	    	 } 
	  }
   break;
 case 11:
	  if (offers.id.size() > 0){
   	  for (int i = 0; i < offers.id.size(); i++) {
   		accepted = offers.accepted.get(i);
   		  if(accepted == true) {
       		System.out.println("house number:"+offers.id.get(i)+" - Price:" +offers.price.get(i)+" - Client Name:"+offers.owner.get(i));
       		} else {
       		 System.out.println("\t\t\t\t   There's no accepted offers, press 0 to go back");
       		 

		  choose = input.nextInt();
		  if (choose==0){
	    		 menu();
	    		 
	    	 }else {
	    	
		  System.out.println("here2");
	    	 } 
       		}	
   	  }
   	  }
   	  else {
   		  System.out.println("\t\t\t\t   There's no accepted offers, press 0 to go back");
   		  choose = input.nextInt();
   		  if (choose==0){
		    		 menu();
		    		 
		    	 }
		    	 else {System.out.println("here1");
		    		 
		    	 } 
   	  }	  
	 break;
		    }
	}
		

	public static void main(String[] args) {
		
	       menu();
	    
	    } 
}
