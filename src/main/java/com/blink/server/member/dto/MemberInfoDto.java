package com.blink.server.member.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberInfoDto {
    private String memberCode;
    private String memberId;
    private String memberName;
    private String memberEmail;
    private String memberTel;
    private String memberStudentNumber;
    private String memberRegDate;
    private String memberBirthDate;
    private boolean memberSex;
}