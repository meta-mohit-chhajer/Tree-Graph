package com.metacube.TreeGraph.PriorityQueue;

public interface Priority {
	public void enqueue(int data,int priority);
	public int dequeue();
	public int peek();
	public boolean isEmpty();
	public boolean isFull();
}
