/*
 * Copyright (c) 2015 Apostolis Iakovakis, Nikos Karagiannis,
 * Nikos Krommydas & Malamas Malamidis. All rights reserved.
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
package eap.pli24.rastaman.ui;

import eap.pli24.rastaman.entities.Album;
import eap.pli24.rastaman.entities.Label;
import eap.pli24.rastaman.entities.Song;
import eap.pli24.rastaman.ui.tablecellrenderers.TableCellRendererFactory;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/*
 * 
 * @author Apostolis Iakovakis
 * @author Nikos Karagiannis
 * @author Nikos Krommydas
 * @author Malamas Malamidis
 */
public class ArtistAlbumEditorPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditGroupPanel
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        localEm = em;
        labelquery = java.beans.Beans.isDesignTime() ? null : localEm.createQuery("SELECT a FROM Label a");
        labelList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : labelquery.getResultList();
        albumQuery = java.beans.Beans.isDesignTime() ? null : localEm.createQuery("SELECT a FROM Album a");
        albumList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : albumQuery.getResultList();
        labelNamequery = java.beans.Beans.isDesignTime() ? null : localEm.createQuery("SELECT a.name FROM Label a");
        labelNamelist = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : labelNamequery.getResultList();
        songQuery = java.beans.Beans.isDesignTime() ? null : localEm.createQuery("SELECT s FROM Song s");
        songList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : songQuery.getResultList();
        artistQuery = java.beans.Beans.isDesignTime() ? null : localEm.createQuery("SELECT  a  FROM Artist a");
        artistList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : artistQuery.getResultList();
        boundAlbum = album;
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        releasedateField = new javax.swing.JFormattedTextField();
        labelComboBox = new javax.swing.JComboBox();
        artistComboBox = new javax.swing.JComboBox();
        titleField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        disknumberTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        songTable = new javax.swing.JTable();

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/accept22.png"))); // NOI18N
        saveButton.setText("Αποθήκευση");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/undo22.png"))); // NOI18N
        cancelButton.setText("Ακύρωση");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/delete22.png"))); // NOI18N
        deleteButton.setText("Διαγραφή");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/add22.png"))); // NOI18N
        newButton.setText("Εισαγωγή");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        releasedateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, boundAlbum, org.jdesktop.beansbinding.ELProperty.create("${releasedate}"), releasedateField, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, labelNamelist, labelComboBox);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, boundAlbum, org.jdesktop.beansbinding.ELProperty.create("${labelid.name}"), labelComboBox, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, artistList, artistComboBox);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, boundAlbum, org.jdesktop.beansbinding.ELProperty.create("${artistartistid}"), artistComboBox, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, boundAlbum, org.jdesktop.beansbinding.ELProperty.create("${title}"), titleField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Τίτλος :");

        jLabel4.setText("Καλιτέχνης:");

        jLabel3.setText("Εταιρία:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Ημ.Κυκλοφορίας :");

        jLabel5.setText("Τύπος:");

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cs", "ep", "lp" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, boundAlbum, org.jdesktop.beansbinding.ELProperty.create("${type}"), typeComboBox, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jLabel7.setText("Νο Δίσκου:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, boundAlbum, org.jdesktop.beansbinding.ELProperty.create("${disknumber}"), disknumberTextField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        songTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Track", "Τίτλος", "Διάρκεια"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        songTable.setCellSelectionEnabled(true);
        songTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        songTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                songTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(songTable);
        songTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (songTable.getColumnModel().getColumnCount() > 0) {
            songTable.getColumnModel().getColumn(0).setResizable(false);
            songTable.getColumnModel().getColumn(0).setPreferredWidth(2);
            songTable.getColumnModel().getColumn(1).setResizable(false);
            songTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            songTable.getColumnModel().getColumn(2).setResizable(false);
            songTable.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(titleField)
                                .addComponent(labelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(artistComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(releasedateField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(disknumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(newButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artistComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(releasedateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(disknumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(cancelButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    // κλικ στο πλήκτρο Ακύρωση
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        localEm.getTransaction().rollback(); //Ακύρωση όλων των αλλαγών
        controller.switchToPanel(MainFrameController.PanelType.ARTIST_ALBUM_TABLE);
    }//GEN-LAST:event_cancelButtonActionPerformed

    // Κλικ στο πλήκτρο Διαγραφή Τραγουδιού
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        deleteSong();
    }//GEN-LAST:event_deleteButtonActionPerformed

    //κλικ στο πλήκτρο Εισαγωγή Τραγουδιού
    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        addSong();
    }//GEN-LAST:event_newButtonActionPerformed

    //κλικ στο πλήκτρο  Αποθήκευση
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        saveAndExit();
    }//GEN-LAST:event_saveButtonActionPerformed

    // κλικ και επιλογή τραγουδιού
    private void songTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_songTableMouseClicked
        //ενεργοποίηση του πλήκτρου διαγραφής τραγουδιού
        deleteButton.setEnabled(true);
    }//GEN-LAST:event_songTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<eap.pli24.rastaman.entities.Album> albumList;
    private javax.persistence.Query albumQuery;
    private javax.swing.JComboBox artistComboBox;
    private java.util.List<eap.pli24.rastaman.entities.Artist> artistList;
    private javax.persistence.Query artistQuery;
    private eap.pli24.rastaman.entities.Album boundAlbum;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField disknumberTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox labelComboBox;
    private java.util.List<Label> labelList;
    private java.util.List labelNamelist;
    private javax.persistence.Query labelNamequery;
    private javax.persistence.Query labelquery;
    private javax.persistence.EntityManager localEm;
    private javax.swing.JButton newButton;
    private javax.swing.JFormattedTextField releasedateField;
    private javax.swing.JButton saveButton;
    private java.util.List<eap.pli24.rastaman.entities.Song> songList;
    private javax.persistence.Query songQuery;
    private javax.swing.JTable songTable;
    private javax.swing.JTextField titleField;
    private javax.swing.JComboBox typeComboBox;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    // Ο δικός μας κώδικας αρχίζει εδώ, για να είναι
    // εμφανώς διαχωρισμένος από τον αυτόματα δημιουργούμενο
    //
    private MainFrameController controller;
    private EntityManager em;
    private Album album;
    private String artistName;
    private DefaultTableModel model;

    public ArtistAlbumEditorPanel(MainFrameController controller, EntityManager em, Album album) {
        this.controller = controller;
        this.em = em;
        this.album = album;
        initComponents();
        songTable.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
        deleteButton.setEnabled(false);
        TableColumnModel tcm = songTable.getColumnModel();
        for (int i = 0; i < tcm.getColumnCount(); i++) {
            switch (i) {
                case 2: // στήλη διάρκεια
                    tcm.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.DURATION));
                    break;
                default:
                    tcm.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.GENERIC));
                    break;
            }
        }
        this.artistName = album.getArtistartistid() == null ? null : album.getArtistartistid().getScreenName();
        model = (DefaultTableModel) songTable.getModel();
        //Εισαγωγή τραγουδιών στον πίνακα
        if (boundAlbum.getSongList() != null) {
            for (Song s : boundAlbum.getSongList()) {
                model.addRow(new Object[]{s.getTrackNo(), s.getTitle(), s.getDuration()});
            }
        }

        localEm.getTransaction().begin(); // Αρχή Transaction
        localEm.persist(boundAlbum);
    }

    // Μέθοδος addSong()
    // Καλείται όταν πατηθεί το πλήκτρο Εισαγωγή τραγουδιού και 
    // δημιουργεί μια νέα γραμμή για την καταχώρηση νέου τραγουδιού
    private void addSong() {
        boolean found;
        int i;
        // Υπολογισμός πρώτου διαθέσιμου track number
        //Ελεγχουμε κάθε ακέραιο ξεκινώντας απο το 1 και εαν δεν βραθεί 
        //στον πίνακα των τραγουδιών τον προτείνουμε για συμπλήρωση στη νέα γραμμή
        for (i = 1; i < model.getRowCount() + 2; i++) {
            found = false;
            for (int j = 0; j < model.getRowCount(); j++) {
                if (i == (int) model.getValueAt(j, 0)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                break;
            }
        }
        model.addRow(new Object[]{i, null, 0});
    }

    // Μέθοδος deleteSong()
    // Καλείται όταν πατηθεί το πλήκτρο Διαγραφή τραγουδιού και αφου κάνει τους 
    // απαραίτητους ελέγχους διαγράφει το επιλεγμένο τραγούδι   
    private void deleteSong() {
        int selectedRow = songTable.getSelectedRow();
        if (selectedRow != -1) {
            for (Song s : boundAlbum.getSongList()) {
                if (s.getTrackNo() == (int) model.getValueAt(selectedRow, 0)) {

                    // έλεγχος συμμετοχής τραγουδιού σε playlist
                    if (!s.getPlaylistSongList().isEmpty()) { // Εαν συμμετέχει σε PlayList δεν διαγράφεται
                        JOptionPane.showMessageDialog(this, "To τραγούδι συμμετέχει σε λίστα \n"
                                + "πρέπει πρώτα να διαγραφεί απο αυτή",
                                "Αδυναμία διαγραφής", JOptionPane.INFORMATION_MESSAGE);
                    } else { // Εαν δεν συμμετέχει σε PlayList  διαγράφεται
                        boundAlbum.getSongList().remove(s);
                        Query q = localEm.createQuery("DELETE FROM Song s1 WHERE s1.songid=:songID ",
                                Song.class).setParameter("songID", s.getSongId());
                        q.executeUpdate();
                        model.removeRow(selectedRow);
                    }
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Δεν Επιλέχθηκε Τραγούδι \nπρος Διαγραφή", "Rastaman", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    /**
     * Μέθοδος saveAndExit() καλείται όταν πατηθεί το πλήκτρο Αποθήκευση και
     * αφου εκτελέσει τους απαραίτητους ελέγχους αποθηκεύει το αλμπουμ
     * boundAlbum
     */
    private void saveAndExit() {
        try {
            if (titleField.getText().isEmpty()) {
                throw new Exception("Συμπληρώστε Τίτλο");
            }
            if (artistComboBox.getSelectedItem().toString().isEmpty()) {
                throw new Exception("Επιλέξτε Καλλιτέχνη");
            }
            if (labelComboBox.getSelectedItem().toString().isEmpty()) {
                throw new Exception("Επιλέξτε Εταιρία");
            }
            if (typeComboBox.getSelectedItem().toString().isEmpty()) {
                throw new Exception("Επιλέξτε Τύπο Άλμπουμ");
            }
            List<Song> albumSongList = new ArrayList<>();
            albumSongList = boundAlbum.getSongList();

            if (model.getRowCount() < 1) {
                throw new Exception("To Αλμπουμ θα πρέπει να έχει \n τουλάχιστον ένα τραγούδι.");
            }
            for (int i = 0; i < model.getRowCount() - 1; i++) {
                if ((model.getValueAt(i, 0) == null) || model.getValueAt(i, 0).equals(0)) {
                    songTable.setColumnSelectionInterval(0, 0);
                    songTable.setRowSelectionInterval(i, i);
                    i++;
                    throw new Exception("Η Αριθμός Track στη " + i + "η γραμμή δεν μπορεί να είναι μηδέν ή κενό");
                }
                for (int j = i + 1; j < model.getRowCount(); j++) {
                    if (model.getValueAt(i, 0).equals(model.getValueAt(j, 0))) {
                        i++;
                        throw new Exception("Το track " + model.getValueAt(j, 0).toString() + " υπάρχει τουλάχιστον δύο φορές");
                    }
                }
            }
            boolean found;
            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 1).toString().isEmpty()) {
                    songTable.setColumnSelectionInterval(1, 1);
                    songTable.setRowSelectionInterval(i, i);
                    i++;
                    throw new Exception("Ο τίτλος στη " + i + "η γραμμή δεν μπορεί να είναι κενός");
                }
                if ((model.getValueAt(i, 2) == null) || model.getValueAt(i, 2).equals(0)) {
                    songTable.setColumnSelectionInterval(2, 2);
                    songTable.setRowSelectionInterval(i, i);
                    i++;
                    throw new Exception("Η Διάρκεια στη " + i + "η γραμμή δεν μπορεί να είναι μηδέν ή κενό");
                }
                found = false;
                for (Song s : albumSongList) {
                    if (s.getTrackNo() == ((Integer) model.getValueAt(i, 0))) {
                        s.setTitle((String) model.getValueAt(i, 1));
                        s.setDuration((Integer) model.getValueAt(i, 2));
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    Song newSong = new Song(null, (String) model.getValueAt(i, 1), (Integer) model.getValueAt(i, 2), (Integer) model.getValueAt(i, 0));
                    newSong.setAlbumId(boundAlbum);
                    albumSongList.add(newSong);
                }
            }
            boundAlbum.setSongList(albumSongList);

            String selectetLabelName = labelComboBox.getSelectedItem().toString();
            for (Label g : labelList) {
                if (g.getName().equals(selectetLabelName)) {
                    boundAlbum.setLabelid(g);
                    break;
                }
            }
            localEm.getTransaction().commit();
            controller.switchToPanel(MainFrameController.PanelType.ARTIST_ALBUM_TABLE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
}
