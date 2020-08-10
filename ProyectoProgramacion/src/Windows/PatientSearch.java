package Windows;

import Models.Patient;
import Models.User;
import Services.PatientsService;
import Utilities.WindowsBackground.CustomPanel;
import com.formdev.flatlaf.FlatIntelliJLaf;
import org.apache.commons.lang3.StringUtils;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 * @author JD101
 */
public class PatientSearch extends javax.swing.JFrame {

    //  Variables and Objects
    //  ------------------------------------------------------------------------
    private User user;
    //  ------------------------------------------------------------------------

    /**
     * Creates new form PatientSearch
     *
     * @throws java.sql.SQLException
     */
    public PatientSearch() throws SQLException {

        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Images/Logo/logo.png")).getImage());
        setLocationRelativeTo(null);
        initTablePatientsTable();
        textFieldSearchBar.requestFocus();

    }

    /**
     * Crea un nuevo formulario PatientSearch.
     *
     * @param window Recibe un parámetro tipo JFrame para localizarse de acuerdo
     * a este.
     * @param user Recibe un parámetro de tipo User para mantener un control de
     * los permisos de usuario.
     * @throws java.sql.SQLException
     */
    public PatientSearch(JFrame window, User user) throws SQLException {

        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Images/Logo/logo.png")).getImage());
        setLocationRelativeTo(window);
        initTablePatientsTable();
        lockComponents();
        textFieldSearchBar.requestFocus();

        this.user = user;

        if (this.user.getPermissions() != 1) {
            buttonRemove.setVisible(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackgroundBelow = new CustomPanel("/Images/PatientSearch/backgroundBelow.png");
        panelBackgroundAbove = new CustomPanel("/Images/PatientSearch/background.png");
        comboBoxSearchFilter = new javax.swing.JComboBox<>();
        textFieldSearchBar = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        labelSearchFilter = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePatientsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        buttonExit = new javax.swing.JButton();
        buttonRemove = new javax.swing.JButton();
        buttonModify = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Búsqueda de pacientes");
        setPreferredSize(new java.awt.Dimension(1080, 540));
        setResizable(false);

        panelBackgroundBelow.setPreferredSize(new java.awt.Dimension(1080, 510));

        panelBackgroundAbove.setPreferredSize(new java.awt.Dimension(1020, 460));

        comboBoxSearchFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula", "Nombre", "Primer apellido", "Segundo apellido", "Nacionalidad", "Estado de la prueba" }));
        comboBoxSearchFilter.setPreferredSize(new java.awt.Dimension(70, 26));
        comboBoxSearchFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboBoxSearchFilterMouseClicked(evt);
            }
        });
        comboBoxSearchFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSearchFilterActionPerformed(evt);
            }
        });

        textFieldSearchBar.setMinimumSize(new java.awt.Dimension(70, 26));
        textFieldSearchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldSearchBarMouseClicked(evt);
            }
        });
        textFieldSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSearchBarActionPerformed(evt);
            }
        });

        buttonSearch.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        buttonSearch.setForeground(new java.awt.Color(255, 255, 255));
        buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PatientSearch/buttonSearchButton.png"))); // NOI18N
        buttonSearch.setText("Buscar");
        buttonSearch.setBorder(null);
        buttonSearch.setBorderPainted(false);
        buttonSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSearch.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PatientSearch/buttonSearchButtonRollOver.png"))); // NOI18N
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        labelSearchFilter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelSearchFilter.setText("Por:");
        labelSearchFilter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tablePatientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablePatientsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePatientsTable.getTableHeader().setReorderingAllowed(false);
        tablePatientsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePatientsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablePatientsTable);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel1.setText("Búsqueda de pacientes");

        buttonExit.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(255, 255, 255));
        buttonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PatientSearch/buttonRemoveModifyExit.png"))); // NOI18N
        buttonExit.setText("Atrás");
        buttonExit.setBorder(null);
        buttonExit.setBorderPainted(false);
        buttonExit.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PatientSearch/buttonRemoveModifyExitDisabled.png"))); // NOI18N
        buttonExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PatientSearch/buttonRemoveModifyExitRollOver.png"))); // NOI18N
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        buttonRemove.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        buttonRemove.setForeground(new java.awt.Color(255, 255, 255));
        buttonRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PatientSearch/buttonRemoveModifyExit.png"))); // NOI18N
        buttonRemove.setText("Eliminar");
        buttonRemove.setBorder(null);
        buttonRemove.setBorderPainted(false);
        buttonRemove.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PatientSearch/buttonRemoveModifyExitDisabled.png"))); // NOI18N
        buttonRemove.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonRemove.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PatientSearch/buttonRemoveModifyExitRollOver.png"))); // NOI18N
        buttonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveActionPerformed(evt);
            }
        });

        buttonModify.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        buttonModify.setForeground(new java.awt.Color(255, 255, 255));
        buttonModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PatientSearch/buttonRemoveModifyExit.png"))); // NOI18N
        buttonModify.setText("Modificar");
        buttonModify.setBorder(null);
        buttonModify.setBorderPainted(false);
        buttonModify.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PatientSearch/buttonRemoveModifyExitDisabled.png"))); // NOI18N
        buttonModify.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonModify.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PatientSearch/buttonRemoveModifyExitRollOver.png"))); // NOI18N
        buttonModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBackgroundAboveLayout = new javax.swing.GroupLayout(panelBackgroundAbove);
        panelBackgroundAbove.setLayout(panelBackgroundAboveLayout);
        panelBackgroundAboveLayout.setHorizontalGroup(
            panelBackgroundAboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundAboveLayout.createSequentialGroup()
                .addGroup(panelBackgroundAboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelBackgroundAboveLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonRemove)
                        .addGap(18, 18, 18)
                        .addComponent(buttonModify)
                        .addGap(38, 38, 38)
                        .addComponent(buttonExit))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBackgroundAboveLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelBackgroundAboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBackgroundAboveLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelSearchFilter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonSearch)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelBackgroundAboveLayout.setVerticalGroup(
            panelBackgroundAboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundAboveLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelBackgroundAboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch)
                    .addComponent(labelSearchFilter)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBackgroundAboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonModify)
                    .addComponent(buttonExit)
                    .addComponent(buttonRemove))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBackgroundBelowLayout = new javax.swing.GroupLayout(panelBackgroundBelow);
        panelBackgroundBelow.setLayout(panelBackgroundBelowLayout);
        panelBackgroundBelowLayout.setHorizontalGroup(
            panelBackgroundBelowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundBelowLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelBackgroundAbove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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
            .addComponent(panelBackgroundBelow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackgroundBelow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //  Own Code
    //  ------------------------------------------------------------------------
    /**
     * Bloquea los botones de modificar y eliminar.
     */
    private void lockComponents() {

        this.buttonRemove.setEnabled(false);
        this.buttonModify.setEnabled(false);

    }

    /**
     * Desbloquea los botones de modificar y eliminar.
     */
    private void unlockComponents() {

        this.buttonRemove.setEnabled(true);
        this.buttonModify.setEnabled(true);

    }

    /**
     * Crea un objeto de tipo Patient y rellena los atributos de este de acuerdo
     * con la fila que hay seleccionada en la tabla.
     *
     * @return Retorna un objeto de tipo Patient con sus atributos llenos.
     */
    private Patient getPatientData() {

        Patient patient = new Patient();

        int rowTable = tablePatientsTable.getSelectedRow();

        patient.setId(tablePatientsTable.getValueAt(rowTable, 0).toString());
        patient.setName(tablePatientsTable.getValueAt(rowTable, 1).toString());
        patient.setFirstLastName(tablePatientsTable.getValueAt(rowTable, 2).toString());
        patient.setSecondLastName(tablePatientsTable.getValueAt(rowTable, 3).toString());
        patient.setNationality(tablePatientsTable.getValueAt(rowTable, 4).toString());
        patient.setBirthdate(tablePatientsTable.getValueAt(rowTable, 5).toString());
        patient.setTestDay(tablePatientsTable.getValueAt(rowTable, 6).toString());
        patient.setTestStatus(tablePatientsTable.getValueAt(rowTable, 7).toString());
        patient.setPhoneNumber(tablePatientsTable.getValueAt(rowTable, 8).toString());
        patient.setAddress(tablePatientsTable.getValueAt(rowTable, 9).toString());
        patient.setObservations(tablePatientsTable.getValueAt(rowTable, 10).toString());

        return patient;

    }

    /**
     * Inicializa la tabla con todos los datos que contiene la tabla patient.
     *
     * @throws SQLException Controla los errores tipo SQL que se pudieran dar
     * por la consulta de la información a la base de datos.
     */
    public void initTablePatientsTable() throws SQLException {

        PatientsService patientService = new PatientsService();
        DefaultTableModel model = patientService.showInformation(this);
        tablePatientsTable.setModel(model);

    }

    /**
     * Establece la tabla según los valores ingresados.
     *
     * @param filterPosition Indica la columna donde se va a buscar el texto a
     * buscar.
     * @param searchText Indica el texto a buscar en la tabla ingresada.
     * @throws SQLException Controla los errores tipo SQL que se pudieran dar
     * por la consulta de la información.
     *
     */
    private void setTableByTheFilter(int filterPosition, String searchText) throws SQLException {

        PatientsService patientsService = new PatientsService();
        DefaultTableModel model = null;

        switch (filterPosition) {

            case 0:
                model = patientsService.showInformationBy("id_patient", searchText, this);
                break;

            case 1:
                model = patientsService.showInformationBy("name_patient", searchText, this);
                break;

            case 2:
                model = patientsService.showInformationBy("first_lastname_patient", searchText, this);
                break;

            case 3:
                model = patientsService.showInformationBy("second_lastname_patient", searchText, this);
                break;

            case 4:
                model = patientsService.showInformationBy("nationality_patient", searchText, this);
                break;

            case 5:
                model = patientsService.showInformationBy("teststatus_patient", searchText, this);
                break;

        }

        tablePatientsTable.setModel(model);

    }

    /**
     * Crea un objeto de tipo Patient y rellena sus atributos con el método
     * getPatientData(), luego realiza la eliminación del registro.
     *
     * @throws SQLException Controla los errores tipo SQL que se pudieran dar
     * por la eliminación del registro de la base de datos.
     */
    private void removePatient() throws SQLException {

        PatientsService patientsService = new PatientsService();
        Patient patient = getPatientData();
        patientsService.deletePatient(patient, this);

    }

    /**
     * Establece la tabla con toda la información de la base de datos si el
     * campo del texto a buscar está vacío. Si el texto a buscar no está vacío
     * toma el filtro para poder decidir en cual tabla buscar el texto.
     *
     * @param evt
     */
    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed

        lockComponents();

        String searchText = StringUtils.capitalize(textFieldSearchBar.getText());
        int filterPosition = comboBoxSearchFilter.getSelectedIndex();

        textFieldSearchBar.setText(searchText);

        if (textFieldSearchBar.getText().equals("")) {

            try {
                initTablePatientsTable();
            } catch (SQLException ex) {
                Logger.getLogger(PatientSearch.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            try {
                setTableByTheFilter(filterPosition, searchText);
            } catch (SQLException ex) {
                Logger.getLogger(PatientSearch.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_buttonSearchActionPerformed

    private void textFieldSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSearchBarActionPerformed
        textFieldSearchBar.transferFocus();
    }//GEN-LAST:event_textFieldSearchBarActionPerformed

    private void comboBoxSearchFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSearchFilterActionPerformed
        comboBoxSearchFilter.transferFocus();
    }//GEN-LAST:event_comboBoxSearchFilterActionPerformed

    /**
     * Cierra este formulario e instancia uno nuevo de tipo Menu, y lo hace
     * visible.
     *
     * @param evt
     */
    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed

        this.dispose();

        Menu formMenu = new Menu(this, this.user);
        formMenu.setVisible(true);

    }//GEN-LAST:event_buttonExitActionPerformed

    /**
     * Lanza un mensaje de confirmación al presionar el botón eliminar para
     * eliminar o no el registro seleccionado de la tabla. Al eliminar el
     * registro lanza la confirmación y en el caso contrario también.
     *
     * @param evt
     */
    private void buttonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveActionPerformed

        int option = JOptionPane.showConfirmDialog(this,
                "Desea eliminar al paciente?", "", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.YES_NO_OPTION);

        if (option == 0) {

            try {

                removePatient();
                initTablePatientsTable();

            } catch (SQLException ex) {
                Logger.getLogger(PatientSearch.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Paciente no eliminado.");
        }

    }//GEN-LAST:event_buttonRemoveActionPerformed

    /**
     * Crea un objeto de tipo Patient y rellena sus atributos con el método
     * getPatientData(), luego instancia un formulario de tipo PatientModify
     * pasandole este formulario y el objeto creado al constructor, al
     * formulario creado lo hace visible.
     *
     * @param evt
     */
    private void buttonModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModifyActionPerformed

        try {

            Patient patient = getPatientData();

            PatientModify formPatientModify = new PatientModify(this, patient);
            formPatientModify.setVisible(true);

        } catch (ParseException ex) {
            Logger.getLogger(PatientSearch.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_buttonModifyActionPerformed

    /**
     * Desbloquea los botones modificar y eliminar cuando presiona alguna celda
     * la tabla.
     *
     * @param evt
     */
    private void tablePatientsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePatientsTableMouseClicked
        unlockComponents();
    }//GEN-LAST:event_tablePatientsTableMouseClicked

    /**
     * Bloquea los botones modificar y eliminar cuando presiona la selección de
     * filtro de la búsqueda.
     *
     * @param evt
     */
    private void comboBoxSearchFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxSearchFilterMouseClicked
        lockComponents();
    }//GEN-LAST:event_comboBoxSearchFilterMouseClicked

    /**
     * Bloquea los botones modificar y eliminar cuando presiona la barra de
     * búsqueda.
     *
     * @param evt
     */
    private void textFieldSearchBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldSearchBarMouseClicked
        lockComponents();
    }//GEN-LAST:event_textFieldSearchBarMouseClicked
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
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new PatientSearch().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(PatientSearch.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonModify;
    private javax.swing.JButton buttonRemove;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JComboBox<String> comboBoxSearchFilter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelSearchFilter;
    private javax.swing.JPanel panelBackgroundAbove;
    private javax.swing.JPanel panelBackgroundBelow;
    private javax.swing.JTable tablePatientsTable;
    private javax.swing.JTextField textFieldSearchBar;
    // End of variables declaration//GEN-END:variables
}
