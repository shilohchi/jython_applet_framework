/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainPanel.java
 *
 * Created on Apr 8, 2014, 2:03:42 PM
 */
package org.java;

import javax.swing.JButton;

/**
 *
 * @author qi
 */
public class MainPanelUi extends javax.swing.JPanel {

    /** Creates new form MainPanel */
    public MainPanelUi() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        change_bgcolor_button = new javax.swing.JButton();
        display_message_button = new javax.swing.JButton();

        change_bgcolor_button.setIcon(new javax.swing.ImageIcon(MainPanelUi.class.getResource("setting.jpg")));
        change_bgcolor_button.setText("改变背景");
        add(change_bgcolor_button);

        display_message_button.setIcon(new javax.swing.ImageIcon(MainPanelUi.class.getResource("msgbox.jpg")));
        display_message_button.setText("显示消息");
        add(display_message_button);
    }// </editor-fold>//GEN-END:initComponents
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton change_bgcolor_button;
    public javax.swing.JButton display_message_button;
    // End of variables declaration//GEN-END:variables
}
