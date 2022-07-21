package com.dev_chae_hwa;

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
    동물 animals;

    public void setClickEventListener(동물 animals) {
        this.animals = animals;
    }

    public void fireClick() {
        animals.알림();  // 각각의 객체가 담긴 animals 리모컨이 알림 버튼을 작동시킨다.
    }
}
interface 동물{
    void 알림();  // 인터페이스의 추상메서드는 선언부만 작성한다. 자식에게 구현을 맡김.
}
class 고양이 implements 동물{
    void 고양이응답(){
        System.out.println("나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
    public void 알림(){ // 인터페이스의 메서드를 받아올 땐 무조건 public, 그리고 구현부까지 작성한다.
        고양이응답();
    }
}
class 개 implements 동물{
    void 개응답(){
        System.out.println("나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
    public void 알림(){
        개응답();
    }

}
class 부엉이 implements 동물{
    void 부엉이응답(){
        System.out.println("나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
    public void 알림(){
        부엉이응답();
    }

}