package com.ivan.alex.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Fish extends BaseActor{
    public Fish(float x, float y, Stage s) {
        super(x, y, s);

        loadTexture("fish.png");

        setAcceleration(400);
        setMaxSpeed(100);
        setDeceleration(400);

        setBoundaryPolygon(8);
    }

    public void act(float dt) {
        super.act(dt);
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            accelerateAtAngle(180);
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            accelerateAtAngle(0);
        }
        if(Gdx.input.isKeyPressed(Input.Keys.UP)) {
            accelerateAtAngle(90);
        }
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            accelerateAtAngle(270);
        }

        applyPhysics(dt);
        setAnimationPaused(!isMoving());

        if (getSpeed() > 0) {
            setRotation(getMotionAngle());
        }
        boundToWorld();
        alignCamera();
    }
}
