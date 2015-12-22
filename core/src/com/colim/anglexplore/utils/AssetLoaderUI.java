package com.colim.anglexplore.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by jerelynco on 12/21/15.
 */
public class AssetLoaderUI {
    public static Texture texturesUI;
    public static TextureRegion bg, text_box, button_ok, button_ok_pressed, button_generate, button_generate_pressed, button_quit, button_quit_pressed;

    public static void load() {
        texturesUI = new Texture(Gdx.files.internal("AssetsUI.png"));
        texturesUI.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        bg = new TextureRegion(texturesUI, 0, 0, 1280, 720);
        text_box = new TextureRegion(texturesUI, 0, 720, 992, 158);
        button_ok = new TextureRegion(texturesUI, 0, 875, 142, 85);
        button_ok_pressed = new TextureRegion(texturesUI, 85, 875, 142, 85);
        button_generate = new TextureRegion(texturesUI, 0, 960, 425, 64);
        button_generate_pressed = new TextureRegion(texturesUI, 0, 1044, 425, 64);
        button_quit = new TextureRegion(texturesUI, 0, 1090, 127, 65);
        button_quit_pressed = new TextureRegion(texturesUI, 127, 1098, 127, 65);
    }

    public static void dispose(){
        texturesUI.dispose();
    }
}
