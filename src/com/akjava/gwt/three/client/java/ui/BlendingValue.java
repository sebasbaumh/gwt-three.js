package com.akjava.gwt.three.client.java.ui;

import java.util.Arrays;
import java.util.List;

public  class BlendingValue{
		public static final List<BlendingValue> values=Arrays.asList(
				new BlendingValue(0,"Normal"),
				new BlendingValue(1,"Additive"),
				new BlendingValue(2,"Subtractive"),
				new BlendingValue(3,"Multiply"),
				new BlendingValue(4,"AdditiveAlpha"));
		private int value;
		private String label;
		public static boolean isvalid(int value){
			return value>=0 && value<values.size();
		}
		public BlendingValue(int value,String label){
			this.value=value;
			this.label=label;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public String getLabel() {
			return label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		return Integer.hashCode(this.value);
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
		if (obj instanceof BlendingValue)
		{
			BlendingValue other = (BlendingValue) obj;
			return (this.value == other.value);
		}
		return false;
	}
		
	}