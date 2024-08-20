package unidad.poo.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestSwing {

	public static void main(String[] args) {
        // Crear el marco principal
        JFrame frame = new JFrame("Aplicación Simple con Java Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Crear el menú
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem menuItemFormulario = new JMenuItem("Formulario");
        JMenuItem menuItemTabla = new JMenuItem("Tabla de Resultados");
        
        // Añadir los elementos al menú
        menu.add(menuItemFormulario);
        menu.add(menuItemTabla);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        // Panel principal donde se cargarán los diferentes componentes
        JPanel mainPanel = new JPanel(new CardLayout());
        frame.add(mainPanel);

        // Crear el panel del formulario
        JPanel formularioPanel = new JPanel();
        formularioPanel.setLayout(new GridLayout(5, 2, 10, 10)); // Layout de 5 filas y 2 columnas

        // Añadir campos de entrada al formulario
        JLabel nameLabel = new JLabel("Nombre:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Edad:");
        JTextField ageField = new JTextField();

        JLabel genderLabel = new JLabel("Género:");
        String[] genders = {"Masculino", "Femenino", "Otro"};
        JComboBox<String> genderComboBox = new JComboBox<>(genders);

        JLabel occupationLabel = new JLabel("Ocupación:");
        JTextField occupationField = new JTextField();

        JButton submitButton = new JButton("Enviar");

        // Añadir componentes al panel del formulario
        formularioPanel.add(nameLabel);
        formularioPanel.add(nameField);
        formularioPanel.add(ageLabel);
        formularioPanel.add(ageField);
        formularioPanel.add(genderLabel);
        formularioPanel.add(genderComboBox);
        formularioPanel.add(occupationLabel);
        formularioPanel.add(occupationField);
        formularioPanel.add(new JLabel()); // Espacio vacío para el botón
        formularioPanel.add(submitButton);

        // Crear el panel de la tabla
        JPanel tablaPanel = new JPanel(new BorderLayout());

        // Datos de ejemplo para la tabla
        String[] columnNames = {"Columna 1", "Columna 2", "Columna 3"};
        Object[][] data = {
            {"Dato 1", "Dato 2", "Dato 3"},
            {"Dato 4", "Dato 5", "Dato 6"},
            {"Dato 7", "Dato 8", "Dato 9"}
        };

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        tablaPanel.add(scrollPane, BorderLayout.CENTER);

        // Añadir los paneles al panel principal
        mainPanel.add(formularioPanel, "Formulario");
        mainPanel.add(tablaPanel, "Tabla");

        // Manejar los eventos del menú
        menuItemFormulario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "Formulario");
            }
        });

        menuItemTabla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "Tabla");
            }
        });
        
        // Acción del botón "Enviar"
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Recoger los datos del formulario
                String name = nameField.getText();
                String age = ageField.getText();
                String gender = (String) genderComboBox.getSelectedItem();
                String occupation = occupationField.getText();

                // Mostrar los datos en un cuadro de diálogo
                JOptionPane.showMessageDialog(frame,
                        "Nombre: " + name + "\n" +
                        "Edad: " + age + "\n" +
                        "Género: " + gender + "\n" +
                        "Ocupación: " + occupation,
                        "Datos Ingresados",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Mostrar el marco
        frame.setVisible(true);
    }
}
