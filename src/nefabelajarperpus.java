import java.util.Scanner;
public class nefabelajarperpus {
    public static void main(String[] args){
                //membuat scanner untuk membaca input dari user
                Scanner Scanner = new Scanner(System.in);
                //meminta user untuk memasukkan alas
                System.out.print("Masukkan alas segitiga: ");
                double alas = Scanner.nextDouble();
                //meminta user untuk memasukkan tinggi
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = Scanner.nextDouble();
                //menghitung uas segitiga
                double luas = 0.5 * alas * tinggi;
                //menampilkan hasil
                System.out.println("Luas segitiga adalah:"  + luas );
                //menutup scanner
                Scanner.close();
    }
    
}
