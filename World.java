package sim;

import java.awt.Color;
import java.awt.Graphics;

public class World {
    private final int SIZE = 600;
    private final Color bg = Color.GRAY;
    //declare array of Blobs
    private Blob[] blobs = new Blob[1000];
    
    public World() {
        for (int i = 0; i < blobs.length; i++) {
            blobs[i] = new Blob();
        }
    }
    
    public void draw(Graphics g) {
       
        //For each loop, enhanced for loop
        for (Blob blob : blobs) {
            blob.move();
            blob.collideWorldBounds(this);
            blob.draw(g);
        }
    }

    public int getSIZE() {
        return SIZE;
    }
    
}
