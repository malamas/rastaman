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
package eu.malamas.rastaman.ui;

import eu.malamas.rastaman.model.Artist;
import eu.malamas.rastaman.model.Genre;
import eu.malamas.rastaman.ui.skins.SkinProvider;
import eu.malamas.rastaman.ui.tablecellrenderers.TableCellRendererFactory;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Beans;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumnModel;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;

/**
 *
 * @author Apostolis Iakovakis
 */
public class ArtistTablePanel extends javax.swing.JPanel {

    /**
     * Creates new form ArtistTablePanel
     */
    public ArtistTablePanel() {
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
        artistQuery = Beans.isDesignTime() ? null : localEm.createQuery("SELECT a FROM Artist a");
        artistList = Beans.isDesignTime() ? Collections.emptyList() : artistQuery.getResultList();
        scrollPane1 = new JScrollPane();
        artistTable = new JTable();
        buttonPanel = new JPanel();
        filler3 = new Box.Filler(new Dimension(5, 15), new Dimension(5, 15), new Dimension(5, 15));
        backButton = new JButton();
        filler2 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 32767));
        newButton = new JButton();
        filler4 = new Box.Filler(new Dimension(5, 15), new Dimension(5, 15), new Dimension(5, 15));
        editButton = new JButton();
        filler5 = new Box.Filler(new Dimension(5, 15), new Dimension(5, 15), new Dimension(5, 15));
        deleteButton = new JButton();
        filler6 = new Box.Filler(new Dimension(5, 15), new Dimension(5, 15), new Dimension(5, 15));

        setLayout(new BorderLayout());

        artistTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        artistTable.getTableHeader().setReorderingAllowed(false);

        JTableBinding jTableBinding = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ_WRITE, artistList, artistTable);
        JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${lastName}"));
        columnBinding.setColumnName("Επώνυμο");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${firstName}"));
        columnBinding.setColumnName("Όνομα");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${artisticName}"));
        columnBinding.setColumnName("Καλιτεχνικό Όνομα");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${gender}"));
        columnBinding.setColumnName("Φύλο");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${birthDate}"));
        columnBinding.setColumnName("Ημ. Γέννησης");
        columnBinding.setColumnClass(Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${birthPlace}"));
        columnBinding.setColumnName("Τόπος Γέννησης");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${genre}"));
        columnBinding.setColumnName("Είδος Μουσικής");
        columnBinding.setColumnClass(Genre.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        scrollPane1.setViewportView(artistTable);

        add(scrollPane1, BorderLayout.CENTER);

        buttonPanel.setPreferredSize(new Dimension(0, 50));
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));
        buttonPanel.add(filler3);

        backButton.setIcon(new ImageIcon(getClass().getResource("/eu/malamas/rastaman/resources/images/home22.png"))); // NOI18N
        backButton.setText("Αρχική");
        backButton.setPreferredSize(new Dimension(120, 36));
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(backButton);
        buttonPanel.add(filler2);

        newButton.setIcon(new ImageIcon(getClass().getResource("/eu/malamas/rastaman/resources/images/add22.png"))); // NOI18N
        newButton.setText("Εισαγωγή");
        newButton.setPreferredSize(new Dimension(120, 36));
        newButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(newButton);
        buttonPanel.add(filler4);

        editButton.setIcon(new ImageIcon(getClass().getResource("/eu/malamas/rastaman/resources/images/edit22.png"))); // NOI18N
        editButton.setText("Επεξεργασία");
        editButton.setPreferredSize(new Dimension(120, 36));

        Binding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, artistTable, ELProperty.create("${selectedElement!=null}"), editButton, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(editButton);
        buttonPanel.add(filler5);

        deleteButton.setIcon(new ImageIcon(getClass().getResource("/eu/malamas/rastaman/resources/images/delete22.png"))); // NOI18N
        deleteButton.setText("Διαγραφή");
        deleteButton.setPreferredSize(new Dimension(120, 36));

        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, artistTable, ELProperty.create("${selectedElement!=null}"), deleteButton, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(deleteButton);
        buttonPanel.add(filler6);

        add(buttonPanel, BorderLayout.PAGE_END);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    //κλίκ στο πλήκτρο Εισαγωγή Καλιτέχνη
    private void newButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        //¨Ανοιγμα της φόρμας επεξεργασίας καλιτέχνη με
        // παράμετρο νέο καλιτέχνη
        controller.switchToEditor(MainFrameController.EditorType.ARTIST_EDITOR, new Artist());
    }//GEN-LAST:event_newButtonActionPerformed

    //κλίκ στο πληκτρο Επεξεργασία Καλιτέχνη
    private void editButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        //¨Ανοιγμα της φόρμας επεξεργασίας καλιτέχνη με
        // παράμετρο τον επιλεγμένο από τον πίνακα καλιτεχνών
        // καλιτέχνη
        int selectedIndex = artistTable.getSelectedRow();
        if (selectedIndex != -1) {
            Artist selectedArtist = artistList.get(selectedIndex);
            controller.switchToEditor(MainFrameController.EditorType.ARTIST_EDITOR, selectedArtist);
        }
    }//GEN-LAST:event_editButtonActionPerformed
    //κλίκ στο πλήκτρο Διαγραφή καλιτέχνη
    private void deleteButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        deleteArtist();
    }//GEN-LAST:event_deleteButtonActionPerformed
    // κλικ στο πλήκτρο επιστροφή στο κυρίως μενού
    private void backButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        controller.switchToPanel(MainFrameController.PanelType.ROOT_MENU);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private List<Artist> artistList;
    private Query artistQuery;
    private JTable artistTable;
    private JButton backButton;
    private JPanel buttonPanel;
    private JButton deleteButton;
    private JButton editButton;
    private Box.Filler filler2;
    private Box.Filler filler3;
    private Box.Filler filler4;
    private Box.Filler filler5;
    private Box.Filler filler6;
    private EntityManager localEm;
    private JButton newButton;
    private JScrollPane scrollPane1;
    private BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    //
    // Ο δικός μας κώδικας αρχίζει εδώ, για να είναι
    // εμφανώς διαχωρισμένος από τον αυτόματα δημιουργούμενο
    //
    private MainFrameController controller;
    private EntityManager em;

    public ArtistTablePanel(MainFrameController controller, EntityManager em) {
        this.controller = controller;
        this.em = em; // Ο entity manager ο οποίος περνιεται και στον localEm της φόρμας
        initComponents();
        initFurther();
    }

    private void initFurther() {
        buttonPanel.setPreferredSize(new Dimension(0, SkinProvider.getInstance().getSkin().getButtonPanelHeight()));

        // Καθορισμός εμφάνισης πίνακα
        TableColumnModel tcm = artistTable.getColumnModel();
        for (int i = 0; i < tcm.getColumnCount(); i++) {
            switch (i) {
                case 3:  // στήλη Φύλο
                    tcm.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.SEX));
                    break;
                case 4: // στήλη Ημερομηνία Γέννησης
                    tcm.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.DATE));
                    break;
                default: // όλες οι στήλες...
                    tcm.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.GENERIC));
                    break;
            }
        }
    }

    // Μέθοδος deleteArtist()
    // Καλείται όταν πατηθεί το πλήκτρο Διαγραφή Καλιτέχνη και αφου κάνει τους 
    // απαραίτητους ελέγχους διαγράφει τον επιλεγμένο καλιτέχνη
    private void deleteArtist() {
        int selectedIndex = artistTable.getSelectedRow();
        if (selectedIndex != -1) {
            Artist selectedArtist = artistList.get(selectedIndex);
            if (selectedArtist.getAlbumList().isEmpty()) { // εαν δεν συμμετέχει σε αλμπουμ
                if (selectedArtist.getMusicGroupList().isEmpty()) { //εαν δεν συμμετέχει σε γκρουπ
                    Object[] options = {"Ναι", "Όχι"};
                    int n = JOptionPane.showOptionDialog(this,
                            "Να διαγραφεί ο Καλιτέχνης: " + selectedArtist.getScreenName() + ";",
                            "Επιβεβαίωση Διαγραφής",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null, //do not use a custom Icon
                            options, //the titles of buttons
                            options[1]); //default button title
                    if (n == 0) { //εαν επιλέξουμε να διαγράψουμε τον καλιτέχνη
                        localEm.getTransaction().begin();
                        localEm.remove(artistList.remove(selectedIndex));
                        localEm.getTransaction().commit();
                        artistTable.updateUI();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ο καλλιτέχνης δεν μπορεί να διαγραφεί,\n γιατί συμμετέχει σε συγκρότημα.", "Αδυναμία διαγραφής", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                if (selectedArtist.getMusicGroupList().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Ο καλλιτέχνης δεν μπορεί να διαγραφεί,\n γιατί υπάρχει άλμπουμ του.", "Αδυναμία διαγραφής", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Ο καλλιτέχνης δεν μπορεί να διαγραφεί, \n γιατί συμμετέχει σε συγκρότημα και υπάρχει άλμπουμ του.", "Αδυναμία διαγραφής", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }
}
