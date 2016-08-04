package org.shravan.sample;

public class Queue {
	
	int first,last,length;
	int[] arrayQ;
	
	//constructor
	public  Queue(int n){
		first=-1;
		last=-1;
		length = 0;
		arrayQ= new int[n];
	}
	
	//inserting elements
	public void insert(int element){
		if(last ==-1){
			first =0;
			last=0;
			arrayQ[last] = element;
		}else if(last>=arrayQ.length-1)
			throw new ArrayIndexOutOfBoundsException();
		else if(last<arrayQ.length-1){
			last++;
			arrayQ[last] = element;
		}
	}
	
	public int remove(){
		int num;
		if(isEmpty())
			throw new IllegalAccessError();
		else{
			num = arrayQ[first];
			if(first==last){
				first=-1; 
				last=-1;
			}else
				first++;
		}		
		return num;
	}
	
	//starting element of queue
	public int peek(){
		if (isEmpty())
			throw new IllegalAccessError();
		return arrayQ[first];
	}
	
	public boolean isEmpty(){
		return first==-1&&last==-1;
	}
	
	public boolean isFull(){
		return first == 0 && last==arrayQ.length-1;
	}

}
