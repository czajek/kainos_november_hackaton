package models;

/*
 * candidate
 */
public class Candidate {
	public String name;
	public String surname;
	public int votesCount;
	public int pesel;
	
	public Candidate(String name, String surname, int votes, int pesel) {
		this.name = name;
		this.surname = surname;
		this.votesCount = votes;
		this.pesel = pesel;
	}
}
