package models.dto;

import java.util.List;

/*
 * Gmina
 */
public class Community {
	public String name;
	public String province;
	public List<Circumference> circumference;
	
	public Community(String name, String province, List<Circumference> circumference){
		this.name = name;
		this.province = province;
		this.circumference = circumference;
	}
	
	@Override
	public String toString() {
		return "DataObject [name=" +name+", province="+province+",circumference="+circumference+"]";
	}
}
