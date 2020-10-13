package game;

import gameoflife.GameOfLifeBoard;

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        int j = super.getHeight(); //rows
        int k = super.getWidth();  //columns
        double percentage = (j * k) * d;
        int percent = (int) percentage;
        int p = percent / j;

        if (d == 0.0) {
            for (int i = 0; i < j; i++) {
                for (int l = 0; l < k; l++) {
                    turnToDead(l, i);
                }
            }

        } else if (d == 1.0) {
            for (int i = 0; i < j; i++) {
                for (int l = 0; l < k; l++) {
                    turnToLiving(l, i);
                }
            }
        } else {
            for (int i = 0; i < j; i++) {
                for (int l = 0; l < p; l++) {
                    turnToLiving(i, l);
                }
            }
        }
    }

    @Override
    public boolean isAlive(int i, int i1) {

        int j = super.getHeight() - 1;
        int k = super.getWidth() - 1;

        if (i < 0 || i1 < 0) {

            return false;
        } else if (i > k || i1 > j) {
            return false;
        }

        return super.getBoard()[i][i1];
    }

    @Override
    public void turnToLiving(int i, int i1) {

        int j = super.getHeight() - 1;
        int k = super.getWidth() - 1;

        if (i < 0 || i1 < 0) {

        } else if (i > k || i1 > j) {

        } else {

            super.getBoard()[i][i1] = true;

        }
    }

    @Override
    public void turnToDead(int i, int i1) {
        int j = super.getHeight() - 1;
        int k = super.getWidth() - 1;

        if (i < 0 || i1 < 0) {

        } else if (i > k || i1 > j) {

        } else {

            super.getBoard()[i][i1] = false;

        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int m = 0;

        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = i1 - 1; l <= i1 + 1; l++) {
                if (isAlive(k, l)) {
                    m += 1;
                }
            }
        }

        if (isAlive(i, i1)) {
            m = m - 1;
        }

        return m;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {

        if (getNumberOfLivingNeighbours(i, i1) < 2) {
            turnToDead(i, i1);
        }
        else if(getNumberOfLivingNeighbours(i, i1)>3){
            turnToDead(i, i1);
        }
        else if(getNumberOfLivingNeighbours(i, i1)==3){
            turnToLiving(i, i1);
        }

    }

}
