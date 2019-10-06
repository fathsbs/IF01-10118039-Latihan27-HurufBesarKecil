
import java.util.Scanner;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program untuk menampilkan input-an menjadi besar atau kecil  
 */
public class HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat;

        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        kalimat = masuk.nextLine();
        String Kapital = kalimat.toUpperCase();
        String Kecil = kalimat.toLowerCase();

        System.out.println("====Hasil Formatting====");
        System.out.printf("Huruf Besar\t: %s", Kapital);
        System.out.printf("%nHuruf Kecil\t: %s%n", Kecil);

    }

}
