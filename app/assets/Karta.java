package assets;

import java.util.List;

public class Karta {
	public static enum Rodzaj{
		RADAMIASTA,
		PREZYDENCKIE,
		SEJMIK
	}
	public Rodzaj rodzaj;
	public List<SelectionList> selectionList;
}
