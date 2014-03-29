package com.ITP4.TowerDefense;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "TowerDefense";
		cfg.width = 480;
		cfg.height = 320;
		
		new LwjglApplication(new TDGame(), cfg);
	}
}
