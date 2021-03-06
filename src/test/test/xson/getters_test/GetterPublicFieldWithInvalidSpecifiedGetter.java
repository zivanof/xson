package test.xson.getters_test;

import org.junit.Assert;
import org.junit.Test;

import com.vi.xson.Xson;
import com.vi.xson.annotation.Jsonnable;
import com.vi.xson.annotation.toJson;

public class GetterPublicFieldWithInvalidSpecifiedGetter {

	private static String f1Value = "xx";

	@Test
	public void test() throws Exception {
		test t = new test();
		// when an invalid specified getter function is specified then call
		// getter method
		Assert.assertEquals(Xson.toJson(t), "{\"f1\" : \"" + t.f1 + "\"}");
	}

	@Jsonnable()
	public static class test {

		@toJson(getterName = "specifiedGetter")
		public String f1;

		// private specified getter
		@SuppressWarnings("unused")
		private String specifiedGetter() {
			return f1 + " (specified getter)";
		}

		public test() {
			f1 = f1Value;
		}
	}
}
