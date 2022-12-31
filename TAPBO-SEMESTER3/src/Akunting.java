public class Akunting extends Pegawai {//Akunting subclass dari Pegawai
    private double tunJab;//deklarasi variabel tunJab bertipe int scr private

    public Akunting(String nip, String nama, String alamat, int gol, int jumAnak){
        //constructor ber-parameter
        super(nip,nama,alamat,gol,jumAnak);//variabel pada superclass
    }

    @Override
    public double hitGT(){//metode hitGT()
        return super.hitGP()+tunJab;//hasil penjumlahan hitGP() pada superclass dan tunJab
        //merupakan nilai balikan
    }

    @Override
    public int getGajiPokok() {//metode get untuk gajiPokok
        return gajiPokok;//isi gajiPokok sbg nilai balikan
    }

    @Override
    public void setGajiPokok(int gajiPokok) {//metode set untuk gajiPokok
        this.gajiPokok = gajiPokok;//simpan ke gajiPokok
    }

    public double getTunJab() {//metode get untuk tunJab
        return tunJab;//isi tunJab sbg nilai balikan
    }

    public void setTunJab(double tunJab) {//metode set untuk tunJab
        this.tunJab = tunJab;//simpan ke tunJab
    }
}