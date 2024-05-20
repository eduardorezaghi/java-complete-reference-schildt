public class Stack {
    int[] stack = new int[100];
    int tos; // top of stack

    // Initialize top-of-stack
    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 99)
            System.out.println("Stack is full.");
        else
            stack[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stack[tos--];
    }
}
