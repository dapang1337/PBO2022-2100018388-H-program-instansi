import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] namaDiv= {"Akunting", "Pemasaran", "Kepegawaian"};//menyimpan String di namaDiv
        Scanner sc = new Scanner(System.in);

        Pegawai peg1 = null;//obyek peg1 bernilai null
        Pegawai kepala = null;//obyek kepala bernilai null
        Divisi[] div = new Divisi[3];//Array of objects
        for(int i=0;i<3;i++)//perulangan for
        {
            div[i]=new Divisi();//membentuk obyek div[i]
            System.out.print("Pilih divisi :\n 1. "+namaDiv[0]+" \n 2. "+namaDiv[1]+" \n 3. "+namaDiv[2]+" ");
            System.out.print("\nPilihan : ");//output tulisan
            int pilih=sc.nextInt();//menjalankan method nextInt(), disimpan di pilih
            div[i].setNamaD(namaDiv[pilih-1]);
            System.out.println("Masukkan Data Kepala Divisi : ");//output tulisan
            System.out.print("Masukkan NIP : ");//output tulisan
            String nip = sc.next();//menjalankan method next(), disimpan di nip
            System.out.print("Masukkan Nama: ");//output tulisan
            String nama = sc.next();//menjalankan method next(), disimpan di nama
            System.out.print("Masukkan Alamat: ");//output tulisan
            String alamat = sc.next();//menjalankan method next(), disimpan di alamat
            System.out.print("Masukkan Golongan: ");//output tulisan
            int gol = sc.nextInt();//menjalankan method nextInt(), disimpan di gol
            System.out.print("Masukkan Jumlah Anak: ");//output tulisan
            int jumAnak = sc.nextInt();//menjalankan method nextInt(), disimpan di jumAnak
            System.out.print("Masukkan Jam Lembur: ");//output tulisan
            int jamLem = sc.nextInt();//menjalankan method nextInt(), disimpan di jamLem
            switch (pilih) {//switch dengan variabel pilih sbg parameter
                case 1://jika parameter berupa 1
                    kepala =new Akunting(nip, nama, alamat, gol, jumAnak);//membentuk obyek kepala
                    break;
                case 2://jika parameter berupa 2
                    kepala =new Pemasaran(nip, nama, alamat, gol, jumAnak); //membentuk obyek kepala
                    break;
                case 3://jika parameter berupa 3
                    kepala =new Kepegawaian(nip, nama, alamat, gol, jumAnak);//membentuk obyek kepala
                    break;
            }
            kepala.setJamLembur(jamLem);//menyimpan jamLem di setJamLembur dari obyek kepala
            div[i].setKepalaDiv(kepala);//menyimpan kepala di setKepalaDiv dari obyek div[i]

            System.out.println("Masukkan Data pegawai ");//output tulisan
            while (true){//switch dengan boolean true sbg parameter
                System.out.print("Masukkan NIP : "); //output tulisan
                nip = sc.next();//menjalankan method next(), disimpan di nip
                System.out.print("Masukkan Nama: ");  //output tulisan
                nama = sc.next();//menjalankan method next(), disimpan di nama
                System.out.print("Masukkan Alamat: ");  //output tulisan
                alamat = sc.next();//menjalankan method next(), disimpan di alamat
                System.out.print("Masukkan Golongan: ");   //output tulisan
                gol = sc.nextInt();//menjalankan method nextInt(), disimpan di gol
                System.out.print("Masukkan Jumlah Anak: "); //output tulisan
                jumAnak = sc.nextInt();//menjalankan method nextInt(), disimpan di jumAnak
                System.out.print("Masukkan Jam Lembur: ");     //output tulisan
                jamLem = sc.nextInt();//menjalankan method nextInt(), disimpan di jamLem

                switch (pilih) {//switch dengan variabel pilih sbg parameter
                    case 1: //jika parameter berupa 1
                        peg1= new Akunting(nip, nama, alamat, gol, jumAnak);//membentuk obyek peg1
                        System.out.print("Besar tunjangan jabatan: ");//output tulisan
                        double tunjangan = sc.nextDouble();//menjalankan method nextDouble(), disimpan di tunjangan
                        ((Akunting) peg1).setTunJab(tunjangan);//simpan tunjangan di setTunJab dari peg1 merujuk kelas Akunting
                        break;
                    case 2://jika parameter berupa 2
                        peg1 = new Pemasaran(nip, nama, alamat, gol, jumAnak);//membentuk obyek peg1
                        System.out.print("Besarnya bonus: ");//output tulisan
                        double bonus = sc.nextDouble();//menjalankan method nextDouble(), disimpan di bonus
                        ((Pemasaran) peg1).setBonus(bonus);//simpan bonus di setBonus dari peg1 merujuk kelas Pemasaran
                        break;
                    case 3://jika parameter berupa 3
                        peg1 = new Kepegawaian(nip, nama, alamat, gol, jumAnak);//membentuk obyek peg1
                        System.out.println("Besarnya tunjangan transport: ");//output tulisan
                        double trans = sc.nextDouble();//menjalankan method nextDouble(), disimpan di trans
                        ((Kepegawaian) peg1).setTunT(trans);//simpan trans di setTunT dari peg1 merujuk kelas Kepegawaian
                        break;
                }
                peg1.setJamLembur(jamLem);//menyimpan jamLem di setJamLembur dari obyek peg1
                div[i].setDataP(peg1);//menyimpan peg1 di setDataP dari obyek div[i]
                System.out.println("Lanjut isi Data pegawai > (Y/T)");//output tulisan
                if (sc.next().toUpperCase().equals("T"))//menjalankan metode next(), if dieksekusi jika inputan berupa "T"
                    break;

            }
        }
        double gatot;//deklarasi variabel gatot bertipe double
        int total = 0;//deklarasi variabel total bernilai 0 bertipe int
        for (int j=0;j<div.length;j++) {//perulangan for
            System.out.println("Data divisi " + div[j].getNamaD());
            //memanggil getNamaD() dari div[j]
            System.out.println("Data Kepala Divisi :");
            System.out.println("    NIP\t: " + div[j].getKepalaDiv().getNip());
            //memanggil getNIP() pada getKepalaDiv() dari div[j]
            System.out.println("    Nama\t: " + div[j].getKepalaDiv().getNama());
            //memanggil getNama() pada getKepalaDiv() dari div[j]
            System.out.println("    Golongan\t: " + div[j].getKepalaDiv().getGol());
            //memanggil getGol() pada getKepalaDiv() dari div[j]
            System.out.println("    Alamat\t: " + div[j].getKepalaDiv().getAlamat());
            //memanggil getAlamat() pada getKepalaDiv() dari div[j]
            System.out.println("    Jumlah anak\t: " + div[j].getKepalaDiv().getJumAnak());
            //memanggil getJumAnak() pada getKepalaDiv() dari div[j]
            System.out.println("    Jam lembur\t: " + div[j].getKepalaDiv().getJamLembur());
            //memanggil getJamLembur() pada getKepalaDiv() dari div[j]
            System.out.println("    Besar Gaji Pokok : " + div[j].getKepalaDiv().hitGP());
            //memanggil hitGP() pada getKepalaDiv() dari div[j]
            gatot= div[j].getKepalaDiv().hitGP();//disimpan di gatot
            System.out.println("Data Pegawai Divisi :");//output tulisan
            for (int k = 0; k < div[j].getJumAng(); k++) {//perulangan for
                System.out.println("    Pegawai ke-"+(k+1)+" : ");
                System.out.println("    NIP\t: " + div[j].getDataP(k).getNip());
                //memanggil getNIP() pada getDataP(k) dari div[j]
                System.out.println("    Nama\t: " + div[j].getDataP(k).getNama());
                //memanggil getNama() pada getDataP(k) dari div[j]
                System.out.println("    Golongan\t: " + div[j].getDataP(k).getGol());
                //memanggil getGol() pada getDataP(k) dari div[j]
                System.out.println("    Alamat\t: " +div[j].getDataP(k).getAlamat());
                //memanggil getAlamat() pada getDataP(k) dari div[j]
                System.out.println("    Jumlah anak\t: " + div[j].getDataP(k).getJumAnak());
                //memanggil getJumAnak() pada getDataP(k) dari div[j]
                System.out.println("    Jam lembur\t: " + div[j].getDataP(k).getJamLembur());
                //memanggil getJamLembur() pada getDataP(k) dari div[j]
                System.out.println("    Besar Gaji Pokok : " + div[j].getDataP(k).hitGP());
                //memanggil hitGP() pada getDataP(k) dari div[j]

                if (div[j].getDataP(k) instanceof Akunting) {//memanggil getDataP(k) dari div[j]
                    //dari kelas Akunting
                    System.out.println("    Besar tunjangan jabatan: " + ((Akunting)div[j].getDataP(k)).getTunJab());
                    //memanggil getTunJab() pada getDataP(k) dari div[j] pada kelas Akunting
                } else if (div[j].getDataP(k) instanceof Pemasaran) {//memanggil getDataP(k) dari div[j]
                    //dari kelas Pemasaran
                    System.out.println("    Besar bonus " + ((Pemasaran) div[j].getDataP(k)).getBonus());
                    //memanggil getBonus() pada getDataP(k) dari div[j] pada kelas Pemasaran
                } else if (div[j].getDataP(k) instanceof Kepegawaian) {//memanggil getDataP(k) dari div[j]
                    //dari kelas Kepegawaian
                    System.out.println("    Besar tunjangan jabatan: " + ((Kepegawaian) div[j].getDataP(k)).getTunT());
                    //memanggil getTunT() pada getDataP(k) dari div[j] pada kelas Kepegawaian
                }
                System.out.println("    Besar gaji total: " + div[j].getDataP(k).hitGT());
                //memanggil getGajiPokok() pada getDataP(k) dari div[j]
                gatot += div[j].getDataP(k).hitGT();
                //menambah nilai gatot dengan nilai pada getGajiPokok() pada getDataP(k) dari div[j]

            }
            System.out.println("Besar gaji total divisi " + div[j].getNamaD() + ": " + gatot);
            //memanggil getNamaD() dari div[j], serta variabel gatot
            total+=gatot;//menambah nilai gatot dengan total, lalu disimpan ke total
        }
        System.out.println("Besar gaji total semua divisi : ");//menampilkan isi total
        System.out.print(total);
    }
}