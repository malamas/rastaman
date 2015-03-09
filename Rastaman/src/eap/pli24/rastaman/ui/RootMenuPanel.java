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

import eap.pli24.rastaman.ui.skins.SkinProvider;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.MutableComboBoxModel;
import javax.swing.SwingConstants;

/**
 * Η κλάση {@code RootMenuPanel} είναι ένα {@code JPanel} με το κύριο μενού της
 * εφαρμογής.
 *
 * @author Apostolis Iakovakis
 * @author Nikos Karagiannis
 * @author Nikos Krommydas
 * @author Malamas Malamidis
 */
public class RootMenuPanel extends javax.swing.JPanel {

    /**
     * Creates new form RootMenuPanel
     */
    public RootMenuPanel() {
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

        menuPanel = new JPanel();
        playlistButton = new JButton();
        exitButton = new JButton();
        mainFilePanel = new JPanel();
        artistButton = new JButton();
        musicgroupButton = new JButton();
        artistAlbumButton = new JButton();
        groupAlbumButton = new JButton();
        auxFilePanel = new JPanel();
        labelButton = new JButton();
        genreButton = new JButton();
        skinComboBox = new JComboBox<SkinProvider.Skins>();
        jLabel1 = new JLabel();

        setLayout(new BorderLayout());

        playlistButton.setText("Λίστες Αναπαραγωγής");
        playlistButton.setPreferredSize(new Dimension(160, 32));
        playlistButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                playlistButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Έξοδος");
        exitButton.setPreferredSize(new Dimension(160, 32));
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        mainFilePanel.setBorder(BorderFactory.createTitledBorder("Κύρια αρχεία"));
        mainFilePanel.setPreferredSize(new Dimension(180, 200));
        mainFilePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));

        artistButton.setText("Καλλιτέχνες");
        artistButton.setPreferredSize(new Dimension(160, 32));
        artistButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                artistButtonActionPerformed(evt);
            }
        });
        mainFilePanel.add(artistButton);

        musicgroupButton.setText("Συγκροτήματα");
        musicgroupButton.setPreferredSize(new Dimension(160, 32));
        musicgroupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                musicgroupButtonActionPerformed(evt);
            }
        });
        mainFilePanel.add(musicgroupButton);

        artistAlbumButton.setText("Αλμπουμ καλλιτεχνών");
        artistAlbumButton.setPreferredSize(new Dimension(160, 32));
        artistAlbumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                artistAlbumButtonActionPerformed(evt);
            }
        });
        mainFilePanel.add(artistAlbumButton);

        groupAlbumButton.setText("Άλμπουμ συγκροτημάτων");
        groupAlbumButton.setPreferredSize(new Dimension(160, 32));
        groupAlbumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                groupAlbumButtonActionPerformed(evt);
            }
        });
        mainFilePanel.add(groupAlbumButton);

        auxFilePanel.setBorder(BorderFactory.createTitledBorder("Βοηθητικά αρχεία"));
        auxFilePanel.setPreferredSize(new Dimension(180, 100));
        auxFilePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));

        labelButton.setText("Εταιρίες Παραγωγής");
        labelButton.setPreferredSize(new Dimension(160, 32));
        labelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                labelButtonActionPerformed(evt);
            }
        });
        auxFilePanel.add(labelButton);

        genreButton.setText("Είδη Μουσικής");
        genreButton.setPreferredSize(new Dimension(160, 32));
        genreButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                genreButtonActionPerformed(evt);
            }
        });
        auxFilePanel.add(genreButton);

        skinComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                skinComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(SwingConstants.TRAILING);
        jLabel1.setLabelFor(skinComboBox);
        jLabel1.setText("Εμφάνιση:");

        GroupLayout menuPanelLayout = new GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(menuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(mainFilePanel, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(skinComboBox, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(auxFilePanel, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(menuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                            .addComponent(playlistButton, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(menuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(mainFilePanel, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(skinComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(auxFilePanel, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(playlistButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        add(menuPanel, BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void musicgroupButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_musicgroupButtonActionPerformed
        controller.switchToPanel(MainFrameController.PanelType.GROUP_TABLE);
    }//GEN-LAST:event_musicgroupButtonActionPerformed

    private void artistButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_artistButtonActionPerformed
        controller.switchToPanel(MainFrameController.PanelType.ARTIST_TABLE);
    }//GEN-LAST:event_artistButtonActionPerformed

    private void exitButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        controller.shutdown();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void artistAlbumButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_artistAlbumButtonActionPerformed
        controller.switchToPanel(MainFrameController.PanelType.ARTIST_ALBUM_TABLE);
    }//GEN-LAST:event_artistAlbumButtonActionPerformed

    private void groupAlbumButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_groupAlbumButtonActionPerformed
        controller.switchToPanel(MainFrameController.PanelType.GROUP_ALBUM_TABLE);
    }//GEN-LAST:event_groupAlbumButtonActionPerformed

    private void playlistButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_playlistButtonActionPerformed
        controller.switchToPanel(MainFrameController.PanelType.PLAYLIST_TABLE);
    }//GEN-LAST:event_playlistButtonActionPerformed

    private void labelButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_labelButtonActionPerformed
        controller.switchToPanel(MainFrameController.PanelType.LABEL_TABLE);
    }//GEN-LAST:event_labelButtonActionPerformed

    private void genreButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_genreButtonActionPerformed
        controller.switchToPanel(MainFrameController.PanelType.GENRE_TABLE);
    }//GEN-LAST:event_genreButtonActionPerformed

    private void skinComboBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_skinComboBoxActionPerformed
        controller.switchToSkin((SkinProvider.Skins) skinComboBox.getSelectedItem());
    }//GEN-LAST:event_skinComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton artistAlbumButton;
    private JButton artistButton;
    private JPanel auxFilePanel;
    private JButton exitButton;
    private JButton genreButton;
    private JButton groupAlbumButton;
    private JLabel jLabel1;
    private JButton labelButton;
    private JPanel mainFilePanel;
    private JPanel menuPanel;
    private JButton musicgroupButton;
    private JButton playlistButton;
    private JComboBox<SkinProvider.Skins> skinComboBox;
    // End of variables declaration//GEN-END:variables
    //
    // Ο δικός μας κώδικας αρχίζει εδώ, για να είναι
    // εμφανώς διαχωρισμένος από τον αυτόματα δημιουργούμενο
    //
    private MainFrameController controller;

    /**
     * Δημιουργεί ένα {@code RootMenuPanel} με ελεγκτή τον {@code controller}.
     *
     * @param controller ο ελεγκτής
     */
    public RootMenuPanel(MainFrameController controller) {
        this.controller = controller;
        initComponents();
        initFurther();
    }

    /**
     * Αρχικοποίεί περαιτέρω στοιχεία του UI.
     */
    private void initFurther() {
        MutableComboBoxModel<SkinProvider.Skins> cbm = new DefaultComboBoxModel<>();
        for (SkinProvider.Skins s : SkinProvider.Skins.values()) {
            cbm.addElement(s);
        }
        cbm.setSelectedItem(SkinProvider.getInstance().getActiveSkin());
        skinComboBox.setModel(cbm);
    }
}
