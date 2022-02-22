package com.example.Sprint1.Sprint1Server;

import com.example.Sprint1.Sprint1Server.model.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
class Sprint1ServerApplicationTests {

	/// Member Tests ///
	// Initial member
	Member m1 = new Member("Tyler Downey", "25 Baker Street", "tyler.downey@gmail.com",
			"709-690-1337", "2022-02-21", 3, "normal",
			new ArrayList<String>(Arrays.asList("Tyler Downey", "Scott Downey")), new ArrayList<String>(Arrays.asList("PGA Tour 2022")),
			new ArrayList<String>(Arrays.asList("PGA Tour 2021")), new ArrayList<String>(Arrays.asList("PGA Tour 2023"))
	);

	@Test
	public void testMemberGetMethods() {
		Assertions.assertEquals("Tyler Downey", m1.getMemberName());
		Assertions.assertEquals("25 Baker Street", m1.getMemberAddress());
		Assertions.assertEquals("tyler.downey@gmail.com", m1.getMemberEmail());
		Assertions.assertEquals("709-690-1337", m1.getMemberPhone());
		Assertions.assertEquals(3, m1.getMembershipDuration());
		Assertions.assertEquals("normal", m1.getMembershipType());
		Assertions.assertEquals("Tyler Downey", m1.getMembershipFamilyMembers().get(0));
		Assertions.assertEquals("PGA Tour 2022", m1.getCurrentTournaments().get(0));
		Assertions.assertEquals("PGA Tour 2021", m1.getPastTournaments().get(0));
		Assertions.assertEquals("PGA Tour 2023", m1.getUpcomingTournaments().get(0));
	}

	/// Tournament Tests ///

}
