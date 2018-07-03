package library;

import static org.junit.Assert.*;

import org.junit.Test;

public class libraryTest {

	Storage S =new Storage();
	
//	@Test
//	public void addItemTest() {
//		int size =Storage.Items.size();
//		Storage.addBook("test", true, 100, "Fantasy","J.k.lowing");
//		assertEquals(Storage.Items.size(),size+1);
//		Storage.removeItem("test");
//		
//	}
//	
//	@Test
//	public void removeItemTest() {
//		
//		Storage.addBook("test", true, 100, "Fantasy","J.k.lowing");
//		int size =Storage.Items.size();
//		Storage.removeItem("test");
//		assertEquals(Storage.Items.size(),size-1);
//		
//	}
	
	@Test
	public void updateItemTest() {
		
		S.addBook("test", true, 150, "Fantasy","J.k.lowing");
		
		S.updateItemName(150,"test2");
		
		System.out.println(S.Items.get(S.Items.size()-1).name);
		
		assertEquals("test2",S.Items.get(S.Items.size()-1).name);

		
	}

}