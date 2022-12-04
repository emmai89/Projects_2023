package projects_2023.Pieces;

import projects_2023.Reference;

public class King extends Piece{

    public King(String name, int x, int y, boolean team) {
        super(name, x, y, team, 23);
        distance = 1;
        jump = false;

        if (team == Reference.BLACK) {
            image = Reference.generatImage(163, 138, 10, 23);
        } else {
            image = Reference.generatImage(163, 138+32, 10, 23);
        }
    }

}