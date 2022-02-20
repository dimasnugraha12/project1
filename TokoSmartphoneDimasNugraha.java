//NPM       : 4519210007
//Nama      : Dimas Nugraha
//Program   : UTS - PBO A - Toko Smartphone Dimas
//Update    : 15 April 2021


import java.util.Scanner;
public class TokoSmartphoneDimasNugraha {

    //Method menampilkan barang yang tersedia
    public static void BarangTersedia () {
        //Menampilkan barang yang tersedia
        System.out.println("--- Barang Yang Tersedia Di Toko Kami ---");
        System.out.println("====================================================================================================");
        System.out.println("    1. Oppo Reno X");
        System.out.println("    2. Xiaomi Redmi X");
        System.out.println("    3. Vivo Y17");
        System.out.println("    4. Apple Iphone XR");
        System.out.println("====================================================================================================");
    }

    //Variabel
    private String nama_smartphone;
    private String os;
    private String chipset;
    private int ram;
    private int storage;
    private int harga;

    //Setter dan Getter
    //nama_smartphone
    public void set_nama_smartphone(String nama_smartphone)
    {
        this.nama_smartphone = nama_smartphone;
    }
    public String get_nama_smartphone()
    {
        return this.nama_smartphone;
    }
    //os
    public void set_os(String os)
    {
        this.os = os;
    }
    public String get_os()
    {
        return this.os;
    }
    //chipset
    public void set_chipset(String chipset)
    {
        this.chipset = chipset;
    }
    public String get_chipset()
    {
        return this.chipset;
    }
    //ram
    public void set_ram(int ram)
    {
        this.ram = ram;
    }
    public int get_ram()
    {
        return this.ram;
    }
    //storage
    public void set_storage(int storage)
    {
        this.storage = storage;
    }
    public int get_storage()
    {
        return this.storage;
    }
    //harga
    public void set_harga(int harga)
    {
        this.harga = harga;
    }
    public int get_harga()
    {
        return this.harga;
    }

    //Method menampilkan spesifikasi dan harga barang
    public static void spesifikasi() {
        //Membuat object
        TokoSmartphoneDimasNugraha oppo = new TokoSmartphoneDimasNugraha();
        TokoSmartphoneDimasNugraha xiaomi = new TokoSmartphoneDimasNugraha();
        TokoSmartphoneDimasNugraha vivo = new TokoSmartphoneDimasNugraha();
        TokoSmartphoneDimasNugraha apple = new TokoSmartphoneDimasNugraha();

        //Memanggil method setter
        //Object oppo
        oppo.set_nama_smartphone("Oppo Reno X");
        oppo.set_os("Android 9.0");
        oppo.set_chipset("Qualcomm SM8150 Snapdragon 855");
        oppo.set_ram(8);
        oppo.set_storage(256);
        oppo.set_harga(8990000);
        //Object xiaomi
        xiaomi.set_nama_smartphone("Xiaomi Redmi X");
        xiaomi.set_os("Android 9.0");
        xiaomi.set_chipset("Qualcomm Snapdragon 730");
        xiaomi.set_ram(6);
        xiaomi.set_storage(128);
        xiaomi.set_harga(5990000);
        //Object vivo
        vivo.set_nama_smartphone("Vivo Y17");
        vivo.set_os("Android 9.0");
        vivo.set_chipset("MediaTek Helio P35");
        vivo.set_ram(4);
        vivo.set_storage(128);
        vivo.set_harga(2599000);
        //Object apple
        apple.set_nama_smartphone("Apple Iphone XR");
        apple.set_os("IOS 14.2");
        apple.set_chipset("Apple A12 Bionic");
        apple.set_ram(3);
        apple.set_storage(128);
        apple.set_harga(5800000);

        //Memanggil method getter
        System.out.println("--- Spesifikasi dan Harga Barang ---");
        System.out.println("====================================================================================================");
        System.out.println("1. Oppo Reno X");
        System.out.println("    a. Nama Smartphone : " +oppo.nama_smartphone);
        System.out.println("    b. OS              : " +oppo.os);
        System.out.println("    c. Chipset         : " +oppo.chipset);
        System.out.println("    d. RAM             : " +oppo.ram+ " GB");
        System.out.println("    e. Storage         : " +oppo.storage+ " GB");
        System.out.println("    f. Harga           : Rp " +oppo.harga);
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("2. Xiaomi Redmi X");
        System.out.println("    a. Nama Smartphone : " +xiaomi.nama_smartphone);
        System.out.println("    b. OS              : " +xiaomi.os);
        System.out.println("    c. Chipset         : " +xiaomi.chipset);
        System.out.println("    d. RAM             : " +xiaomi.ram+ " GB");
        System.out.println("    e. Storage         : " +xiaomi.storage+ " GB");
        System.out.println("    f. Harga           : Rp " +xiaomi.harga);
        System.out.println("====================================================================================================\n");
        System.out.println("3. Vivo Y17");
        System.out.println("    a. Nama Smartphone : " +vivo.nama_smartphone);
        System.out.println("    b. OS              : " +vivo.os);
        System.out.println("    c. Chipset         : " +vivo.chipset);
        System.out.println("    d. RAM             : " +vivo.ram+ " GB");
        System.out.println("    e. Storage         : " +vivo.storage+ " GB");
        System.out.println("    f. Harga           : Rp " +vivo.harga);
        System.out.println("====================================================================================================\n");
        System.out.println("4. Apple Iphone XR");
        System.out.println("    a. Nama Smartphone : " +apple.nama_smartphone);
        System.out.println("    b. OS              : " +apple.os);
        System.out.println("    c. Chipset         : " +apple.chipset);
        System.out.println("    d. RAM             : " +apple.ram+ " GB");
        System.out.println("    e. Storage         : " +apple.storage+ " GB");
        System.out.println("    f. Harga           : Rp " +apple.harga);
        System.out.println("====================================================================================================\n");

    }    
        
