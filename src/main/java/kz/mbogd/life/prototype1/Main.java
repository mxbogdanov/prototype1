package kz.mbogd.life.prototype1;

import java.util.Arrays;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import kz.mbogd.life.prototype1.view.MainGame;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main:Start args = [" + Arrays.toString(args) + "]");

        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        new LwjglApplication(new MainGame(), config);

        System.out.println("Main:Finish");
    }
}
