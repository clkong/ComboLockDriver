/*
 *Sean Luo 11/11/2018
 *ComboLockDriver.java
 *This is progrem calculates the ComboLockDriver.
 */
package combolockdriver;

import javax.swing.JOptionPane;

/**
 *
 * @author clkon
 */
public class ComboLockDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String guess;
        int num1 = 0,num2 = 0,num3= 0;
         guess = "" + num1 + "-" + num2 + "-" + num3;
        ComboLock lock = new ComboLock();
        JOptionPane.showMessageDialog(null, "There is a  lock for you!"
                    + "\nThe numbers are only from 1 to 3 "
                    + "\nYou  have 3 chances to open the lock");
        for(int i = 0; i<3; i++){
            num1 = Integer.parseInt(JOptionPane.showInputDialog
                        ("What is the first number of the combo?"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog
                        ("What is the second number of the combo?"));
            num3 = Integer.parseInt(JOptionPane.showInputDialog
                        ("What is the third number of the combo?"));
            guess = "" + num1 + "-" + num2 + "-" + num3;
            if(i==0){
            if (guess.equals(lock.code)){
                JOptionPane.showMessageDialog(null, "You open the lock!");
                System.exit(0);
            }else{
                JOptionPane.showMessageDialog(null,
                        "You put the combo in wrong :("
                                + "\nThe first message:"+lock.number1);                
            }
        }
            if(i==1){
            if (guess.equals(lock.code)){
                JOptionPane.showMessageDialog(null, "You open the lock!");
                System.exit(0);
            }else{
                JOptionPane.showMessageDialog(null,
                        "You put the combo in wrong :("
                                + "\nThe second message:"+lock.number2);                
            }
        }
            if(i==2){
            if (guess.equals(lock.code)){
                JOptionPane.showMessageDialog(null, "You open the lock!");
                System.exit(0);
            }else{
                JOptionPane.showMessageDialog(null,
                        "You put the combo in wrong :("
                                + "\nThe third message:"+lock.number3);                
            }
        }
        }
        JOptionPane.showMessageDialog(null,
                "You put " + guess + " and it's actually " + lock.code);
    }

}
    
    

