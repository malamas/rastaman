package eap.pli24.rastaman.ui;

/*
 * @author Apostolis Iakovakis
 * @author Malamas Malamidis
 */
public class GroupAlbumEditorPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditGroupPanel
     */
    public GroupAlbumEditorPanel() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        RastamanPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("RastamanPU").createEntityManager();
        musicgroupQuery = java.beans.Beans.isDesignTime() ? null : RastamanPUEntityManager.createQuery("SELECT m FROM Musicgroup m");
        musicgroupList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : musicgroupQuery.getResultList();
        labelquery = java.beans.Beans.isDesignTime() ? null : RastamanPUEntityManager.createQuery("SELECT a FROM Label a");
        labellist = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : labelquery.getResultList();
        albumQuery = java.beans.Beans.isDesignTime() ? null : RastamanPUEntityManager.createQuery("SELECT a FROM Album a");
        albumList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : albumQuery.getResultList();
        musicgroupNameQuery = java.beans.Beans.isDesignTime() ? null : RastamanPUEntityManager.createQuery("SELECT m.name FROM Musicgroup m");
        musicgroupNameList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : musicgroupNameQuery.getResultList();
        labelNamequery = java.beans.Beans.isDesignTime() ? null : RastamanPUEntityManager.createQuery("SELECT a.name FROM Label a");
        labelNamelist = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : labelNamequery.getResultList();
        songQuery = java.beans.Beans.isDesignTime() ? null : RastamanPUEntityManager.createQuery("SELECT s FROM Song s");
        songList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : songQuery.getResultList();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        releasedateField = new javax.swing.JFormattedTextField();
        labelComboBox = new javax.swing.JComboBox();
        MusicGroupComboBox = new javax.swing.JComboBox();
        titleField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        disknumberTextField = new javax.swing.JTextField();

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/accept22.png"))); // NOI18N
        saveButton.setText("Αποθήκευση");

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eap/pli24/rastaman/resources/images/undo22.png"))); // NOI18N
        cancelButton.setText("Ακύρωση");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Άλμπουμ Συγκροτήματος");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, songList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tracknr}"));
        columnBinding.setColumnName("Track");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${title}"));
        columnBinding.setColumnName("Τίτλος");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${duration}"));
        columnBinding.setColumnName("Διάρκεια");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

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

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, labelNamelist, labelComboBox);
        bindingGroup.addBinding(jComboBoxBinding);
        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, labellist, org.jdesktop.beansbinding.ObjectProperty.create(), labelComboBox, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, musicgroupNameList, MusicGroupComboBox);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, musicgroupList, org.jdesktop.beansbinding.ObjectProperty.create(), MusicGroupComboBox, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Τίτλος :");

        jLabel4.setText("Συγκρότημα:");

        jLabel3.setText("Εταιρία:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Ημ.Κυκλοφορίας :");

        jLabel5.setText("Τύπος:");

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cs", "ep", "lp" }));

        jLabel7.setText("Νο Δίσκου:");

        disknumberTextField.setText("jTextField2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(newButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleField)
                            .addComponent(MusicGroupComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MusicGroupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton)))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        controller.switchToPanel(MainFrameController.PanelType.GROUP_ALBUM_TABLE);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        /*
         try{
         int selectedIndex= jTable1.getSelectedRow();
         if (selectedIndex == -1 ) throw new Exception("Δεν Επιλέχθηκε Καλλιτέχνης");
         Artist a = artistList.get(selectedIndex);
         if (a.getAlbumList().isEmpty()){
         if (a.getMusicgroupList().isEmpty()){
         Object[] options = {"Ναι",
         "Όχι"};
         int n = JOptionPane.showOptionDialog(new JFrame(),
         "Να διαγραφεί ο Καλλιτέχνης" + a.getLastname() + " " + a.getFirstname() + ";",
         "Επιβεβαίωση Διαγραφής",
         JOptionPane.YES_NO_OPTION,
         JOptionPane.QUESTION_MESSAGE,
         null,     //do not use a custom Icon
         options,  //the titles of buttons
         options[1]); //default button title
         if (n==0) {
         RastamanPUEntityManager.getTransaction().begin();
         try{
         Query q=RastamanPUEntityManager.createQuery("DELETE FROM Artist art WHERE art.artistid=:artistID ",
         Artist.class).setParameter("artistID", a.getArtistid());
         q.executeUpdate();
         RastamanPUEntityManager.getTransaction().commit();
         artistList.remove(selectedIndex);
         jTable1.updateUI();
         } catch (Exception e){
         e.printStackTrace();
         RastamanPUEntityManager.getTransaction().rollback();
         }
         }
         }
         else{
         Object[] options = {"ΟΚ"};
         int n = JOptionPane.showOptionDialog(new JFrame(),
         "Ο καλλιτέχνης συμμετέχει σε συγκρότημα \n"
         + "πρέπει πρώτα να διαγραφεί απο αυτό",
         "Διαγραφή Καλλιτέχνη",
         JOptionPane.NO_OPTION,
         JOptionPane.INFORMATION_MESSAGE,
         null,     //do not use a custom Icon
         options,  //the titles of buttons
         options[0]); //default button title
         }
         }
         else {
         if (a.getMusicgroupList().isEmpty()){
         Object[] options = {"ΟΚ"};
         int n = JOptionPane.showOptionDialog(new JFrame(),
         "Υπάρχει άλμπουμ για τον συγκεκριμένο καλλιτέχνη \n"
         + "πρέπει πρώτα να διαγραφεί αυτό",
         "Διαγραφή Καλλιτέχνη",
         JOptionPane.NO_OPTION,
         JOptionPane.INFORMATION_MESSAGE,
         null,     //do not use a custom Icon
         options,  //the titles of buttons
         options[0]); //default button title
         }
         else{
         Object[] options = {"ΟΚ"};
         int n = JOptionPane.showOptionDialog(new JFrame(),
         "Ο καλλιτέχνης συμμετέχει σε συγκρότημα  και\n"
         +"υπάρχει άλμπουμ για τον συγκεκριμένο καλλιτέχνη \n"
         + "πρέπει πρώτα να διαγραφεί το άλμπουμ και να διαγραφεί απο το συγκρότημα",
         "Διαγραφή Καλλιτέχνη",
         JOptionPane.NO_OPTION,
         JOptionPane.INFORMATION_MESSAGE,
         null,     //do not use a custom Icon
         options,  //the titles of buttons
         options[0]); //default button title
         }

         }

         }
         catch(Exception e) {
         JOptionPane.showMessageDialog(new JFrame(), e.getMessage());
         }
         */
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed

        //controller.switchToPanel(MainFrameController.PanelType.ARTIST_EDITOR);
    }//GEN-LAST:event_newButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox MusicGroupComboBox;
    private javax.persistence.EntityManager RastamanPUEntityManager;
    private java.util.List<eap.pli24.rastaman.entities.Album> albumList;
    private javax.persistence.Query albumQuery;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField disknumberTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox labelComboBox;
    private java.util.List labelNamelist;
    private javax.persistence.Query labelNamequery;
    private java.util.List labellist;
    private javax.persistence.Query labelquery;
    private java.util.List<eap.pli24.rastaman.entities.Musicgroup> musicgroupList;
    private java.util.List<eap.pli24.rastaman.entities.Musicgroup> musicgroupNameList;
    private javax.persistence.Query musicgroupNameQuery;
    private javax.persistence.Query musicgroupQuery;
    private javax.swing.JButton newButton;
    private javax.swing.JFormattedTextField releasedateField;
    private javax.swing.JButton saveButton;
    private java.util.List<eap.pli24.rastaman.entities.Song> songList;
    private javax.persistence.Query songQuery;
    private javax.swing.JTextField titleField;
    private javax.swing.JComboBox typeComboBox;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    // Ο δικός μας κώδικας αρχίζει εδώ, για να είναι
    // εμφανώς διαχωρισμένος από τον αυτόματα δημιουργούμενο
    //
    private MainFrameController controller;

    public void setController(MainFrameController controller) {
        this.controller = controller;
    }

}
