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
public class Dikotil extends Tumbuhan{
    private String warnaDaun;

    /**
     * @return the warnaDaun
     */
    public String getWarnaDaun() {
        return warnaDaun;
    }

    /**
     * @param warnaDaun the warnaDaun to set
     */
    public void setWarnaDaun(String warnaDaun) {
        this.warnaDaun = warnaDaun;
    }

    public void jenisBiji() {
        System.out.println("Aku memiliki biji ganda");
    }

    public void bentukAkar() {
        System.out.println("Bentuk akarku tunggang");
    }

    public void bentukTulangDaun() {
        System.out.println("Aku memiliki tulang daun yang menyirip");
    }

}
