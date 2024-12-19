package C07ExceptionFileParsing.AuthorException;

import java.util.*;

//핵심 로직(비지니스 로직)을 구현하는 계층
public class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService(){
        authorRepository = new AuthorRepository();
    }

    public register(){
        this.authorRepository.register();
    }

    public login(){
        this.authorRepository.findByEmail();
    }

    public findAll(){
        this.authorRepository.findAll();

    }

}
