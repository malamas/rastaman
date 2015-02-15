package eap.pli24.rastaman.ui;

import eap.pli24.rastaman.entities.Album;
import eap.pli24.rastaman.entities.Artist;
import eap.pli24.rastaman.entities.Song;
import eap.pli24.rastaman.ui.tablecellrenderers.TableCellRendererFactory;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Beans;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumnModel;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;

/**
 *
 * @author Malamas Malamidis
 * @author Apostolis Iakovakis
 */
public class GroupAlbumTablePanel extends javax.swing.JPanel {

    /**
     * Creates new form ArtistAlbumTablePanel
     */
    public GroupAlbumTablePanel() {
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
        albumQuery = Beans.isDesignTime() ? null : localEm.createQuery("SELECT a FROM Album a where a.musicgroupmusicgroupid is not null");
        albumList = Beans.isDesignTime() ? Collections.emptyList() : albumQuery.getResultList();
        jScrollPane2 = new JScrollPane();
        groupAlbumTable = new JTable();
        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        newButton = new JButton();
        editButton = new JButton();
        deleteButton = new JButton();
        backButton = new JButton();

        setLayout(new BorderLayout());

        groupAlbumTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        groupAlbumTable.getTableHeader().setReorderingAllowed(false);

        JTableBinding jTableBinding = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ_WRITE, albumList, groupAlbumTable);
        JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${title}"));
        columnBinding.setColumnName("Τίτλος");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${musicgroupmusicgroupid.name}"));
        columnBinding.setColumnName("Ονομα Συγκροτήματος");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${type}"));
        columnBinding.setColumnName("Τύπος");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${disknumber}"));
        columnBinding.setColumnName("No Δίσκου");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${labelid.name}"));
        columnBinding.setColumnName("Εταιρία");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${releasedate}"));
        columnBinding.setColumnName("Ημ.Κυκλοφορίας");
        columnBinding.setColumnClass(Date.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(groupAlbumTable);
        groupAlbumTable.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        add(jScrollPane2, BorderLayout.CENTER);

        jLabel1.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Άλμπουμ Καλλιτεχνών");
        jLabel1.setPreferredSize(new Dimension(0, 30));
        add(jLabel1, BorderLayout.PAGE_START);

        newButton.setIcon(new ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/add22.png"))); // NOI18N
        newButton.setText("Εισαγωγή");
        newButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        editButton.setIcon(new ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/edit22.png"))); // NOI18N
        editButton.setText("Επεξεργασία");
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setIcon(new ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/delete22.png"))); // NOI18N
        deleteButton.setText("Διαγραφή");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        backButton.setIcon(new ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/home22.png"))); // NOI18N
        backButton.setText("Επιστροφή");
        backButton.setPreferredSize(new Dimension(80, 23));
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(newButton)
                .addGap(5, 5, 5)
                .addComponent(editButton)
                .addGap(5, 5, 5)
                .addComponent(deleteButton)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 377, Short.MAX_VALUE)
                .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(newButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton)
                    .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
        );

        add(jPanel1, BorderLayout.PAGE_END);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        controller.switchToPanel(MainFrameController.PanelType.ROOT_MENU);
    }//GEN-LAST:event_backButtonActionPerformed

    private void newButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed

    }//GEN-LAST:event_newButtonActionPerformed

    private void editButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int selectedIndex = groupAlbumTable.getSelectedRow();
        if (selectedIndex != -1) {
            Artist a = artistList.get(selectedIndex);
            //controller.switchToPanel(MainFrameController.PanelType.GROUP_ALBUM_EDITOR);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        deleteGroupAlbum();
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private List<Album> albumList;
    private Query albumQuery;
    private List<Artist> artistList;
    private Query artistQuery;
    private JButton backButton;
    private JButton deleteButton;
    private JButton editButton;
    private JTable groupAlbumTable;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JScrollPane jScrollPane2;
    private EntityManager localEm;
    private JButton newButton;
    private BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    //
    // Ο δικός μας κώδικας αρχίζει εδώ, για να είναι
    // εμφανώς διαχωρισμένος από τον αυτόματα δημιουργούμενο
    //
    private MainFrameController controller;
    private EntityManager em;

    public GroupAlbumTablePanel(MainFrameController controller, EntityManager em) {
        this.controller = controller;
        this.em = em;
        initComponents();

        // Καθορισμός εμφάνισης πίνακα
        TableColumnModel tcm = groupAlbumTable.getColumnModel();
        for (int i = 0; i < tcm.getColumnCount(); i++) {
            switch (i) {
                case 3:
                    tcm.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.GENERIC_RIGHT_ALIGNED));
                    break;
                case 5:
                    tcm.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.DATE));
                    break;
                default:
                    tcm.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.GENERIC));
                    break;
            }
        }
    }

    private void deleteGroupAlbum() {
        int selectedIndex = groupAlbumTable.getSelectedRow();
        if (selectedIndex != -1) {
            Album a = albumList.get(selectedIndex);
            boolean isInPlaylist = false;
            for (Song s : a.getSongList()) {
                if (!s.getPlaylistList().isEmpty()) {
                    isInPlaylist = true;
                    break;
                }
            }
            if (isInPlaylist) {
                Object[] options = {"ΟΚ"};
                int n = JOptionPane.showOptionDialog(this,
                        "Kάποιο(α) τραγούδι(α) συμμετέχει σε λίστα \n"
                        + "πρέπει πρώτα να διαγραφεί απο αυτή",
                        "Διαγραφή Άλμπουμ",
                        JOptionPane.NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null, //do not use a custom Icon
                        options, //the titles of buttons
                        options[0]); //default button title                
            } else {
                Object[] options = {"Ναι", "Όχι"};
                int n = JOptionPane.showOptionDialog(this,
                        "Να διαγραφεί το Άλμπουμ " + a.getTitle() + ";",
                        "Επιβεβαίωση Διαγραφής",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, //do not use a custom Icon
                        options, //the titles of buttons
                        options[1]); //default button title
                if (n == 0) {
                    localEm.getTransaction().begin();
                    try {
                        Query q = localEm.createQuery("DELETE FROM Album al WHERE al.albumid=:albumID ",
                                Album.class).setParameter("albumID", a.getAlbumid());
                        q.executeUpdate();
                        localEm.getTransaction().commit();
                        albumList.remove(selectedIndex);
                        groupAlbumTable.updateUI();
                    } catch (Exception e) {
                        e.printStackTrace();
                        localEm.getTransaction().rollback();
                    }
                }
            }
        }
    }
}
