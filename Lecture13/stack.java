package Lecture13;

public class stack {
	int st[] = new int[5];
	int top = -1;
	int size = 0;

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return size == st.length;
	}

	public void push(int val) {
		if (isFull()) {
			System.out.println("Stack is full");
			return;
		}
		top = top + 1;
		st[top] = val;
		size++;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		int val = st[top];
		size--;
		top--;
		return val;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		int val = st[top];
		return val;
	}
}
