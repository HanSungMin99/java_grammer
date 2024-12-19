package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C0703JsonParsing  {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Path filePath = Paths.get("src/C07ExceptionFileParsing/json1.json");
        String st1 = Files.readString(filePath);
        System.out.println(st1);

        //밑의 2가지는 반드시 기억해두어야 한다.
        //readTree: 트리구조의 JsonNode객체로 변환 → 굉장히 유연하다는 장점이 있다.

        //readValue: 바로 java 객체로 변환
    }
}
