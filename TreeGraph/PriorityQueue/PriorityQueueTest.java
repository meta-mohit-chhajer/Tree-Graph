package com.metacube.TreeGraph.PriorityQueue;
import static org.junit.Assert.*;

import org.junit.Test;
public class PriorityQueueTest {

	@Test
	public void testEnqueue()
	{
		Queue queue=new Queue(5);
		queue.enqueue(1, 2);
		queue.enqueue(1, 3);
		queue.enqueue(1, 4);
		queue.enqueue(1, 6);
		Task task[]=queue.getTask();
		int arr[]=new int[]{6, 4, 3, 2};
		for(int i=0;i<4;i++)
		{
			assertEquals(arr[i], task[i].priority);
		}
	}
	
	@Test
	public void testDequeue()
	{
		Queue queue = new Queue(5);
		queue.enqueue(1, 2);
		queue.enqueue(2, 3);
		queue.enqueue(3, 4);
		assertEquals(3, queue.dequeue());
	}
}
