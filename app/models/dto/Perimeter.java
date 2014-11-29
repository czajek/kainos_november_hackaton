package models.dto;

import java.util.List;

/*
 * Obwod
 */
public class Perimeter {
	public String name;
	public List<SelectionList> selectionList;
	
	public Perimeter(String name, List<SelectionList> selectionList) {
		this.name = name;
		this.selectionList = selectionList;
	}
}
