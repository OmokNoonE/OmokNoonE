package org.omoknoone.omokhub.projectmember.command.service;

import org.omoknoone.omokhub.projectmember.command.dto.JoinwaitingMemberDTO;
import org.omoknoone.omokhub.projectmember.query.dto.JoinwaitingmemberDTO;
import org.omoknoone.omokhub.user.query.dto.MemberDTO;

public interface JoinwaitingMemberService {

    void addJoinWaiting(JoinwaitingMemberDTO joinwaitingMemberDTO);
}
