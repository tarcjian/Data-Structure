/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignmenty2s2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class AgileAssignmentY2S2 {

	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		DeliveryMan deliveryMan;
		HrManager hr = new HrManager();
		boolean spacing = false;

		do {
			if (spacing) {
				System.out.println("\n\n\n\n");
			}

			deliveryMan = new DeliveryMan();
			
			System.out.print("Enter name               : ");
			deliveryMan.setName(scanner.nextLine());
			System.out.print("Enter status             : ");
			deliveryMan.setStatus(scanner.nextLine());
			System.out.print("Enter age                : ");
			deliveryMan.setAge(scanner.nextInt());
			System.out.print("Enter number of delivery : ");
			deliveryMan.setNumberOfDelivery(scanner.nextInt());
			System.out.print("Enter salary             : ");
			deliveryMan.setSalary(scanner.nextDouble());

			hr.add(deliveryMan);

			System.out.print("Do you wish to continue to add staff member? (Y/N)");
			spacing = true;

		} while (scanner.nextLine().equals("Y") || scanner.nextLine().equals("y"));

		System.out.println("\n\n\n\n");
		System.out.println("Delivery Man List: ");
		System.out.println(hr.toString());
	}

}