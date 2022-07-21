package com.dev_sapjil;

/*
문제 : 사람 객체의 `안녕`이 `button.click();`에 의해 실행되도록 해주세요.
조건 : Button에는 `사람` 이라는 언급이 없어야 합니다.
*/
class Main {
    public static void main(String[] args) {
        Button aButton = new Button();
        aButton.setClickEventListener(new 고양이());
        aButton.fireClick();
        // 나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.setClickEventListener(new 개());
        aButton.fireClick();
        // 나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.setClickEventListener(new 부엉이());
        // 나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.fireClick();
    }
}
class Button{
    Animal animal;
    public Button(){
        animal = null;
    }
    public void setClickEventListener(Animal info) {
        animal = info;
    }

    public void fireClick() {
        animal.response();
    }
}
interface Animal{
    //Listener의 역할
    void response();
    //응답의 역할
}
class 고양이 implements Animal{
    void 울음소리(){
        System.out.println("나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
    @Override
    public void response() {
        울음소리();
    }
}
class 개 implements Animal{
    void 울음소리(){
        System.out.println("나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
    @Override
    public void response() {
        울음소리();
    }
}
class 부엉이 implements Animal{
    void 울음소리(){
        System.out.println("나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
    @Override
    public void response() {
        울음소리();
    }
}
//인터페이스를 선언하는 것까지는 알겠어.
//그럼 버튼을 눌렀을 때, 무엇이 실행되야할까.
//1. Button측에 무엇을 만들어야 출력이 될 것이다.
//2. 리스너 타입의 a리스너를 만든다. 주소값을 담기 위한 null초기화
//3. 어차피 매개변수로 들어오는 것은 리스너를 상속받았기 때문에 매개변수타입을 리스너로 했다. -> Object 타입선언당시의 캐스팅에러 해결
//4. 주소값을 해당 a리스너에 넣고, 메서드가 실행될 때마다 리스너에 정의된 메서드를 호출한다.