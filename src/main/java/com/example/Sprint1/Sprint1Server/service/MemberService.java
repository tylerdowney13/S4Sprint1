package com.example.Sprint1.Sprint1Server.service;

import com.example.Sprint1.Sprint1Server.dao.MemberDao;
import com.example.Sprint1.Sprint1Server.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    private final MemberDao memberDao;

    @Autowired
    public MemberService(@Qualifier("memberDao") MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public int addMember(Member member) {
        return memberDao.insertMember(member);
    }

    public List<Member> getAllMembers() {
        return memberDao.selectAllMembers();
    }

    public Optional<Member> getMemberByName(String memberName) {
        return memberDao.selectMemberByName(memberName);
    }

    public Optional<Member> getMemberByEmail(String memberEmail) {
        return memberDao.selectMemberByEmail(memberEmail);
    }

    public Optional<Member> getMemberByPhone(String memberPhone) {
        return memberDao.selectMemberByPhone(memberPhone);
    }
}
