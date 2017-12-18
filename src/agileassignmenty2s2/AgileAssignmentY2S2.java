/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignmenty2s2;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class AgileAssignmentY2S2 {

	private static ListInterface<DeliveryMan> list = new List<DeliveryMan>();
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DeliveryMan deliveryMan;
		int answer;
		String moreStaff;
		int deliveryManUpdateNumber;
		int moreUpdate;

		initializeDeliverMan();
		
		do {
			System.out.println("0. End");
			System.out.println("1. Add Delivery Man");
			System.out.println("2. View Delivery Man Detail");
			System.out.println("3. Update Delivery Man Detail");
			System.out.println("4. View Delivery Man Report");

			System.out.print("Enter you choice : ");
			answer = Integer.parseInt(scanner.nextLine());

			if (answer == 1) {
				do {
					spacing();

					deliveryMan = new DeliveryMan();

					System.out.print("Enter name               : ");
					deliveryMan.setName(scanner.nextLine());
					System.out.print("Enter status             : ");
					deliveryMan.setStatus(scanner.nextLine());
					System.out.print("Enter age                : ");
					deliveryMan.setAge(scanner.nextInt());
					deliveryMan.setNumberOfDelivery(0);
					System.out.print("Enter salary             : ");
					deliveryMan.setSalary(scanner.nextDouble());
					scanner.nextLine();
					System.out.print("Enter address            : ");
					deliveryMan.setAddress(scanner.nextLine());
					System.out.print("Enter phone number       : ");
					deliveryMan.setPhoneNumber(scanner.nextLine());
					deliveryMan.setNumberOfDelivery(Integer.parseInt("0"));
					list.add(deliveryMan);

					System.out.print("Do you wish to continue to add staff member? (Y/N)");
					moreStaff = scanner.nextLine();

				} while (moreStaff.equals("Y") || moreStaff.equals("y"));

			} else if (answer == 2) {

				spacing();
				if (new AgileAssignmentY2S2().toString().isEmpty()) {
					System.out.println("No Delivery Man In Database");
				} else {
					System.out.println("Delivery Man List: ");
				}
				System.out.println(new AgileAssignmentY2S2().toString());
			} else if (answer == 3) {
				spacing();
				for (int i = 0; i < list.size(); i++) {
					System.out.println((i + 1) + ". " + list.get(i).getName());
				}
				System.out.print("Please select the delivery man you wish to update: ");

				deliveryManUpdateNumber = Integer.parseInt(scanner.nextLine()) - 1;

				deliveryMan = new DeliveryMan();
				deliveryMan = list.get(deliveryManUpdateNumber);
				do {

					spacing();
					System.out.println("1. Name: " + deliveryMan.getName());
					System.out.println("2. Status " + deliveryMan.getStatus());
					System.out.println("3. Age " + deliveryMan.getAge());
					System.out.println("4. Number of Delivery " + deliveryMan.getNumberOfDelivery());
					System.out.println("5. Salary " + deliveryMan.getSalary());
					System.out.println("6. Address " + deliveryMan.getAddress());
					System.out.println("7. Phone Number " + deliveryMan.getPhoneNumber());
					System.out.println("0. End");
					System.out.print("Select detail wish to update: ");
					moreUpdate = Integer.parseInt(scanner.nextLine());
					switch (moreUpdate) {
						case 1:
							System.out.println("Current Name is " + deliveryMan.getName());
							System.out.print("New update name is ");
							deliveryMan.setName(scanner.nextLine());
							break;
						case 2:
							System.out.println("Current Status is " + deliveryMan.getStatus());
							System.out.print("New update status is ");
							deliveryMan.setStatus(scanner.nextLine());
							break;
						case 3:
							System.out.println("Current age is " + deliveryMan.getAge());
							System.out.print("New update age is ");
							deliveryMan.setAge(Integer.parseInt(scanner.nextLine()));
							break;
						case 4:
							System.out.println("Current number of delivery is " + deliveryMan.getNumberOfDelivery());
							System.out.print("New update number of delivery is ");
							deliveryMan.setNumberOfDelivery(Integer.parseInt(scanner.nextLine()));
							break;
						case 5:
							System.out.println("Current salary is " + deliveryMan.getSalary());
							System.out.print("New update salary is ");
							deliveryMan.setSalary(Double.parseDouble(scanner.nextLine()));
							break;
						case 6:
							System.out.println("Current address is " + deliveryMan.getAddress());
							System.out.print("New update address is ");
							deliveryMan.setAddress(scanner.nextLine());
							break;
						case 7:
							System.out.println("Current phone number is " + deliveryMan.getPhoneNumber());
							System.out.print("New update phone number is ");
							deliveryMan.setPhoneNumber(scanner.nextLine());
							break;
					}
				} while (moreUpdate != 0);

				list.set(deliveryManUpdateNumber, deliveryMan);

			} else if (answer == 4) {
				spacing();
				System.out.println("Delivery Man Report");
				double averageDelivery = 0;
				int highDelivery = list.get(0).getNumberOfDelivery();
				int lowDelivery = list.get(0).getNumberOfDelivery();
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + 1 + ". " + list.get(i).getName());
					averageDelivery += list.get(i).getNumberOfDelivery();
					if (lowDelivery > list.get(i).getNumberOfDelivery()) {
						lowDelivery = list.get(i).getNumberOfDelivery();
					}
					if (highDelivery < list.get(i).getNumberOfDelivery()) {
						highDelivery = list.get(i).getNumberOfDelivery();
					}
				}
				System.out.println("Daily Number of Delivery Report");
				System.out.println("Average Delivery Made   : " + averageDelivery / list.size());
				System.out.println("Highest Delivery Made   : " + highDelivery);
				System.out.println("Lowest Delivery Made    : " + lowDelivery);
				System.out.print("Select Delivery Man Report: ");
				System.out.println("Number of delivery made : " + list.get(Integer.parseInt(scanner.nextLine()) - 1).getNumberOfDelivery());

			}
			spacing();
		} while (answer != 0);

	}

	public String toString() {
		String deliveryList = "";
		System.out.println("The size is " + list.size());
		for (int i = 0; i < list.size(); i++) {
			deliveryList += list.get(i).toString();
			deliveryList += "  \n";
		}
		return deliveryList;
	}

	private static void initializeDeliverMan() {
		list.add(new DeliveryMan("Quek Wei Jian", "Working", 20, 5, 3000.55, "012-3456789", "Quek Address"));
		list.add(new DeliveryMan("Phuah Wai Yan", "Working", 18, 3, 4500.99, "012-9876543", "Phuah Address"));
		list.add(new DeliveryMan("Ng Yih Sam", "Retire", 25, 15, 7600.30, "012-9786543", "Sam Address"));
		list.add(new DeliveryMan("Seong Jian Sheng", "Working", 22, 7, 2000.55, "012-3456789", "Seong Address"));
	}
	
	private static void spacing() {
		System.out.println("\n\n\n\n\n");
	}

}
