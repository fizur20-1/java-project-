import java.lang.*;
import fileio.*;
import classes.*;
import java.util.*;
import java.io.IOException;  
  
public class Start{

public static void main(String... arg) throws IOException, InterruptedException{  

		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  //runtime clear

		FoodCourt fc = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in);

		boolean repeat = true;

			System.out.println();
			System.out.println("                         ------------------------------------------- ");
			System.out.println("                        |  Welcome to Cheif's Kitchen Food Court    |");
			System.out.println("                         ------------------------------------------- ");
			System.out.println();
		
		while(repeat)                            //Main menu Loop 
		{
			System.out.println("                         ------------------------------------------- ");
			System.out.println("                   	|       What do you want to choose?         |");
			System.out.println("                   	|                                           |");
			System.out.println("               		|       1. Employee Management              |");
			System.out.println("               		|       2. Restaurant Management            |");
			System.out.println("               		|       3. Restaurant FoodItem Management   |");
			System.out.println("               		|       4. FoodItem Quantity Add-Sell       |");
			System.out.println("               		|       5. Exit                             |");
			System.out.println("              		 ------------------------------------------- ");

			System.out.print("Please Enter your choice: ");			
			int choice = sc.nextInt();   			//Input for main menu selection

			System.out.println();
		
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();      //Clear main menu

			switch(choice){  		 

				case 1:				//Employee Management
					boolean repeat2= true;
					while(repeat2)     //Employee Management Loop for Going Back   
					{
 
						System.out.println("----------------------------------------");
						System.out.println("   Your choice is Employee Management   ");
						System.out.println("----------------------------------------");

						System.out.println("\nHere are your options: \n");
						System.out.println("-----------------------------");
						System.out.println("1.Insert New Employee");
						System.out.println("2.Remove Existing Employee");
						System.out.println("3.Show All Employees");
						System.out.println("4.Search an Employee");
						System.out.println("5.Go Back");
						System.out.println("-----------------------------");
						System.out.println();


						System.out.print("Enter your option: ");
						int option1 = sc.nextInt();

						System.out.println();
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						
						switch(option1){  //Switch Case for Employee Management Menu 


						case 1:  //(1-----1) Option Employee Management -> Insert New Employee 

						System.out.println("----------------------------------------");
						System.out.println("   Your option is Insert New Employee   ");
						System.out.println("----------------------------------------");
						System.out.println();

						System.out.print("Enter Employee ID: ");
						String empId1 = sc.next();
						System.out.print("Enter Employee Name: ");
						String name1 = sc.next();
						System.out.print("Enter Employee Salary: ");
						double salary1 = sc.nextDouble();

						Employee e1 = new Employee();
						e1.setEmpId(empId1);
						e1.setName(name1);
						e1.setSalary(salary1);

						if(fc.insertEmployee(e1)){
                               
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							System.out.println("\nEmployee Inserted...ID: "+empId1);
							Thread.sleep(3000,100);
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							
						}else {
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							System.out.println("Oops... Something is Wrong...");
							Thread.sleep(3000,100);
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						}

						System.out.println();
						                      
						break;    //Employee Management -> Employee Insert End Here
					      				
						case 2: // (1-----2) Option Employee Management -> Remove Existing Employee 

						System.out.println("---------------------------------------------");
						System.out.println("   Your option is Remove Existing Employee   ");
						System.out.println("---------------------------------------------");
						System.out.println();

						System.out.print("Enter Employee ID: ");
						String empId2 = sc.next();

						System.out.println();
						

						Employee e2 = fc.searchEmployee(empId2);

						if(e2!=null){

							if(fc.removeEmployee(e2)){
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								System.out.println("Employee Removed... ID: "+e2.getEmpId());  //+empId2 ?
								Thread.sleep(3000,100);
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							}else{
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								System.out.println("Oops... Something is Wrong...");
								Thread.sleep(3000,100);
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							}//remove if else

						}else{
							
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							System.out.println("Found nobody to remove");
							Thread.sleep(3000,100);
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						}

						System.out.println();

						break;  //Employee Management -> Remove employee ends here

						case 3: //(1-----3) Option Employee Management -> Show All Employees 

						System.out.println("---------------------------------------");
						System.out.println("   Your option is Show All Employees   ");
						System.out.println("---------------------------------------");
						System.out.println();

						fc.showAllEmployees();
						System.out.println();

						break;  //Employee Management -> Show All Employees End here
						

						case 4: //(1-----4) Option Employee Management -> Search an Employee 

						System.out.println("---------------------------------------");
						System.out.println("   Your option is Search an Employee   ");
						System.out.println("---------------------------------------");
						System.out.println();

						System.out.print("Enter Employee ID: ");
						String empId4 = sc.next();

						System.out.println();

						Employee e4 = fc.searchEmployee(empId4);

						if(e4 != null){
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							System.out.println("Yessssss! We have found the Employee!!!!!!!");
							System.out.println("Employee ID: "+e4.getEmpId());
							System.out.println("Employee Name: "+e4.getName());
							System.out.println("Employee Salary: "+e4.getSalary());
							

						}else{
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							System.out.println("Sorry... No Employee Found!!!");
						}

						System.out.println();

						break; //Employee Management -> Employee Search Ends here

						case 5: //(1-----5) Option Employee Management - Go Back 
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						repeat2= false;
						
						System.out.println("-----------------------");
						System.out.println("Going Back.....");
						System.out.println("-----------------------");
						Thread.sleep(3000,100); 
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						System.out.println();
                        
						break;  //Go Back Ends Here

						default:

						System.out.println("-----------------------");
						System.out.println("Invalid Option!!!");
						System.out.println("-----------------------");
						System.out.println();
					}					
				}
					break;  //Final => Employee Management Main Break


				case 2:  //(2)Option Restaurant Management

                   boolean repeat3 = true;
 				   while (repeat3){          //Restaurant Management for Going Back
                      
					System.out.println("------------------------------------------");
					System.out.println("   Your choice is Restaurant Management   ");
					System.out.println("------------------------------------------");

					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1.Insert New Restaurant");
					System.out.println("2.Remove Existing Restaurant");
					System.out.println("3.Show All Restaurants");
					System.out.println("4.Search an Restaurant");
					System.out.println("5.Go Back");
					System.out.println("-----------------------------------");
					System.out.println();


					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();

					System.out.println();
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					switch(option2){


						case 1:  //(2-----1) Option Restaurant Management -> Insert New Restaurant 

						System.out.println("------------------------------------------");
						System.out.println("   Your option is Insert New Restaurant   ");
						System.out.println("------------------------------------------");
						System.out.println();

						System.out.print("Enter Restaurant ID: ");
						String rid1 = sc.next();
						System.out.print("Enter Restaurant Name: ");
						String name2 = sc.next();

						System.out.println();

						Restaurant r1 = new Restaurant();
						r1.setRid(rid1);
						r1.setName(name2);

						if(fc.insertRestaurant(r1)){
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							System.out.println("\nRestaurant Inserted...Restaurant ID: "+rid1);
							Thread.sleep(3000,100);
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

						}else {
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							System.out.println("Oops... Something is Wrong...");
							Thread.sleep(3000,100);
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						}

						System.out.println();

						break;  //Restaurant Management -> Insert New Restaurant Ends Here
 

						case 2: //(2-----2) Option Restaurant Management - Remove Existing Restaurant 

						System.out.println("-----------------------------------------------");
						System.out.println("   Your option is Remove Existing Restaurant   ");
						System.out.println("-----------------------------------------------");
						System.out.println();


						System.out.print("Enter Restaurant ID: ");
						String rid2 = sc.next();

						System.out.println();

						Restaurant r2 = fc.searchRestaurant(rid2);

						if(r2!=null){

							if(fc.removeRestaurant(r2)){
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								System.out.println("Restaurant Removed... Restaurant ID: "+r2.getRid());  //+rid2 ?
								Thread.sleep(3000,100);
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

							}else{
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								System.out.println("Oops... Something is Wrong...");
								Thread.sleep(3000,100);
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							}//remove if else

						}else{
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							System.out.println("No Restaurant found to remove");
							Thread.sleep(3000,100);
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						}

						System.out.println();


						break;   //Restaurant Management -> Remove Existing Restaurant Ends Here

 
						case 3: //(2-----3) Option Restaurant Management - Show All Restaurants 

						System.out.println("-----------------------------------------");
						System.out.println("   Your option is Show All Restaurants   ");
						System.out.println("-----------------------------------------");
						System.out.println();

						fc.showAllRestaurants();
						System.out.println();

						break; //Restaurant Management -> Show All Restaurant Ends Here
 

						case 4: //(2-----4) Option Restaurant Management - Search an Restaurant 

						System.out.println("-----------------------------------------");
						System.out.println("   Your option is Search an Restaurant   ");
						System.out.println("-----------------------------------------");
						System.out.println();


						System.out.print("Enter Restaurant ID: ");
						String rid4 = sc.next();

						System.out.println();

						Restaurant r4 = fc.searchRestaurant(rid4);

						if(r4 != null){
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							System.out.println("Yessssss! We have found the Restaurant!!!!!!!");
							System.out.println("Restaurant ID: "+r4.getRid());
							System.out.println("Restaurant Name: "+r4.getName());

						}else{
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							System.out.println("Sorry... No Restaurant Found!!!");
							Thread.sleep(3000,100);
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						}

						System.out.println();

						break;  // Restaurant Management -> Seach an Restaurant Ends Here

						case 5: //(2-----5)Option Restaurant Management - Go Back 
                             repeat3=false;
						System.out.println("-----------------------");
						System.out.println("Going Back.....");
						System.out.println("-----------------------");
						Thread.sleep(3000,100);
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						System.out.println();

						break;  //Restaurant Management -> Go Back Ends Here
 

						default:

						System.out.println("-----------------------");
						System.out.println("Invalid Option!!!");
						System.out.println("-----------------------");
						System.out.println();
					}
				}


					break;  //Restaurant Management main Break
 

				case 3:  //(3) Restaurant Food Item Management
					boolean repeat4 = true;
				    while (repeat4){

					System.out.println("---------------------------------------------------");
					System.out.println("   Your choice is Restaurant FoodItem Management   ");
					System.out.println("---------------------------------------------------");

					System.out.println("\nHere are your options: \n");
					System.out.println("----------------------------------");
					System.out.println("1.Insert New FoodItem");
					System.out.println("2.Remove Existing FoodItem");
					System.out.println("3.Show All FoodItems");
					System.out.println("4.Search an FoodItem");
					System.out.println("5.Go Back");
					System.out.println("---------------------------------");
					System.out.println();


					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();

					System.out.println();
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					switch(option3){             //Restaurant Food Item Management Loop for Going Back


						case 1:  //(3-----1) Option Restaurant Food Item Management -> Insert New Food Item 

						System.out.println("-----------------------------------------");
						System.out.println("   Your option is Insert New Food Item   ");
						System.out.println("-----------------------------------------");
						System.out.println();

						System.out.println("There are two types of Food Item: ");
						System.out.println("1. Main Dish");
						System.out.println("2. Appitizers");
						System.out.println("3. Go Back");

						System.out.println();

						System.out.print("Enter your Type: ");
						int type = sc.nextInt();

						System.out.println();
 
						FoodItem f = null;

						if(type == 1){
							
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							System.out.println("Your Type is: Main Dish");

							System.out.print("Enter Food ID: ");
							String fid = sc.next();
							System.out.print("Enter Food Name: ");
							String name3 = sc.next();
							System.out.print("Enter Food Available Quantity: ");
							int availableQuantity = sc.nextInt();
							System.out.print("Enter Food Price: ");
							double price = sc.nextDouble();
							System.out.print("Enter Food Category: ");
							String category = sc.next();

							MainDish md = new MainDish();
							md.setFid(fid);
							md.setName(name3);
							md.setAvailableQuantity(availableQuantity);
							md.setPrice(price);
							md.setCategory(category);

							f = md;

						}

						else if(type == 2){
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							System.out.println("Your Type is: Appitizers");

							System.out.print("Enter Food ID: ");
							String fid = sc.next();
							System.out.print("Enter Food Name: ");
							String name3 = sc.next();
							System.out.print("Enter Food Available Quantity: ");
							int availableQuantity = sc.nextInt();
							System.out.print("Enter Food Price: ");
							double price = sc.nextDouble();
							System.out.print("Enter Food Size: ");
							String size = sc.next();

							Appitizers ap = new Appitizers();
							ap.setFid(fid);
							ap.setName(name3);
							ap.setAvailableQuantity(availableQuantity);
							ap.setPrice(price);
							ap.setSize(size);

							f = ap;
						}

						else if(type==3){
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							System.out.println("Your type is Go Back");							
						}

						else{
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							System.out.println("Sorry...Invalid Type...Try Again");
						}

						if(f!=null){ //food item selected or not
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							System.out.println("Enter Restaurant ID: ");
							String rid1 = sc.next();

							System.out.println();
 
							Restaurant r1 = fc.searchRestaurant(rid1);

							if(r1!=null){

								if(r1.insertFoodItem(f)){
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("Food Item has inserted...");
									Thread.sleep(3000,100);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								}else{ //food inserted or not
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("Food Item not inserted...");
									Thread.sleep(3000,100);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								}
							}else{//resturant found or not
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								System.out.println("Oops Something is Wrong");
								Thread.sleep(3000,100);
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							}
						}

						break; //Restaurant Food Item Management -> Restaurant Food Item Inserted Ends Here
 

						case 2: //(3-----2) Option Restaurant Food Item Management - Remove Existing Food Item 

						System.out.println("----------------------------------------------");
						System.out.println("   Your option is Remove Existing Food Item   ");
						System.out.println("----------------------------------------------");
						System.out.println();


						System.out.println("Enter Restaurant ID: ");
							String rid2 = sc.next();

							System.out.println();
 
							Restaurant r2 = fc.searchRestaurant(rid2);

							if(r2!=null){
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								System.out.println("Restaurant has been found");

								System.out.print("Insert Food Item ID: ");
								String fid2 = sc.next();

								System.out.println();
 
								FoodItem f2 = r2.searchFoodItem(fid2);

								if(f2!=null){

									if(r2.removeFoodItem(f2)){
										new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
										System.out.println("Food Item has Removed...");
										Thread.sleep(3000,100);
										new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									}else{ 
										new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
										System.out.println("Food Item not Removed...");
										Thread.sleep(3000,100);
										new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									}
								}

							}else{//resturant found or not
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								System.out.println("Oops Something is Wrong");
								Thread.sleep(3000,100);
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							}


						break; //Restaurant Food Item Management -> Restaurant Food Item Remove Ends Here
 

						case 3: //(3-----3) Option Restaurant Food Item Management - Show All FoodItems 

						System.out.println("---------------------------------------");
						System.out.println("   Your option is Show All FoodItems   ");
						System.out.println("---------------------------------------");
						System.out.println();

						System.out.print("Enter Restaurant ID: ");
							String rid3 = sc.next();
 

							Restaurant r3 = fc.searchRestaurant(rid3);

							if(r3!=null){
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								r3.showAllFoodItems();
								System.out.println();
							}else{
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								System.out.println("No Restaurant Found");
								Thread.sleep(3000,100);
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							}
 

						break;//Restaurant Food Item Management -> Show All Restaurant Food Item Ends Here


						case 4: //(3-----4) Option Restaurant Food Item Management - Search an Food Item 

						System.out.println("----------------------------------------");
						System.out.println("   Your option is Search an Food Item   ");
						System.out.println("----------------------------------------");
						System.out.println();

						System.out.println("Enter Restaurant ID: ");
							String rid4 = sc.next();

							System.out.println();

							Restaurant r4 = fc.searchRestaurant(rid4);

							if(r4!=null){ //restaurant found
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								System.out.println("Restaurant has been found");

								System.out.print("Insert Food Item ID: ");
								String fid4 = sc.next();

								System.out.println();
	
								FoodItem f2 = r4.searchFoodItem(fid4);

								if(f2!=null){

									f2.showInfo();
									System.out.println();
									/*System.out.println("Food Item Found!!!");
									System.out.println("Food Item ID: "+f2.getFid());
									System.out.println("Food Item Name: "+f2.getName());
									System.out.println("Food Item Available Quantity: "+f2.getAvailableQuantity());
									System.out.println("Food Item Price: "+f2.getPrice());*/

								}else{
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("Sorry... No Food Item Found");
									Thread.sleep(3000,100);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								}



							}else{//resturant found or not
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								System.out.println("Oops Something is Wrong");
								Thread.sleep(3000,100);
								new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							}

						break;  //Restaurant Food Item Management -> Restaurant Food Item Management Search Food Item Ends Here

						case 5: //(3-----5) Option Restaurant Food Item Management - Go Back 
                        repeat4=false;
						System.out.println("-----------------------");
						System.out.println("Going Back.....");
						System.out.println("-----------------------");
						Thread.sleep(3000,100);
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						System.out.println();

						break; //Restaurant Food Item Management -> Go Back Ends Here 
 
						default:

						System.out.println("-----------------------");
						System.out.println("Invalid Option!!!");
						System.out.println("-----------------------");
						System.out.println();
					}
				}

					break;  //Final => Restaurant Food Item Management main Break

				case 4:  //(4) FoodItem Quantity Add-Sell

                  boolean repeat5 = true;
				  while (repeat5){         //FoodItem Quantity Add-Sell Loop for Going Back  

					System.out.println("-----------------------------------------------");
					System.out.println("   Your choice is FoodItem Quantity Add-Sell   ");
					System.out.println("-----------------------------------------------");

					System.out.println("\nHere are your options: \n");
					System.out.println("---------------------------------------");
					System.out.println("1.Add FoodItem");
					System.out.println("2.Sell FoodItem");
					System.out.println("3.Show Add Sell History");
					System.out.println("4.Go Back");
					System.out.println("---------------------------------------");
					System.out.println();

					System.out.print("Enter your option: ");
					int option4 = sc.nextInt();

					System.out.println();
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					switch(option4){


						case 1:  //(4-----1) Option FoodItem Quantity Add-Sell -> Add FoodItem 

						System.out.println("---------------------------------");
						System.out.println("   Your option is Add FoodItem   ");
						System.out.println("---------------------------------");
						System.out.println();

						System.out.print("Enter Restaurant ID: ");
						String rid5 = sc.next();

						System.out.println();

						Restaurant r4 = fc.searchRestaurant(rid5);

						if(r4!=null){

							System.out.print("Enter Food Item ID: ");
							String fid5 = sc.next();

							FoodItem f4 = r4.searchFoodItem(fid5);

							if(f4!=null){

								System.out.print("Enter Food Item Quantity: ");
								int amount = sc.nextInt();
 
								System.out.println("Current Food Item Quantity: "+f4.getAvailableQuantity());
								
								if(f4.addQuantity(amount)){
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("Adding Quantity "+ amount + " Successfull");
									System.out.println("New Quantity: "+f4.getAvailableQuantity());
									frwd.writeInFile(amount + " has been added in "+f4.getFid()+" Restaurant");
									System.out.println();
									System.out.println();

								}else{ //add quantity completed or not
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
									System.out.println("Oops Something is Wrong");
									Thread.sleep(3000,100);
									new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
								}
							}
						}
						
						break; //FoodItem Quantity Add-Sell -> FoodItem Quantity Add Food Item Ends Here 
 

						case 2: //(4-----2) Option FoodItem Quantity Add-Sell - Sell FoodItem 

						System.out.println("----------------------------------");
						System.out.println("   Your option is Sell FoodItem   ");
						System.out.println("----------------------------------");
						System.out.println();

						System.out.print("Enter Restaurant ID: ");
						String rid6 = sc.next();
						System.out.println();
 
						Restaurant r5 = fc.searchRestaurant(rid6);

						if(r5!=null){

							System.out.print("Enter Food Item ID: ");
							String fid6 = sc.next();

							FoodItem f5 = r5.searchFoodItem(fid6);

							if(f5!=null){

								System.out.print("Enter Food Item Quantity: ");
								int amount = sc.nextInt();

								System.out.println();
								 //new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

								System.out.println("Current Food Item Quantity: "+f5.getAvailableQuantity());
								if(f5.sellQuantity(amount)){

									System.out.println("Selling Quantity "+ amount + " Successfull");
									System.out.println("New Quantity: "+f5.getAvailableQuantity());
									frwd.writeInFile(amount + " has been sold from "+f5.getFid()+" Restaurant");
									System.out.println();
									System.out.println();									

								}else{ //sell quantity completed or not

									System.out.println("Oops Something is Wrong");
								}
							}

						}

						break;  //FoodItem Quantity Add-Sell -> Sell Food Item 


						case 3: //(4-----3) Option FoodItem Quantity Add-Sell - Show Add Sell History 

						System.out.println("------------------------------------------");
						System.out.println("   Your option is Show Add Sell History   ");
						System.out.println("------------------------------------------");
						System.out.println();

						frwd.readFromFile();
						System.out.println();

						break; //FoodItem Quantity Add-Sell -> Show Add Sell History Ends Here
 
						case 4: //(4-----4) Option FoodItem Quantity Add-Sell - Go Back 
                       
					    repeat5=false;
						System.out.println("-----------------------");
						System.out.println("Going Back.....");
						System.out.println("-----------------------");
						Thread.sleep(3000,100);
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						System.out.println();
 
						break; // FoodItem Quantity Add-Sell -> Go Back Ends Here 
 
						default:

						System.out.println("-----------------------");
						System.out.println("Invalid Option!!!");
						System.out.println("-----------------------");
						System.out.println();
					}
				}
  
					break;  //Food Item Quantity Add-Sell main Break

 				case 5:    // System Exit
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					repeat = false;
					System.out.println("------------------------------------------");
					System.out.println("      Thank you for using our system     ");
					System.out.println("      Developed by Team Binary K-O-4     ");
					System.out.println();

					break;  //Main Menu Exit

				default:  //Main menu default
					
					System.out.println("-----------------------");
					System.out.println("Invalid Choice!!!");
					System.out.println("-----------------------");
					System.out.println();
					break;
			}

		}
	}
}