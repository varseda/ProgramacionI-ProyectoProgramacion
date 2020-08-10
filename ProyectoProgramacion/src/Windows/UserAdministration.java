/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Models.User;
import Services.UsersService;
import Utilities.WindowsBackground.CustomPanel;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author JD101
 */
public class UserAdministration extends javax.swing.JFrame {

    //  Variables and Objects
    //  ------------------------------------------------------------------------
    private UserList formUserList;
    private User user;
    private boolean operationAddUser;
    //  ------------------------------------------------------------------------

    /**
     * Creates new form UserAdministration
     */
    public UserAdministration() {
        
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Images/Logo/logo.png")).getImage());
        
    }

    /**
     * Crea un formulario de tipo UserAdministration para añadir usuarios.
     *
     * @param formUserList Recibe un formulario de tipo UserList para hacer a
     * UserAdministration una ventana tipo modal.
     */
    public UserAdministration(UserList formUserList) {

        this.formUserList = formUserList;
        this.formUserList.setEnabled(false);
        this.operationAddUser = true;

        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Images/Logo/logo.png")).getImage());
        setLocationRelativeTo(this.formUserList);
        setTitle("Añadir usuario");
        textFieldUser.requestFocus();

    }

    /**
     * Crea un formulario de tipo UserAdministration para modificar usuarios.
     *
     * @param formUserList Recibe un formulario de tipo UserList para hacer a
     * UserAdministration una ventana tipo modal.
     * @param user
     */
    public UserAdministration(UserList formUserList, User user) {

        this.formUserList = formUserList;
        this.formUserList.setEnabled(false);
        this.user = user;
        this.operationAddUser = false;

        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Images/Logo/logo.png")).getImage());
        setLocationRelativeTo(this.formUserList);
        dataAllocation();
        setTitle("Modificar usuario");
        textFieldUser.setEditable(false);
        passwordFieldPassword.requestFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        panelBackgroundBelow = new CustomPanel("/Images/UserAdministration/backgroundBelow.png");
        panelBackgroundAbove = new CustomPanel("/Images/UserAdministration/background.png");
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldUser = new javax.swing.JTextField();
        passwordFieldPassword = new javax.swing.JPasswordField();
        comboBoxPermissions = new javax.swing.JComboBox<>();
        buttonAccept = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        panelBackgroundBelow.setPreferredSize(new java.awt.Dimension(300, 400));

        panelBackgroundAbove.setPreferredSize(new java.awt.Dimension(250, 350));

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        jLabel3.setText("Permisos:");

        textFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUserActionPerformed(evt);
            }
        });

        passwordFieldPassword.setPreferredSize(new java.awt.Dimension(100, 22));
        passwordFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldPasswordActionPerformed(evt);
            }
        });

        comboBoxPermissions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Si" }));
        comboBoxPermissions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPermissionsActionPerformed(evt);
            }
        });

        buttonAccept.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        buttonAccept.setForeground(new java.awt.Color(255, 255, 255));
        buttonAccept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserAdministration/button.png"))); // NOI18N
        buttonAccept.setText("Aceptar");
        buttonAccept.setBorder(null);
        buttonAccept.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAccept.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserAdministration/buttonRollOver.png"))); // NOI18N
        buttonAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAcceptActionPerformed(evt);
            }
        });

        buttonCancel.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        buttonCancel.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserAdministration/button.png"))); // NOI18N
        buttonCancel.setText("Cancelar");
        buttonCancel.setBorder(null);
        buttonCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonCancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserAdministration/buttonRollOver.png"))); // NOI18N
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBackgroundAboveLayout = new javax.swing.GroupLayout(panelBackgroundAbove);
        panelBackgroundAbove.setLayout(panelBackgroundAboveLayout);
        panelBackgroundAboveLayout.setHorizontalGroup(
            panelBackgroundAboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundAboveLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBackgroundAboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBackgroundAboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackgroundAboveLayout.createSequentialGroup()
                        .addComponent(comboBoxPermissions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgroundAboveLayout.createSequentialGroup()
                        .addGroup(panelBackgroundAboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldUser)
                            .addComponent(passwordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addGap(20, 20, 20))))
            .addGroup(panelBackgroundAboveLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(buttonAccept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCancel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelBackgroundAboveLayout.setVerticalGroup(
            panelBackgroundAboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundAboveLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(panelBackgroundAboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBackgroundAboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBackgroundAboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBoxPermissions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(panelBackgroundAboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAccept)
                    .addComponent(buttonCancel))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout panelBackgroundBelowLayout = new javax.swing.GroupLayout(panelBackgroundBelow);
        panelBackgroundBelow.setLayout(panelBackgroundBelowLayout);
        panelBackgroundBelowLayout.setHorizontalGroup(
            panelBackgroundBelowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundBelowLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelBackgroundAbove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelBackgroundBelowLayout.setVerticalGroup(
            panelBackgroundBelowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundBelowLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelBackgroundAbove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackgroundBelow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackgroundBelow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //  Own Code
    //  ------------------------------------------------------------------------
    /**
     * Crea un objeto de tipo User para rellenar los atributos de este con los
     * datos extraídos de los componentes del formulario.
     *
     * @return Retorna un objeto de tipo Patient con todos los atributos
     * completos.
     */
    private User getUserData() {

        User user = new User();

        user.setUserName(textFieldUser.getText());
        user.setUserPassword(new String(passwordFieldPassword.getPassword()));
        user.setPermissions(comboBoxPermissions.getSelectedIndex());

        return user;

    }

    /**
     * Crea un objeto de tipo User, luego obtiene los datos para rellenar al
     * objeto, realiza las comprobaciones necesarias para hacer la actualización
     * del registro, si todos los datos están completos y son del tipo adecuado
     * se procede a agregar el registro, al finalizar se cierra el formulario.
     */
    private void operationUser() {

        UsersService usersService = new UsersService();
        User user = getUserData();

        if (usersService.validateAllDataIncomplete(user)) {

            JOptionPane.showMessageDialog(this, "Usuario y contraseña vacíos, "
                    + "ingrese los datos requeridos.");

        } else if (usersService.validateDataByData(user)) {

            JOptionPane.showMessageDialog(this, "El usuario o contraseña están "
                    + "vacíos, ingrese los datos requeridos.");

        } else if (!usersService.validateDataTypes(user)) {

            JOptionPane.showMessageDialog(this, "El nombre de usuario debe "
                    + "contener 4 o más caracteres y ningún espacio en blanco. "
                    + "La contraseña debe contener 8 o más caracteres, y ningún "
                    + "espacio en blanco.");

        } else {

            try {

                if (this.operationAddUser) {

                    if (usersService.insertUser(user, this)) {
                        this.dispose();
                        formUserList.initTable();
                    }

                } else {

                    if (usersService.updateData(user, this)) {
                        this.dispose();
                        formUserList.initTable();
                    }

                }

            } catch (SQLException ex) {
                Logger.getLogger(UserAdministration.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    /**
     * Toma la información de un objeto tipo User y la coloca en los componentes
     * de la ventana.
     */
    private void dataAllocation() {

        textFieldUser.setText(this.user.getUserName());
        comboBoxPermissions.setSelectedIndex(this.user.getPermissions());

    }

    /**
     * Habilita y da el focus a la ventana de lista de usuarios al cerrar esta
     * ventana.
     *
     * @param evt
     */
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        this.formUserList.setEnabled(true);
        this.formUserList.requestFocus();

    }//GEN-LAST:event_formWindowClosed

    private void textFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUserActionPerformed
        passwordFieldPassword.requestFocus();
    }//GEN-LAST:event_textFieldUserActionPerformed

    private void passwordFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldPasswordActionPerformed
        comboBoxPermissions.requestFocus();
    }//GEN-LAST:event_passwordFieldPasswordActionPerformed

    private void comboBoxPermissionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPermissionsActionPerformed
        buttonAccept.requestFocus();
    }//GEN-LAST:event_comboBoxPermissionsActionPerformed

    /**
     * Cierra el formulario al presionar el botón de cancelar.
     *
     * @param evt
     */
    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    /**
     * Llama al método addPatient() al presionar el botón.
     *
     * @param evt
     */
    private void buttonAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAcceptActionPerformed
        operationUser();
    }//GEN-LAST:event_buttonAcceptActionPerformed
    //  ------------------------------------------------------------------------

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {

            UIManager.setLookAndFeel(new FlatIntelliJLaf());

        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAdministration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAccept;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JComboBox<String> comboBoxPermissions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel panelBackgroundAbove;
    private javax.swing.JPanel panelBackgroundBelow;
    private javax.swing.JPasswordField passwordFieldPassword;
    private javax.swing.JTextField textFieldUser;
    // End of variables declaration//GEN-END:variables
}
