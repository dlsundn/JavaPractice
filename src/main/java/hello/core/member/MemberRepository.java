package hello.core.member;

public interface MemberRepository {
    //아이디 저장
    void save(Member member);
    //아이디 찾기
    Member findById(Long id);
}
