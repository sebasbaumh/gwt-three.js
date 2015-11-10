package com.akjava.gwt.three.client.gwt.animation;

import java.util.Objects;

import com.akjava.gwt.three.client.js.THREE;
import com.akjava.gwt.three.client.js.math.Vector3;

public class NameAndVector3 {
private String name;
private Vector3 position;
private int index;
public int getIndex() {
	return index;
}
public void setIndex(int index) {
	this.index = index;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Vector3 getVector3() {
	return position;
}
public void setVector3(Vector3 position) {
	this.position = position;
}
public NameAndVector3(String name,double x,double y,double z){
	this(name,THREE.Vector3(x, y, z),0);
}

public NameAndVector3(String name,Vector3 position){
	this(name,position,0);
}
public NameAndVector3(String name,Vector3 position,int index){
	this.name=name;
	this.position=position;
	this.index=index;
}

public String toString(){
	return name+","+index+","+position;
}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = prime + Integer.hashCode(this.index);
		result = prime * result + Objects.hashCode(this.name);
		return prime * result + Objects.hashCode(this.position);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj instanceof NameAndVector3)
		{
			NameAndVector3 other = (NameAndVector3) obj;
			if ((this.index != other.index) || !Objects.equals(this.name, other.name)||((this.position==null)&&(other.position!=null)))
			{
				return false;
			}
			return this.position.equals(other.position);
		}
		return false;
	}

}
