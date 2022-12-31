public class Divisi {
    private static final int MAX_ANG=3;//deklarasi MAX_ANG bernilai 10, bertipe int
    private String namaD;//deklarasi variabel namaD bertipe String scr private
    private int jumAng;//deklarasi variabel jumAng bertipe int scr private
    private Pegawai kepalaDiv;//deklarasi variabel kepalaDiv berbasis Pegawai scr private
    private Divisi[] div;//deklarasi variabel div berbasis Divisi[] scr private
    private Pegawai[] dataP;//deklarasi variabel dataP berbasis Pegawai[] scr private

    public Divisi(){//constructor
        dataP = new Pegawai[MAX_ANG];
        jumAng=0;//simpan ke jumAng
    }

    public Divisi(Divisi[] div){//constructor dgn parameter
        this.div = div;//simpan ke div
    }

    public Pegawai getKepalaDiv() {//metode get untuk kepalaDiv
        return kepalaDiv;//nilai balikan
    }

    public void setKepalaDiv(Pegawai kepalaDiv) {//metode set untuk kepalaDiv, dgn parameter
        this.kepalaDiv = kepalaDiv;//simpan ke kepalaDiv
    }

    public Pegawai getDataP(int index) {//metode get untuk dataP dengan parameter
        return dataP[index];//nilai balikan
    }

    public void setDataP(Pegawai dataP) {//metode set untuk dataP, dgn parameter
        this.dataP[this.jumAng] = dataP;//simpan ke dataP dengan jumAng sbg index
        this.jumAng++;//isi jumAng bertambah
    }

    public String getNamaD() {//metode get untuk namaD
        return namaD;//nilai balikan
    }

    public void setNamaD(String namaD) {//metode set untuk namaD
        this.namaD = namaD;//simpan ke namaD
    }

    public int getJumAng() {//metode get untuk jumAng
        return jumAng;//metode get untuk jumPeg
    }

}
