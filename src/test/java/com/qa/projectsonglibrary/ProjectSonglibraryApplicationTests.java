package com.qa.projectsonglibrary;

import com.qa.projectsonglibrary.Song.SongController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@SpringBootTest
class ProjectSonglibraryApplicationTests {
	@BeforeAll
	static void beforeAll(){
		System.out.println("*** Welcome to the Testing Suite ***");
	}

	@BeforeEach
	void beforeEach(){
		System.out.println("\n\nNew Test");
	}

	@Test//testing that a controller is created
	void contextLoads(){
	}


	//using assertions
	@Test
	void testAssertNull(){
		float length=3.34f;
		String str=null;
		assertNull(str);
		assertNotNull(length);
	}

	@Test
	void testAssertEqual(){
		String name="Lucy";
		assertEquals(10+9,19);
		assertEquals("Lucy", name);
	}

	//using assumptions
	@Test
	void testAssumeTrue(){
		boolean x = "style" == "style";
		assumeTrue(x);
	}

	@Test
	void testAssumeFalse(){
		boolean y= "you"!="you";
		assumeFalse(y);
	}


}
