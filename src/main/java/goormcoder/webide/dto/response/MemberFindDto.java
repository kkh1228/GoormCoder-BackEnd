package goormcoder.webide.dto.response;

import goormcoder.webide.domain.Member;

public record MemberFindDto(
        Long id,
        String loginId,
        String nickname
) {
    public static MemberFindDto from(Member member) {
        if (member == null) {
            return null;
        }
        return new MemberFindDto(
                member.getId(),
                member.getLoginId(),
                member.getNick()
        );
    }
}
