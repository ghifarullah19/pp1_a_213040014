package pertemuan9_Queue;

public class QueueMain {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        // Latihan 4
        System.out.println("### Sebelum Enqueue 3x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElement();

        // Latihan 4
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);

        // Latihan 4
        System.out.println("\n### Sesudah Enqueue 3x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElement();
        System.out.println("Front: " + queue.front());

        queue = new StrukturQueue();

        // Latihan 5
        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElement();

        // Latihan 5
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        // Latihan 5
        System.out.println("\n### Sesudah Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElement();
        System.out.println("Front: " + queue.front());

        // Tugas
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        // Tugas
        System.out.println("\n### Sesudah dequeue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElement();
        System.out.println("Front: " + queue.front());
    }
}
