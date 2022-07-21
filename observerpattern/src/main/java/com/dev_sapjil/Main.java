package com.dev_sapjil;

/*
문제 : 사람 객체의 `안녕`이 `button.click();`에 의해 실행되도록 해주세요.
조건 : Button에는 `사람` 이라는 언급이 없어야 합니다.
*/
class Main {
    public static void main(String[] args) {
        Button aButton = new Button();
        aButton.setClickEventListener(new 고양이());
        //객체 생성
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
    Object info;
    Animal animal;


    public Button(){
        info = null;
        animal = null;
        //주소값이 들어가는 animal
    }
    public void setClickEventListener(Object info) {
        this.info = info;
        //해당 동물객체로 다운캐스팅
    }

    public void fireClick() {
        //animal = (Animal) info;
        //System.out.println("나("+animal.name+")는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
        //캐스팅이 안된다. 고양이, 개, 부엉이 타입 -> Object -> Animal로 다운캐스팅이 불가능.
        System.out.println("나("+info+")는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
        //단순히 주소값은 받아오는 것 가능.
        //animal.name을 어떻게든 긁어오고 싶었는데...
        //현재는 name을 선언한 의미가 없다.

    }
}
class Animal{
    public String name;
    public Animal(){
        name = "";
    }
}
class 고양이{
    //String name;
    Animal animal;
    public 고양이(){
        //name = String.valueOf(new Animal());
        animal = new Animal();
        animal.name = "고양이";
    }
}
class 개{
    Animal animal;
    public 개(){
        animal = new Animal();
        animal.name = "개";
    }
}
class 부엉이{
    Animal animal;
    public 부엉이(){
        animal = new Animal();
        animal.name = "부엉이";
    }
}