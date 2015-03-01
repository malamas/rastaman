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

import eap.pli24.rastaman.entities.Playlist;
import eap.pli24.rastaman.entities.PlaylistSong;
import eap.pli24.rastaman.entities.Song;
import eap.pli24.rastaman.ui.tablecellrenderers.TableCellRendererFactory;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Beans;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableColumnModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 *
 * @author Apostolis Iakovakis
 * @author Nikos Karagiannis
 * @author Nikos Krommydas
 * @author Malamas Malamidis
 */
public class PlaylistTablePanel extends javax.swing.JPanel {

    /**
     * Creates new form PlaylistPanel
     */
    public PlaylistTablePanel() {
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
        playlistQuery = Beans.isDesignTime() ? null : localEm.createQuery("SELECT p FROM Playlist p");
        playlistList = Beans.isDesignTime() ? Collections.emptyList() : playlistQuery.getResultList();
        scrollPane1 = new JScrollPane();
        playlistTable = new JTable();
        buttonPanel = new JPanel();
        filler3 = new Box.Filler(new Dimension(5, 15), new Dimension(5, 15), new Dimension(5, 15));
        backButton = new JButton();
        filler8 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 32767));
        importButton = new JButton();
        filler7 = new Box.Filler(new Dimension(5, 15), new Dimension(5, 15), new Dimension(5, 15));
        portButton = new JButton();
        filler2 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 32767));
        newButton = new JButton();
        filler4 = new Box.Filler(new Dimension(5, 15), new Dimension(5, 15), new Dimension(5, 15));
        editButton = new JButton();
        filler5 = new Box.Filler(new Dimension(5, 15), new Dimension(5, 15), new Dimension(5, 15));
        deleteButton = new JButton();
        filler6 = new Box.Filler(new Dimension(5, 15), new Dimension(5, 15), new Dimension(5, 15));

        setLayout(new BorderLayout());

        playlistTable.getTableHeader().setReorderingAllowed(false);

        JTableBinding jTableBinding = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ_WRITE, playlistList, playlistTable);
        JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${name}"));
        columnBinding.setColumnName("Όνομα");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${creationdate}"));
        columnBinding.setColumnName("Ημερομηνία δημιουργίας");
        columnBinding.setColumnClass(Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(ELProperty.create("${songCount}"));
        columnBinding.setColumnName("Πλήθος τραγουδιών");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        scrollPane1.setViewportView(playlistTable);

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
        buttonPanel.add(filler8);

        importButton.setIcon(new ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/document-open.png"))); // NOI18N
        importButton.setText("από XML");
        importButton.setPreferredSize(new Dimension(120, 36));
        importButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                importButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(importButton);
        buttonPanel.add(filler7);

        portButton.setIcon(new ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/document-save.png"))); // NOI18N
        portButton.setText("σε XML");
        portButton.setPreferredSize(new Dimension(120, 36));

        Binding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, playlistTable, ELProperty.create("${selectedElement!=null}"), portButton, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        portButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                portButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(portButton);
        buttonPanel.add(filler2);

        newButton.setIcon(new ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/add22.png"))); // NOI18N
        newButton.setText("Εισαγωγή");
        newButton.setPreferredSize(new Dimension(120, 36));
        buttonPanel.add(newButton);
        buttonPanel.add(filler4);

        editButton.setIcon(new ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/edit22.png"))); // NOI18N
        editButton.setText("Επεξεργασία");
        editButton.setPreferredSize(new Dimension(120, 36));

        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, playlistTable, ELProperty.create("${selectedElement!=null}"), editButton, BeanProperty.create("enabled"));
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

        binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, playlistTable, ELProperty.create("${selectedElement!=null}"), deleteButton, BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        buttonPanel.add(deleteButton);
        buttonPanel.add(filler6);

        add(buttonPanel, BorderLayout.PAGE_END);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        controller.switchToPanel(MainFrameController.PanelType.ROOT_MENU);
    }//GEN-LAST:event_backButtonActionPerformed

    private void editButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int selectedIndex = playlistTable.getSelectedRow();
        if (selectedIndex != -1) {
            Playlist selectedPlaylist = playlistList.get(selectedIndex);
            controller.showPlaylistEditor(selectedPlaylist);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void importButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_importButtonActionPerformed
        //importListFromXml();
    }//GEN-LAST:event_importButtonActionPerformed

    private void portButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_portButtonActionPerformed
        int selectedIndex = playlistTable.getSelectedRow();
        if (selectedIndex != -1) {
            Playlist selectedPlaylist = playlistList.get(selectedIndex);
            exportListToXml(selectedPlaylist);
        }
    }//GEN-LAST:event_portButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton backButton;
    private JPanel buttonPanel;
    private JButton deleteButton;
    private JButton editButton;
    private Box.Filler filler2;
    private Box.Filler filler3;
    private Box.Filler filler4;
    private Box.Filler filler5;
    private Box.Filler filler6;
    private Box.Filler filler7;
    private Box.Filler filler8;
    private JButton importButton;
    private EntityManager localEm;
    private JButton newButton;
    private List<Playlist> playlistList;
    private Query playlistQuery;
    private JTable playlistTable;
    private JButton portButton;
    private JScrollPane scrollPane1;
    private BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    //
    // Ο δικός μας κώδικας αρχίζει εδώ, για να είναι
    // εμφανώς διαχωρισμένος από τον αυτόματα δημιουργούμενο
    //
    private static final Logger LOGGER = Logger.getLogger(PlaylistTablePanel.class.getName());
    private MainFrameController controller;
    private EntityManager em;

    public PlaylistTablePanel(MainFrameController controller, EntityManager em) {
        this.controller = controller;
        this.em = em;
        initComponents();
        initFurther();
    }

    private void initFurther() {
        buttonPanel.setPreferredSize(new Dimension(0, UIProperties.BUTTON_PANEL_HEIGHT));

        // Καθορισμός εμφάνισης πίνακα
        TableColumnModel tcm = playlistTable.getColumnModel();
        for (int i = 0; i < tcm.getColumnCount(); i++) {
            switch (i) {
                case 1:
                    tcm.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.DATE));
                    break;
                case 2:
                    tcm.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.GENERIC_RIGHT_ALIGNED));
                    break;
                default:
                    tcm.getColumn(i).setCellRenderer(TableCellRendererFactory.getTableCellRenderer(TableCellRendererFactory.RendererType.GENERIC));
                    break;
            }
        }
    }

    private void importListFromXml() {
        File file = getUserSelectedFile(JFileChooser.OPEN_DIALOG);

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(file);
            doc.getDocumentElement().normalize();

            Playlist newPl = new Playlist();
            em.persist(newPl);

            String name = doc.getElementsByTagName("name").item(0).getTextContent();
            newPl.setName(name);
            newPl.setCreationdate(new Date());

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
    }

    private void exportListToXml(Playlist pl) {
        // Επιλογή αρχείου από το χρήστη
        File file = getUserSelectedFile(JFileChooser.SAVE_DIALOG);
        if (file != null) {
            try {
                Document doc = buildDocumentFrom(pl);
                // Εξαγωγή του δένδρου σε αρχείο
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(file);

                transformer.transform(source, result);

            } catch (ParserConfigurationException | TransformerException ex) {
                LOGGER.log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Η δημιουργία του αρχείου xml απέτυχε...", "Σφάλμα", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private Document buildDocumentFrom(Playlist pl) throws ParserConfigurationException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", new Locale("el", "GR"));

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();

        // Ρίζα δένδρου xml
        Element playlistEl = doc.createElement("playlist");
        doc.appendChild(playlistEl);

        // Όνομα λίστας
        Element nameEl = doc.createElement("name");
        nameEl.appendChild(doc.createTextNode(pl.getName()));
        playlistEl.appendChild(nameEl);

        // Ημερομηνία δημιουργίας
        Element creationDateEl = doc.createElement("creationdate");
        creationDateEl.appendChild(doc.createTextNode(sdf.format(pl.getCreationdate())));
        playlistEl.appendChild(creationDateEl);

        // Λίστα τραγουδιών
        Element songlistEl = doc.createElement("songlist");

        for (PlaylistSong ps : pl.getPlaylistSongList()) {
            Song s = ps.getSong();
            // στοιχείο για κάθε τραγούδι
            Element songEl = doc.createElement("song");

            // Στοιχείο με το id του τραγουδιού στη ΒΔ.
            Element idEl = doc.createElement("id");
            idEl.appendChild(doc.createTextNode(Long.toString(s.getSongid())));
            songEl.appendChild(idEl);

            // Τίτλος τραγουδιού
            Element titleEl = doc.createElement("title");
            titleEl.appendChild(doc.createTextNode(s.getTitle()));
            songEl.appendChild(titleEl);

            // Ερμηνευτής (καλλιτέχνης ή συγκρότημα
            Element performerEl = doc.createElement("performer");
            performerEl.appendChild(doc.createTextNode(s.getAlbumid().getPerformerScreenName()));
            songEl.appendChild(performerEl);

            songlistEl.appendChild(songEl);
        }

        playlistEl.appendChild(songlistEl);
        return doc;
    }

    private File getUserSelectedFile(int fileChooserType) {
        if (fileChooserType != JFileChooser.OPEN_DIALOG && fileChooserType != JFileChooser.SAVE_DIALOG) {
            throw new IllegalArgumentException("fileChooserType should be either JFileChooser.OPEN_DIALOG or JFileChooser.SAVE_DIALOG");
        }
        JFileChooser fc = new JFileChooser();
        File selectedFile = null;
        fc.setDialogType(fileChooserType);
        FileFilter xmlFilter = new FileNameExtensionFilter("αρχεία XML (*.xml)", "xml");
        fc.setFileFilter(xmlFilter);
        switch (fileChooserType) {
            case JFileChooser.OPEN_DIALOG:
                fc.setDialogTitle("Εισαγωγή από XML");
                fc.setApproveButtonText("Εισαγωγή");
                break;
            case JFileChooser.SAVE_DIALOG:
                fc.setDialogTitle("Εξαγωγή σε XML");
                fc.setApproveButtonText("Εξαγωγή");
                break;
        }
        if (fc.showDialog(this, null) == JFileChooser.APPROVE_OPTION) {
            selectedFile = fc.getSelectedFile();
        }
        return selectedFile;
    }
}
