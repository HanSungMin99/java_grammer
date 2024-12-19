package C07ExceptionFileParsing.AuthorException;

import java.util.*;

//사용자의 입출력을 받아 처리하는 계층(controller)
public class AuthorController {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        while (true){
            //회원가입은 1번, 로그인은 2번
            System.out.println("회원가입은 1번, 로그인은 2번, 회원목록조회 3번");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if(input.equals("1")){
                System.out.println("이름을 입력해주세요.");
                String name = sc.nextLine();
                System.out.println("이메일을 입력해주세요.");
                String email = sc.nextLine();
                System.out.println("패스워드를 입력해주세요.");
                String password = sc.nextLine();
                //email 중복방지, password의 길이 8자리 이상이어야 함.
                authorService.register(name, email, password);
            }else if(input.equals("2")){
                System.out.println("이메일을 입력해주세요.");
                String email = sc.nextLine();
                System.out.println("패스워드를 입력해주세요.");
                String password = sc.nextLine();
                //email과 password가 맞는지 검증
                authorService.login(email, password);
            }else if(input.equals("3")){
                authorService.findAll();
                //전체목록을 서비스로부터 받아와서 출력
                System.out.println();
            }
        }
    }
}
