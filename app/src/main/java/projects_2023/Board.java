package projects_2023;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import projects_2023.Frame.MyMouseListener;
import projects_2023.Pieces.*;

public class Board {
    
    private Piece[] blackPieces;
    private Piece[] whitPieces;
    private ImageIcon image;
    private JLabel whiteLabels[];
    private JLabel blackLabels[];
    private SpringLayout layout;

    public Board(){
        blackPieces = new Piece[16];
        whitPieces = new Piece[16];
        
        // Pawn Setup
        for (int i = 0; i < 8; i++) {
            blackPieces[i] = new Pawn("Pawn " +(i+1), i, 1, Reference.BLACK);
            whitPieces[i] = new Pawn("Pawn " +(i+1), i, 6, Reference.WHITE);
        }

        // Rook Setup
        blackPieces[8] = new Rook("Rook 1", 0, 0, Reference.BLACK);
        whitPieces[8] = new Rook("Rook 1", 0, 7, Reference.WHITE);

        blackPieces[9] = new Rook("Rook 2", 7, 0, Reference.BLACK);
        whitPieces[9] = new Rook("Rook 2", 7, 7, Reference.WHITE);

        // Knight Setup
        blackPieces[10] = new Knight("Knight 1", 1, 0, Reference.BLACK);
        whitPieces[10] = new Knight("Knight 1", 1, 7, Reference.WHITE);

        blackPieces[11] = new Knight("Knight 2", 6, 0, Reference.BLACK);
        whitPieces[11] = new Knight("Knight 2", 6, 7, Reference.WHITE);

        // Bisop Setup
        blackPieces[12] = new Bisop("Bisop 1", 2, 0, Reference.BLACK);
        whitPieces[12] = new Bisop("Bisop 1", 2, 7, Reference.WHITE);

        blackPieces[13] = new Bisop("Bisop 2", 5, 0, Reference.BLACK);
        whitPieces[13] = new Bisop("Bisop 2", 5, 7, Reference.WHITE);

        // Queen Setup
        blackPieces[14] = new Queen("Queen", 3, 0, Reference.BLACK);
        whitPieces[14] = new Queen("Queen", 3, 7, Reference.WHITE);
        
        // King Setup
        blackPieces[15] = new King("King", 4, 0, Reference.BLACK);
        whitPieces[15] = new King("King", 4, 7, Reference.WHITE);

        image = Reference.generatImage(20, 4, 136, 120);
    }

    public Piece[] getBlackPieces() {
        return blackPieces;
    }

    public Piece[] getWhitPieces() {
        return whitPieces;
    }

    public ImageIcon getImage() {
        return image;
    }

    public JLabel[] getWhiteLabels() {
        return whiteLabels;
    }

    public JLabel[] getBlackLabels() {
        return blackLabels;
    }

    public void displayBoard (Frame panel, MyMouseListener listener, JPanel contentPane)
    {
        blackLabels = new JLabel[16];
        whiteLabels = new JLabel[16];
        layout = new SpringLayout();
        contentPane.setLayout(layout);

        displayCalcs(blackPieces, blackLabels, panel, listener);

        displayCalcs(whitPieces, whiteLabels, panel, listener);

        panel.add(new JLabel(getImage()));

    }

    private void displayCalcs(Piece pieces[], JLabel labels[], Frame panel, MyMouseListener listener)
    {
        for (int i = 0; i < 16; i++) {
            Piece piece = pieces[i];
            int h = piece.getHeight()*4;
            h = h-70;
            labels[i] = new JLabel(piece.getImage());
            labels[i].addMouseListener(listener);

            panel.add(labels[i]);
            layout.putConstraint(SpringLayout.WEST, labels[i], piece.getPosition()[0]*64+28, SpringLayout.WEST, panel);
            layout.putConstraint(SpringLayout.NORTH, labels[i], piece.getPosition()[1]*55-h, SpringLayout.NORTH, panel);

        }
    }
}
