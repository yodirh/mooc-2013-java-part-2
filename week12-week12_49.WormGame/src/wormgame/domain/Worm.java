package wormgame.domain;

import java.util.List;
import java.util.ArrayList;
import wormgame.Direction;

public class Worm {

    private Direction originalDirection;
    private int originalX;
    private int originalY;
    private Piece piece;
    private List<Piece> list;
    private boolean growornot = false;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.originalX = originalX;
        this.originalY = originalY;
        this.originalDirection = originalDirection;
        this.piece = new Piece(this.originalX, this.originalY);
        this.list = new ArrayList<Piece>();
        list.add(this.piece);

    }

    public Direction getDirection() {
        return originalDirection;
    }

    public void setDirection(Direction dir) {
        this.originalDirection = dir;
    }

    public int getLength() {
        return getPieces().size();
    }

    public List<Piece> getPieces() {
        return list;
    }

    public void move() {
        if (list.size() < 3) {
            grow();
        }

        if (getDirection() == originalDirection.RIGHT) {
            this.originalX++;
        }
        if (getDirection() == originalDirection.LEFT) {
            this.originalX--;
        }
        if (getDirection() == originalDirection.DOWN) {
            this.originalY++;
        }
        if (getDirection() == originalDirection.UP) {
            this.originalY--;
        }

        this.piece = new Piece(this.originalX, this.originalY);
        list.add(this.piece);

        if (!this.growornot) {
            this.list.remove(0);
        } else {
            this.growornot = false;
        }

    }

    public void grow() {
        this.growornot = true;
    }

    public boolean runsInto(Piece piece) {
        for (Piece p : list) {
            if (p.runsInto(piece)) {
                return true;
            }
        }
        return false;
    }

    public boolean runsIntoItself() {
        for (Piece p : list) {
            for (Piece c : list) {
                if (p == c) {
                    continue;
                }
                if (p.runsInto(c)) {
                    return true;
                }
            }

        }
        return false;
    }

}
