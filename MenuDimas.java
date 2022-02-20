import java.util.Scanner;
public class MenuDimas{
//NPM : 4519210007
//Nama : Dimas Nugraha
//Program :contoh penerapan kondisi
//Update : 4 April 2021

public static void main (String args[]) {
    //membuat input string
    Scanner input_data = new Scanner(System.in);
    int pilihan;
    System.out.println("Npm : 4519210007");
    System.out.println("Nama : Dimas Nugraha");
    System.out.println("Program : contoh penerapan kondisi");
    System.out.println("Update : 4 April 2021");

System.out.println("===============================================================================================");
System.out.println("Menu Pilihan");
System.out.println("1. Makanan");
System.out.println("2. Minuman");
System.out.println("3. Keluar");

System.out.println("===============================================================================================");
System.out.println("Pilihan Anda  :");
pilihan =0;
while (pilihan < 1 || pilihan > 3){
    pilihan = input_data.nextInt();
switch(pilihan)
{
    case 1 :
              System.out.println("Selamat anda memilih menu 1. Makanan");
              break;
          case 2 : System.out.println("Selamat anda memilih menu 2. Minuman");
              break;
          case 3 : System.out.println("Selamat anda memilih menu 3. Keluar");
              break;
          default : System.out.println("maaf pilihan yang anda masukkan salah");
}
}
}
}