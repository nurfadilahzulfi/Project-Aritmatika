//Bismillahirrahmanirrahim


public class aritmatika {
    

        private int nilaiA;
        private int nilaiB;
        public aritmatika() {

        }

        //membuat constructor pada class artimatika
        public aritmatika(int nilaiA, int nilaiB) {
            this.nilaiA = nilaiA;
            this.nilaiB = nilaiB;    
        }

        //Membuat mutator pada class artimatika
        // metode get digunakan untuk mengembalikan nilai 
        //pada dari variable dengan menggunakan fungsi return 
        // dan set merupakan method void untuk mensetting atau memberikan nilai pada variable.
        public void setNilaiA(int nilaiA) {
                this.nilaiA = nilaiA;
        }
        public void setNilaiB(int nilaiB) {
                this.nilaiB = nilaiB;
        }

        //membuat method untuk artimatika
        public int getPertambahan(int nilaiA, int nilaiB) {    
            return nilaiA + nilaiB;
        }
        public int getPengurangan(int nilaiA, int nilaiB) {  
            return nilaiA - nilaiB;
        }
        public int getPerkalian(int nilaiA, int nilaiB) {    
            return nilaiA * nilaiB;
        }
        public int getPembagian(int nilaiA, int nilaiB) {   
            return nilaiA / nilaiB;
        }
        

        //membuat method untuk mencetak tampilan
        public String tampilkantambah() {
            return "\nNilai A = " + nilaiA + "\nNilai B = " + nilaiB + "\nHasil Penjumlahan dari nilai A dan B adalah : " + (nilaiA + nilaiB);
        }
        //membuat method untuk mencetak tampilan
        public String tampilkurang() {
            return "\nNilai A = " + nilaiA + "\nNilai B = " + nilaiB + "\nHasil dari Pengurangan nilai A dan B adalah : " + (nilaiA - nilaiB);
        }
        //membuat method untuk mencetak tampilan
        public String tampilkali() {
            
            return "\nNilai A = " + nilaiA + "\nNilai B = " + nilaiB + "\nHasil dari Perkalian nilai A dan B adalah : " + (nilaiA *nilaiB);
            
        }
        //membuat method untuk mencetak tampilan
        public String tampilbagi() {
            return "\nNilai A = " + nilaiA + "\nNilai B = " + nilaiB + "\nHasil dari Pembagian nilai A dan B adalah : " + (nilaiA / nilaiB);
        }
    
    public static void main(String[] args){
        aritmatika artimatika1 = new aritmatika();

        //memberi nilai artimatika dan Pemanggilan method
        artimatika1.setNilaiA(66);
        artimatika1.setNilaiB(3);
        artimatika1.getPerkalian(26, 98);
        //Menampilkan nilai pada artimatika
        
        System.out.println(artimatika1.tampilkali());
        System.out.println(artimatika1.tampilkantambah());
        System.out.println(artimatika1.tampilbagi());
        System.out.println(artimatika1.tampilkurang());
    }
}