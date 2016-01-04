
public class QueuesArrays {

	private Object[] arr;
	int front = 0;
	int rear = -1;

	public QueuesArrays(int size) {
		arr = new Object[size];
	}

	public String add(Object pushedElement) {
		if (rear < arr.length - 1) {
			arr[++rear] = pushedElement;
			return "Successfully added "+ pushedElement;
		} else {
			return "Overflow. Could not add "+ pushedElement;
		}
	}

	public Object remove() {
		if (front > rear) {
			return "Underflow,Empty Queue";
		} else {
			return "Removed value is "+arr[front++];
		}
	}

	public void disp() {
		System.out.print("Queue values are :");
		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

}
