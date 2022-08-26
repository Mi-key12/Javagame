
package object;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Enemy extends SuperObject {
    BufferedImage images[] = new BufferedImage[4];
    
    public Enemy() {
        name = "Enemy";
        try {
            images[0] = ImageIO.read(getClass().getResourceAsStream("/enemy/boy_up_evil.png"));
            images[1] = ImageIO.read(getClass().getResourceAsStream("/enemy/boy_right_evil.png"));
            images[2] = ImageIO.read(getClass().getResourceAsStream("/enemy/boy_down_evil.png"));
            images[3] = ImageIO.read(getClass().getResourceAsStream("/enemy/boy_left_evil.png"));
        }catch(IOException e) {
            e.printStackTrace();
        }
        collision = true;
    }
    
    @Override
    public BufferedImage setEnemyDirection(int i) {
        switch(i) {
            case 0:
               image = images[0];
               break;
            case 1:
               image = images[1];
               break;
            case 2:
               image = images[2];
               break;
            case 3:
               image = images[3];
               break;
            default: break;
        }
        return image;
    }
}
