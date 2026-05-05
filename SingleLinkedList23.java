package jobsheet11.Praktikum2;

public class SingleLinkedList23 {
    NodeMahasiswa23 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa23 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void addFirst(Mahasiswa23 input) {
        NodeMahasiswa23 nd = new NodeMahasiswa23(input, null);
        if (isEmpty()) head = tail = nd;
        else {
            nd.next = head;
            head = nd;
        }
    }

    public void addLast(Mahasiswa23 input) {
        NodeMahasiswa23 nd = new NodeMahasiswa23(input, null);
        if (isEmpty()) head = tail = nd;
        else {
            tail.next = nd;
            tail = nd;
        }
    }

    public void insertAfter(String key, Mahasiswa23 input) {
        NodeMahasiswa23 temp = head;
        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                NodeMahasiswa23 nd = new NodeMahasiswa23(input, temp.next);
                temp.next = nd;
                if (nd.next == null) tail = nd;
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, Mahasiswa23 input) {
        if (index == 0) addFirst(input);
        else {
            NodeMahasiswa23 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa23(input, temp.next);
            if (temp.next.next == null) tail = temp.next;
        }
    }

    // GET DATA
    public void getData(int index) {
        NodeMahasiswa23 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }

    // INDEX OF
    public int indexOf(String key) {
        NodeMahasiswa23 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }
        return (tmp == null) ? -1 : index;
    }

    // REMOVE FIRST
    public void removeFirst() {
        if (head == tail) head = tail = null;
        else head = head.next;
    }

    // REMOVE LAST
    public void removeLast() {
        NodeMahasiswa23 temp = head;
        while (temp.next != tail) temp = temp.next;
        temp.next = null;
        tail = temp;
    }

    // REMOVE AT
    public void removeAt(int index) {
        if (index == 0) removeFirst();
        else {
            NodeMahasiswa23 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
}