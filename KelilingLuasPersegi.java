public class KelilingLuasPersegi{

        private int sisi;

        public KelilingLuasPersegi () {
                // ini adalah construktor default berguna untuk melakukan 
                //inisialisasi awal pada objek yang pertama kali di ciptakan
        }

        public KelilingLuasPersegi(int sisi) {
            this.sisi = sisi;
        }


        //membuat method untuk mencari luas
        public int hitungluas() {
            aritmatika Hluas = new aritmatika();
            int luas = Hluas.getPerkalian(sisi, sisi);
            return luas;
        }

        public int hitungkeliling() {
            aritmatika Hluas = new aritmatika();
            int luas = Hluas.getPerkalian(4,sisi);
            return luas;
        }
}