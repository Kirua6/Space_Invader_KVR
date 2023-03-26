package est.grand;

import javax.swing.*;
import java.awt.*;

public class SpaceInvaders extends JFrame  {

    public SpaceInvaders() {

        initk();
    }

    private void initk() {

        add(new Rencontre());

        setTitle("Space Invaders");
        setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new SpaceInvaders();
            ex.setVisible(true);
        });
    }
}