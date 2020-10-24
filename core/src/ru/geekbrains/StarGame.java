package ru.geekbrains;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class StarGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	float port = 0f;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.2f, 0.6f, 0.5f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//batch.setColor(0.2f, 0.3f, 0.4f, 1f);
		batch.draw(img, 200, 120);
		//batch.setColor(0.2f, 0.3f, 0.4f, 0.5f);
		batch.draw(img, 250, 350, 100, 100);
		batch.draw(img, port, port);
		port += 0.2f;
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
