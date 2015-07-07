package com.adts;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T> {

	private static final int INITIAL_CAPACITY = 100;
	private int currentSize = 0;
	private T[] array = null;

	public MyArrayList() {

	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int index) {

		if (index < 0 || index > currentSize) {
			throw new ArrayIndexOutOfBoundsException("Current array size is "
					+ currentSize + ". Provided index is " + index);
		}
		return array[index];
	}

	@Override
	public int indexOf(Object o) {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return currentSize != 0;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		
		for(int i=0;i<array.length;i++){
			if(array[i].equals(o)){
				array[i]=null;
			}
		}
		
		return false;
	}

	@Override
	public T remove(int index) {
		checkIndex(index);
		T removed = array[index]; 
		array[index]=null;
		return removed;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T set(int index, Object element) {
		checkIndex(index);
		T oldElement= array[index];
		array[index]=(T) element;
		return oldElement;
	}

	@Override
	public int size() {
		
		return currentSize;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {

		
		checkIndex(fromIndex);
		checkIndex(toIndex);
		
		if(fromIndex>toIndex){
			throw new IllegalArgumentException();
		}
		
		List subList= new MyArrayList();
		
		for(int index= fromIndex;index<toIndex;index++){
		
			subList.add(array[index]);	
		
		}
		
		return subList;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void add(T element,int index){
		if(index==currentSize){
			ensureCapacity(size()*2+1);
			
		}
		checkIndex(index);		
		array[index]=element;
		
	}
	
	private void checkIndex(int index){
		if(index >= array.length || index<0)
			throw new ArrayIndexOutOfBoundsException();
	}

	private void ensureCapacity(int capacity) {
		
		if (capacity < currentSize) {
			return;
		}
		
		T[] oldArray = array;
		
		array = (T[]) new Object[capacity];
		
		for(int i=0;i<oldArray.length;i++){
			array[i]=oldArray[i];
		}

	}

}
