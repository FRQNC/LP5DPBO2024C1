public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String golonganUKT;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String golonganUKT) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.golonganUKT = golonganUKT;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setGolonganUKT(String golonganUKT){
        this.golonganUKT = golonganUKT;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getGolonganUKT(){
        return golonganUKT;
    }
}
