package classes;

import java.lang.*;
import interfaces.*;

public class FoodCourt implements RestaurantOperations, EmployeeOperations{

	private Restaurant restaurants[] = new Restaurant[100];
	private Employee employees[] = new Employee[100];

	//Starting of Restaurant Operations
	public boolean insertRestaurant(Restaurant r){

		boolean flag = false;

		for(int i=0; i<restaurants.length; i++){

			if(restaurants[i]==null){

				restaurants[i]=r;
				flag = true;
				break;
			}
		}

		return flag;
	}

	public boolean removeRestaurant(Restaurant r){

		boolean flag = false;

		for(int i=0; i<restaurants.length; i++){

			if(restaurants[i]==r){

				restaurants[i]=null;
				flag = true;
				break;
			}
		}

		return flag;	
	}

	public Restaurant searchRestaurant(String rid){

		Restaurant a = null;

		for(int i=0; i<restaurants.length; i++){

			if(restaurants[i]!=null){

				if(restaurants[i].getRid().equals(rid)){

					a = restaurants[i];
					break;
				}
			}
		}

		return a;
	}

	public void showAllRestaurants(){

		System.out.println();

		for(int i=0; i<restaurants.length; i++){

			if(restaurants[i]!=null){

				System.out.println("-------------------------");
				restaurants[i].showAllFoodItems();
				System.out.println();

			}
		}
	}//ending of restaurants operationns

	//Starting of employee operations
	public boolean insertEmployee(Employee e){

		boolean flag = false;

		for(int i=0; i<employees.length; i++){

			if(employees[i]==null){

				employees[i]=e;
				flag = true;
				break;
			}
		}

		return flag;
	}

	public boolean removeEmployee(Employee e){

		boolean flag = false;

		for(int i=0; i<employees.length; i++){

			if(employees[i]==e){

				employees[i]=null;
				flag = true;
				break;
			}
		}

		return flag;	
	}

	public Employee searchEmployee(String empId){

		Employee a = null;

		for(int i=0; i<employees.length; i++){

			if(employees[i]!=null){

				if(employees[i].getEmpId().equals(empId)){

					a = employees[i];
					break;
				}
			}
		}

		return a;
	}

	public void showAllEmployees(){

		System.out.println();

		for(int i=0; i<employees.length; i++){

			if(employees[i]!=null){

				System.out.println("-------------------------");
				System.out.println("Employee Name: "+employees[i].getName());
				System.out.println("Employee ID: "+employees[i].getEmpId());
				System.out.println("Employee Salary: "+employees[i].getSalary());
				System.out.println();

			}
		}
	}//end of employee operations


}