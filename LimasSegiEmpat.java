public class LimasSegiEmpat {
    private int luasalas;
    private int tinggi;

    

    //Method Constructor
    public LimasSegiEmpat(int luasalas, int tinggi) {
        this.luasalas = luasalas;
        this.tinggi = tinggi;
    }

    public int getVolume() {
        aritmatika hitungVolume = new aritmatika(luasalas, tinggi);
        int volume = hitungVolume.getPerkalian(luasalas,tinggi);
        int volume1 = hitungVolume.getPembagian(volume,3);
        return volume1;
    }

    public int getLuas() { // rumus : (luas alas) + (4 x Luas Sisi Tegak)
        aritmatika hitungLpermukaan = new aritmatika(luasalas, tinggi);
        aritmatika hitungLmiring = new aritmatika(luasalas, tinggi); // Lmiring = Luas sisi tegak
        int luasAlas = luasalas;
        int luasSisiTegak = hitungLmiring.getPerkalian(4, tinggi);

        int luasPermukaan = hitungLpermukaan.getPertambahan(luasAlas, luasSisiTegak);
        return luasPermukaan;
    }
}