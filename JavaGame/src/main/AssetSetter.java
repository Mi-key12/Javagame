
package main;

import object.OBJ_Pencil;
import object.OBJ_Pizza;
import object.OBJ_Notes;
import object.Enemy;

public class AssetSetter {
    GamePanel gp;
    
    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }
    
    public void setObject() {
        gp.obj[0] = new OBJ_Pencil();
        gp.obj[0].worldX = 23 * gp.tileSize;
        gp.obj[0].worldY = 7 * gp.tileSize;
        
        gp.obj[1] = new OBJ_Pizza();
        gp.obj[1].worldX = 33 * gp.tileSize;
        gp.obj[1].worldY = 7 * gp.tileSize;
        
        gp.obj[2] = new OBJ_Pizza();
        gp.obj[2].worldX = 35 * gp.tileSize;
        gp.obj[2].worldY = 27 * gp.tileSize;
        
        gp.obj[3] = new OBJ_Pizza();
        gp.obj[3].worldX = 23 * gp.tileSize;
        gp.obj[3].worldY = 40 * gp.tileSize;
        
        gp.obj[4] = new Enemy();
        gp.obj[4].image = gp.obj[4].setEnemyDirection(3);
        gp.obj[4].worldX = 35 * gp.tileSize;
        gp.obj[4].worldY = 21 * gp.tileSize;
        
        gp.obj[5] = new Enemy();
        gp.obj[5].image = gp.obj[5].setEnemyDirection(0);
        gp.obj[5].worldX = 23 * gp.tileSize;
        gp.obj[5].worldY = 36 * gp.tileSize;
        
        gp.obj[6] = new Enemy();
        gp.obj[6].image = gp.obj[6].setEnemyDirection(1);
        gp.obj[6].worldX = 11 * gp.tileSize;
        gp.obj[6].worldY = 31 * gp.tileSize;
        
        gp.obj[7] = new Enemy();
        gp.obj[7].image = gp.obj[7].setEnemyDirection(2);
        gp.obj[7].worldX = 10 * gp.tileSize;
        gp.obj[7].worldY = 10 * gp.tileSize;
        
        gp.obj[8] = new Enemy();
        gp.obj[8].image = gp.obj[8].setEnemyDirection(2);
        gp.obj[8].worldX = 38 * gp.tileSize;
        gp.obj[8].worldY = 12 * gp.tileSize;
        
        gp.obj[9] = new OBJ_Notes();
        gp.obj[9].worldX = 10 * gp.tileSize;
        gp.obj[9].worldY = 7 * gp.tileSize;
    }
}
