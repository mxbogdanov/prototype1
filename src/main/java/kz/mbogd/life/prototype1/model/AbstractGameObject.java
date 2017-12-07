package kz.mbogd.life.prototype1.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public abstract class AbstractGameObject {

    Rectangle bounds;
    Sprite sprite;

    public AbstractGameObject(Texture texture, float x, float y, float width, float height) {
        this.sprite = new Sprite(texture);
        this.bounds = new Rectangle(x, y, width, height);
    }

    public void draw(SpriteBatch spriteBatch) {
        sprite.setBounds(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
        sprite.draw(spriteBatch);
    }

    public abstract void update();
}
