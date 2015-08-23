package com.Alienkore.SuperMarioBros;

import com.Alienkore.SuperMarioBros.Screens.PlayScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//Lo primero que tenemos que hacer es extender de Game
//Creamos un paquete y creamos dentro una clase que implemente de Screen
// si no extendemos de Game no podemos hacer setScreen
public class SuperMarioBros extends Game {
public final static int V_WIDTH=400;
	public final static int V_HEIGHT=208;
	public SpriteBatch batch;
	public Texture img;


	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");

		//llamamos a setScreen y le pasamos la pantalla y a la pantala el juego "this"
		setScreen(new PlayScreen(this));
	}

	@Override
	public void render () {
	super.render();
	}
}
