package models.dto;

import java.util.List;

/*
 * Lista
 */
public class SelectionList {
		public int number;
		public String name;
		public List<Candidate> candidates;
		
		public SelectionList(int number, String name, List<Candidate> candidates) {
			this.number = number;
			this.name = name;
			this.candidates = candidates;
		}
}
