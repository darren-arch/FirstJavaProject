import javax.swing.JButton;
import javax.swing.JFrame;

public class GFG {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton button = new JButton("My First Frame!!!");

        button.setBounds(150,200,220,50);

        frame.add(button);

        frame.setSize(500, 600);
        
        frame.setLayout(null);

        frame.setVisible(true);
    }
}
