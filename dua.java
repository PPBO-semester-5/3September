/*
Nama: Fauziah Syifa R. Siregar
Tanggal: 5 September 2021
Menjumlahkan total belanjaan
 */

public class dua {
    public static void main(String[] args){
        //Deklarasi tipe data
        double a = 4.99, b = 2.49, c = 3.50;
        double t;

        //Hitung total barang
        t = (a * 2) + b + (c * 2);

        //Mencetak hasil
        System.out.println("HARGA BARANG");
        System.out.println("Milk $" + a);
        System.out.println("Bread $" + b);
        System.out.println("Pasta $" + String.format ("%.2f", c));
        System.out.println("Tomatoes $" + a);
        System.out.println("Chocolate $" + String.format ("%.2f", c));
        System.out.println("----------");
        System.out.println("Total $" + t);
    }
}
