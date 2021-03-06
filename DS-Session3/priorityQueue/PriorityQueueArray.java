package priorityQueue;

/**
 * @author Deekshika Sharma This class will have priority queue operation
 */
public class PriorityQueueArray implements PriorityQueue {

	private Job[] queue;
	private int rear, front, maxSize;

	public PriorityQueueArray(int maxSize) {
		this.maxSize = maxSize;
		queue = new Job[maxSize];
		rear = -1;
		front = -1;
	}

	/**
	 * While enqueue the job it will check form start the priority and place it
	 * it suitable place
	 */
	@Override
	public boolean enqueue(Job job) {
		try {
			if (!isFull()) {
				if (rear == -1) {
					front++;
					rear++;
				} else {
					rear = (rear + 1) % maxSize;
				}
				// it will calculate the position where it have to be placed
				int pos = -1;
				for (int i = front; i <= (rear - 1) % maxSize; i++) {
					if (job.getPriority() > queue[i].getPriority()) {
						pos = i;
						break;
					}
				}
				if (pos != -1) {
					for (int i = (rear - 1) % maxSize; i >= pos; i--) {
						queue[(i + 1) % maxSize] = queue[i];
					}
					queue[pos] = job;
				} else
					queue[rear] = job;

			} else
				throw new AssertionError("The queue is full!");

			return true;
		} catch (AssertionError error) {
			return false;
		}
	}

	/**
	 * This method will dequeue the job and maintain the order of jobs
	 */
	@Override
	public Job dequeue() {
		Job job = null;

		if (!isEmpty()) {
			if (front == rear) {
				job = queue[front];
				front = -1;
				rear = -1;
			} else {
				job = queue[front];
				front = (front + 1) % maxSize;
			}
		} else
			throw new AssertionError("The queue is empty!");

		return job;
	}

	/**
	 * This method will find whether queue is empty or not
	 */
	@Override
	public boolean isEmpty() {

		boolean isEmpty = false;

		if (rear == -1 && front == -1)
			isEmpty = true;

		return isEmpty;
	}

	/**
	 * This methods will find queue is full or not
	 */
	@Override
	public boolean isFull() {

		return (rear + 1) % maxSize == front;
	}

}
