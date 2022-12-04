package projects_2023.Pieces;

import javax.swing.ImageIcon;

import java.util.LinkedList;

public class Piece {
    protected String name;
    protected int[] position;
    protected boolean team;
    protected int distance; 
    protected boolean dead;
    protected boolean jump;
    protected ImageIcon image;
    protected int height;
    protected LinkedList<int[]> moves;

    public Piece(String name, int x, int y, boolean team, int height){
        this.name = name;
        this.position = new int[2];
        this.position[0] = x;
        this.position[1] = y;
        this.team = team;
        this.dead = false;
        this.height = height;
        this.moves = new LinkedList<int[]>();
    }

    public void setPosition(int x, int y) {
        position[0] = x;
        position[1] = y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getPosition() {
        return position;
    }

    public boolean getTeam() {
        return team;
    }

    public boolean isDead() {
        return dead;
    }

    public boolean isJump() {
        return jump;
    }

    public int getDistance() {
        return distance;
    }

    public ImageIcon getImage() {
        return image;
    }
    public int getHeight() {
        return height;
    }

    public LinkedList<int[]> getMoves() {
        return moves;
    }

    protected void setMoves() {
        int x = getPosition()[0];
        int y = getPosition()[1];
        int arr[] = new int[2];
        moves.removeAll(moves);

        for (int i = 0; i < 3; i++) {
            arr[0] = x-1+i;
            for (int j = 0; j < 3; j++) {
                arr[1] = y-1+j;
                moves.add(arr); 
            }
        }
 
    }
}

