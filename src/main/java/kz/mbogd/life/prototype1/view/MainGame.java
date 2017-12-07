package kz.mbogd.life.prototype1.view;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import kz.mbogd.life.prototype1.model.Asteroid;
import kz.mbogd.life.prototype1.model.Background;

public class MainGame extends ApplicationAdapter {
    SpriteBatch batch;
    Texture backgroundTexture1;
    Texture asteroidTexture1;
    Asteroid asteroid1;
    Background backgroundSpace1;

    @Override
    public void create () {
        batch = new SpriteBatch();

        backgroundTexture1 = new Texture(Gdx.files.internal("assets/bigSpace2.jpg"));
        asteroidTexture1 = new Texture(Gdx.files.internal("assets/singleAsteroid1.png"));

        backgroundSpace1 = new Background(backgroundTexture1, 0, 0, backgroundTexture1.getWidth(), backgroundTexture1.getHeight());
        asteroid1 = new Asteroid(asteroidTexture1,130, 100, asteroidTexture1.getWidth(), asteroidTexture1.getHeight());
    }

    @Override
    public void render () {
        update();
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        backgroundSpace1.draw(batch);
        asteroid1.draw(batch);
        batch.end();/**/
    }

    private void update() {
        asteroid1.update();
    }

    @Override
    public void dispose () {
        batch.dispose();
        asteroidTexture1.dispose();
    }
}
