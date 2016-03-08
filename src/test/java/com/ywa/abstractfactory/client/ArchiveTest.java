package com.ywa.abstractfactory.client;

public class ArchiveTest {

	public static void main(String[] args) {
		String [] reports = {"IN_INV_001.txt","OUT_PUR_001.txt","IN_INV_002.txt", "IN_PUR_001.txt", "OUT_PUR_002.txt", "OUT_INV_001.txt", "IN_INV_003.txt"};
		String [] temp = null;
		
		Archive archive = new Archive();
		
		for (String name : reports) {
			temp = name.split("_");
			archive.addReport(temp[0], temp[1], name);
		}
		
		archive.procesAllReport();
	}
}
