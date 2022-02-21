package com.example.Sprint1.Sprint1Server.dao;

import com.example.Sprint1.Sprint1Server.model.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("memberDao")
public class MemberAccessService implements MemberDao {
    private static List<Member> DB = new ArrayList<>();

    @Override
    public int insertMember(Member member) {
        DB.add(new Member(member.getMemberName(), member.getMemberAddress(), member.getMemberEmail(), member.getMemberPhone(),
                member.getMembershipStartDate(), member.getMembershipDuration(), member.getMembershipType(), member.getMembershipFamilyMembers(),
                member.getCurrentTournaments(), member.getPastTournaments(), member.getUpcomingTournaments()));
        return 1;
    }

    @Override
    public List<Member> selectAllMembers() {
        return DB;
    }

    @Override
    public Optional<Member> selectMemberByName(String memberName) {
        return DB.stream().filter(member -> member.getMemberName().equals(memberName)).findFirst();
    }

    @Override
    public Optional<Member> selectMemberByEmail(String memberEmail) {
        return DB.stream().filter(member -> member.getMemberName().equals(memberEmail)).findFirst();
    }

    @Override
    public Optional<Member> selectMemberByPhone(String memberPhone) {
        return DB.stream().filter(member -> member.getMemberName().equals(memberPhone)).findFirst();
    }
}
