package C02ClassBasic;

public class C0205Constructor {
    public static void main(String[] args) {
        //캘린더 객체 생성 후 연도, 월, 일 세팅(setter 사용)
        Calender c1 = new Calender("2024", "12", "11");
//        //데이터의 안전성을 위해 일반적으로 setter을 사용하지 않음
//        c1.setYear("2024");
//        c1.setMonth("12");
//        c1.setDay("11");

        //캘린더 객체출력: "오늘은 xxx연도, xx월, xx일 입니다."(getter사용)
        System.out.println("오늘은 " + c1.getYear() + "연도, " + c1.getMonth() + " 월" + c1.getDay() + " 일 입니다.");
    }

}

//year, month, day 변수값 존재하는 클래스, getter/setter추가
class Calender{
    private String year;
    private String month;
    private String day;

    //생성자는 메서드의 일종으로 클래스명과 동일한 이름을 갖는 메서드
    //생성자를 통해 객체변수값들을 객체가 만들어지는 시점에 초기화(세팅)
    public Calender(String year,  String month, String day){ //void, return 넣을 수 없음
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //별도의 생성자를 만들 경우, 초기(기본)생성자는 더이상 사용할 수 없으므로 별도 추가 필요
    public Calender(){

    }

    //getter
    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }
}

