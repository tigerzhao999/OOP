/*
 * Created on May 24, 2004
 *
 * Latest update on April 21, 2011
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.math.*;

import javax.swing.JButton;
import javax.swing.JComponent;


// Note that the JComponent is set up to listen for mouse clicks
// and mouse movement.  To achieve this, the MouseListener and
// MousMotionListener interfaces are implemented and there is additional
// code in init() to attach those interfaces to the JComponent.


public class Display extends JComponent implements MouseListener, MouseMotionListener {
    public static final int ROWS = 300;
    public static final int COLS = 300;
    public static Cell[][] cell = new Cell[ROWS][COLS];
    private final int X_GRID_OFFSET = 25; // 25 pixels from left
    private final int Y_GRID_OFFSET = 40; // 40 pixels from top
    private final int CELL_WIDTH = 5;
    private final int CELL_HEIGHT = 5;


    // Note that a final field can be initialized in constructor
    private final int DISPLAY_WIDTH;
    private final int DISPLAY_HEIGHT;
    private StartButton startStop;
    private RButton randOm;
    private boolean paintloop = false;



    public Display(int width, int height) {
        DISPLAY_WIDTH = width;
        DISPLAY_HEIGHT = height;
        init();
    }


    public void init() {
        setSize(DISPLAY_WIDTH, DISPLAY_HEIGHT);
        initCells();

        addMouseListener(this);
        addMouseMotionListener(this);

        // Example of setting up a button.
        // See the StartButton class nested below.
        startStop = new StartButton();
        startStop.setBounds(105, 1000, 100, 36);
        add(startStop);
        startStop.setVisible(true);
        repaint();
        randOm = new RButton();
        randOm.setBounds(0, 1000, 100, 36);
        add(randOm);
        randOm.setVisible(true);
        repaint();
    }


    public void paintComponent(Graphics g) {
        final int TIME_BETWEEN_REPLOTS = 1; // change to your liking

        g.setColor(Color.BLACK);
        drawGrid(g);
        drawCells(g);
        drawButtons();

        if (paintloop) {
            try {
                Thread.sleep(TIME_BETWEEN_REPLOTS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            nextGeneration();
            repaint();
        }
    }


    public void initCells() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                cell[row][col] = new Cell(row, col);
            }
        }
        cell[36][22].setAlive(true); // sample use of cell mutator method
        cell[36][23].setAlive(true); // sample use of cell mutator method
        cell[36][24].setAlive(true); // sample use of cell mutator method
        cell[35][24].setAlive(true); // sample use of cell mutator method
        cell[34][23].setAlive(true); // sample use of cell mutator method



    }


    public void togglePaintLoop() {
        paintloop = !paintloop;
    }


    public void setPaintLoop(boolean value) {
        paintloop = value;
    }


    void drawGrid(Graphics g) {
        for (int row = 0; row <= ROWS; row++) {
            g.drawLine(X_GRID_OFFSET,
                    Y_GRID_OFFSET + (row * (CELL_HEIGHT + 1)), X_GRID_OFFSET
                            + COLS * (CELL_WIDTH + 1), Y_GRID_OFFSET
                            + (row * (CELL_HEIGHT + 1)));
        }
        for (int col = 0; col <= COLS; col++) {
            g.drawLine(X_GRID_OFFSET + (col * (CELL_WIDTH + 1)), Y_GRID_OFFSET,
                    X_GRID_OFFSET + (col * (CELL_WIDTH + 1)), Y_GRID_OFFSET
                            + ROWS * (CELL_HEIGHT + 1));
        }
    }


    void drawCells(Graphics g) {
        // Have each cell draw itself
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                // The cell cannot know for certain the offsets nor the height
                // and width; it has been set up to know its own position, so
                // that need not be passed as an argument to the draw method
                cell[row][col].draw(X_GRID_OFFSET, Y_GRID_OFFSET, CELL_WIDTH,
                        CELL_HEIGHT, g);
            }
        }
    }


    private void drawButtons() {
        startStop.repaint();
    }

    private void nextGeneration() {

        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell[0].length; j++) {
                cell[i][j].calcNeighbors(cell);
                //System.out.println("i=" + i + " j=" + j + "  Neighbors=" + cell[i][j].getNeighbors());
            }
        }
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell[0].length; j++) {
                cell[i][j].setAlive(cell[i][j].getAliveNextTurn());
            }
        }
        repaint();
    }
    public void mouseClicked(MouseEvent arg0) {
        cell[0][0].setAlive(true);
        cell[6][2].setAlive(true); // sample use of cell mutator method
        cell[6][3].setAlive(true); // sample use of cell mutator method
        cell[6][4].setAlive(true); // sample use of cell mutator method
        cell[5][4].setAlive(true); // sample use of cell mutator method
        cell[4][3].setAlive(true); // sample use of cell mutator method

    }


    public void mouseEntered(MouseEvent arg0) {

    }


    public void mouseExited(MouseEvent arg0) {

    }


    public void mousePressed(MouseEvent arg0) {

    }


    public void mouseReleased(MouseEvent arg0) {

    }


    public void mouseDragged(MouseEvent arg0) {

    }


    public void mouseMoved(MouseEvent arg0) {

    }
    public void randomCells() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                double random = Math.random();
                if(random <= 0.5)
                    cell[row][col].setAlive(true);
                else{
                    cell[row][col].setAlive(false);
                }
            }
        }
        repaint();
    }


    private class StartButton extends JButton implements ActionListener {
        StartButton() {
            super("Start");
            addActionListener(this);
        }



        public void actionPerformed(ActionEvent arg0) {
            nextGeneration(); // test the start button
            if (this.getText().equals("Start")) {
                togglePaintLoop();
                setText("Stop");
            } else {
                togglePaintLoop();
                setText("Start");
            }
            repaint();
        }
    }
    private class RButton extends JButton implements ActionListener {
        RButton() {
            super("Random");
            addActionListener(this);
        }


        public void actionPerformed(ActionEvent arg0) {
            randomCells();
            repaint();
        }
    }

}
