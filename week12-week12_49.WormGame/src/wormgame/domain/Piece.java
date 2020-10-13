
package wormgame.domain;

public class Piece {
    
    int x;
    int y;
    
    public Piece(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    
    public boolean runsInto(Piece piece){
        if(this.x == piece.getX()&&this.y==piece.getY()){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return "(" + this.x +","+ this.y+")";
    }
    
}
