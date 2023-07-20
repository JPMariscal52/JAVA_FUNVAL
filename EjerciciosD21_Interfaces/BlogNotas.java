package graficos;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class BlogNotas extends JFrame implements ActionListener {

    private JTextArea textArea;
    private JButton guardarButton;
    private JButton editarButton;
    private JButton eliminarButton;
    private JComboBox<String> notasComboBox;

    private List<String> notasGuardadas;

    //---Clase de la interfaz grafica
    public BlogNotas() {
    	
    	//--Ventana principal de la interfaz
    	setAlwaysOnTop(true);
        setTitle("Blog de Notas Funval Java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        
        //---Lista para notas
        notasGuardadas = new ArrayList<>();
        getContentPane().setLayout(null);
        
        //---Area de texto con Scrooll Panel
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(0, 33, 384, 206);
        getContentPane().add(scrollPane);

        guardarButton = new JButton("Guardar");
        guardarButton.setFont(new Font("Arial", Font.BOLD, 11));
        guardarButton.addActionListener(this);

        editarButton = new JButton("Editar");
        editarButton.setFont(new Font("Arial", Font.BOLD, 11));
        editarButton.addActionListener(this);

        eliminarButton = new JButton("Eliminar");
        eliminarButton.setFont(new Font("Arial", Font.BOLD, 11));
        eliminarButton.addActionListener(this);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setBounds(0, 0, 384, 33);
        buttonsPanel.add(guardarButton);
        buttonsPanel.add(editarButton);
        buttonsPanel.add(eliminarButton);
        getContentPane().add(buttonsPanel);

        notasComboBox = new JComboBox<>();
        notasComboBox.setFont(new Font("Arial", Font.BOLD, 11));
        notasComboBox.setBounds(0, 239, 384, 22);
        getContentPane().add(notasComboBox);
        notasComboBox.addActionListener(this);

        cargarNotasGuardadas();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                BlogNotas blogDeNotas = new BlogNotas();
                blogDeNotas.setVisible(true);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == guardarButton) {
            guardarNota();
        } else if (e.getSource() == editarButton) {
            editarNota();
        } else if (e.getSource() == eliminarButton) {
            eliminarNota();
        } else if (e.getSource() == notasComboBox) {
            cargarNotaSeleccionada();
        }
    }

    private void guardarNota() {
        String nota = textArea.getText();
        notasGuardadas.add(nota);
        notasComboBox.addItem("Nota " + notasGuardadas.size());
        JOptionPane.showMessageDialog(this, "Nota guardada exitosamente");
        limpiarTextArea();
    }

    private void editarNota() {
        int indiceNota = notasComboBox.getSelectedIndex();
        if (indiceNota >= 0) {
            String notaSeleccionada = notasComboBox.getSelectedItem().toString();
            String nuevaNota = textArea.getText();
            notasGuardadas.set(indiceNota, nuevaNota);
            JOptionPane.showMessageDialog(this, "Nota editada exitosamente");
            cargarNotasGuardadas();
            notasComboBox.setSelectedItem(notaSeleccionada);
        } else {
            JOptionPane.showMessageDialog(this, "No hay nota seleccionada");
        }
    }

    private void eliminarNota() {
        int indiceNota = notasComboBox.getSelectedIndex();
        if (indiceNota >= 0) {
            String notaSeleccionada = notasComboBox.getSelectedItem().toString();
            notasGuardadas.remove(indiceNota);
            JOptionPane.showMessageDialog(this, "Nota eliminada exitosamente");
            cargarNotasGuardadas();
            limpiarTextArea();
        } else {
            JOptionPane.showMessageDialog(this, "No hay nota seleccionada");
        }
    }

    private void cargarNotaSeleccionada() {
        int indiceNota = notasComboBox.getSelectedIndex();
        if (indiceNota >= 0) {
            String notaSeleccionada = notasGuardadas.get(indiceNota);
            textArea.setText(notaSeleccionada);
        }
    }

    private void cargarNotasGuardadas() {
        notasComboBox.removeAllItems();
        for (int i = 0; i < notasGuardadas.size(); i++) {
            notasComboBox.addItem("Nota " + (i + 1));
        }
    }

    private void limpiarTextArea() {
        textArea.setText("");
    }
}

