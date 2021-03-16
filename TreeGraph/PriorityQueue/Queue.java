package com.metacube.TreeGraph.PriorityQueue;

class Task {
	public int job;
	public int priority;

	public Task(int job, int priority) {
		this.job = job;
		this.priority = priority;
	}
}

public class Queue implements Priority {

	public Task task[];
	public int cap;
	public int size;

	public Queue(int cap) {
		this.cap = cap;
		task = new Task[this.cap];
		this.size = 0;
	}

	public Task[] getTask() {
		return this.task;
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public boolean isFull() {
		return this.size == this.cap;
	}

	/*
	 * Adding Element to Queue
	 * 
	 * @param val to be added in Queue
	 * 
	 * @priority of task
	 */

	@Override
	public void enqueue(int val, int priority) {
		if (isFull()) {
			throw new AssertionError("Queue is Full");
		}

		Task newJob = new Task(val, priority);
		boolean flag = false;
		for (int i = 0; i < this.size; i++) {
			if (this.task[i].priority < priority) {
				int move = size;
				while (i <= move) {
					this.task[move + 1] = this.task[move];
					move--;
				}
				task[i] = newJob;
				size++;
				flag = true;
				break;
			}
		}
		if (!flag) {
			task[size++] = newJob;
		}
	}

	/*
	 * Remove an Element from Queue
	 */

	@Override
	public int dequeue() {
		if (isEmpty()) {
			throw new AssertionError("Empty Queue");
		}
		int data = task[0].job;
		for (int i = 1; i < size; i++) {
			task[i - 1] = task[i];
			size--;
		}
		return data;
	}

	/*
	 * Get TopMost Element of Queue
	 */

	@Override
	public int peek() {
		if (isEmpty()) {
			throw new AssertionError("Empty List");
		}

		int data = task[0].job;
		return data;
	}

}
