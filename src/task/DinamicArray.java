/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

/**
 *
 * @author kateryna
 */
public class DinamicArray {

    private String[] masyvas;
    private String word;
    private int index;

    public DinamicArray(String[] array) {
        this.masyvas = array;
        this.word = null;
        this.index = 0;
    }

    public void add(String s) {
        // Prideti nauja reiksme prie masyvo pabaigos
        this.word = s;
        int arraySize = this.masyvas.length;
        int newSize = arraySize + 1;
        String[] tempArray = new String[newSize];
        for (int i = 0; i < arraySize; i++) {
            tempArray[i] = this.masyvas[i];
        }
        tempArray[newSize - 1] = this.word;
        this.masyvas = tempArray;
    }

    public String get(int index) {
        // jei index reiksme neteisinga - grainam null
        this.index = index;
        if (this.masyvas.length < this.index || this.index < 0) {
            return null;
        }
        // Grazinti stringa, kuris yra index elemente
        return this.masyvas[this.index];
    }

    public void set(int index, String s) {
        // Pakeisti esama reksme index elemente nurodyta reiksme
        // jei index reiksme neteisinga - nieko nedarom
        this.index = index;
        this.word = s;
        if (this.masyvas.length < this.index || this.index < 0) {
            return;
        }
        this.masyvas[this.index] = this.word;
    }

    public void remove(int index) {
        // pasalinti is masyvo nurodyta elementa
        // jei index reiksme neteisinga - nieko nedarom
        this.index = index;
        if (this.masyvas.length < this.index || this.index < 0) {
            return;
        }
        int arraySize = this.masyvas.length;
        int newSize = arraySize - 1;
        String[] tempArray = new String[newSize];
        for (int i = 0, k = 0; i < arraySize; i++) {
            if (i == this.index) {
                continue;
            } 
                tempArray[k++] = this.masyvas[i];
            
        }
        this.masyvas = tempArray;
        System.out.println(this.masyvas[0]);
    }

    public int size() {
        // grazina masyvo ilgi
        return this.masyvas.length;
    }

    public String toString() {
        // grazinti masyva tokia forma:
        // "[labas, pasauli, !]"
        String o = null;
        char buiginning = '[';
        char end = ']';
        for (int i = 0; i < this.masyvas.length; i++) {
            if (i == 0) {
                o = this.masyvas[i] + ", ";
            } else if (i == this.masyvas.length - 1) {
                o += this.masyvas[i];
            } else {
                o += this.masyvas[i] + ", ";
            }
        }
        return "\"" + buiginning + o + end + "\"";
    }

    public String[] getMasyvas() {
        return this.masyvas;
    }
}
