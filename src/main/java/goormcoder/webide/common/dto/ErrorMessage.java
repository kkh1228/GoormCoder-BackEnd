package goormcoder.webide.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorMessage {

    //404 NOT_FOUND
    MEMBER_NOT_FOUND("해당하는 사용자가 존재하지 않습니다."),
    QUESTION_NOT_FOUND("해당하는 문제가 존재하지 않습니다."),
    BOARD_NOT_FOUND("해당하는 게시글이 존재하지 않습니다."),
    COMMENT_NOT_FOUND("해당하는 댓글이 존재하지 않습니다."),
    LIKE_NOT_FOUND("해당하는 좋아요가 존재하지 않습니다."),
    TESTCASE_NOT_FOUND("해당하는 테스트케이스가 존재하지 않습니다."),
    
    //409 CONFLICT
    LIKE_CONFLICT("이미 좋아요를 누르셨습니다."),
  
    JWT_UNAUTHORIZED_EXCEPTION("사용자 검증에 실패했습니다."),
    JWT_FORBIDDEN_ACCESS("접근 권한이 없습니다."),
    JWT_USER_NOT_FOUND_EXCEPTION("존재하지 않는 사용자입니다."),
    JWT_BAD_CREDENTIAL_EXCEPTION("아이디 또는 비밀번호가 잘못 되었습니다."),
    INTERNAL_SERVER_ERROR("서버 오류입니다."),
    TOKEN_NOT_FOUND("존재하지 않는 토큰입니다."),
    TOKEN_EXPIRED("만료된 토큰입니다."),

    FORBIDDEN_BOARD_ACCESS("해당 게시글에 대한 접근 권한이 없습니다."),
    FORBIDDEN_COMMENT_ACCESS("해당 게시글에 대한 접근 권한이 없습니다."),
    ;

    private final String message;
}
