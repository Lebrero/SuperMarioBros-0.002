package com.Alienkore.SuperMarioBros.Screens;

import com.Alienkore.SuperMarioBros.Scenes.Hud;
import com.Alienkore.SuperMarioBros.SuperMarioBros;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by David on 23/08/2015.
 */

//Una pantalla implementa siempre de Screen. Implementa los metodos
public class PlayScreen implements Screen {
    protected SuperMarioBros game;
    Hud hud ;
    private OrthographicCamera gameCam;
    private Viewport gamePort;

    public PlayScreen(SuperMarioBros game) {
        this.game = game;
        //
        this.hud = new Hud(game.batch);
        this.gameCam = new OrthographicCamera();
        // gamePort = new StretchViewport(800, 400, gameCam);
      this. gamePort = new FitViewport(800, 400, gameCam);
        // gamePort = new ScreenViewport(gameCam);
        //gamePort = new ExtendViewport(800, 400, gameCam);
       // this.gamePort = new FillViewport(800, 400, gameCam);

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        //limpiamos la pantalla
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
