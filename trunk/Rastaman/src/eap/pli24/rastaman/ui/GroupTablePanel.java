package eap.pli24.rastaman.ui;

import eap.pli24.rastaman.entities.Album;
import eap.pli24.rastaman.entities.Musicgroup;
import eap.pli24.rastaman.ui.tablecellrenderers.TableCellRendererFactory;
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
 * @author Nikos Karagiannis
 * @author Nikos Krommydas
 * @author Malamas Malamidis
 */
public class GroupTablePanel extends javax.swing.JPanel {

    /**
     * Creates new form ArtistTablePanel
     */
    public GroupTablePanel() {
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
        albumQuery = Beans.isDesignTime() ? null : localEm.createQuery("SELECT a FROM Album a");
        albumList = Beans.isDesignTime() ? Collections.emptyList() : albumQuery.getResultList();
        scrollPane1 = new JScrollPane();
        groupTable = new JTable();
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

        groupTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        groupTable.getTableHeader().setReorderingAllowed(false);

        JTableBinding jTableBinding = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ_WRITE, musicgroupList, groupTable);
        JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${name}"));
        columnBinding.setColumnName("Όνομα");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${formationdate}"));
        columnBinding.setColumnName("Ημερομηνία δημιουργίας");
        columnBinding.setColumnClass(Date.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        scrollPane1.setViewportView(groupTable);

        add(scrollPane1, BorderLayout.CENTER);

        buttonPanel.setPreferredSize(new Dimension(0, 50));
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));
        buttonPanel.add(filler3);

        backButton.setIcon(new ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/home22.png"))); // NOI18N
        backButton.setText("Αρχική");
        backButton.setPreferredSize(new Dimension(120, 36));
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(backButton);
        buttonPanel.add(filler2);

        newButton.setIcon(new ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/add22.png"))); // NOI18N
        newButton.setText("Εισαγωγή");
        newButton.setPreferredSize(new Dimension(120, 36));
        newButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(newButton);
        buttonPanel.add(filler4);

        editButton.setIcon(new ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/edit22.png"))); // NOI18N
        editButton.setText("Επεξεργασία");
        editButton.setPreferredSize(new Dimension(120, 36));

        Binding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, groupTable, ELProperty.create("${selectedElement!=null}"), editButton, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(editButton);
        buttonPanel.add(filler5);

        deleteButton.setIcon(new ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/delete22.png"))); // NOI18N
        deleteButton.setText("Διαγραφή");
        deleteButton.setPreferredSize(new Dimension(120, 36));

        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, groupTable, ELProperty.create("${selectedElement!=null}"), deleteButton, BeanProperty.create("enabled"));
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

    private void backButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        controller.switchToPanel(MainFrameController.PanelType.ROOT_MENU);
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        deleteGroup();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed

        int selectedIndex = groupTable.getSelectedRow();
        if (selectedIndex != -1) {
            Musicgroup selectedMusicgroup = musicgroupList.get(selectedIndex);
            controller.showGroupEditor(selectedMusicgroup);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void newButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        controller.showGroupEditor(new Musicgroup());
    }//GEN-LAST:event_newButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private List<Album> albumList;
    private Query albumQuery;
    private JButton backButton;
    private JPanel buttonPanel;
    private JButton deleteButton;
    private JButton editButton;
    private Box.Filler filler2;
    private Box.Filler filler3;
    private Box.Filler filler4;
    private Box.Filler filler5;
    private Box.Filler filler6;
    private JTable groupTable;
    private EntityManager localEm;
    private List<Musicgroup> musicgroupList;
    private Query musicgroupQuery;
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

    public GroupTablePanel(MainFrameController controller, EntityManager em) {
        this.controller = controller;
        this.em = em;
        initComponents();
        initFurther();
    }

    private void initFurther() {
        buttonPanel.setPreferredSize(new Dimension(0, UIProperties.BUTTON_PANEL_HEIGHT));

        // Καθορισμός εμφάνισης πίνακα
        TableColumnModel tcm = groupTable.getColumnModel();
        for (int i = 0; i < tcm.getColumnCount(); i++) {
            switch (i) {
                case 1:
                    tcm.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.DATE));
                    break;
                default:
                    tcm.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.GENERIC));
                    break;
            }
        }
    }

    private void deleteGroup() {
        int selectedIndex = groupTable.getSelectedRow();
        if (selectedIndex != -1) {
            Musicgroup a = musicgroupList.get(selectedIndex);
            if (a.getAlbumList().isEmpty()) {
                Object[] options = {"Ναι", "Όχι"};
                int n;
                if (a.getArtistList().isEmpty()) {
                    n = JOptionPane.showOptionDialog(this,
                            "Να διαγραφεί το συγκρότημα " + a.getName() + ";",
                            "Επιβεβαίωση Διαγραφής",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null, //do not use a custom Icon
                            options, //the titles of buttons
                            options[1]); //default button title
                } else {

                    n = JOptionPane.showOptionDialog(this,
                            "To συγκρότημα " + a.getName() + "\n"
                            + "έχει καλλιτέχνες οι οποίοι δεν θα  διαγραφούν."
                            + "Να διαγραφεί το Συγκρότημα;",
                            "Επιβεβαίωση Διαγραφής",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null, //do not use a custom Icon
                            options, //the titles of buttons
                            options[1]); //default button title
                }
                if (n == 0) {
                    localEm.getTransaction().begin();
                    Query q = localEm.createQuery("DELETE FROM Musicgroup grp WHERE grp.musicgroupid=:musicgroupID ",
                            Musicgroup.class).setParameter("musicgroupID", a.getMusicgroupid());
                    q.executeUpdate();
                    localEm.getTransaction().commit();
                    musicgroupList.remove(selectedIndex);
                    groupTable.updateUI();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Το συγκρότημα δεν μπορεί να διαγραφεί, γιατί υπάρχει άλμπουμ του.", "Αδυναμία διαγραφής", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
