package projects_2023.Pieces;

import projects_2023.Reference;

public class Rook extends Piece{

    public Rook(String name, int x, int y, boolean team) {
        super(name, x, y, team, 16);

        if (team == Reference.BLACK) {
            image = Reference.generatImage(115, 145, 10, 16);
        } else {
            image = Reference.generatImage(115, 145+32, 10, 16);
        }
    }

}
