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
public class Aves extends Hewan {

    private String caraBerjalan;
    private String tempatHidup;

    public void berkantung() {
        System.out.println("Aku memiliki bentuk paruh yang berkantung");
    }

    public void melengkungtajam() {
        System.out.println("Aku memiliki bentuk paruh yang melengkung dan tajam");
    }

    public void runcing() {
        System.out.println("Aku memiliki bentuk paruh yang runcing");
    }

    public void melengkung() {
        System.out.println("Aku memiliki bentuk paruh yang melengkung");
    }

    public void kecilpendek() {
        System.out.println("Aku memiliki bentuk paruh yang kecil dan pendek");
    }

    /**
     * @return the caraBerjalan
     */
    public String getCaraBerjalan() {
        return caraBerjalan;
    }

    /**
     * @param caraBerjalan the caraBerjalan to set
     */
    public void setCaraBerjalan(String caraBerjalan) {
        this.caraBerjalan = caraBerjalan;
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
