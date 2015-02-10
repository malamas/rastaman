package eap.pli24.rastaman.ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle;

/**
 *
 * @author malamas
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

        musicgroupButton = new JButton();
        jLabel1 = new JLabel();
        artistButton = new JButton();
        exitButton = new JButton();
        artistAlbumButton = new JButton();
        groupAlbumButton = new JButton();
        playlistButton = new JButton();

        musicgroupButton.setText("Συγκροτήματα");
        musicgroupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                musicgroupButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Αρχικό Μενού");

        artistButton.setText("Καλλιτέχνες");
        artistButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                artistButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Έξοδος");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        artistAlbumButton.setText("Αλμπουμ Καλιτεχνών");
        artistAlbumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                artistAlbumButtonActionPerformed(evt);
            }
        });

        groupAlbumButton.setText("Άλμπουμ Συγκροτημάτων");
        groupAlbumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                groupAlbumButtonActionPerformed(evt);
            }
        });

        playlistButton.setText("Λίστες");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(artistButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(musicgroupButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(artistAlbumButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(groupAlbumButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(playlistButton, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(artistButton)
                    .addComponent(artistAlbumButton))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(musicgroupButton)
                    .addComponent(groupAlbumButton))
                .addGap(26, 26, 26)
                .addComponent(playlistButton)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void musicgroupButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_musicgroupButtonActionPerformed
        controller.showPanel(MainFrameController.Panel.GROUP_TABLE);
    }//GEN-LAST:event_musicgroupButtonActionPerformed

    private void artistButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_artistButtonActionPerformed
        controller.showPanel(MainFrameController.Panel.ARTIST_TABLE);
    }//GEN-LAST:event_artistButtonActionPerformed

    private void exitButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        controller.shutdown();
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void artistAlbumButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_artistAlbumButtonActionPerformed
        controller.showPanel(MainFrameController.Panel.ARTIST_ALBUM_TABLE);
    }//GEN-LAST:event_artistAlbumButtonActionPerformed

    private void groupAlbumButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_groupAlbumButtonActionPerformed
        controller.showPanel(MainFrameController.Panel.GROUP_ALBUM_TABLE);
    }//GEN-LAST:event_groupAlbumButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton artistAlbumButton;
    private JButton artistButton;
    private JButton exitButton;
    private JButton groupAlbumButton;
    private JLabel jLabel1;
    private JButton musicgroupButton;
    private JButton playlistButton;
    // End of variables declaration//GEN-END:variables
    //
    // Ο δικός μας κώδικας αρχίζει εδώ, για να είναι
    // εμφανώς διαχωρισμένος από τον αυτόματα δημιουργούμενο
    //
    private MainFrameController controller;
    

    public void setController(MainFrameController controller) {
        this.controller = controller;
    }
}