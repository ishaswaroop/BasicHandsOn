package com.globallogic.helloworld;

public class MyEncapsulation {
	

	//encapsulation : it says there is a single unit and private propteries which can be access by class method only
	//fully encapsulated class
	

		public MyEncapsulation(String name, int id) {
			super();
			this.name = name;
			this.id = id;
		}

		private String name;
		private int id;

		public void print() {
			System.out.println("name " + this.name);
			System.out.println("id " + this.id);
		}

	}

