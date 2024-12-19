package C07ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//저장소역할을 하는 계층
public class AuthorRepository {
    private static List<Author> authorList = new ArrayList<>();

    public void register(Author author) {
        authorList.add(author);
    }

    public Optional<Author> findByEmail(String email) {
        //email로 Author를 찾는 로직 필요
    }

    public List<Author> findAll() {

    }
}
