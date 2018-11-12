/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combolockdriver;

/**
 *
 * @author clkon
 */
public class ComboLock {
    String code;

    int number1, number2, number3;

    public ComboLock(){
        number1 = (int)(Math.random()*3 + 1);
        number2 = (int)(Math.random()*3 + 1);
        number3 = (int)(Math.random()*3 + 1);
        code = "" + number1 + "-" + number2 + "-" + number3;
    }

}

