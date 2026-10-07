/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajar.pbo;

/**
 *
 * @author HP
 */
public class BelajarPBO {
    
        public static void main(String[] args) {
        String nama = "budi utomo";
        String prodi = "Teknik Informatika";
        biodata(nama,prodi);
        
        double sudutDerajat = 69.5;
        Trigonometri(sudutDerajat);

        int hasil = penjumlahan (35,25,05);
        System.out.println("ini hasil penjumlahan " + hasil);
        
        hasil = perkalian (50,5);
        System.out.println("ini hasil perkalian " +hasil);
        
        hasil = pengurangan (100,10);
        System.out.println("ini hasil pengurangan " +hasil);
        
        hasil = pembagian (250,6);
        System.out.println("ini hasil pembagian " +hasil);
        
        hasil = perkalianpengurangan(280,35,100);
        System.out.println("ini hasil perkalian pengurangan "+hasil);
        
        hasil = penjumlahanpembagian(2009,30,200);
        System.out.println("ini hasil penjumlahan pembagian "+hasil);
    }
    
     public static void biodata(String nama,String prodi){
        System.out.println("......");
        System.out.println("Nama :"+nama);
        System.out.println("Prodi :"+prodi);
        System.out.println("......");
    }
     
    
     public static int penjumlahan(int a, int b, int c){
         return a+b+c;
     }
     
     public static int perkalian(int a, int b){
         return a*b;
     }
     
     public static int pengurangan(int a, int b){
         return a-b;
     }
     
     public static int pembagian(int a, int b){
         return a/b;
     }
     
      public static int perkalianpengurangan(int a, int b, int c){
         return a*b-c;
     }
      
      public static int penjumlahanpembagian(int a, int b, int c){
         return a+b/c;
     }
      public static void Trigonometri(double sudutDerajat){   
        double sudutRadian = Math.toRadians(sudutDerajat);
        
        double nilaiSin = Math.sin(sudutRadian);
        double nilaiCos = Math.cos(sudutRadian);
        double nilaiTan = Math.tan(sudutRadian);
        
        System.out.println("hasil Sin: " +nilaiSin);
        System.out.println("hasil Cos: " +nilaiCos);
        System.out.println("hasil Tan: " +nilaiTan);
    }
}