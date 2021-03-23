package OBJECT_MASKING.ui;

import javax.swing.*;


public class GraphicInterface extends JFrame {


    public GraphicInterface() {
        super("Главное окно");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 320);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GraphicInterface::new);
    }
}

