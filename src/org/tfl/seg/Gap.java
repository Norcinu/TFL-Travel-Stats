package org.tfl.seg;

import java.awt.*;
import javax.swing.*;

////////////////////////////////////////////////////////////////////// Class Gap
public class Gap extends JComponent {
	private static final long serialVersionUID = -4809827760806100763L;

	//============================================================== constructor
	/* Creates filler with minimum size, but expandable infinitely. */
	public Gap() {
		Dimension min = new Dimension(0, 0);
		Dimension max = new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE);
		setMinimumSize(min);
		setPreferredSize(min);
		setMaximumSize(max);
	}

	//============================================================== constructor
	/* Creates rigid filler. */
	public Gap(int size) {
		Dimension dim = new Dimension(size, size);
		setMinimumSize(dim);
		setPreferredSize(dim);
		setMaximumSize(dim);
	}
}
