package inputs;

import gamestates.Gamestate;
import main.GamePanel;
import main.Game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static utilz.Constants.Directions.*;

public class KeyboardInputs implements KeyListener {

	private GamePanel gamePanel;
	public KeyboardInputs(GamePanel gamePanel){
		this.gamePanel = gamePanel;
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (Gamestate.state) {

			case MENU -> {
				gamePanel.getGame().getMenu().keyPressed(e);
			}
			case PLAYING -> {
				gamePanel.getGame().getPlaying().keyPressed(e);
			}
			case OPTIONS -> {
				gamePanel.getGame().getGameOptions().keyPressed(e);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (Gamestate.state) {

			case MENU -> {
				gamePanel.getGame().getMenu().keyReleased(e);
			}
			case PLAYING -> {
				gamePanel.getGame().getPlaying().keyReleased(e);
			}
		}
	}
}
