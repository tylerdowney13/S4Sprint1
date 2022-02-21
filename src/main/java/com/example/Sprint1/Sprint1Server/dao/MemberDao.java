package com.example.Sprint1.Sprint1Server.dao;

import com.example.Sprint1.Sprint1Server.model.Member;

import java.util.List;
import java.util.Optional;

public interface MemberDao {

    default int insertMember(Member member) {

        return insertMember(member);
    }

    List<Member> selectAllMembers();

    Optional<Member> selectMemberByName(String memberName);

    Optional<Member> selectMemberByEmail(String memberEmail);

    Optional<Member> selectMemberByPhone(String memberPhone);
}
