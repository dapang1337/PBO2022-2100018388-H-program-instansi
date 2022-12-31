public class Kepegawaian extends Pegawai {//Kepegawaian subclass dari Pegawai
    private double tunT;//deklarasi variabel tunT bertipe int scr private

    public Kepegawaian(String nip, String nama, String alamat, int gol, int jumAnak){
        //constructor ber-parameter
        super(nip,nama,alamat,gol,jumAnak);//variabel pada superclass
    }

    @Override
    public double hitGT(){//metode hitGT()
        return super.hitGP() + tunT;//hasil penjumlahan hitGP() pada superclass dan tunT
        //merupakan nilai balikan
    }

    public double getTunT() {//metode get untuk tunT
        return tunT;//isi tunT sbg nilai balikan
    }

    public void setTunT(double tunT) {//metode set untuk tunT
        this.tunT = tunT;//simpan ke tunT
    }

    @Override
    public int getGajiPokok() {//metode get untuk gajiPokok
        return gajiPokok;//isi gajiPokok sbg nilai balikan
    }

    @Override
    public void setGajiPokok(int gajiPokok) {//metode set untuk gajiPokok
        this.gajiPokok = gajiPokok;//simpan ke gajiPokok
    }
}