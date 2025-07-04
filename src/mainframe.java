
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class mainframe extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(mainframe.class.getName());

    public mainframe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        tfname = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        tfregno = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        tffaculty = new javax.swing.JTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        tfprojecttitle = new javax.swing.JTextField();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        tfcontactno = new javax.swing.JTextField();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnCLEAR = new javax.swing.JButton();
        javax.swing.JButton btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablestudents = new javax.swing.JTable();
        javax.swing.JButton btnsearch = new javax.swing.JButton();
        javax.swing.JButton btnupdate = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setMinimumSize(new java.awt.Dimension(838, 422));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LIST OF STUDENTS");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NEW STUDENTS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 12))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel2.setText("Name");

        jLabel3.setText("Reg no");

        jLabel4.setText("Faculty");

        jLabel5.setText("project title");

        jLabel6.setText("contact no");

        jLabel7.setText("Email");

        btnAdd.setText("REGISTER");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCLEAR.setText("CLEAR");
        btnCLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLEARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tfname)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tfregno)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tffaculty)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tfprojecttitle)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tfcontactno)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tfEmail)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(btnCLEAR)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnCLEAR});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfregno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tffaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfprojecttitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfcontactno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tablestudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Reg no", "Faculty", "project title", "contact no", "Email"
            }
        ));
        jScrollPane1.setViewportView(tablestudents);

        btnsearch.setText("SEARCH");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btnupdate.setText("UPDATE");
        btnupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupdateMouseClicked(evt);
            }
        });
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnsearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnupdate)
                        .addGap(34, 34, 34))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnsearch, btnupdate});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnsearch)
                            .addComponent(btnupdate)
                            .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
      String Name = tfname.getText();
      String Regno = tfregno.getText();
      String Faculty = tffaculty.getText();
      String projecttitle = tfprojecttitle.getText();
      String contactno = tfcontactno.getText();
      String email = tfEmail.getText();
      if(Faculty.isEmpty()|| projecttitle.isEmpty() || Name.isEmpty()|| Regno.isEmpty()||contactno.isEmpty()||email.isEmpty()){
          JOptionPane.showMessageDialog(this,
                  "please enter all fields","Try again", 
                  JOptionPane.ERROR_MESSAGE);
      }else {
          DefaultTableModel model = (DefaultTableModel) tablestudents.getModel();
          model.addRow(new Object[]{Name, Regno, Faculty, projecttitle, contactno, email});
          
          tfname.setText("");
          tfregno.setText("");
          tffaculty.setText("");
          tfprojecttitle.setText("");
          tfcontactno.setText("");
          tfEmail.setText("");
          
          
      }
          
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCLEARActionPerformed
        tfname.setText("");
          tfregno.setText("");
          tffaculty.setText("");
          tfprojecttitle.setText("");
          tfcontactno.setText("");
          tfEmail.setText("");
    }//GEN-LAST:event_btnCLEARActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       int row = tablestudents.getSelectedRow();
       if (row < 0){
           JOptionPane.showMessageDialog(this,
                  "please enter all fields","Try again", 
                  JOptionPane.ERROR_MESSAGE);
       }else {
         DefaultTableModel model = (DefaultTableModel) tablestudents.getModel();
          model.removeRow(row);  
       }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        DefaultTableModel model = (DefaultTableModel) tablestudents.getModel();
          Vector<Vector> tableData = model.getDataVector();
          
          // saving object in a file
          try {
              FileOutputStream file = new FileOutputStream("file.bin");
              ObjectOutputStream output = new ObjectOutputStream(file); 
              //method of serialization of objects
              output.writeObject(tableData);
              output.close();
              file.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       try{
        FileInputStream file = new FileInputStream("file.bin");
        ObjectInputStream input = new ObjectInputStream(file);
        // deserialization of object
        Vector<Vector> tableData = (Vector<Vector>)input.readObject();
        
        input.close();
        file.close();
           DefaultTableModel model = (DefaultTableModel) tablestudents.getModel();
           for (int i = 0; i < 10; i++) {
             Vector row   = tableData.get(i);
             model.addRow(new Object[]{row.get(0),row.get(1),row.get(2),row.get(3)});
           }
       }
       catch (Exception ex) {
           ex.printStackTrace();
       }
    }//GEN-LAST:event_formWindowOpened

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        DefaultTableModel ob = (DefaultTableModel) tablestudents.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        tablestudents.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txtsearch.getText()));
        
        
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        DefaultTableModel ob = (DefaultTableModel) tablestudents.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        tablestudents.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txtsearch.getText()));
    }//GEN-LAST:event_txtsearchKeyReleased

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
       int i = tablestudents.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel)tablestudents.getModel();
       if(i >= 0)
       {
      String Name = tfname.getText();
      String Regno = tfregno.getText();
      String Faculty = tffaculty.getText();
      String projecttitle = tfprojecttitle.getText();
      String contactno = tfcontactno.getText();
      String email = tfEmail.getText();
      model.setValueAt(Name, tablestudents.getSelectedRow(), 0);
      model.setValueAt(Regno, tablestudents.getSelectedRow(), 1);
      model.setValueAt(Faculty, tablestudents.getSelectedRow(), 2);
      model.setValueAt(projecttitle, tablestudents.getSelectedRow(), 3);
      model.setValueAt(contactno, tablestudents.getSelectedRow(), 4);
      model.setValueAt(email, tablestudents.getSelectedRow(), 5);
      //display message
      JOptionPane.showMessageDialog(this, "UPDATE SUCCESSFUL");
    }//GEN-LAST:event_btnupdateActionPerformed
       else{
          
           if(tablestudents.getRowCount()==0){
                //if table is empty
               JOptionPane.showMessageDialog(this, "TABLE IS EMPTY");
           }else{
               //if row is  not selected or multiple rows selected
               JOptionPane.showMessageDialog(this, "please select single row for update");
           }
       }
    }
    private void btnupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseClicked

    }//GEN-LAST:event_btnupdateMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new mainframe().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCLEAR;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablestudents;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfcontactno;
    private javax.swing.JTextField tffaculty;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfprojecttitle;
    private javax.swing.JTextField tfregno;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
