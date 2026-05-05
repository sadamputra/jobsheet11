package jobsheet11.Tugas;

public class QueueLinkedList23 {
    Node23 front, rear;
    int size = 0;
    int max = 10; // batas antrian

    // CEK KOSONG
    public boolean isEmpty() {
        return front == null;
    }

    // CEK PENUH
    public boolean isFull() {
        return size == max;
    }

    // TAMBAH ANTRIAN
    public void enqueue(Mahasiswa23 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        Node23 newNode = new Node23(mhs);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println(mhs.nama + " masuk antrian");
    }

    // PANGGIL ANTRIAN
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.print("Memanggil: ");
        front.data.tampil();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    // LIHAT DEPAN
    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Depan: ");
            front.data.tampil();
        }
    }

    // LIHAT BELAKANG
    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Belakang: ");
            rear.data.tampil();
        }
    }

    // JUMLAH ANTRIAN
    public void size() {
        System.out.println("Jumlah antrian: " + size);
    }

    // KOSONGKAN
    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    // TAMPILKAN SEMUA
    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Node23 tmp = front;
            System.out.println("Isi Antrian:");
            while (tmp != null) {
                tmp.data.tampil();
                tmp = tmp.next;
            }
        }
    }
}