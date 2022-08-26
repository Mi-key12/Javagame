
package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Pizza extends SuperObject {
    
    public OBJ_Pizza() {
        name = "Pizza";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/pizza_right.png"));
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
