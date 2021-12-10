import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Змейка версия 1.0");
        Image image = Toolkit.getDefaultToolkit().getImage("src/dot.png");
        setIconImage(image);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(368,390);
        setLocation(100,100);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw= new MainWindow();

    }
}
