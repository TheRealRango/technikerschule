package its.sw;

/**
 *
 * @author Oliver Schwahlen
 */
public class Controller {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }
}
