package com.example.projects.demo.Model;

public class Ship {
    private Field[] fields; //This information has the length, direction and coordinates of the ship
    private Board board;
    private ShipType type;
    private boolean sunk;
    

    public Ship(int x, int y, boolean isHorizontal, Board board, ShipType type) {
        try {
            this.board = board;
            this.type = type;
            this.fields = new Field[type.getLength()]; //Instantiate new arry
            for (int i = 0; i < this.fields.length; i++) { //Fill the array
                if (isHorizontal) this.fields[i] = board.getFields()[x][y++];
                else this.fields[i] = board.getFields()[x++][y];
            }
        } catch (Exception e) {
            //TODO Error handling when ship badly placed
        }
    }

    public void checkSunk() {
        for (Field f : fields) { //Check along the ship if there is a non-hit field
            if (!f.isShot()) this.sunk = false;
        }
        if(this.sunk) {
            //this.board.checkGameOver();
            //Test Comment
        }
    }
}
