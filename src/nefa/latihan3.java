
package nefa;
import java.util.Scanner;
public class latihan3 {
     public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("masukkan nama anda: ");
    String nama = scanner.nextLine();
    System.out.print("masukkan usia anda: ");
    int usia = scanner. nextInt();
    scanner.nextLine(); // mengonsumsi newLine yang tertinggal
    
    System.out.print("alamat :");
    String alamat = scanner.nextLine();
    System.out.print(" jenis kelamin p/l ");
    char jeniskelamin = scanner.next().charAt(0);
    System.out.println("/n== Data Diri Anda ===");
    System.out.println("Nama :" + nama);
    System.out.println("usia :" +  usia);
    System.out.println("alamat : " + alamat);
    System.out.println("Jenis Kelamin :" +(jeniskelamin == 'P' ? "Laki Laki" :"Perempuan"));
     }
}
