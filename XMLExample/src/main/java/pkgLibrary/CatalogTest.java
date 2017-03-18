package pkgLibrary;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CatalogTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testgetBook() {
		Catalog tester = new Catalog();
		Book result = tester.getBook("109");
		assertEquals("Creepy Crawlies" ,result);
	}
	@Test
	public void testaddBook(){
		Catalog tester = new Catalog();
		Catalog result = tester.addBook(Book("120", "Test","Test","Test",2.0,2000-12-12,"Test",1.6));
		assertEquals(addBook(Book("120", "Test","Test","Test",2.0,2000-12-12,"Test",1.6)),result);
	}

}
