/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Martabaks {

    static Scanner s = new Scanner(System.in);
    static String menu[][]= new String[12][4];
    
    static void DaftarMenu(){
        System.out.println("");
        System.out.println("DAFTAR MENU");
        System.out.println("");
        System.out.println("No.\tJENIS\tRASA\t\tTOPPING\t\tHARGA");
        for(int i=0; i<12; i++){
            System.out.print((i+1)+".\t");
            System.out.print(menu[i][0]+"\t");
            System.out.print(menu[i][1]+"\t");
            System.out.print(menu[i][2]+"\t");
            System.out.print(menu[i][3]+"\t");
            System.out.println("");
        }
        System.out.println("");
    }
    
    static String[][]urutkan(String[][]data, int kolom){
        for(int i=0; i<11; i++){
            for(int j=i+1; j<12; j++){
                if(data[i][kolom].compareToIgnoreCase(data[j][kolom])>0){
                    //tukar rasa
                    String temp1 = data[i][1];
                    data[i][1]=data[j][1];
                    data[j][1]=temp1;
                    //tukar topping
                    String temp2 = data[i][2];
                    data[i][2]=data[j][2];
                    data[j][2]=temp2;
                    //tukar harga
                    String temp3 = data[i][3];
                    data[i][3]=data[j][3];
                    data[j][3]=temp3;
                }
            
            }
        }
        String hasil[][] = new String[12][4];
        for(int i=0; i<12; i++){
            hasil[i][1]=data[i][1]; //rasa
            hasil[i][2]=data[i][2]; //topping
            hasil[i][3]=data[i][3]; //harga
        }
        return hasil;
    }   
    
    static void cetakUrut(String u[][]){
        for (int i=0; i<12; i++){
            System.out.print((i+1)+". "+u[i][1]);
            System.out.print("  "+u[i][2]);
            System.out.print(" : "+u[i][3]);
            System.out.println("");
        }
    }
    
    static void urutRasa(){
        String urut[][]= urutkan(menu, 1);
        System.out.println("");
        System.out.println("Urut Rasa");
        cetakUrut(urut);
    }
    
    static void urutTopping(){
        String urut[][]= urutkan(menu, 2);
        System.out.println("");
        System.out.println("Urut Topping");
        cetakUrut(urut);
    }
    
    static void urutHarga(){
        String urut[][]= urutkan(menu, 3);
        System.out.println("");
        System.out.println("Urut Harga");
        cetakUrut(urut);
    }
    
    
    static void UrutkanMenu(){
        int pilih1;
        do{
            System.out.println("");
            System.out.println("Urutkan Berdasarkan");
            System.out.println("1. Rasa\n2. Topping\n3. Harga\n4. Selesai");
            System.out.print("Pilih = ");
            pilih1 = s.nextInt();
            switch(pilih1){
                case 1 :
                    urutRasa(); 
                    break;
                case 2 :
                    urutTopping();
                    break;
                case 3 :
                    urutHarga();
                    break;
                case 4 :
                    System.out.println("Selesai");
                    break;
            }
        }while(pilih1!=4);
    }
    
    static void cariRasa(String rs){
        boolean ketemu=false;
        for(int i=0; i<12; i++){
            if(menu[i][1].contains(rs)){
                System.out.print(menu[i][1]+"  "+menu[i][2]+" : "+menu[i][3]);
                System.out.println("");
                ketemu=true;
            }
        }
        if(ketemu==false){
            System.out.println("Menu Tidak Ada");
        }
    }
    
     static void cariTopping(String tp){
        boolean ketemu=false;
        for(int i=0; i<12; i++){
            if(menu[i][2].contains(tp)){
                System.out.print(menu[i][1]+"  "+menu[i][2]+" : "+menu[i][3]);
                System.out.println("");
                ketemu=true;
            }
        }
        if(ketemu==false){
            System.out.println("Menu Tidak Ada");
        }
    }
    
    
    static void cariHarga(String hg){
        boolean ketemu=false;
        for(int i=0; i<12; i++){
            if(menu[i][3].contains(hg)){
                System.out.print(menu[i][1]+"  "+menu[i][2]+" : "+menu[i][3]);
                System.out.println("");
                ketemu=true;
            }
        }
        if(ketemu==false){
            System.out.println("Menu Tidak Ada");
        }
    }
    
    static void Pencarian(){
        int pilih2;
        do{
            System.out.println("");
            System.out.println("Cari Berdasarkan");
            System.out.println("1. Rasa\n2. Topping\n3. Harga\n4. Selesai");
            System.out.print("Pilih = ");
            pilih2 = s.nextInt();
            switch(pilih2){
                case 1 :
                    System.out.print("Rasa : ");
                    String rasa = s.next();
                    cariRasa(rasa); 
                    break;
                case 2 :
                    System.out.print("Topping : ");
                    String topping = s.next();
                    cariTopping(topping);
                    break;
                case 3 :
                    System.out.print("Harga : ");
                    String harga = s.next();
                    cariHarga(harga);
                    break;
                case 4 :
                    System.out.println("Selesai");
                    break;
            }
        }while(pilih2!=4);
    }
    
    
    static void cetakJumlah(int tot){
        System.out.println("");
        System.out.print("TOTAL PEMBAYARAN : Rp ");
        System.out.print(tot);
        System.out.println("");
    }
    
    static void RekamPesanan(){
        String nama,alamat,rasa,topping;
        int harga, jum, jumlah, pesanan;
        int total;
        jumlah=0; 
        total=0; 
        System.out.println("");
        System.out.println("PESANAN ANDA");
        System.out.println("");
        System.out.print("Banyak Pesanan : ");
        pesanan=s.nextInt();
        System.out.println("");
        System.out.print("Nama : ");
        nama=s.next();
        System.out.print("Alamat : ");
        alamat=s.next();
        for (int i = 0; i<pesanan; i++){
        System.out.println("");
        System.out.println("Pesanan "+(i+1));
            for(int j=0; j<3; j++){
                    if(j==0){
                       System.out.print("Rasa : ");
                       rasa=s.next();
                    }
                    else if(j==1){
                       System.out.print("Topping : ");
                       topping=s.next();
                    }
                    else if(j==2){
                        System.out.print("Jumlah : ");
                        jum=s.nextInt();
                        System.out.print("Harga satu :");
                        harga=s.nextInt();
                        jumlah=jum*harga;
                        total=total+jumlah;
                    }
                }     
            }
            cetakJumlah(total);
                                
    }
    
    
    public static void main(String[] args) {
       System.out.println("SELAMAT DATANG DI LAPAK MARTABAK KAMI...");
       System.out.println("");
       System.out.println("KAMI DARI KELOMPOK 5");
       System.out.println("Dengan Anggota : ");
       System.out.println("1. Ciptagusti Sila Sakti");
       System.out.println("   NPM : 20082010043");
       System.out.println("2. Zilvi Azus Sriyanti");
       System.out.println("   NPM : 20082010057");
       System.out.println("3. Valent Aderiandra");
       System.out.println("   NPM : 20082010061");
       System.out.println("4. Syahrani Ratnaswari");
       System.out.println("   NPM : 20082010062");
       System.out.println("");
       int pilih;
       //inisialisasi daftar menu
       menu[0][0]="telur"; menu[0][1]="istimewa";
       menu[0][2]="ayam      "; menu[0][3]="30.000";
       menu[1][0]="telur"; menu[1][1]="spesial ";
       menu[1][2]="ayam      "; menu[1][3]="25.000"; 
       menu[2][0]="telur"; menu[2][1]="biasa   ";
       menu[2][2]="ayam      "; menu[2][3]="20.000";
       menu[3][0]="manis"; menu[3][1]="original";
       menu[3][2]="coklat    "; menu[3][3]="20.000"; 
       menu[4][0]="manis"; menu[4][1]="original";
       menu[4][2]="keju      "; menu[4][3]="21.000"; 
       menu[5][0]="manis"; menu[5][1]="original";
       menu[5][2]="coklat,keju"; menu[5][3]="25.000"; 
       menu[6][0]="manis"; menu[6][1]="pandan  ";
       menu[6][2]="coklat    "; menu[6][3]="22.000";
       menu[7][0]="manis"; menu[7][1]="pandan  ";
       menu[7][2]="keju      "; menu[7][3]="24.000"; 
       menu[8][0]="manis"; menu[8][1]="pandan  ";
       menu[8][2]="coklat,keju"; menu[8][3]="27.000";
       menu[9][0]="manis"; menu[9][1]="redvelved";
       menu[9][2]="coklat       "; menu[9][3]="25.000";
       menu[10][0]="manis"; menu[10][1]="redvelved";
       menu[10][2]="keju    "; menu[10][3]="27.000";
       menu[11][0]="manis"; menu[11][1]="redvelved";
       menu[11][2]="coklat,keju"; menu[11][3]="30.000";
        do{
            System.out.println("");
            System.out.println("MARTABAK KELOMPOK 5");
            System.out.println("1. Daftar Menu");
            System.out.println("2. Urutkan Menu");
            System.out.println("3. Cari Menu");
            System.out.println("4. Rekam Pesanan dan Total Pembayaran");
            System.out.println("5. Exit");
            System.out.print("Pilih = ");
            pilih=s.nextInt();
            switch(pilih){
                case 1 :
                    DaftarMenu();
                    break;
                case 2 :
                    UrutkanMenu();
                    break;
                case 3 :
                    Pencarian();
                    break;
                case 4 :
                     RekamPesanan();
                    break;
                case 5 :
                    System.out.println("");
                    System.out.println("TERIMA KASIH ");
                    System.out.println("SILAKAN TUNGGU PESANAN ANDA...");
                }
               
        }while(pilih!=5);
    
    }
    
}
