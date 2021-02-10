package com.xworkz.beach.sort;

import java.util.Comparator;

import com.xworkz.beach.dto.BeachDTO;

public class BeachNoOfResortsComparator implements Comparator<BeachDTO> {

	@Override
	public int compare(BeachDTO o1, BeachDTO o2) {
		Integer o1No=o1.getNoOfResorts();
		Integer o2No=o1.getNoOfResorts();
		return o1No.compareTo(o2No);
	}

}
