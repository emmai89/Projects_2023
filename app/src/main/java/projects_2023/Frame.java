package projects_2023;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.Component;
import java.awt.event.MouseEvent;


public class Frame extends JFrame{
    private int width;
    private int height;
    private MyMouseListener listener;
    private Board board;

    public Frame(int width, int height){
        this.width = width;
        this.height = height;
        listener  = new MyMouseListener();

        board = new Board();

        
    }

    public void setUpGUI() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width,height);
        // setLocationRelativeTo(null);
        setTitle("Chess Game");

        JPanel contentPane = (JPanel) getContentPane();
        board.displayBoard(this, listener, contentPane);
        
        //add(panel);
        //add(label);
        //add(button);
        //button.addActionListener(mal);


        setVisible(true);
        }



    /**
     * MyActionListener
     */
    public class MyMouseListener implements MouseListener{

        private JLabel previous;

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Clicked");
            Component source = e.getComponent();

            if (!(source instanceof JLabel)) {
                return;
            }
            JLabel label = (JLabel) source;
            if (previous != null) {
                previous.setBackground(null);
                previous.setForeground(null);
                previous.setOpaque(false);
            }
            previous = label;
            label.setForeground(Color.WHITE);
            label.setBackground(Color.BLUE);
            label.setOpaque(true);

            for (int i = 0; i < board.getWhiteLabels().length; i++) {
                if (label == board.getWhiteLabels()[i])
                {
                    board.getWhitPieces()[i].getHeight();
                }
            }  

        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            System.out.println("Pressed");

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("Entered");

            Component source = e.getComponent();

            if (!(source instanceof JLabel)) {
                return;
            }
            JLabel label = (JLabel) source;

            for (int i = 0; i < board.getWhiteLabels().length; i++) {
                if (label == board.getWhiteLabels()[i])
                {
                    label.setForeground(Color.WHITE);
                    label.setBackground(Color.BLUE);
                    label.setOpaque(true);
                }
            }  
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("Exited");

            Component source = e.getComponent();

            if (!(source instanceof JLabel)) {
                return;
            }
            JLabel label = (JLabel) source;

            if (previous == label) {
                return;
            }

            for (int i = 0; i < board.getWhiteLabels().length; i++) {
                if (label == board.getWhiteLabels()[i])
                {
                    label.setBackground(null);
                    label.setForeground(null);
                    label.setOpaque(false);
                }
            }            
        }

    }
}
