import java.util.ArrayList;
import java.util.List;

import models.dto.Candidate;
import models.dto.Circumference;
import models.dto.Community;
import models.dto.Perimeter;
import models.dto.SelectionList;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;

import play.libs.Json;


public class Mock {

	@Test
	public void testObjectToJson() {
		List<Candidate> candidates = new ArrayList<Candidate>();
		candidates.add(new Candidate("Joanna", "Kowalska", 12345, 910941726));
		candidates.add(new Candidate("Jan", "Kowalski", 1235, 910941517));
		
		List<SelectionList> selectionList = new ArrayList<SelectionList>();
		selectionList.add(new SelectionList(1, "PSL", candidates));
		
		List<Perimeter> perimeter = new ArrayList<Perimeter>();
		perimeter.add(new Perimeter("Brzezno", selectionList));
		
		List<Circumference> circumference = new ArrayList<Circumference>();
		circumference.add(new Circumference(1, perimeter));
		
		Community community = new Community("Gdansk", "Gdansk", circumference);
		
		JsonNode jsonNode = Json.toJson(community);
		
		System.out.println(jsonNode.toString());
	}

}
