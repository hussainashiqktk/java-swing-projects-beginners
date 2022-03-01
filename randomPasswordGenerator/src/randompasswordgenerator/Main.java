/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randompasswordgenerator;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;

/**
 *
 * @author HUSSAIN ASHIQ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MainFrame().setVisible(true);
    }
    public static String generatePass(int len){
        String randStr = "";
        Random rand = new Random();
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789-+=)(*&^%$#@!~<>:;[]{}|";
        int n = charSet.length(); 
        for(int i=0; i < len; i++){
            int randIndex = rand.nextInt(n);
            char ch = charSet.charAt(randIndex);
            randStr += ch;
        }   
        return randStr;
    }
    public static void copyToClipboard(String text){
        StringSelection ss = new StringSelection(text);
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        clip.setContents(ss, null);
    }
}
