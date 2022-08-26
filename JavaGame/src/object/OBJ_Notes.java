
package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Notes extends SuperObject{
    
    public OBJ_Notes() {
        name = "Notes";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/notes.png"));
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
