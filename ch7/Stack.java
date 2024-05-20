class Stack {
    private int[] stck;
    private int top;

    Stack() {
        stck = new int[10];
        top = -1;
    }

    Stack(int size) {
        stck = new int[size];
        top = -1;
    }

    // Push an item to the stack
    void push(int x) {
        if (top == stck.length - 1) { // Use stack length instead of hardcoding
            System.out.println("Stack overflow");
        }
        else {
            stck[++top] = x;
        }
    }

    // Pop an item from the stack
    int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        else {
            return stck[top--];
        }
    }
}

class TestStack {
    public static void main(String[] args) {
        Stack s = new Stack(); 
        Stack s2 = new Stack();

        // Push numbers to the stack
        for (int i = 0; i < 10; i++) s.push(i);
        for (int i = 10; i < 20; i++) s2.push(i);

        // Pop numbers from the stack
        System.out.println("Stack in s:");
        for (int i = 0; i < 10; i++) {
            System.out.println(s.pop());
        }

        // Pop numbers from the stack
        System.out.println("Stack in s2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(s2.pop());
        }
    }
}

class TestStack2 {
    public static void main(String[] args) {
        Stack s = new Stack(5); // Create a stack of size 5

        // Push numbers to the stack
        for (int i = 0; i < 5; i++) s.push(i);

        // Pop numbers from the stack
        System.out.println("Stack in s:");
        for (int i = 0; i < 5; i++) {
            System.out.println(s.pop());
        }
    }
}