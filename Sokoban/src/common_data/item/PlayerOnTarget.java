package common_data.item;

import java.io.Serializable;

public class PlayerOnTarget implements Item,Movable,Serializable {
 
	char id;
	
	public PlayerOnTarget() {
	id='*';
	}
@Override
public void setPosition(Position pos) {
	// TODO Auto-generated method stub
	
}

@Override
public Position2D getPosition() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void print() {
	// TODO Auto-generated method stub
	
}

@Override
public char getId_char() {
	return this.id;
}

@Override
public int getPosX() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int getPosY() {
	// TODO Auto-generated method stub
	return 0;
}
 

}
