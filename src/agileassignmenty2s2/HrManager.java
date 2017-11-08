/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignmenty2s2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class HrManager {
	
	private List<DeliveryMan> list = new ArrayList<>();
	
	public void add(DeliveryMan deliveryMan) {
		list.add(deliveryMan);
	}
}
