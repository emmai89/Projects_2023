package projects_2023;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Dimension;
import java.awt.Graphics;
//import java.awt.Graphics2D;

// import java.awt.event.ActionListener;
// import java.awt.event.ActionEvent;

public class MyPanel extends JPanel {
  
    private ImageIcon image;

    MyPanel(){
        setPreferredSize(new Dimension(1000,600));

        new Board();
        image = new ImageIcon(getClass().getClassLoader().getResource("SingleFile.png"));
        new JLabel(image);

    }

    @Override
    public void paint(Graphics g) {
        //Graphics2D g2D = (Graphics2D)g;

        //board.displayBoard(this, g2D, listener);
        //add(new JLabel(board.getImage()));
        
    }
}

