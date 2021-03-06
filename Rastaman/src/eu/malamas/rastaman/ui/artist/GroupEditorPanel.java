/*
 * Copyright (c) 2015 Apostolis Iakovakis & Malamas Malamidis.
 * All rights reserved.
 *
 * This file is part of Rastaman.
 *
 * Rastaman is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * Rastaman is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Rastaman.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package eu.malamas.rastaman.ui.artist;

import eu.malamas.rastaman.model.Artist;
import eu.malamas.rastaman.model.Musicgroup;
import eu.malamas.rastaman.ui.MainFrameController;
import eu.malamas.rastaman.ui.tablecellrenderers.TableCellRendererFactory;
import eu.malamas.rastaman.util.DatabaseHandler;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.Beans;
import java.text.DateFormat;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.TableColumnModel;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;

/*
 *
 * @author Apostolis Iakovakis
 * @author Malamas Malamidis
 */
public class GroupEditorPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditGroupPanel
     */
    public GroupEditorPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new BindingGroup();

        localEm = em;
        musicgroupQuery = Beans.isDesignTime() ? null : localEm.createQuery("SELECT m FROM Musicgroup m");
        musicgroupList = Beans.isDesignTime() ? Collections.emptyList() : musicgroupQuery.getResultList();
        artistQuery = Beans.isDesignTime() ? null : localEm.createQuery("SELECT a FROM Artist a");
        availArtistList = Beans.isDesignTime() ? Collections.emptyList() : artistQuery.getResultList();
        groupArtistList = Beans.isDesignTime() ? Collections.emptyList() : artistQuery.getResultList();
        boundGroup = group;
        saveButton = new JButton();
        cancelButton = new JButton();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jLabel6 = new JLabel();
        groupNameField = new JTextField();
        formationdateField = new JFormattedTextField();
        jScrollPane1 = new JScrollPane();
        groupArtistTable = new JTable();
        deleteButton = new JButton();
        newButton = new JButton();
        jScrollPane2 = new JScrollPane();
        availArtistTable = new JTable();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();

        saveButton.setIcon(new ImageIcon(getClass().getResource("/eu/malamas/rastaman/resources/images/accept22.png"))); // NOI18N
        saveButton.setText("Αποθήκευση");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setIcon(new ImageIcon(getClass().getResource("/eu/malamas/rastaman/resources/images/undo22.png"))); // NOI18N
        cancelButton.setText("Ακύρωση");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(BorderFactory.createEtchedBorder());

        jLabel2.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel2.setText("Όνομα :");

        jLabel6.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel6.setText("Ημ.Δημιουργίας :");

        Binding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, boundGroup, ELProperty.create("${name}"), groupNameField, BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        formationdateField.setFormatterFactory(new DefaultFormatterFactory(new DateFormatter(DateFormat.getDateInstance(DateFormat.SHORT))));

        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, boundGroup, ELProperty.create("${formationDate}"), formationdateField, BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        groupArtistTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        groupArtistTable.getTableHeader().setReorderingAllowed(false);

        JTableBinding jTableBinding = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ_WRITE, groupArtistList, groupArtistTable);
        JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${screenName}"));
        columnBinding.setColumnName("Όνομα");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        groupArtistTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                groupArtistTableMouseClicked(evt);
            }
            public void mousePressed(MouseEvent evt) {
                groupArtistTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(groupArtistTable);
        if (groupArtistTable.getColumnModel().getColumnCount() > 0) {
            groupArtistTable.getColumnModel().getColumn(0).setResizable(false);
        }

        deleteButton.setIcon(new ImageIcon(getClass().getResource("/eu/malamas/rastaman/resources/images/deleteuser22.png"))); // NOI18N
        deleteButton.setText("Διαγραφή");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        newButton.setIcon(new ImageIcon(getClass().getResource("/eu/malamas/rastaman/resources/images/adduser22.png"))); // NOI18N
        newButton.setText("Εισαγωγή");
        newButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        availArtistTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        availArtistTable.getTableHeader().setReorderingAllowed(false);

        jTableBinding = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ_WRITE, availArtistList, availArtistTable);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${screenName}"));
        columnBinding.setColumnName("Όνομα");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        availArtistTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                availArtistTableMouseClicked(evt);
            }
            public void mousePressed(MouseEvent evt) {
                availArtistTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(availArtistTable);
        if (availArtistTable.getColumnModel().getColumnCount() > 0) {
            availArtistTable.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel3.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Μέλη Συγκροτήματος");

        jLabel4.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Διαθέσιμοι Καλιτέχνες");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formationdateField, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(groupNameField, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(newButton)
                            .addComponent(deleteButton))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(groupNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(formationdateField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(newButton, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(cancelButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton)))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    //κλικ στο πλήκτρο Ακύρωση
    private void cancelButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        localEm.getTransaction().rollback(); // Ακύρωση όλων των κινήσεων
        controller.switchToPanel(MainFrameController.PanelType.GROUP_TABLE);
    }//GEN-LAST:event_cancelButtonActionPerformed

    //κλίκ στο πλήκτρο Διαγραφή Καλλιτέχνη
    private void deleteButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        deleteArtist();
    }//GEN-LAST:event_deleteButtonActionPerformed

    //κλίκ στο πλήκτρο Εισαγωγή Καλλιτέχνη
    private void newButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        addArtist();
    }//GEN-LAST:event_newButtonActionPerformed

    //κλίκ στο πλήκτρο Αποθήκευση Συγκροτήματος
    private void saveButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        saveAndExit();
	}//GEN-LAST:event_saveButtonActionPerformed


    private void availArtistTableMouseClicked(MouseEvent evt) {//GEN-FIRST:event_availArtistTableMouseClicked

    }//GEN-LAST:event_availArtistTableMouseClicked


    private void groupArtistTableMouseClicked(MouseEvent evt) {//GEN-FIRST:event_groupArtistTableMouseClicked

    }//GEN-LAST:event_groupArtistTableMouseClicked

    //κλίκ στον πίνακα καλλιτεχνών Συγγκροτήματος
    private void groupArtistTableMousePressed(MouseEvent evt) {//GEN-FIRST:event_groupArtistTableMousePressed
        // ενεργοποίηση κατάλληλων πλήκτρων
        availArtistTable.clearSelection();
        newButton.setEnabled(false);
        deleteButton.setEnabled(true);
    }//GEN-LAST:event_groupArtistTableMousePressed

    //κλίκ στον πίνακα διαθέσιμων καλλιτεχνών
    private void availArtistTableMousePressed(MouseEvent evt) {//GEN-FIRST:event_availArtistTableMousePressed
        // ενεργοποίηση κατάλληλων πλήκτρων
        groupArtistTable.clearSelection();
        newButton.setEnabled(true);
        deleteButton.setEnabled(false);
    }//GEN-LAST:event_availArtistTableMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Query artistQuery;
    private List<Artist> availArtistList;
    private JTable availArtistTable;
    private Musicgroup boundGroup;
    private JButton cancelButton;
    private JButton deleteButton;
    private JFormattedTextField formationdateField;
    private List<Artist> groupArtistList;
    private JTable groupArtistTable;
    private JTextField groupNameField;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private EntityManager localEm;
    private List<Musicgroup> musicgroupList;
    private Query musicgroupQuery;
    private JButton newButton;
    private JButton saveButton;
    private BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    // Ο δικός μας κώδικας αρχίζει εδώ, για να είναι
    // εμφανώς διαχωρισμένος από τον αυτόματα δημιουργούμενο
    //
    private MainFrameController controller;
    private EntityManager em;
    private Musicgroup group;

    public GroupEditorPanel(MainFrameController controller, Musicgroup group) {
        this.controller = controller;
        this.em = DatabaseHandler.getInstance().getEm();
        this.group = group;
        initComponents();
        // Καθορισμός εμφάνισης των πινακων
        // Πίνακας Καλιτεχνών του Γκρούπ
        TableColumnModel tcmg = groupArtistTable.getColumnModel();
        for (int i = 0; i < tcmg.getColumnCount(); i++) {
            tcmg.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.GENERIC));
        }
        //Πίνακας Διαθέσιμων Καλιτεχνών για συμμετοχή στο Γκρούπ
        TableColumnModel tcma = availArtistTable.getColumnModel();
        for (int i = 0; i < tcma.getColumnCount(); i++) {
            tcma.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.GENERIC));
        }
        /**
         * Γέμισμα των πινάκων με τους σωστούς καλιτέχνες Αρχικά και οι δύο
         * πίνακες έχουν όλους τους διαθέσιμους καλιτέχνες έτσι ώστε να έχουμε
         * το μέγιστο μέγεθος στους δύο πίνακες
         */
        groupArtistList.clear();
        if (group.getName() != null) {
            for (Artist a : group.getArtistList()) {
                groupArtistList.add(a);
            }
            for (Artist a : group.getArtistList()) {
                for (Artist a2 : availArtistList) {
                    if (a.equals(a2)) {
                        availArtistList.remove(a2);
                        break;
                    }
                }
            }
        }
        localEm.getTransaction().begin(); // Αρχή Transaction
        localEm.persist(boundGroup);
        /**
         * Τα πλήκτρα εισαγωγή και διαγραφή απενεργοποιούνται μέχρι να επιλεχθεί
         * κάποιος καλλιτέχης
         */
        newButton.setEnabled(false);
        deleteButton.setEnabled(false);
    }

    /**
     * Μέθοδος saveAndExit() καλείται όταν πατηθεί το πλήκτρο Αποθήκευση και
     * αφου εκτελέσει τους απαραίτητους ελέγχους αποθηκεύει το Συγκρότημα
     * boundGroup
     */
    private void saveAndExit() {
        try {
            //Ελεγχος Ονόματος.
            if (groupNameField.getText().isEmpty()) {
                throw new Exception("Συμπληρώστε Όνομα");
            }
            // Πρέπει να έχει τουλάχιστον 2 καλλιτέχνες
            boundGroup.setArtistList(groupArtistList);
            if (boundGroup.getArtistList().size() < 2) {
                throw new Exception("To Συγκρότημα πρέπει να έχει \nτουλάχιστον δύο μέλη");
            }
            localEm.getTransaction().commit(); //Αποθήκευση στη Βάση
            for (Artist a : groupArtistList) {
                localEm.refresh(a);
            }
            for (Artist a : availArtistList) {
                localEm.refresh(a);
            }
            controller.switchToPanel(MainFrameController.PanelType.GROUP_TABLE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    /**
     * Μέθοδος addArtist() καλείται όταν πατηθεί το πλήκτρο εισαγωγή και
     * μεταφέρει τον επιλεγμένο καλιτέχνη απο τον πίνακα των διαθέσιμων στον
     * πίνακα των καλιτεχνών του συγκροτήματος
     */
    private void addArtist() {
        int selectedIndex = availArtistTable.getSelectedRow();
        if (selectedIndex != -1) {
            groupArtistList.add(availArtistList.remove(selectedIndex));
            groupArtistTable.updateUI();
            groupArtistTable.clearSelection();
            availArtistTable.updateUI();
            availArtistTable.clearSelection();
            newButton.setEnabled(false);
        } else { // Μηνυμα για λόγους Ασφαλείας δεν πρέπει να εμφανιστεί ποτέ
            JOptionPane.showMessageDialog(this, "Δεν Επιλέχθηκε Καλλιτέχνης \nπρος Εισαγωγή", "Rastaman", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * Μέθοδος deleteArtist() καλείται όταν πατηθεί το πλήκτρο Διαγραφή και
     * μεταφέρει τον επιλεγμένο καλιτέχνη απο τον πίνακα καλιτεχνών του
     * συγκροτήματος στον πίνακα των διαθέσιμων καλιτεχνών
     */
    private void deleteArtist() {
        int selectedIndex = groupArtistTable.getSelectedRow();
        if (selectedIndex != -1) {
            availArtistList.add(groupArtistList.remove(selectedIndex));
            availArtistTable.updateUI();
            availArtistTable.clearSelection();
            groupArtistTable.updateUI();
            groupArtistTable.clearSelection();
            deleteButton.setEnabled(false);
        } else { // Μηνυμα για λόγους Ασφαλείας δεν πρέπει να εμφανιστεί ποτέ
            JOptionPane.showMessageDialog(this, "Δεν Επιλέχθηκε Καλλιτέχνης \nπρος Διαγραφή", "Rastaman", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
