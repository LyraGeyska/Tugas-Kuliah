/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgssemester3;

/**
 *
 * @author LENOVO
 */
public class Hewan extends makhlukHidup {

    private String namaHewan;
    private int jumlahKaki;
    private String Berjalan;
    private String sistemPernapasan;
    private String makanan;

    /**
     * @return the makanan
     */
    public String getMakanan() {
        return makanan;
    }

    /**
     * @param makanan the makanan to set
     */
    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    /**
     * @return the namaHewan
     */
    public String getNamaHewan() {
        return namaHewan;
    }

    /**
     * @param namaHewan the namaHewan to set
     */
    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    /**
     * @return the jumlahKaki
     */
    public int getJumlahKaki() {
        return jumlahKaki;
    }

    /**
     * @param jumlahKaki the jumlahKaki to set
     */
    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    /**
     * @return the Berjalan
     */
    public String getBerjalan() {
        return Berjalan;
    }

    /**
     * @param Berjalan the Berjalan to set
     */
    public void setBerjalan(String Berjalan) {
        this.Berjalan = Berjalan;
    }

    /**
     * @return the sistemPernapasan
     */
    public String getSistemPernapasan() {
        return sistemPernapasan;
    }

    /**
     * @param sistemPernapasan the sistemPernapasan to set
     */
    public void setSistemPernapasan(String sistemPernapasan) {
        this.sistemPernapasan = sistemPernapasan;
    }

    public void ovipar() {
        System.out.println("Aku bereproduksi dengan cara bertelur");
    }

    public void vivipar() {
        System.out.println("Aku bereproduksi dengan cara melahirkan");
    }

    public void ovovivipar() {
        System.out.println("Aku bereproduksi dengan cara bertelur & melahirkan");
    }

    /**
     * @return the makanan
     */
}
