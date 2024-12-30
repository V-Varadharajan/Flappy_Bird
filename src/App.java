
import javax.swing.JFrame;


public class App {
    public static void main(String[] args) throws Exception {
        
        int Borderwidth = 360;
        int Borderheight = 640;

        JFrame frame = new JFrame("Flappy bird");
        frame.setVisible(true);

        frame.setSize(Borderwidth,Borderheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
