package Clases;


import com.sun.awt.AWTUtilities;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lypef_000
 */
public class Trasparencia {
    public void TransComFrame (JFrame frm)
    {
        frm.setUndecorated(true);
        AWTUtilities.setWindowOpaque(frm, false);
    }
}
