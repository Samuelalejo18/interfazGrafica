package presentacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame{
    private JPanel pnlCodigo;
    private JLabel lblCodigo;
    private JTextField txtCodigo;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblApellido;
    private JTextField txtApellido;
    private JButton btnGuardar;
    private JLabel lblIdioma;
    private JComboBox comboBox1;

    public IngresarPersona(){
        this.setTitle("Ingresar Persona");
        this.setVisible(true);

        this.setSize(400,300);
        this.setContentPane(pnlCodigo);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo= txtCodigo.getText();
                String nombre= txtNombre.getText();
                String apellido= txtApellido.getText();
                String mensaje = "Tus datos son: \n"+ "Codigo:"+ codigo+"\n"+ "Nombre:"+ nombre+"\n"+ "Apellido:"+apellido+"\n";
                JOptionPane.showMessageDialog(btnGuardar,mensaje);
            }
        });
    }
}
