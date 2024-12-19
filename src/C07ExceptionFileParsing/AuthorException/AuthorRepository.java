package C07ExceptionFileParsing.AuthorException;

import java.util.*;

//저장소역할을 하는 계층
public class AuthorRepository {
    private static List<Author> authorList = new ArrayList<>();

    // 등록
    public void register(Author author) {
        authorList.add(author);
    }

    // 이메일로 Author찾는 로직
    public Optional<Author> findByEmail(String email) {
        Author author = null;
        for (Author a : authorList) {
            if (a.getEmail().equals(email)) {
                author = a;
            }
        }
        return Optional.ofNullable(author);
    }

    // 모든 회원 조회
    public List<Author> findAll() {
        return authorList;
    }
}
