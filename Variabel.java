public class Variabel {
    public static void main(String[] args) {
        // Deklarasi variabel dengan tipe data yang sesuai
        String namaLengkap    = "Achmad Khalid Meshal";
        String tempatLahir    = "Bogor";
        String tanggalLahir   = "11 Januari 2008";
        String jenisKelamin   = "Laki-laki";
        String alamatLengkap  = "KP. SIRNAGALIH DESA MEGAMENDUNG";
        String noHp           = "085694030948";   // String, agar angka 0 di depan tidak hilang
        long   penghasilan    = 5000000L;         // long, karena nilainya besar

        // Menampilkan output
        System.out.println("Assalamu'alaikum");
        System.out.println("Izinkan saya memperkenalkan diri");
        System.out.println("Nama Lengkap\t\t: " + namaLengkap);
        System.out.println("Tempat & Tanggal Lahir\t: " + tempatLahir + ", " + tanggalLahir);
        System.out.println("Jenis Kelamin\t\t: " + jenisKelamin);
        System.out.println("Alamat Lengkap\t\t: " + alamatLengkap);
        System.out.println("No Hp\t\t\t: " + noHp);
        System.out.println("Penghasilan Sebulan\t: Rp " + penghasilan);
    }
}