package com.example.Sprint1.Sprint1Server.api;

import com.example.Sprint1.Sprint1Server.model.Member;
import com.example.Sprint1.Sprint1Server.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/member")
@RestController
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public void addMember(@RequestBody Member member) {
        memberService.addMember(member);
    }

    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping(path = "/name={memberName}")
    public Member getMemberByName(@PathVariable("memberName") String memberName) {
        return memberService.getMemberByName(memberName).orElse(null);
    }

    @GetMapping(path = "/email={memberEmail}")
    public Member getMemberByEmail(@PathVariable("memberEmail") String memberEmail) {
        return memberService.getMemberByEmail(memberEmail).orElse(null);
    }

    @GetMapping(path = "/email={memberPhone}")
    public Member getMemberByPhone(@PathVariable("memberPhone") String memberPhone) {
        return memberService.getMemberByPhone(memberPhone).orElse(null);
    }
}
