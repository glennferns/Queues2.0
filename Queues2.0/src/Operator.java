
public class Operator {


	public static void main(String[] args) {

		QueuesArrayList queue = new QueuesArrayList();
		queue.add("text");
		queue.add(6);
		queue.add(5.4);
		queue.add(8);
		
		System.out.println(queue.disp());
		System.out.println();
		System.out.println("Item removed : "+ queue.remove());
		System.out.println();
		System.out.println(queue.disp());

		System.out.println();
		System.out.println();
		System.out.println();

		
		
		
		System.out.println("Arrays");
		System.out.println();
		QueuesArrays queueArr = new QueuesArrays(3);
		queueArr.disp();
		System.out.println(queueArr.add("text"));
		System.out.println(queueArr.add(6));
		System.out.println(queueArr.add(5.4));
		System.out.println(queueArr.add(8));
		System.out.println();
		
		queueArr.disp();
		
		System.out.println();

		System.out.println(queueArr.remove());
		System.out.println(queueArr.remove());
		System.out.println(queueArr.remove());
		System.out.println(queueArr.remove());
		queueArr.disp();
	}

}




