package implementajoptionpane;
import javax.swing.*;
public class ImplementaJOptionPane {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "¡Bienvenido al ejemplo de JOptionPane!", "Mensaje de Información", JOptionPane.INFORMATION_MESSAGE);
        String input = JOptionPane.showInputDialog(null, "Por favor ingrese su nombre:", "Entrada de Texto", JOptionPane.QUESTION_MESSAGE);
        if (input != null && !input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hola, " + input + "!", "Saludo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No ingresaste un nombre.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        int option = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Has elegido continuar.", "Confirmación Aceptada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Has elegido no continuar.", "Confirmación Rechazada", JOptionPane.INFORMATION_MESSAGE);
        }
        Object[] options = {"Opción 1", "Opción 2", "Opción 3"};
        int choice = JOptionPane.showOptionDialog(null, "Elige una opción:", "Opciones Personalizadas", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        JOptionPane.showMessageDialog(null, "Seleccionaste: " + options[choice], "Opción Seleccionada", JOptionPane.INFORMATION_MESSAGE);
    }
}
