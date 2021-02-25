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
public class Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

MineLinckedList m = new MineLinckedList();
m.addToEnd(9);
m.addToEnd(10);
m.addToEnd(1);
m.addToEnd(234);
m.addToEnd(12);
m.getArray();
        System.out.println(m.length());
m.addToBegining(111);
m.getArray();
m.addToBegining(83);
m.addToBegining(67);
m.getArray();
m.addAt(1, 13);
m.getArray();
m.addAt(3, 13);
m.getArray();
m.get(0);
        System.out.println("+++" + m.length());

m.set(2, 0);
m.set(0, 0);
m.getArray();
        System.out.println("======");
m.remove(5);
m.getArray();
m.toString();

    }

}
