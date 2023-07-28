package com.ivan.alex.game;

import com.badlogic.gdx.Gdx;

public class LevelScreen extends BaseScreen{

    private Fish fish;

    public void initialize() {
        BaseActor ocean = new BaseActor(0,0, mainStage);
        ocean.loadTexture( "water-border.jpg" );
        ocean.setSize(Gdx.graphics.getWidth() * 2, Gdx.graphics.getHeight() * 2);
        BaseActor.setWorldBounds(ocean);

        fish = new Fish(Gdx.graphics.getWidth() / 2f, Gdx.graphics.getHeight() / 2f, mainStage);
    }

    public void update(float dt) {

    }
}