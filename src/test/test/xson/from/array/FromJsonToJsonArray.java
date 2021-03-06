package test.xson.from.array;

import org.junit.Assert;
import org.junit.Test;

import com.vi.xson.Xson;
import com.vi.xson.object.JsonArray;

public class FromJsonToJsonArray {

	@Test
	public void test() {
		JsonArray a = Xson.fromJsonToJsonArray("[1,5,23,-12,\"_pewq!\"]");
		JsonArray a1 = Xson.fromJsonToJsonArray("[1     ,5,  23,-12,  \"_pewq!\"       ]");

		String expected = "[1.0, 5.0, 23.0, -12.0, \"_pewq!\"]";
		Assert.assertEquals(expected, a.toString());
		Assert.assertEquals(expected, a1.toString());

	}

}
