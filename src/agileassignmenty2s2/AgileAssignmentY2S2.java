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

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Scanner scanner = new Scanner(System.in);
		DeliveryMan deliveryMan = new DeliveryMan();
		
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
		
		System.out.println(deliveryMan.toString());
		
	}
	
}
