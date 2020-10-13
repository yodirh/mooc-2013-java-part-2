package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;
    private Random random;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);
        
        this.random = new Random();
        
        this.worm = new Worm(width/2, height/2, Direction.DOWN);
        this.apple = new Apple(random.nextInt(width), random.nextInt(height));
        
        while (true){
                if(!worm.runsInto(apple)){
                    break;
                }
                this.apple = new Apple(random.nextInt(width), random.nextInt(height));
            }
    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        this.worm.move();
        if(worm.runsInto(apple)){
            worm.grow();
            
            while (true){
                if(!worm.runsInto(apple)){
                    break;
                }
                this.apple = new Apple(random.nextInt(width), random.nextInt(height));
            }   
        }
        
        if(this.worm.runsIntoItself()){
            this.continues = false;
        }
        for (Piece p : this.worm.getPieces()) {
            if (p.getX() >= this.width || p.getX() <= 0 || p.getY() >= this.height || p.getY() <= 0) {
                this.continues = false;
            }
        }
        this.updatable.update();
        super.setDelay(1000/worm.getLength());

    }
    
    public Worm getWorm(){
        return this.worm;
    }
    
    public void setWorm(Worm worm){
        this.worm = worm;
    }
    
    public Apple getApple(){
        return this.apple;
    }
    
    public void setApple(Apple apple){
        this.apple = apple;
    }

}
