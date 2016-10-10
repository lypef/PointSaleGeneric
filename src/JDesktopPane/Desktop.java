/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JDesktopPane;

import java.awt.Frame;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import sun.misc.Cleaner;

/**
 *
 * @author lypef_000
 */
public class Desktop extends javax.swing.JFrame {

    /**
     * Creates new form Desktop
     */
    String NivelDeUsuario,UsuarioDeTrabajador;
    Clases.ReturnDate datos = new Clases.ReturnDate();
    
    public Desktop() {
            initComponents();
            setTitle(datos.ReturnDateMay("nombre"));
            setLocationRelativeTo(null);
            setAlwaysOnTop(true);
            this.setResizable(false);
            
            setExtendedState(MAXIMIZED_BOTH);
            Desktop.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Desktop.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        Escritorio.setBackground(java.awt.Color.white);
        Escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(null);
        jToolBar1.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Store.png"))); // NOI18N
        jButton1.setText("[F1] STOCK");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Truck32.png"))); // NOI18N
        jButton10.setText("[F2] PROVEDORES");
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton10);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buy.png"))); // NOI18N
        jButton3.setText("[F3] VENTA");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bill.png"))); // NOI18N
        jButton7.setText("[F4] INVENTARIO");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Order.png"))); // NOI18N
        jButton6.setText("[F5] RESUMEN");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clean.png"))); // NOI18N
        jButton5.setText("[F6] LIMPIAR");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit-Exit.png"))); // NOI18N
        jButton4.setText("SALIR");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar2.setForeground(new java.awt.Color(255, 255, 255));

        jMenu3.setText("Archivo");
        jMenu3.add(jSeparator2);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Login");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);
        jMenu3.add(jSeparator3);

        jMenuItem10.setText("Salir");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Configuracion");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuBar2.add(jMenu3);

        jMenu1.setText("Modulo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Stock");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem3.setText("Provedores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem6.setText("Ventas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem14.setText("Limpiar");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);
        jMenu1.add(jSeparator1);

        jMenuItem4.setText("Personal");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Finanzas");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem2.setText("Inventario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem5.setText("Resumen");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar2.add(jMenu2);

        jMenu4.setText("Ayuda");

