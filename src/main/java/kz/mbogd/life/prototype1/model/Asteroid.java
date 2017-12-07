package kz.mbogd.life.prototype1.model;

import com.badlogic.gdx.graphics.Texture;

public class Asteroid extends AbstractGameObject {
    private float ax;
    private float ay;
    public Asteroid(Texture texture, float x, float y, float width, float height) {
        super(texture, x, y, width, height);
        ax = 1;
        ay = 1;
    }

    @Override
    public void update() {
        bounds.x += ax;
        bounds.y += ay;
    }
}
