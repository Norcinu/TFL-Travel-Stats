package org.tfl.seg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvOperation implements FileOperations {
	private ArrayList<String> wordList = new ArrayList<String>();
	private ArrayList<TravelStats> travelStats = new ArrayList<TravelStats>();
	
	public ArrayList<String> getWordList() {
		return wordList;
	}

	public CsvOperation() {
		
	}

	@Override
	public void open(String filename) {
		doRead(filename);
	}

	@Override
	public void close() {

	}

	@Override
	public void doRead(String filename) {
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			
			String line = null;
			try {
				while ((line = br.readLine()) != null) {
					wordList.add(line);
				}

				br.close();
				fr.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for (String s : wordList) {
			TravelStats ts = new TravelStats();
			String[] splitter = s.split(",");
			ts.date = splitter[0];
			ts.startTime = splitter[1];
			ts.endTime = splitter[2];
			ts.actionType = splitter[3];
			//ts.charge = splitter[4];
			//ts.credit = splitter[5];
		}
	}

	@Override
	public void doWrite() {

	}
}