        jMenuItem7.setText("Acerca de");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1227, Short.MAX_VALUE)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escritorio))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CallStore ();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CallExit();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CallSales ();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Clean ();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        CallSupplies ();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    CallSales();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    CallSupplies();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        AdminStaff();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CallStore();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        CallConsultas();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        CallInventario();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CallInventario();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        CallConsultas();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JOptionPane.showMessageDialog(Desktop.Escritorio, "PUNTO DE VENTA DESARROLLADO POR:\n"+datos.ReturnDateMay("desarrollador")+"\nPARA: "+datos.ReturnDateMay("nombre")+"\nVERSION: "+datos.ReturnDateMay("version")+"\n"+datos.ReturnDateMay("web")+"");
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        Clean ();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        CallConfig();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        CallExit();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        CallLogin();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
public void InsertaNombre (String NivelDeUsuario0 , String UsuarioDeTrabajador0)
{
    NivelDeUsuario = NivelDeUsuario0;
    UsuarioDeTrabajador = UsuarioDeTrabajador0;
}
{

}
    private void Clean ()
    {
        //if (JOptionPane.showConfirmDialog(rootPane,"Esta accion cerrara todas las ventanas abiertas. \n¿Esta seguro que desea continuar?","Confirmacion",0) == 0)
        //{
        Escritorio.removeAll();
        Escritorio.repaint();       
        //}
    }
    public int DesktopEscritorioX (int ventana)
    {
    int x = (Desktop.Escritorio.getWidth() / 2) - ventana / 2 ;
    return x;
    }
    public int DesktopEscritorioy (int ventana)
    {
    int y = (Desktop.Escritorio.getHeight() / 2) - ventana / 2;
    return y;
    }
    private void CallStaff ()
    {
    if (NivelDeUsuario.equalsIgnoreCase("vendedor"))
        {
        JOptionPane.showInternalMessageDialog(Desktop.Escritorio, "Acceso denegado");
        }else
        {
        Staff Staff = new Staff();
        Staff.NivelDeUsuario = NivelDeUsuario;
        Staff.UsuarioDeTrabajador = UsuarioDeTrabajador;
        Escritorio.add(Staff);
        Staff.toFront();
        Staff.setLocation(DesktopEscritorioX(Staff.getWidth()),DesktopEscritorioy(Staff.getHeight()));
        Staff.show();
        }
    }
    private void CallClientes ()
    {
        if (NivelDeUsuario.equalsIgnoreCase("vendedor"))
        {
        JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Acceso denegado");
        }else
        {
        Clientes Clientes = new Clientes();
        Clientes.setLocation(DesktopEscritorioX(Clientes.getWidth()), DesktopEscritorioy(Clientes.getHeight()));
        Desktop.Escritorio.add(Clientes);
        Clientes.NivelDeUsuario = NivelDeUsuario;
        Clientes.UsuarioDeTrabajador = UsuarioDeTrabajador;
        Clientes.setLocation(DesktopEscritorioX(Clientes.getWidth()), DesktopEscritorioy(Clientes.getHeight()));
        Clientes.toFront();
        Clientes.show();
        }
    }
    private void CallStore ()
    {
        if (NivelDeUsuario.equalsIgnoreCase("vendedor"))
        {
            addproduct Store = new addproduct();
            Escritorio.add(Store);
            Store.toFront();
            Store.setLocation(DesktopEscritorioX(Store.getWidth()),DesktopEscritorioy(Store.getHeight()));
            Store.show(); 
        }else
        {
        Store Store = new Store();
        Store.NivelDeUsuario = NivelDeUsuario;
        Store.UsuarioDeTrabajador = UsuarioDeTrabajador;
        Escritorio.add(Store);
        Store.toFront();
        Store.setLocation(DesktopEscritorioX(Store.getWidth()),DesktopEscritorioy(Store.getHeight()));
        Store.show();
        }
    }
    private void CallSales ()
    {
            Sales Sales = new Sales ();
            Sales.InsertaNombre(NivelDeUsuario, UsuarioDeTrabajador);
            Escritorio.add(Sales);
            Sales.toFront();
            Sales.setLocation(DesktopEscritorioX(Sales.getWidth()),DesktopEscritorioy(Sales.getHeight()));
            Sales.show();
    }

    private void CallSupplies() 
    {
    if (NivelDeUsuario.equalsIgnoreCase("root"))
        {
            Supplies Supplies = new Supplies ();
            Desktop.Escritorio.add(Supplies);
            Supplies.setLocation(Desktop.Escritorio.getWidth() / 2 -Supplies.getWidth() / 2, Desktop.Escritorio.getHeight() / 2 - Supplies.getHeight() / 2);
            Supplies.toFront();
            Supplies.show();
        }else
        {
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Acceso negado");
        }
    }

    private void CallFeatures() {
        if (NivelDeUsuario.equalsIgnoreCase("root"))
        {
            Features Features = new Features ();
            Desktop.Escritorio.add(Features);
            Features.NivelDeUsuario = NivelDeUsuario;
            Features.NombreDeUsuario = UsuarioDeTrabajador;
            Features.setLocation(Desktop.Escritorio.getWidth() / 2 - Features.getWidth() / 2, Desktop.Escritorio.getHeight() / 2 - Features.getHeight() / 2);
            Features.toFront();
            Features.show();
        }else
        {
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio, "Acceso negado");
        }
    }

    private void CallLogin() {
        dispose();
        JDesktopPane.Login Login = new JDesktopPane.Login ();
        Login.isOpaque();
        Login.setVisible(true);
    }

    private void CallExit() {
        if (JOptionPane.showConfirmDialog(rootPane,"¿Esta seguro que desea salir?","Exit",0)==0)
        {
            System.exit(1);
        }
    }

    private void CallFacturas() 
    {
        JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Modulo aun no programado");
    }

    private void CallConsultas() 
    {
    
        if (NivelDeUsuario.equalsIgnoreCase("vendedor"))
        {
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Acceso negado");
        }else
        {
            Resumen Reports = new Resumen ();
            Desktop.Escritorio.add(Reports);
            Reports.setLocation(Desktop.Escritorio.getWidth() / 2 - Reports.getWidth() / 2,Desktop.Escritorio.getHeight() / 2 - Reports.getHeight() / 2);
            Reports.show();
        }
    }

    private void CallInventario() 
    {
        if (NivelDeUsuario.equalsIgnoreCase("vendedor"))
        {
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Acceso negado");
        }else
        {
            Inventario Reports = new Inventario ();
            Desktop.Escritorio.add(Reports);
            Reports.setLocation(Desktop.Escritorio.getWidth() / 2 - Reports.getWidth() / 2,Desktop.Escritorio.getHeight() / 2 - Reports.getHeight() / 2);
            Reports.show();
        }
    }
    
    private void CallStoreOrder() 
    {
        if (NivelDeUsuario.equalsIgnoreCase("root"))
        {
            StoreOrder StoreOrder = new StoreOrder ();
            Desktop.Escritorio.add(StoreOrder);
            StoreOrder.setLocation(Desktop.Escritorio.getWidth() / 2 - StoreOrder.getWidth() / 2,Desktop.Escritorio.getHeight() / 2 - StoreOrder.getHeight() / 2);
            StoreOrder.show();
        }else
        {
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Acceso denegado");
        }
    }
    
    private void CallConfig() 
    {
        if (NivelDeUsuario.equalsIgnoreCase("root"))
        {
            Config Config = new Config ();
            Desktop.Escritorio.add(Config);
            Config.setLocation(Desktop.Escritorio.getWidth() / 2 - Config.getWidth() / 2,Desktop.Escritorio.getHeight() / 2 - Config.getHeight() / 2);
            Config.show();
        }else
        {
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Acceso denegado");
        }
    }

    private void AdminStaff() {
        if (NivelDeUsuario.equalsIgnoreCase("root"))
        {
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Modulo no desarrollado");
        }else
        {
            JOptionPane.showInternalMessageDialog(Desktop.Escritorio,"Acceso negado");
        }
    }
}
