package C07ExceptionFileParsing;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class C0704HttpJsonParsing {
    public static void main(String[] args) throws IOException, InterruptedException {
        //HttpClient클래스를 통해 외부 데이터(api) 요청
        //http:인터넷 표준
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET() //데이터를 달라고 할 때는 get, 내가 데이터를 줄 때는 post
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String postString = response.body();
        List<Post> posts = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(postString);
        for(JsonNode j : jsonNode){
            Post p1 = objectMapper.readValue(j.toString(), Post.class);
            posts.add(p1);
        }
        System.out.println(posts); //그냥 출력하면 주소값으로 나오기 때문에 아래의 class에 toString 메서드 추가 필요
    }
}

class Post{
    private int userId;
    private int id;
    private String title;
    private String body;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
