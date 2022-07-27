package com.dev_sapjil;

//code.oa.gg/java8/1416

class Main {
    public static void main(String[] args) {
        Activity activity = new MainActivity();
        //만들어진 리모콘은 부모 클래스 참조변수
        activity.onCreate();
        // 출력 => 메인 액티비티가 실행되었습니다.

    }
}
abstract class Activity{
    abstract void onCreate();
}
class MainActivity extends Activity{
    void onCreate(){
        System.out.println("메인 액티비티가 실행되었습니다.");
    }
}