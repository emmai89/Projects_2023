package projects_2023.Pieces;

import projects_2023.Reference;

public class Queen extends Piece{

    public Queen(String name, int x, int y, boolean team) {
        super(name, x, y, team, 20);

        if (team == Reference.BLACK) {
            image = Reference.generatImage(147, 141, 10, 20);
        } else {
            image = Reference.generatImage(147, 141+32, 10, 20);
        }
    }

}