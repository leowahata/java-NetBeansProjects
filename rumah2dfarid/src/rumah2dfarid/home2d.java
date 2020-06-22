/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumah2dfarid;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 *
 * @author Muhammad Farid S
 */
public class home2d extends javax.swing.JFrame {

    /**
     * Creates new form home2d
     */
    public home2d() {
        initComponents();
    }
   public void paint(Graphics g){
        super.paint(g);
        
        int warna1 = Integer.parseInt("3a3836",30);
        Color abuTua = new Color(warna1);
        int warna2 = Integer.parseInt("7f3e04",20);
        Color coklat = new Color(warna2);
        int warna3 = Integer.parseInt("74716e",20);
        Color abu = new Color(warna3);
        
        Graphics2D brdLine = (Graphics2D) g;
        BasicStroke LineAtp = new BasicStroke(10);
        BasicStroke akln = new BasicStroke(25);
        BasicStroke thin = new BasicStroke(2);
        
        g.setColor(Color.ORANGE);
        brdLine.setStroke(akln);
        for (int x=110; x<=300; x+=10){
            g.drawLine(x, 85, x, 120);
        }
        g.drawLine(130, 75, 130, 85);
        g.drawLine(155, 63, 155, 85);
        g.drawLine(180, 52, 180, 85);
        g.drawLine(205, 45, 205, 85);
        g.drawLine(255, 54, 225, 85);
        g.drawLine(250, 66, 250, 85);
        g.drawLine(275, 77, 275, 85);
        g.drawLine(288, 88, 298, 88);
        
        brdLine.setStroke(thin);
        
        g.fillRect(40, 130, 315, 158);
        g.fillRect(50, 180, 50, 50);
        
        g.setColor(coklat);
        g.fillRect(200, 140, 80, 148);
        g.fillRect(200, 180, 30, 10);
        g.fillRect(50, 70, 50, 110);
        g.fillRect(50, 130, 300, 10);
        g.fillRect(150, 185, 40, 90);
        g.fillRect(60, 185, 40, 70);
        g.fillRect(105, 185, 40, 100);
        
        g.setColor(Color.BLACK);
        g.drawRect(200, 140, 80, 150);
        g.drawRect(50, 169, 200, 11);
        g.drawRect(299, 169, 50, 11);
        g.drawRect(110, 190, 30, 40);
        g.drawRect(110, 240, 30, 40);
        g.drawRect(105, 185, 40, 100);
        g.drawRect(109, 144, 21, 21);
        g.drawRect(134, 144, 21, 21);
         g.drawRect(159, 144, 21, 21);
         
        g.fillOval(135, 233, 5, 5);
        for (int y=140; y<=260; y+=20){
            g.drawRect(200, y, 80, 20);
        }
        for (int x=250; x<=330; x+=20){
            g.drawRect( x, 90, 20, 40);
        }
        brdLine.setStroke(LineAtp);
        g.setColor(abu);
        g.drawLine(50, 100, 200, 30);
        g.drawLine(200, 30, 350, 100);
        
        g.drawString("Rumah 2D Muhammad Farid S", 140,310);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(home2d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home2d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home2d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home2d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home2d().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
