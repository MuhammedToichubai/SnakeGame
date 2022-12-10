import javax.swing.*;

//игровая рамка
public class GameFrame extends JFrame {
    //game snake
    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
//        this.setLocationRelativeTo();

    }
}
