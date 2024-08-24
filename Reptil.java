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
public class Reptil extends Hewan {

    private String tempatHidup;

    public void bersisik() {
        System.out.println("Aku memiliki kulit yang bersisik");
    }

    public void berdarahDingin() {
        System.out.println("Aku adalah hewan yang berdarah dingin");
    }

    public void caraBerjalan() {
        System.out.println("Aku bergerak dengan cara merayap");
    }

    /**
     * @return the tempatHidup
     */
    public String getTempatHidup() {
        return tempatHidup;
    }

    /**
     * @param tempatHidup the tempatHidup to set
     */
    public void setTempatHidup(String tempatHidup) {
        this.tempatHidup = tempatHidup;
    }
}
