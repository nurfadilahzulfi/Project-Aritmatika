public class Kubus {
    private int sisi;

    public Kubus() {
        // Constructor Default
    }

    //Construktor pada class kubus
    public Kubus(int sisi) {

        this.sisi = sisi;
    }

    //Membuat method mencari volume kubus
    public int hitungvolume() {
        aritmatika Vkubus = new aritmatika(sisi, sisi);
        int volume = Vkubus.getPerkalian((sisi*sisi),sisi);
        return volume;
    }

    public int Hitungluas() {
        aritmatika Luaspermukaan = new aritmatika();
        int luas = Luaspermukaan.getPerkalian(6,(sisi*sisi));
        return luas;
        }
}