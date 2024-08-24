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
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Monokotil jagung = new Monokotil();
        jagung.setNamaTumbuhan("Jagung");
        System.out.println("Haloo, aku adalah " + jagung.getNamaTumbuhan());
        jagung.bernafas();
        jagung.tumbuh();
        jagung.setTempatHidup("tanah Andosol");
        System.out.println("Aku biasanya hidup di " + jagung.getTempatHidup());
        jagung.setWarnaDaun("hijau muda");
        System.out.println("Warna Daunku " + jagung.getWarnaDaun());
        jagung.ciriCiri();
        jagung.jenisBiji();
        jagung.bentukAkar();
        jagung.bentukTulangDaun();
        jagung.budidaya();

        System.out.println("====================================================");

        Dikotil mangga = new Dikotil();
        mangga.setNamaTumbuhan("Mangga");
        System.out.println("Haloo, aku adalah " + mangga.getNamaTumbuhan());
        mangga.bernafas();
        mangga.tumbuh();
        jagung.setTempatHidup("hutan tropik");
        System.out.println("Aku biasanya hidup di " + jagung.getTempatHidup());
        mangga.setWarnaDaun("hijau muda");
        System.out.println("Warna Daunku " + mangga.getWarnaDaun());
        mangga.ciriCiri();
        mangga.jenisBiji();
        mangga.bentukAkar();
        mangga.bentukTulangDaun();
        mangga.budidaya();

        System.out.println("====================================================");

        Aves elang = new Aves();
        elang.setNamaHewan("Elang");
        System.out.println("Haloo, aku adalah " + elang.getNamaHewan());
        elang.bernafas();
        elang.tumbuh();
        elang.setSistemPernapasan("paru-paru");
        System.out.println("Aku bernafas dengan " + elang.getSistemPernapasan());
        elang.ciriCiri();
        elang.setMakanan("daging");
        System.out.println("Aku pemakan " + elang.getMakanan());
        elang.melengkungtajam();
        elang.setJumlahKaki(2);
        System.out.println("Aku berkaki " + elang.getJumlahKaki());
        elang.setTempatHidup("hutan");
        System.out.println("Aku hidup di " + elang.getTempatHidup());
        elang.setBerjalan("Terbang");
        System.out.println("Aku bergerak dengan cara " + elang.getBerjalan());
        elang.ovipar();
        elang.budidaya();

        System.out.println("====================================================");

        Reptil buaya = new Reptil();
        buaya.setNamaHewan("Buaya");
        System.out.println("Haloo, aku adalah " + buaya.getNamaHewan());
        buaya.bernafas();
        elang.tumbuh();
        buaya.setSistemPernapasan("paru-paru");
        System.out.println("Aku bernafas dengan " + buaya.getSistemPernapasan());
        buaya.ciriCiri();
        buaya.setMakanan("daging");
        System.out.println("Aku pemakan " + buaya.getMakanan());
        buaya.berdarahDingin();
        buaya.berdarahDingin();
        buaya.caraBerjalan();
        buaya.setJumlahKaki(4);
        System.out.println("Aku berkaki " + buaya.getJumlahKaki());
        buaya.setTempatHidup("Darat dan Air");
        System.out.println("Aku hidup di " + buaya.getTempatHidup());
        buaya.ovipar();
        buaya.budidaya();

        System.out.println("====================================================");

        Amfibi katak = new Amfibi();
        katak.setNamaHewan("Katak");
        System.out.println("Haloo, aku adalah " + katak.getNamaHewan());
        katak.bernafas();
        elang.tumbuh();
        katak.setSistemPernapasan("paru-paru");
        System.out.println("Aku bernafas dengan " + katak.getSistemPernapasan());
        katak.ciriCiri();
        katak.setMakanan("serangga");
        System.out.println("Aku pemakan " + katak.getMakanan());
        katak.berdarahDingin();
        katak.setBerjalan("melompat dan berenang");
        System.out.println("Aku bergerak dengan cara " + katak.getBerjalan());
        katak.setJumlahKaki(4);
        System.out.println("Aku berkaki " + katak.getJumlahKaki());
        katak.tempatHidup();
        katak.ovipar();
        katak.budidaya();

        System.out.println("====================================================");

        Mamalia monyet = new Mamalia();
        monyet.setNamaHewan("Monyet");
        System.out.println("Haloo, aku adalah " + monyet.getNamaHewan());
        monyet.bernafas();
        elang.tumbuh();
        monyet.setSistemPernapasan("paru-paru");
        System.out.println("Aku bernafas dengan " + monyet.getSistemPernapasan());
        monyet.ciriCiri();
        monyet.kelenjarSusu();
        monyet.menyusui();
        monyet.setMakanan("buah");
        System.out.println("Aku pemakan " + monyet.getMakanan());
        monyet.berdarahPanas();
        monyet.setBerjalan("Berjalan menggunakan kaki dan tangan");
        System.out.println("Aku bergerak dengan cara " + monyet.getBerjalan());
        monyet.setJumlahKaki(2);
        System.out.println("Aku berkaki " + monyet.getJumlahKaki());
        monyet.setTempatHidup("hutan");
        monyet.vivipar();
        monyet.budidaya();
        
        System.out.println("====================================================");

        Pisces mujair = new Pisces();
        mujair.setNamaHewan("Mujair");
        System.out.println("Haloo, aku adalah " + mujair.getNamaHewan());
        mujair.bernafas();
        mujair.tumbuh();
        mujair.setSistemPernapasan("insang");
        System.out.println("Aku bernafas dengan " + mujair.getSistemPernapasan());
        mujair.ciriCiri();
        mujair.setMakanan("hewan kecil");
        System.out.println("Aku pemakan " + mujair.getMakanan());
        mujair.tempatHidup();
        mujair.ekor();
        mujair.setJumlahKaki(0);
        System.out.println("Aku berkaki " + mujair.getJumlahKaki());
        mujair.setBerjalan("Berenang");
        System.out.println("Aku bergerak dengan cara " + mujair.getBerjalan());
        mujair.ovipar();
        mujair.budidaya();
    }

}
