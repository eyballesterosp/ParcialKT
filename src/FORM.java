import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FORM extends JFrame {

    JPanel panelTitulo = new JPanel();
    JPanel panelTexto = new JPanel();
    JPanel panelBotones = new JPanel();
    JLabel labelTitulo = new JLabel("Ingrese Dos Numeros");
    JLabel labelResultado = new JLabel("Su Resultado Es: ");
    JLabel labelResultado2 = new JLabel();
    JTextField textoNumero1 = new JTextField();
    JTextField textoNumero2 = new JTextField();
    JButton botonSuma = new JButton("SUMA");
    JButton botonResta = new JButton("RESTA");
    JButton botonProducto = new JButton("PRODUCTO");
    JButton botonDivision = new JButton("DIVISION");
    JToggleButton tBoton = new JToggleButton("HERE");

    public FORM() {
        super("Formulario De Prueba");
        setSize(415, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        add(labelTitulo);
        add(textoNumero1);
        add(textoNumero2);
        add(botonSuma);
        add(botonResta);
        add(botonProducto);
        add(botonDivision);
        add(labelResultado);
        add(labelResultado2);
        //labelTitulo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        //labelResultado2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        labelTitulo.setBounds(135, 30, 130, 30);
        textoNumero1.setBounds(100, 100, 80, 30);
        textoNumero2.setBounds(220, 100, 80, 30);
        botonSuma.setBounds(10, 190, 70, 30);
        botonResta.setBounds(90, 190, 75, 30);
        botonProducto.setBounds(175, 190, 100, 30);
        botonDivision.setBounds(300, 190, 90, 30);
        labelResultado.setBounds(50, 260, 110, 30);
        labelResultado2.setBounds(150, 260, 60, 30);
        //ESTE ES UN EJEMPLO

        botonSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botonSumaActionPerformed(evt);
            }
        }
        );
        botonResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botonRestaActionPerformed(evt);
            }
        }
        );
        botonProducto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botonProductoActionPerformed(evt);
            }
        }
        );
        botonDivision.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        }
        );

    }

    private void botonSumaActionPerformed(ActionEvent evt) {
        int num1, num2;
        num1 = Integer.parseInt(textoNumero1.getText());
        num2 = Integer.parseInt(textoNumero2.getText());
        labelResultado2.setText(" " + (num1 + num2));
    }

    private void botonRestaActionPerformed(ActionEvent evt) {
        int num1, num2;
        num1 = Integer.parseInt(textoNumero1.getText());
        num2 = Integer.parseInt(textoNumero2.getText());
        labelResultado2.setText(" " + (num1 - num2));
    }

    private void botonProductoActionPerformed(ActionEvent evt) {
        int num1, num2;
        num1 = Integer.parseInt(textoNumero1.getText());
        num2 = Integer.parseInt(textoNumero2.getText());
        labelResultado2.setText(" " + (num1 * num2));
    }

    private void botonDivisionActionPerformed(ActionEvent evt) {
        int num1, num2;
        num1 = Integer.parseInt(textoNumero1.getText());
        num2 = Integer.parseInt(textoNumero2.getText());
        if (num2 == 0) {
            labelResultado2.setText("ERROR");
        } else {
            labelResultado2.setText("" + (num1 / num2));
        }
    }

    public static void main(String Args[]) {
        FORM f = new FORM();
    }

}
