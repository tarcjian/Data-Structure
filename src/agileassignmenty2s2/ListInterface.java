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
public interface ListInterface<T> {
	public T get(int i);
	public T remove(int i);
	public boolean isEmpty();
	public void add(T element);
	public void set(int position, T element);
	public void clear();
	public int size();
}
