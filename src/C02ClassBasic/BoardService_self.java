package C02ClassBasic;

import java.util.*;

//1.회원가입 : 이름, 이메일(중복되면 안됨), 비밀번호, author_id값(auto_increment)
//2.회원 전체 목록 조회 : author_id, email
//3.회원 상세 조회(id로 조회) : author_id, email, name, password, 회원이 작성한 글 수도 조회되게
//4.게시글 작성 : post_id값(auto_increment), 제목, 내용, 작성자email → author_id를 찾아서 author_id로 변경 입력
//5.게시물 목록 조회 : post_id, title
//6.게시물 상세 조회 : post_id, title, contents, 작성자email
//7.서비스 종료

public class BoardService_self {
    private static List<Author> authors = new ArrayList<>();
    private  static List<Post> posts = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("원하시는 서비스를 고르세요. 1.회원가입, 2.회원목록조회 3.회원상세조회 4.게시글작성, 5.게시글 목록조회, 6.게시물 상세조회 7.종료");
            int number = sc.nextInt();
            if (number == 1) { //1. 회원가입
                System.out.println("이름을 입력하세요");
                String name = sc.next();
                System.out.println("이메일을 입력하세요");
                String email = sc.next();
                if (findAuthorByEmail(email) != null) {
                    System.out.println("이미 존재하는 아이디입니다. 다시 시도해주세요");
                    continue;
                }
                System.out.println("비밀번호를 입력하세요");
                String password = sc.next();
                authors.add(new Author(name, email, password));
                System.out.println("회원가입이 완료되었습니다.");

            } else if (number == 2) { //회원 목록 조회
                System.out.println("회원목록조회입니다.");
                System.out.println("회원 목록: ");
                for (Author author : authors) {
                    System.out.println("ID: " + author.getId() + " Email: " + author.getEmail());
                }

            } else if (number == 3) { //회원 상세 조회
                System.out.println("회원상세조회입니다. id를 입력해주세요");
                int id = sc.nextInt();
                Author author = findAuthor(id);
                if (author == null) {
                    System.out.println("해당 id의 회원을 찾을 수 없습니다.");
                    continue;
                }
                System.out.println("ID: "+author.getId());
                System.out.println("Name: " + author.getName());
                System.out.println("Email: " + author.getEmail());
                System.out.println("Password: " + author.getPassword());

                int postCount = 0;
                for(Post post: posts){
                    if(post.getAuthorId()==id){
                        postCount++;
                    }
                }
                System.out.println("작성한 게시글 수: "+ postCount);

            }else if(number == 4){
                System.out.println("작성자의 이메일을 입력하세요");
                String email = sc.next();
                Author author = findAuthorByEmail(email);
                if(author == null){
                    System.out.println("해당 이메일의 회원을 찾을 수 없습니다.");
                    continue;
                }
                System.out.println("게시글 제목을 입력하세요");
                String title = sc.next();
                System.out.println("게시글의 내용을 입력하세요");
                String content = sc.next();
                posts.add(new Post(title, content, author.getId()));
                System.out.println("게시글이 작성되었습니다.");

            }else if(number == 5){
                System.out.println("게시글 목록: ");
                for(Post post: posts){
                    System.out.println("Post ID: " + post.getId() + ", Title: " + post.getTitle());
                }

            }else if(number == 6){
                System.out.println("게시글 ID를 입력하세요");
                int id = sc.nextInt();
                Post post = findPost(id);
                if (post == null){
                    System.out.println("해당 ID의 게시글을 찾을 수 없습니다.");
                    continue;
                }
                System.out.println("Post ID: "+post.getId());
                System.out.println("Title: "+post.getTitle());
                System.out.println("Content: "+post.getContents());

                Author author = findAuthor(post.getAuthorId());
                System.out.println("작성자 Email: " + (author != null ? author.getEmail() : "알 수 없음"));

            }else if(number ==7 ){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else {
                System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
            }
        }
    }

    private static Author findAuthor(int id) {
        for (Author author : authors) {
            if (author.getId() == id) {
                return author;
            }
        }
        return null;
    }

    private static Author findAuthorByEmail(String email) {
        for (Author author : authors) {
            if (author.getEmail().equals(email)) {
                return author;
            }
        }
        return null;
    }
    private static Post findPost(int id){
        for(Post post : posts){
            if(post.getId() == id){
                return post;
            }
        }
        return null;
    }
}

class Author {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String email;
    private String password;

    public Author(String name, String email, String password) {
        this.id = idCounter++;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
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
}

class Post {
    private static int postCounter = 1;
    private int id;
    private String title;
    private String contents;
    private int authorId;

    public Post(String title, String contents, int authorId) {
        this.id = postCounter++;
        this.title = title;
        this.contents = contents;
        this.authorId = authorId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public int getAuthorId() {
        return authorId;
    }
}
