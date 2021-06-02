package queue;

/**
 * https://leetcode.com/explore/challenge/card/april-leetcoding-challenge-2021/593/week-1-april-1st-april-7th/3696/
 * <br>
 * 
 * @author eaukjam
 * 
 *
 */
public class CircularQueueArray {

	private int[] dataHoler;
	private int size;

	private int front;
	private int rear;

	public CircularQueueArray(int k) {

		this.dataHoler = new int[k];
		this.size = k;
		front = -1;
		rear = -1;

	}

	public boolean enQueue(int value) {

		if (!isFull()) {
			if (front == -1 && rear == -1) // condition to check queue is empty
			{
				front = 0;
				rear = 0;
				dataHoler[rear] = value;
			}
			// System.out.println("Enque " + value);
			else {
				rear = (rear + 1) % size;
				dataHoler[rear] = value;
			}
			return true;

		}
		return false;
	}

	public boolean deQueue() {

		if (!isEmpty()) {
			front = (front + 1) % size;
			// System.out.println("deque " + dataHoler[front]);

			return true;
		}
		return false;
	}

	public int Front() {

		return dataHoler[front];
	}

	public int Rear() {
		return dataHoler[rear];
	}

	public boolean isEmpty() {

		return front == rear;
	}

	public boolean isFull() {

		return ((rear+1)%size==front) || (front == -1 && rear == size - 1);
	}

	public static void main(String[] args) {

		CircularQueueArray queue = new CircularQueueArray(6);

		System.out.println(queue.enQueue(6));
		System.out.println(queue.Rear());
		System.out.println(queue.Rear());
		System.out.println(queue.deQueue());
		System.out.println(queue.enQueue(5));

		System.out.println(queue.Rear());
		System.out.println(queue.deQueue());
		System.out.println(queue.Front());
	}
}
