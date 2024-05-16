import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {
        Object[] itens = { "Soma", "Subtração", "Multiplicação", "Divisão" };
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Selecione a operaçao que deseja fazer", "Calculadora",
                JOptionPane.INFORMATION_MESSAGE, null,
                itens, itens [0]);

        if (selectedValue == "Soma") {
            String inputValue1 = JOptionPane.showInputDialog("Digite o primeiro valor");
            String inputValue2 = JOptionPane.showInputDialog("Agora digite o segundo valor a ser somado");
            double resultado = Double.valueOf(inputValue1.replace(",", ".")).doubleValue() + Double.valueOf(inputValue2.replace(",", ".")).doubleValue();
            JOptionPane.showMessageDialog(null, "Resultado: A soma é igual a " + resultado,
                    "Calculadora", JOptionPane.INFORMATION_MESSAGE);
        }

        if (selectedValue == "Subtração") {
            String inputValue1 = JOptionPane.showInputDialog("Digite o valor do minuendo");
            inputValue1.replaceAll(",", ".");
            String inputValue2 = JOptionPane.showInputDialog("Agora digite o valor do subtraendo");
            inputValue2.replaceAll(",", ".");
            double resultado = Double.valueOf(inputValue1.replace(",", ".")).doubleValue() - Double.valueOf(inputValue2.replace(",", ".")).doubleValue();
            JOptionPane.showMessageDialog(null, "Resultado: A subtração é igual a " + resultado,
                    "Calculadora", JOptionPane.INFORMATION_MESSAGE);
        }

        if (selectedValue == "Multiplicação") {
            String inputValue1 = JOptionPane.showInputDialog("Digite o primeiro valor");
            inputValue1.replaceAll(",", ".");
            String inputValue2 = JOptionPane.showInputDialog("Agora digite o segundo valor");
            inputValue2.replaceAll(",", ".");
            double resultado = Double.valueOf(inputValue1.replace(",", ".")).doubleValue() * Double.valueOf(inputValue2.replace(",", ".")).doubleValue();
            JOptionPane.showMessageDialog(null, "Resultado: A multiplicação é igual a " + resultado,
                    "Calculadora", JOptionPane.INFORMATION_MESSAGE);
        }

        if (selectedValue == "Divisão") {
            String inputValue1 = JOptionPane.showInputDialog("Digite o valor do dividendo");
            inputValue1.replaceAll(",", ".");
            String inputValue2 = JOptionPane.showInputDialog("Agora digite o valor do divisor");
            inputValue2.replaceAll(",", ".");
            double resultado = Double.valueOf(inputValue1.replace(",", ".")).doubleValue() / Double.valueOf(inputValue2.replace(",", ".")).doubleValue();
            JOptionPane.showMessageDialog(null, "Resultado: A divisão é igual a " + resultado,
                    "Calculadora", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
