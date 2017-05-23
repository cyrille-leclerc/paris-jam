package com.jam.paris.parisjam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParisJamApplicationTests {

	/**
	 * FIXME
	 *
	 * TODO do the fix
	 */
	@Test
	public void contextLoads() {
	}

	@Test
	public void testApp() throws IOException {

		assertTrue(true);
		File myattachment = new File("myattachment");

		myattachment.createNewFile();
		FileWriter fileWriter = new FileWriter(myattachment);
		try {
			fileWriter.append("This is a JUnit-attachment sample");
			System.out.println("[[ATTACHMENT|" + myattachment.getAbsolutePath() + "]]");
		} finally {
			fileWriter.close();
		}
	}
}
