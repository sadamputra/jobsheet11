package jobsheet11.Tugas;

public class Mahasiswa23 {
    String nim, nama, kelas;

    public Mahasiswa23(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public void tampil() {
        System.out.println(nama + " | " + nim + " | " + kelas);
    }
}