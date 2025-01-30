package implementajmenu;
import javax.swing.*;
import java.awt.event.*;
public class ImplementaJMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de JMenu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem salir = new JMenuItem("Salir");
        menuArchivo.add(abrir);
        menuArchivo.add(guardar);
        menuArchivo.addSeparator();
        menuArchivo.add(salir);
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JMenu menuAyuda = new JMenu("Ayuda");
        JMenuItem acercaDe = new JMenuItem("Acerca de");
        menuAyuda.add(acercaDe);
        JMenu subMenu = new JMenu("Documentación");
        JMenuItem manual = new JMenuItem("Manual de Usuario");
        JMenuItem tutorial = new JMenuItem("Tutorial");
        subMenu.add(manual);
        subMenu.add(tutorial);
        menuAyuda.add(subMenu);
        menuBar.add(menuArchivo);
        menuBar.add(menuAyuda);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
