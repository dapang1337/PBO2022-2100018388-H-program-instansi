public class Pemasaran extends Pegawai {//Pemasaran subclass dari Pegawai
    private double bonus;//deklarasi variabel bonus bertipe int scr private

    public Pemasaran(String nip, String nama, String alamat, int gol, int jumAnak){
        //constructor ber-parameter
        super(nip,nama,alamat,gol,jumAnak);//variabel pada superclass
    }

    @Override
    public double hitGT(){//metode hitGT()
        return super.hitGP() + bonus;//hasil penjumlahan hitGP() pada superclass dan bonus
        //merupakan nilai balikan
    }

    public double getBonus() {//metode get untuk bonus
        return bonus;//isi bonus sbg nilai balikan
    }

    public void setBonus(double bonus) {//metode set untuk bonus
        this.bonus = bonus;//simpan ke bonus
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