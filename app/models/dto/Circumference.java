package models.dto;

import java.util.List;

/*
 * Okręg
 */
public class Circumference {
	public int number;
	public List<Perimeter> perimeter;
	
	public Circumference(int number, List<Perimeter> perimeter) {
		this.number = number;
		this.perimeter = perimeter;
	}
}
