package mino;
import java.awt.*;

public class Mino_Z2 extends Mino{
    public Mino_Z2(){
        create(Color.green);
    }
    public void setXY(int x, int y){
        b[0].x = x;
        b[0].y = y;
        b[1].x = b[0].x-Block.SIZE;
        b[1].y = b[0].y;
        b[2].x = b[0].x;
        b[2].y = b[0].y-Block.SIZE;
        b[3].x = b[0].x+Block.SIZE;
        b[3].y = b[0].y-Block.SIZE;
    }
    public void draw(Graphics2D g2) {
        int margin = 2;
        g2.setColor(b[0].c);
        g2.fillRect(b[0].x + margin, b[0].y + margin, Block.SIZE - (margin * 2), Block.SIZE - (margin * 2));
        g2.fillRect(b[1].x + margin, b[1].y + margin, Block.SIZE - (margin * 2), Block.SIZE - (margin * 2));
        g2.fillRect(b[2].x + margin, b[2].y + margin, Block.SIZE - (margin * 2), Block.SIZE - (margin * 2));
        g2.fillRect(b[3].x + margin, b[3].y + margin, Block.SIZE - (margin * 2), Block.SIZE - (margin * 2));
    }
    public void getDirection1() {
        tempB[0].x = b[0].x;
        tempB[0].y = b[0].y;
        tempB[1].x = b[0].x-Block.SIZE;
        tempB[1].y = b[0].y;
        tempB[2].x = b[0].x;
        tempB[2].y = b[0].y-Block.SIZE;
        tempB[3].x = b[0].x+Block.SIZE;
        tempB[3].y = b[0].y-Block.SIZE;
        updateXY(1);
    }
    public void getDirection2() {
        tempB[0].x = b[0].x;
        tempB[0].y = b[0].y;
        tempB[1].x = b[0].x;
        tempB[1].y = b[0].y-Block.SIZE;
        tempB[2].x = b[0].x+Block.SIZE;
        tempB[2].y = b[0].y;
        tempB[3].x = b[0].x+Block.SIZE;
        tempB[3].y = b[0].y+Block.SIZE;
        updateXY(2);
    }
    public void getDirection3() {
        getDirection1();
        updateXY(3);
    }
    public void getDirection4() {
        getDirection2();
        updateXY(4);
    }
}
