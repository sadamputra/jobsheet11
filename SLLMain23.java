package jobsheet11.Praktikum2;

public class SLLMain23 {
    public static void main(String[] args) {

        SingleLinkedList23 sll = new SingleLinkedList23();

        Mahasiswa23 m1 = new Mahasiswa23("1", "Dirga", "4D", 3.6);
        Mahasiswa23 m2 = new Mahasiswa23("2", "Alvaro", "1A", 4.0);
        Mahasiswa23 m3 = new Mahasiswa23("3", "Cintia", "3C", 3.5);
        Mahasiswa23 m4 = new Mahasiswa23("4", "Bimon", "2B", 3.8);

        sll.addFirst(m1);
        sll.addLast(m2);
        sll.insertAfter("Dirga", m3);
        sll.insertAt(2, m4);

        sll.print();

        System.out.println("Data index 1:");
        sll.getData(1);

        System.out.println("Index Bimon: " + sll.indexOf("Bimon"));

        sll.removeFirst();
        sll.print();

        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }
}