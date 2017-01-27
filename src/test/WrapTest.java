import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WrapTest {

	private Wrap wrap;

	@Before
	public void setUp() throws Exception {
		wrap = new Wrap();
	}

	@Test
	public void wrapTest() throws Exception {
		assertWrapped("", 1, "");
		assertWrapped("x", 1, "x");
		assertWrapped("xx", 1, "x\nx");
		assertWrapped("xx", 2, "xx");
		assertWrapped("xxx", 1, "x\nx\nx");
		assertWrapped("xxx", 2, "xx\nx");
		assertWrapped("xx xx", 2, "xx\nxx");
		assertWrapped("xx xx", 3, "xx\nxx");
		assertWrapped("xx xx", 4, "xx\nxx");
		assertWrapped("xx xx", 6, "xx xx");
		assertWrapped(
				"Write a long sentence and test the result of this long sentence",
				3,
				"Wri\nte\na\nlon\ng\nsen\nten\nce\nand\ntes\nt\nthe\nres\nult\nof\nthi\ns\nlon\ng\nsen\nten\nce");
	}

	private void assertWrapped(String s, int l, String wrapped) {
		assertThat(wrap.wrap(s, l), is(wrapped));
	}
}