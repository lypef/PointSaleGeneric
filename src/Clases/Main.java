/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import Clases.JForm.SplasScream;
/**
 *
 * @author robert
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new Thread(new SplasScream()).start();

    }

}
