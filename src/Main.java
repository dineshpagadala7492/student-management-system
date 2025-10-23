package src;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            GUIForm app = new GUIForm();
            app.setVisible(true);
        });
    }
}
