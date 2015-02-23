/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eap.pli24.rastaman.ui;

import eap.pli24.rastaman.entities.Playlist;
import eap.pli24.rastaman.ui.tablecellrenderers.TableCellRendererFactory;
import java.awt.BorderLayout;
import javax.persistence.EntityManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;

/**
 *
 * @author malamas
 */
public class PlaylistEditorPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlaylistEditorPanel
     */
    public PlaylistEditorPanel() {
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

        boundPlaylist = playlist;
        scrollPane1 = new JScrollPane();
        playlistSongTable = new JTable();

        setLayout(new BorderLayout());

        playlistSongTable.getTableHeader().setReorderingAllowed(false);

        ELProperty eLProperty = ELProperty.create("${songList}");
        JTableBinding jTableBinding = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ_WRITE, boundPlaylist, eLProperty, playlistSongTable);
        JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${title}"));
        columnBinding.setColumnName("Τίτλος");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${duration}"));
        columnBinding.setColumnName("Διάρκεια (sec)");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        scrollPane1.setViewportView(playlistSongTable);

        add(scrollPane1, BorderLayout.CENTER);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Playlist boundPlaylist;
    private JTable playlistSongTable;
    private JScrollPane scrollPane1;
    private BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    //
    // Ο δικός μας κώδικας αρχίζει εδώ, για να είναι
    // εμφανώς διαχωρισμένος από τον αυτόματα δημιουργούμενο
    //
    private MainFrameController controller;
    private EntityManager em;
    private Playlist playlist;

    public PlaylistEditorPanel(MainFrameController controller, EntityManager em, Playlist playlist) {
        this.controller = controller;
        this.em = em;
        this.playlist = playlist;
        initComponents();
        initFurther();
    }

    private void initFurther() {
        //buttonPanel.setPreferredSize(new Dimension(0, UIProperties.BUTTON_PANEL_HEIGHT));

        // Καθορισμός εμφάνισης πίνακα
        TableColumnModel tcm = playlistSongTable.getColumnModel();
        for (int i = 0; i < tcm.getColumnCount(); i++) {
            switch (i) {
                case 1:
                    tcm.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.GENERIC_RIGHT_ALIGNED));
                    break;
                default:
                    tcm.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.GENERIC));
                    break;
            }
        }
    }
}
