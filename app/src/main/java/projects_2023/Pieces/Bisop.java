package projects_2023.Pieces;

import projects_2023.Reference;

public class Bisop extends Piece{

    public Bisop(String name, int x, int y, boolean team) {
        super(name, x, y, team,19);

        if (team == Reference.BLACK) {
            image = Reference.generatImage(83, 142, 10, 19);
        } else {
            image = Reference.generatImage(83, 142+32, 10, 19);
        }        
    }

}