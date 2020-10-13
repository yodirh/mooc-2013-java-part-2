
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.game.WormGame;


public class DrawingBoard extends JPanel implements Updatable{
    
    private WormGame game;
    private int pieceLength;
    
    public DrawingBoard(WormGame game, int pieceLength){
        this.game = game;
        this.pieceLength = pieceLength;
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.BLACK);
        
        for(Piece p: game.getWorm().getPieces()){
            graphics.fill3DRect(p.getX()*pieceLength, p.getY()*pieceLength, pieceLength, pieceLength, true);
        }
        
        graphics.setColor(Color.red);
        Apple apple = this.game.getApple();
        
        graphics.fillOval(apple.getX()*pieceLength, apple.getY()*pieceLength, pieceLength, pieceLength);
    }
    
    @Override
    public void update() {
        super.repaint();
    }
    
    
}
