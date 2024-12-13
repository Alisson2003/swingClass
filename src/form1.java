import javax.swing.*;

public class form1 {
    private JTextField TextField;
    private JTextField TextField2;
    private JButton areaCirculo;
    public JPanel mainPanel;
    private JTextField lblTotal;
    private JButton areaCuadrado;
    private JButton areaTriangulo;
    private JButton areaRectangulo;
    private JButton areaTrapecio;
    private JButton perimetroCuadradoButton;
    private JButton perimetroTrianguloButton;
    private JButton perimetroCirculoButton;
    private JButton perimetroRectanguloButton;
    private JButton perimetroTrapecioButton;
    private JTextField TextField3;
    private JTextField lblAltura;
    private JTextField textField4;

    public form1() {
        areaCirculo.addActionListener(e -> {
        double radio = getDoubleFromTextField(TextField);
        lblTotal.setText("" + (Math.PI * radio * radio));
        });

        areaCuadrado.addActionListener(e -> {
            double lado = getDoubleFromTextField(TextField);
            lblTotal.setText("" + (lado * lado));
        });

        areaTriangulo.addActionListener(e -> {
            double base = getDoubleFromTextField(TextField);
            double altura = getDoubleFromTextField(TextField2);
            lblTotal.setText("" + ((base * altura) / 2));
        });

        areaRectangulo.addActionListener(e -> {
            double base = getDoubleFromTextField(TextField);
            double altura = getDoubleFromTextField(TextField2);
            lblTotal.setText("" + (base * altura));
        });

        areaTrapecio.addActionListener(e -> {
            double baseMayor = getDoubleFromTextField(TextField);
            double baseMenor = getDoubleFromTextField(TextField2);
            double altura = getDoubleFromTextField(lblAltura);
            lblTotal.setText("" + ((baseMayor + baseMenor) * altura / 2));
        });

        perimetroCuadradoButton.addActionListener(e -> {
            double lado = getDoubleFromTextField(TextField);
            lblTotal.setText("" + (4 * lado));
        });

        perimetroTrianguloButton.addActionListener(e -> {
            double lado = getDoubleFromTextField(TextField);
            lblTotal.setText("" + (3 * lado));
        });

        perimetroCirculoButton.addActionListener(e -> {
            double radio = getDoubleFromTextField(TextField);
            lblTotal.setText("" + (2 * Math.PI * radio));
        });

        perimetroRectanguloButton.addActionListener(e -> {
            double base = getDoubleFromTextField(TextField);
            double altura = getDoubleFromTextField(TextField2);
            lblTotal.setText("" + 2 * (base + altura));
        });

        perimetroTrapecioButton.addActionListener(e -> {
            double lado1 = getDoubleFromTextField(TextField);
            double lado2 = getDoubleFromTextField(TextField2);
            double lado3 = getDoubleFromTextField(TextField3);
            double lado4 = getDoubleFromTextField(textField4);
            lblTotal.setText("" +(lado1 + lado2 + lado3 + lado4));
        });
        }

        private double getDoubleFromTextField(JTextField textField) {
            try {
                return Double.parseDouble(textField.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(mainPanel, "Por favor ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                return 0;
            }
        }

        private double requestExtraInput(String message) {
            String input = JOptionPane.showInputDialog(mainPanel, message);
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(mainPanel, "Entrada inválida. Usando valor 0.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return 0;
            }
    }
}
