package swing; 

//import library Scanner ke program
import java.util.Scanner; 

public class Swingtoko{

    public static void main(String[] args){ 
        
        String nama, nama_toko, pesanan, ditoko;   //deklarasi variabel store and order
        int no_telepon;

        Scanner input = new Scanner(System.in);   //membuat scanner baru

        System.out.println("..Pendataan Toko..");    //tampilkan output ke user
        System.out.print("Nama Pembuat Toko : "); 
        nama = input.nextLine();    //menggunakan scanner dan menyimpan apa yg diketik ke dlm variabel
                                    //jika string gunakan nextLine, jika integer gunakan nextInt

        System.out.print("Nama Toko : ");
        nama_toko = input.nextLine();

        System.out.println("-------------------------");

        System.out.println("..Pendataan Pesanan..");     //tampilkan output ke user 
        System.out.print("Pesanan : ");     //tampilkan output lagi
        pesanan = input.nextLine();

        System.out.print("Di Toko mana : "); 
        ditoko = input.nextLine();

        System.out.print("Notelepon : "); 
        no_telepon = input.nextInt(); 

        System.out.println("-------------------------");
        System.out.println("Nama Pembuat Toko : " + nama);
        System.out.println("Nama Toko : " + nama_toko);
        System.out.println("Nama Pesanan : " + pesanan);
        System.out.println("Tempat order : " + ditoko);
        System.out.println("No telp : " + no_telepon); 




    }

}