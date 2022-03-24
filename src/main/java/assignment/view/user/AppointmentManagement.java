/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package assignment.view.user;

import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 *
 * @author rmrt1n
 */
public class AppointmentManagement extends javax.swing.JPanel {
  private ArrayList<VaccinationComponent> cards;
  /**
   * Creates new form Test
   */
  public AppointmentManagement() {
    initComponents();
    cards = new ArrayList<VaccinationComponent>();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(960, 720));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(960, 720));
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(20);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 720));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));
        //jPanel1.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0,1)));
        //jPanel1.add(javax.swing.Box.createVerticalGlue());
        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

  // add vaccination for vaccination component
  public void addVaccination(int id, String vacCentreName, String location, LocalDateTime startDate,
                             LocalDateTime endDate, String vacName, int qty) {
    VaccinationComponent c = new VaccinationComponent();

    c.setVcnId(id);
    c.setVacCentreName(vacCentreName + " (" + location + ")");
    c.setDatetime(startDate, endDate);
    c.setVacNameQty(vacName, qty);

    jPanel1.add(c);
    cards.add(c);
  }

  public ArrayList<VaccinationComponent> getVaccinations() {
    return cards;
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
