import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class conversor {

    public static void main(String[] args) {
// convertir monedas al ejecutar este programa
        boolean continuarPrograma = true;

        while (continuarPrograma) {

            String[] options = { "Quetzales a Euros", "Quetzales a Dólares", "Quetzales a Libras Esterlinas", "Quetzales a Yen",
                    "Quetzales a Won" };
            String choice = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                    "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            String input = JOptionPane.showInputDialog("Ingrese la cantidad en quetzales: ");
            double quetzales;
            try {
                quetzales = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido.");
                return;
            }
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");

            if (choice.equals("Quetzales a Dólares")) {
                double dollars = quetzales / 7.75;
                JOptionPane.showMessageDialog(null,
                        quetzales + " quetzales son " + FormatearDecimal.format(dollars) + " dólares");
            } else if (choice.equals("Quetzales a Euros")) {
                double euros = quetzales / 8.40;
                JOptionPane.showMessageDialog(null, quetzales + " quetzales son " + euros + " euros.");
            } else if (choice.equals("Quetzales a Libras Esterlinas")) {
                double pounds = quetzales / 9.92;
                JOptionPane.showMessageDialog(null, quetzales + " quetzales son " + pounds + " libras esterlinas.");
            } else if (choice.equals("Quetzales a Yen")) {
                double yen = quetzales / 20.75;
                JOptionPane.showMessageDialog(null, quetzales + " quetzales son " + yen + " yenes japoneses.");
            } else if (choice.equals("Quetzales a Won")) {
                double won = quetzales / 177.84;
                JOptionPane.showMessageDialog(null, quetzales + " quetzales son " + won + " wones surcoreanos.");
            }
            
            int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                continuarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
            }
        }

    }
}