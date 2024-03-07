package org.omoknoone.omokhub.user.query.controller;

import org.omoknoone.omokhub.user.query.dto.MemberDTO;
import org.omoknoone.omokhub.user.query.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("QueryMemberController")
@RequestMapping("/user/members")
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/member-id/{memberId}")
    public ResponseEntity<MemberDTO> searchMemberInfo(@PathVariable String memberId) {

        MemberDTO member = memberService.searchMemberInfoByMemberId(memberId);

        return ResponseEntity.status(HttpStatus.OK).body(member);
    }


    public void searchMemberIdByNickname(String nickname) {

        MemberDTO member = memberService.searchMemberIdByNickname(nickname);

    }

    public void searchProfileCount(String memberId) {

        int profileCount = memberService.searchProfileCountByMemberId(memberId);
    }
}
