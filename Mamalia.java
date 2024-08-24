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
public class Mamalia extends Hewan {
private String tempatHidup;
    public void kelenjarSusu() {
        System.out.print("Aku memiliki kelenjar susu, jadi ");
    }

    public void menyusui() {
        System.out.println("Aku bisa menyusui");
    }

    public void berdarahPanas() {
        System.out.println("Aku merupakan hewan yang berdarah panas");
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
