package jobsheet11.Tugas;

public class QueueMain23 {
    public static void main(String[] args) {

        QueueLinkedList23 q = new QueueLinkedList23();

        Mahasiswa23 m1 = new Mahasiswa23("01", "Andi", "TI-1A");
        Mahasiswa23 m2 = new Mahasiswa23("02", "Budi", "TI-1B");
        Mahasiswa23 m3 = new Mahasiswa23("03", "Citra", "TI-1C");
        Mahasiswa23 m4 = new Mahasiswa23("04", "Deni", "TI-1D");

        // ENQUEUE
        q.enqueue(m1);
        q.enqueue(m2);
        q.enqueue(m3);
        q.enqueue(m4);

        q.print();

        // LIHAT DEPAN & BELAKANG
        q.peekFront();
        q.peekRear();

        // JUMLAH
        q.size();

        // DEQUEUE
        q.dequeue();
        q.print();

        // CLEAR
        q.clear();
        q.print();
    }
}