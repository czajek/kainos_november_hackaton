import static org.junit.Assert.*;

import org.junit.Test;

import assets.Circumference;
import assets.Community;


public class Mock {

	@Test
	public void testObjectToJson() {
		Community c = new Community("Gdansk", "Gdansk", null);
		System.out.println(c.toString());
	}

}
