/*
 * Created on Dec 1, 2004
 * Last update: June 24, 2010
 */

import java.awt.Color;
import java.awt.Graphics;

public class Cell {
    private int myX, myY; // x,y position on grid
    private boolean myAlive; // alive (true) or dead (false)
    private int myNeighbors; // count of neighbors with respect to x,y
    private boolean myAliveNextTurn; // Used for state in next iteration
    private final Color DEFAULT_ALIVE = Color.ORANGE;
    private final Color DEFAULT_DEAD = Color.GRAY;

    public Cell(int x, int y) {
        this(x, y, false);
    }

    public Cell(int row, int col, boolean alive) {
        myAlive = alive;
        myX = col;
        myY = row;
    }

    public boolean isAlive() {
        return myAlive;
    }

    public Color getColor() {
        if (myAlive) {
            return DEFAULT_ALIVE;
        } else {
            return DEFAULT_DEAD;
        }
    }

    public int getX() {
        return myX;
    }

    public int getY() {
        return myY;
    }

    public void setAlive(boolean alive) {

        myAlive = alive;
    }

    public void setAliveNextTurn(boolean alive) {
        myAliveNextTurn = alive;
    }

    public boolean getAliveNextTurn() {
        return myAliveNextTurn;
    }

    public int getNeighbors() {
        return myNeighbors;
    }

    public void calcNeighbors(Cell[][] cell) {
        int myX = getX();
        int myY = getY();
        myNeighbors = 0;
        for (int i = -1; i <= 1; i++)
            for (int j = -1; j <= 1; j++) {
                int xindex = (myX + i + cell.length) % cell.length;
                int yindex = (myY + j + cell[0].length) % cell[0].length;
                if (cell[xindex][yindex].isAlive()) {
                    myNeighbors++;
                }
            }
        if (isAlive()) {
            myNeighbors--;
        }
        //Any live cell with fewer than two live neighbours dies, as if caused by under-population.
        if ((isAlive()) && (myNeighbors < 2)) {
            //dead
            setAliveNextTurn(false);
        }
        //Any live cell with two or three live neighbours lives on to the next generation.
        if ((isAlive()) && ((myNeighbors == 2) || (myNeighbors == 3))) {
            //lives on
            setAliveNextTurn(true);
        }
        //Any live cell with more than three live neighbours dies, as if by overcrowding.
        if ((isAlive()) && (myNeighbors > 3)) {
            //rip
            setAliveNextTurn(false);
        }
        //Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
        if (!isAlive() && (myNeighbors == 3)) {
            //revive
            setAliveNextTurn(true);
        }
    }


    public void draw(int x_offset, int y_offset, int width, int height,
                     Graphics g) {
        // I leave this understanding to the reader
        int xleft = x_offset + 1 + (myX * (width + 1));
        int xright = x_offset + width + (myX * (width + 1));
        int ytop = y_offset + 1 + (myY * (height + 1));
        int ybottom = y_offset + height + (myY * (height + 1));
        Color temp = g.getColor();

        g.setColor(getColor());
        g.fillRect(xleft, ytop, width, height);
    }
}