package com.jomus.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jomus.game.NohchiGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Nohchi";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new NohchiGame(), config);

	}
}
