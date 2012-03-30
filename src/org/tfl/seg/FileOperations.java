package org.tfl.seg;

public interface FileOperations {
	void open(String filename);
	void close();
	void doRead(String filename);
	void doWrite();
}
