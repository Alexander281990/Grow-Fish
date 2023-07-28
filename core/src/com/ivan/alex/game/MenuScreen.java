package com.ivan.alex.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class MenuScreen extends BaseScreen{
    public void initialize()
    {


    }

    public void update(float dt)
    {
        if (Gdx.input.isKeyPressed(Input.Keys.S))
            GrowFish.setActiveScreen( new LevelScreen() );
    }
}