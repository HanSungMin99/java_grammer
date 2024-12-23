package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C0703JsonParsing {
    //json파일에서
    //전체가 문자열로 취급됨: read하려면 String, 그러나 String으로 읽으면 활용도 떨어짐.
    //따라서 객체로 쓰고 싶음: 객체로 쓰게 도와주는 라이브러리가 json
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Path filePath = Paths.get("src/C07ExceptionFileParsing/json1.json");
        String st1 = Files.readString(filePath);
        System.out.println(st1);

        //밑의 2가지는 반드시 기억해두어야 한다.
        //readTree: 트리구조의 JsonNode객체로 변환 → 굉장히 유연하다는 장점이 있다.
        //트리구조의 장점은 유연하게 데이터를 파싱한다는 것
        JsonNode j1 = objectMapper.readTree(st1);
        //System.out.println(j1);
        //System.out.println(j1.get("id"));
        //System.out.println(j1.get("name"));
        Map<String, String> m1 = new HashMap<>();
        System.out.println(m1.put("id", j1.get("id").asText()));
        System.out.println(m1.put("name", j1.get("name").asText()));
        for(JsonNode j : j1){
            System.out.println(j);
        }


        //readValue: 바로 java 객체로 변환 (쉬움)
        //Map클래스로 변형하면 유연성이 좀 떨어짐
        Map<String, String> myMap = objectMapper.readValue(st1, Map.class);
        System.out.println(myMap);
        System.out.println(myMap.get("name"));
        System.out.println(myMap.get("city"));

        //자주 사용되는 방법
        Student s1 = objectMapper.readValue(st1, Student.class);
        System.out.println(s1);

        //실습: 리스트형식의 student json데이터를 파싱
        List<Student> students = new ArrayList<>();
        ObjectMapper objectMapper1 = new ObjectMapper();
        Path filePath1 = Paths.get("src/C07ExceptionFileParsing/json2.json");
        String st2 = Files.readString(filePath1);
        JsonNode jsonNodes = objectMapper1.readTree(st2);
        for(JsonNode j : jsonNodes){
            Student s2 = objectMapper1.readValue(j.toString(), Student.class);
            students.add(s2);
        }

    }
}


//실제 값의 setting은 reflection이라는 기술을 통해 변수에 직접 접근. private이라 할지라도 접근 가능.
//objectmapper는 getter 또는 setter의 메서드명을 통해 필드값을 유추


class Student {
    private int id;
    private String name;
    private String classNumber;
    private String city;

    //getter가 꼭 필요함(자동완성으로 생성할 것, 변수값 예측가능)
    //setter는 없어도 된다.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        String Student ="";
        return "C0703JsonParsing{" +
                "Student=" + Student +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", classNumber='" + classNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}




