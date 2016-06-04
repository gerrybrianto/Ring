package fr.ring.gui.map;

import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;
import org.newdawn.slick.state.StateBasedGame;

import fr.ring.gui.MainScreenGameState;

public class PlayerController implements KeyListener {
	
	private Player player;
	private StateBasedGame game;
	
	public PlayerController(Player player, StateBasedGame game) {
		this.player = player;
		this.game = game;
	}


	@Override
	public void keyPressed(int key, char c) {
		switch (key) {
		case Input.KEY_UP:
			this.player.getP().setDirection(0);
		    this.player.getP().setMoving(true);
		    break;
		case Input.KEY_LEFT:
		    this.player.getP().setDirection(1);
		    this.player.getP().setMoving(true);
		    break;
		case Input.KEY_DOWN:
		    this.player.getP().setDirection(2);
		    this.player.getP().setMoving(true);
		    break;
		case Input.KEY_RIGHT:
			this.player.getP().setDirection(3);
		    this.player.getP().setMoving(true);
		    break;
		case Input.KEY_ESCAPE:
			game.enterState(MainScreenGameState.ID);
			break;
		}			
	}

	@Override
	public void keyReleased(int key, char c) {
		this.player.getP().setMoving(false);
	}


	@Override
	public void inputEnded() {
		
	}


	@Override
	public void inputStarted() {
		
	}


	@Override
	public boolean isAcceptingInput() {

		return true;
	}


	@Override
	public void setInput(Input arg0) {
		
	}

}
