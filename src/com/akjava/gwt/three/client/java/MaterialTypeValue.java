package com.akjava.gwt.three.client.java;

public  class MaterialTypeValue{
	public static final MaterialTypeValue BASIC=new MaterialTypeValue(0,"Basic");
	public static final MaterialTypeValue LAMBERT=new MaterialTypeValue(1,"Lambert");
				public static final MaterialTypeValue PHONG=new MaterialTypeValue(2,"Phong");
						public static final MaterialTypeValue NORMAL_MAP=new MaterialTypeValue(3,"Normal-map");
								public static final MaterialTypeValue NORMAL_MAP_PLUS=new MaterialTypeValue(4,"Normal-map+D");

		private int value;
		private String label;
	
		public MaterialTypeValue(int value,String label){
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
			if (obj instanceof MaterialTypeValue)
			{
				MaterialTypeValue other = (MaterialTypeValue) obj;
				return (this.value == other.value);
			}
			return false;
		}
	}