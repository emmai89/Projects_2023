package projects_2023.Pieces;

import projects_2023.Reference;

public class Pawn extends Piece{

    private boolean moved;


    public Pawn(String name, int x, int y, boolean team) {
        super(name, x, y, team, 14);
        distance = 2;
        jump = false;
        moved = false;

        if (team == Reference.BLACK) {
            image = Reference.generatImage(99, 147, 10, 14);
        } else {
            image = Reference.generatImage(99, 147+32, 10, 14);
        }
    }

    @Override
    public void setPosition(int x, int y) {
        super.setPosition(x, y);
        moved = true;
    }

    @Override
    protected void setMoves() {
        super.setMoves();
        if (!moved){
            int y = getPosition()[1] - 2;
            int arr[] = {getPosition()[0],y};
            moves.addLast(arr);
        }
    }
}
