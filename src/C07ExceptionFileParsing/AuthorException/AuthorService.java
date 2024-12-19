package C07ExceptionFileParsing.AuthorException;

import java.util.*;

//핵심 로직(비지니스 로직)을 구현하는 계층
public class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService(){
        authorRepository = new AuthorRepository();
    }

    // 회원가입
    public void register(String name, String email, String password){
        // 이메일 중복 체크
        Optional<Author> existAuthor = authorRepository.findByEmail(email);
        if (existAuthor.isPresent()) throw new IllegalArgumentException("이메일 중복됩니다.");
        // 비밀번호 길이 체크
        if (password.length() < 8) throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        // 등록
        Author author = new Author(name, email, password);
        authorRepository.register(author);
        System.out.println("회원가입이 완료되었습니다.");

    }

    // 로그인
    public void login(String email, String password){
        Optional<Author> author = authorRepository.findByEmail(email);
        if (! author.isPresent()) {
            throw new NoSuchElementException("없는 이메일입니다.");
        }else {
            if (! author.get().getPassword().equals(password)){
                throw new IllegalArgumentException("잘못된 비밀번호입니다.");
            }
        }
    }

    // 전체 목록 조회
    public void findAll(){
        List<Author> authors = authorRepository.findAll();
        if (authors.isEmpty()) {
            System.out.println("등록된 회원이 없습니다.");
        } else {
            for (Author author : authors) {
                System.out.println(author);
            }
        }
    }
}
