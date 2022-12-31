public abstract class Pegawai implements Penggajian{
    //kelas abstrak, dan mengimpementasikan interface Penggajian
    private final String nip;//deklarasi variabel nip bertipe String scr private
    private final String nama; //deklarasi variabel nama bertipe String scr private
    private final String alamat;//deklarasi variabel alamat bertipe String scr private
    private final int jumAnak;//deklarasi variabel jumAnak bertipe String scr private
    private int jamLembur;//deklarasi variabel jamLembur bertipe int scr private
    private final int gol;//deklarasi variabel gol bertipe int scr private
    protected int gajiPokok;//deklarasi variabel gajiPokok bertipe int

    public Pegawai(String id, String n, String a, int g, int jl){//constructor ber-parameter
        this.nip=id;//simpan ke nip
        this.nama=n;//simpan ke nama
        this.alamat=a;//simpan ke alamat
        this.gol=g;//simpan ke gol
        this.jumAnak=jl;//simpan ke jumAnak
    }

    public int hitGP(){//metode hitGP()
        switch(getGol()){//switch dengan getGol() sbg kondisi
            case 1://dieksekusi jika kondisi berupa 1
                gajiPokok = 1000000;//simpan 1000000 ke gajiPokok
                break;//berhenti mengecek case yg lain
            case 2://dieksekusi jika kondisi berupa 2
                gajiPokok = 1500000;//simpan 1500000 ke gajiPokok
                break;//berhenti mengecek case yg lain
            case 3://dieksekusi jika kondisi berupa 3
                gajiPokok = 2000000;//simpan 2000000 ke gajiPokok
                break;//berhenti mengecek case yg lain
            case 4://dieksekusi jika kondisi berupa 4
                gajiPokok = 3000000;//simpan 3000000 ke gajiPokok
                break;//berhenti mengecek case yg lain
        }
        return gajiPokok;//isi gajiPokok sbg nilai balikan
    }

    @Override//metode hitGT() adalah implementasi
    abstract public double hitGT();//metode abstrak hitGT()

    public String getNip() {//metode get untuk nip
        return nip;//isi nip sbg nilai balikan
    }

    public String getNama() {//metode get untuk nama
        return nama;//isi nama sbg nilai balikan
    }

    public String getAlamat() {//metode get untuk alamat
        return alamat;//isi alamat sbg nilai balikan
    }

    public int getJumAnak() {//metode get untuk jumAnak
        return jumAnak;//isi jumAnak sbg nilai balikan
    }

    public int getGol() {//metode get untuk gol
        return gol;//isi gol sbg nilai balikan
    }

    public int getJamLembur() {//metode get untuk jamLembur
        return jamLembur;//isi jamLembur sbg nilai balikan
    }

    public void setJamLembur(int jamLembur) {//metode set untuk jamLembur dgn argumen
        this.jamLembur = jamLembur;//simpan ke jamLembur
    }

    abstract public int getGajiPokok(); //metode abstrak getGajiPokok()

    abstract public void setGajiPokok(int gajiPokok) ;//metode abstrak setGajiPokok()
}