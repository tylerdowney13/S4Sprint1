package com.example.Sprint1.Sprint1Server;

import com.example.Sprint1.Sprint1Server.dao.MemberAccessService;
import com.example.Sprint1.Sprint1Server.model.Member;
import com.example.Sprint1.Sprint1Server.service.MemberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class Sprint1ServerApplicationTests {

	/// Member Tests ///
	// Initial member
	Member m1 = new Member("Tyler Downey", "25 Baker Street", "tyler.downey@gmail.com",
			"709-690-1337", "2022-02-21", 3, "normal",
			new ArrayList<String>(Arrays.asList("Tyler Downey", "Scott Downey")), new ArrayList<String>(Arrays.asList("PGA Tour 2022")),
			new ArrayList<String>(Arrays.asList("PGA Tour 2021")), new ArrayList<String>(Arrays.asList("PGA Tour 2023"))
	);

	Member m2 = new Member("Dryden Bussey", "10 Newfoundland Drive", "dryden.bussey@gmail.com",
			"709-691-1234", "2022-02-23", 12, "normal",
			new ArrayList<String>(Arrays.asList()), new ArrayList<String>(Arrays.asList("PGA Tour 2022")),
			new ArrayList<String>(Arrays.asList("PGA Tour 2021")), new ArrayList<String>(Arrays.asList("PGA Tour 2023"))
	);

	// Test Member class
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

	// Test MemberAccessServiceClass
	@Test
	public void testMemberAccessServiceInsertMember () {
		MemberAccessService mas = new MemberAccessService();

		mas.insertMember(m2);

		List<Member> memberList = mas.selectAllMembers();

		Assertions.assertEquals(mas.selectAllMembers().get(1).getMemberName(), m2.getMemberName());
	}

	@Test
	public void testMemberAccessServiceSelectMemberByName() {
		MemberAccessService mas = new MemberAccessService();

		mas.insertMember(m1);
		mas.insertMember(m2);

		Optional<Member> member1 = mas.selectMemberByName("Tyler Downey");
		Optional<Member> member2 = mas.selectMemberByName("Dryden Bussey");

		Assertions.assertEquals("Tyler Downey", member1.get().getMemberName());
		Assertions.assertEquals("Dryden Bussey", member2.get().getMemberName());

	}

	@Test
	public void testSelectMemberByEmail() {
		MemberAccessService mas = new MemberAccessService();

		mas.insertMember(m1);
		mas.insertMember(m2);

		Optional<Member> member1 = mas.selectMemberByEmail("tyler.downey@gmail.com");
		Optional<Member> member2 = mas.selectMemberByEmail("dryden.bussey@gmail.com");

		Assertions.assertEquals("tyler.downey@gmail.com", member1.get().getMemberEmail());
		Assertions.assertEquals("dryden.bussey@gmail.com", member2.get().getMemberEmail());
	}

	@Test
	public void testSelectMemberByPhone() {
		MemberAccessService mas = new MemberAccessService();

		mas.insertMember(m1);
		mas.insertMember(m2);

		Optional<Member> member1 = mas.selectMemberByPhone("709-690-1337");
		Optional<Member> member2 = mas.selectMemberByPhone("709-691-1234");

		Assertions.assertEquals("709-690-1337", member1.get().getMemberPhone());
		Assertions.assertEquals("709-691-1234", member2.get().getMemberPhone());
	}

	/// Tournament Tests ///

}
