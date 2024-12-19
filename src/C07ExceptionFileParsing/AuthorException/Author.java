package C07ExceptionFileParsing.AuthorException;

//엔티티계층
public class Author {
    private static Long static_id=0L; //static 변수는 클래스 레벨에서 공유
    private Long id; // 객체마다 고유한 id, //원시타입은 잘 사용하지 않음
    private String name;
    private String email;
    private String password;

    //생성자
    public Author( String name, String email, String password) {
        this.id = static_id++;// static_id를 증가시키고 id에 할당
        this.name = name;
        this.email = email;
        this.password = password;
    }

    //getter
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
              '}';
    }
}



