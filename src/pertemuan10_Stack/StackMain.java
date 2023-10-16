package pertemuan10_Stack;

public class StackMain {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

        // Latihan 4
        System.out.println("### Sebelum push 3x ###");
        System.out.println("size: " + stack.size());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("isFull: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayElement();

        // Latihan 4
        System.out.println("\n# Melakukan push 3x: ");
        stack.push(2);
        stack.push(4);
        stack.push(1);

        // Latihan 4
        System.out.println("\nsize: " + stack.size());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("isFull: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayElement();
        
        stack = new StrukturStack(3);

        System.out.println();
        
        // Tugas
        System.out.println("### Sebelum push 3x ###");
        System.out.println("size: " + stack.size());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("isFull: " + stack.isFull());
        System.out.println("Top: " + stack.top());

        // Tugas
        System.out.println("\n# Melakukan push 3x: ");
        stack.push(2);
        stack.push(4);
        stack.push(1);

        // Tugas
        System.out.println("\nsize: " + stack.size());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("isFull: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayElement();

        // Tugas
        stack.pop();
        stack.pop();
        stack.pop();

        // Tugas
        System.out.println("\n### Sesudah pop 3x ###");
        System.out.println("size: " + stack.size());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("isFull: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayElement();
    }
}