    //Method pembelian
    public static void pembelian() {
        Scanner input_pilihdim = new Scanner(System.in);
        System.out.println("--- List Pembelian Barang ---");
        System.out.println("================================================================================================");
        System.out.println("    1. Oppo Reno X Rp 8.990.000");
        System.out.println("    2. Xiaomi Redmi X Rp 5.990.000");
        System.out.println("    3. Vivo Y17 Rp 2.599.000");
        System.out.println("    4. Apple Iphone XR Rp 5.800.000");
        System.out.println("================================================================================================");
        System.out.println("Masukkan Pilihan Anda : ");
        int pilihan = 0;
        pilihan = input_pilihdim.nextInt();
        if (pilihan == 1) {
            int jumlah_pembelian = 0;
            int total_pembayaran;
            System.out.println("Jumlah Pembelian Barang : ");
            jumlah_pembelian = input_pilihdim.nextInt();
            total_pembayaran = 8990000 * jumlah_pembelian;
            System.out.println("Total Pembayaran : Rp " +total_pembayaran);
            System.out.println("--- Konfirmasi Pembayaran Pembelian ---");
            System.out.println("Pilih Y Untuk Konfirmasi dan Pilih N Untuk Batalkan : ");
            System.out.println("Masukkan Pilihan Anda : ");
            char pilihan2 = 'a';
            pilihan2 = input_pilihdim.next().charAt(0);
            if (pilihan2 == 'Y' || pilihan2 == 'y') {
                System.out.println("--- Terima Kasih Telah Berbelanja Di Dimas Phone ---");
            } else
                if (pilihan2 == 'N' || pilihan2 == 'n') {
                    System.out.println("--- Pembelian Dibatalkan ---");
                } else
                    System.out.println("Pilihan Anda Salah");
        } else
            if (pilihan == 2) {
                int jumlah_pembelian = 0;
                int total_pembayaran;
                System.out.println("Jumlah Pembelian : ");
                jumlah_pembelian = input_pilihdim.nextInt();
                total_pembayaran = 5990000 * jumlah_pembelian;
                System.out.println("Total Pembayaran : Rp " +total_pembayaran);
                System.out.println("--- Konfirmasi Pembayaran Pembelian---");
                System.out.println("Pilih Y Untuk Konfirmasi dan Pilih N Untuk Batalkan : ");
                System.out.println("Masukkan Pilihan Anda : ");
                char pilihan2 = 'a';
                pilihan2 = input_pilihdim.next().charAt(0);
                if (pilihan2 == 'Y' || pilihan2 == 'y') {
                       System.out.println("--- Terima Kasih Telah Berbelanja Di Dimas Phone ---");
                } else
                    if (pilihan2 == 'N' || pilihan2 == 'n') {
                        System.out.println("--- Pembelian Dibatalkan ---");
                    } else
                        System.out.println("Pilihan Anda Salah");
        } else
            if (pilihan == 3) {
                int jumlah_pembelian = 0;
                int total_pembayaran;
                System.out.println("Jumlah Pembelian Barang : ");
                jumlah_pembelian = input_pilihdim.nextInt();
                total_pembayaran = 2599000 * jumlah_pembelian;
                System.out.println("Total Pembayaran : Rp " +total_pembayaran);
                System.out.println("--- Konfirmasi Pembayaran Pembelian ---");
                System.out.println("Pilih Y Untuk Konfirmasi dan Pilih N Untuk Batalkan : ");
                System.out.println("Masukkan Pilihan Anda : ");
                char pilihan2 = 'a';
                pilihan2 = input_pilihdim.next().charAt(0);
                if (pilihan2 == 'Y' || pilihan2 == 'y') {
                    System.out.println("--- Terima Kasih Telah Berbelanja Di Dimas Phone ---");
                } else
                    if (pilihan2 == 'N' || pilihan2 == 'n') {
                         System.out.println("--- Pembelian Dibatalkan ---");
                    } else
                        System.out.println("Pilihan Anda Salah");
        } else
            if (pilihan == 4) {
                int jumlah_pembelian = 0;
                int total_pembayaran;
                System.out.println("Jumlah Pembelian Barang : ");
                jumlah_pembelian = input_pilihdim.nextInt();
                total_pembayaran = 5800000 * jumlah_pembelian;
                System.out.println("Total Pembayaran : Rp " +total_pembayaran);
                System.out.println("--- Konfirmasi Pembayaran Pembelian ---");
                System.out.println("Pilih Y Untuk Konfirmasi dan Pilih N Untuk Batalkan : ");
                System.out.println("Masukkan Pilihan Anda : ");
                char pilihan2 = 'a';
                pilihan2 = input_pilihdim.next().charAt(0);
                if (pilihan2 == 'Y' || pilihan2 == 'y') {
                    System.out.println("--- Terima Kasih Telah Berbelanja Di Dimas Phone ---");
                } else
                    if (pilihan2 == 'N' || pilihan2 == 'n') {
                        System.out.println("--- Pembelian Dibatalkan ---");
                    } else
                        System.out.println("Pilihan Anda Salah");
            } else
                System.out.println("Pilihan Anda Salah");
    }

