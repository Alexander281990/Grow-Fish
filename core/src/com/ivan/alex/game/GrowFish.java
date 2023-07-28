package com.ivan.alex.game;

public class GrowFish extends BaseGame{
	@Override
	public void create() {
		setActiveScreen(new LevelScreen());
	}
}
