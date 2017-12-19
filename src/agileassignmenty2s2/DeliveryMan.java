/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignmenty2s2;

/**
 *
 * @author Lenovo
 */
public class DeliveryMan {
	private String name;
	private String status;
	private int age;
	private int numberOfDelivery;
	private double salary;

	private String address;
	private String phoneNumber;

	private String taskStatus;
	private int experience;

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public DeliveryMan() {
		
	}
	
	public DeliveryMan(String name, String status, int age, int numberOfDelivery, double salary, String phoneNumber, String address) {
		this.name = name;
		this.status = status;
		this.age = age;
		this.numberOfDelivery = numberOfDelivery;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public DeliveryMan(String name, String status, int age, int numberOfDelivery, double salary, String phoneNumber, String address, String taskStatus, int experience) {
		this.name = name;
		this.status = status;
		this.age = age;
		this.numberOfDelivery = numberOfDelivery;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.taskStatus = taskStatus;
		this.experience = experience;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumberOfDelivery() {
		return numberOfDelivery;
	}

	public void setNumberOfDelivery(int numberOfDelivery) {
		this.numberOfDelivery = numberOfDelivery;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return    "Name            : " + name + "\n" 
				+ "Status          : " + status + "\n" 
				+ "Age             : " + age + "\n" 
				+ "Delivery Number : " + numberOfDelivery + "\n" 
				+ "Salary          : " + salary + "\n"
				+ "Address         : " + address + "\n"
				+ "Phone Number    : " + phoneNumber + "\n"
				+ "Task Status     : " + taskStatus + "\n"
				+ "Experience      : " + experience + "\n";
	}
}
