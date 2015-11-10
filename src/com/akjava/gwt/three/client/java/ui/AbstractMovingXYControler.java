package com.akjava.gwt.three.client.java.ui;

import java.util.List;

import com.akjava.gwt.three.client.java.GWTSpline;
import com.akjava.gwt.three.client.js.math.Vector2;

public abstract class AbstractMovingXYControler {
	protected long duration;
	protected long total;
	protected boolean moving;
	protected List<Vector2> points;

	

public AbstractMovingXYControler(List<Vector2> points,long duration){
	this.points=points;
	this.duration=duration;
	moving=true;
}


public long getDuration() {
	return duration;
}


public void setDuration(long duration) {
	this.duration = duration;
}


public long getTotal() {
	return total;
}


public void setTotal(long total) {
	this.total = total;
}


public boolean isMoving() {
	return moving;
}


public void setMoving(boolean moving) {
	this.moving = moving;
}


public List<Vector2> getPoints() {
	return points;
}


public void setPoints(List<Vector2> points) {
	this.points = points;
}

public abstract void moveEnd();
public abstract void moveTo(double x,double y);

public void update(long delta){
if(!moving){
	return;
}
total+=delta;
if(total<duration){
	Vector2 pt=GWTSpline.get2DPoint(points, (double)total/duration);
	moveTo(pt.getX(),pt.getY());
}else{
	moving=false;
	moveEnd();
}

}

}
