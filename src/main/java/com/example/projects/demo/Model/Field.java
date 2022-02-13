package com.example.projects.demo.Model;


public class Field {
    private int xCoord;
    private int yCoord;

    public int[] getCoordinates() {
        return new int[] {xCoord, yCoord};
    }

    private boolean shot;
    private boolean hasShip; //Helper
    private Ship ship;

    public Field(int x, int y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    public boolean shoot() {
        this.shot = true;
        // if (this.ship != null) this.ship.checkSunk();
        return this.ship != null;
    }

    public boolean isShot() {
        return this.shot;
    }

    public void setShip(Ship s) {
        this.ship = s;
    }

    public char printField(boolean ownBoard) { //TODO better name
        if(!this.shot && !this.hasShip) return 'W';
        if(!this.shot && this.hasShip) return ownBoard ? 'S' : 'W';
        if(this.shot && !this.hasShip) return 'X';
        if(this.shot && this.hasShip) return 'T';
        return 'D'; //If D is returned, something went wrong
    }
}
/*
W for empty
T for hit ship
S for nonhit ship
X for Miss
D for default
*/