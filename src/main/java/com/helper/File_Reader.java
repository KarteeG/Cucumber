package com.helper;

public class File_Reader {
	
	private File_Reader() {
	}
	
	public static File_Reader getInstanceFR() {
		File_Reader FR = new File_Reader();
		return FR;

	}
	
	public Configure_Reader getInstanceCR() throws Throwable {
		Configure_Reader CR = new Configure_Reader();
		return CR;
	}

}
