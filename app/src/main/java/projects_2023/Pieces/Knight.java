package projects_2023.Pieces;

import projects_2023.Reference;

public class Knight extends Piece{

    public Knight(String name, int x, int y, boolean team) {
        super(name, x, y, team,17);
        jump = true;

        if (team == Reference.BLACK) {
            image = Reference.generatImage(131, 144, 11, 17);
        } else {
            image = Reference.generatImage(131, 144+32, 11, 17);
        }
    }

}