    // Method keluar
    public static void keluar() {
        System.out.println("Terima Kasih Telah Berbelanja Di Dimas Phone");
    }

    //Method menu
    public static void menu() {
        Scanner input_menudim = new Scanner(System.in);
        Scanner input_menumas = new Scanner(System.in);

        int pilihan_menudim;
        char pilihan_menumas = 'i';

        pilihan_menudim=4;
        mulai:
        do {
            System.out.println("\n================================================================================================");
            System.out.println("          Selamat Datang Di Toko Dimas Phone");
            System.out.println("================================================================================================");
            System.out.println("Menu Pilihan Di Toko Dimas Phone");
            System.out.println("1. Daftar Barang Yang Tersedia Di Toko Kami");
            System.out.println("2. Daftar Spesifikasi dan Harga Barang");
            System.out.println("3. Pembelian Barang");
            System.out.println("4. Keluar");
            System.out.println("================================================================================================");

            System.out.println("Masukkan Pilihan Anda : ");
            pilihan_menudim = input_menudim.nextInt();
            switch (pilihan_menudim) {
                case 1:
                    BarangTersedia();
                    while(pilihan_menumas != 'Y' || pilihan_menumas != 'N') {
                        System.out.println("Apakah Anda Ingin Melanjutkan ? Y atau N");
                        pilihan_menumas = input_menumas.next().charAt(0);
                        if (pilihan_menumas == 'Y' || pilihan_menumas == 'y') {
                            continue mulai;
                        }  else if (pilihan_menumas == 'N' || pilihan_menumas == 'n') {
                            System.exit(0);
                        }  else {
                            System.out.println("Pilihan Anda Salah");
                        }
                    }
                    break;
                case 2:
                    spesifikasi();
                    while(pilihan_menumas != 'Y' || pilihan_menumas != 'N') {
                        System.out.println("Apakah Anda Ingin Melanjutkan ? Y atau N");
                        pilihan_menumas = input_menumas.next().charAt(0);
                        if (pilihan_menumas == 'Y' || pilihan_menumas == 'y') {
                            continue mulai;
                        }  else if (pilihan_menumas == 'N' || pilihan_menumas == 'n') {
                             System.exit(0);
                        }  else {
                            System.out.println("Pilihan Anda Salah");
                        }
                    }
                    break;
                case 3:
                    pembelian();
                    while(pilihan_menumas != 'Y' || pilihan_menumas != 'N') {
                        System.out.println("Apakah Anda Ingin Melanjutkan ? Y atau N");
                        pilihan_menumas = input_menumas.next().charAt(0);
                        if (pilihan_menumas == 'Y' || pilihan_menumas == 'y') {
                            continue mulai;
                        }  else if (pilihan_menumas == 'N' || pilihan_menumas == 'n') {
                            System.exit(0);
                        }  else {
                            System.out.println("Pilihan Anda Salah");
                        }
                    }
                    break;
                case 4:
                    keluar();
                    break;
                default: System.out.println("Pilihan Anda Salah");
            }
        } while(pilihan_menudim !=4);
    }

    public static void main(String[] args) {
        System.out.println("NPM     : 4519210007");
        System.out.println("Nama    : Dimas Nugraha");
        System.out.println("Program : UTS - PBO A - Toko Smartphone Dimas");
        System.out.println("Update  : 15 April 2021");

        menu();
    }
}