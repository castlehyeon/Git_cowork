package com.dev_chaehwa;

/*
문제 : 사람 객체의 `안녕`이 `button.click();`에 의해 실행되도록 해주세요.
조건 : Button에는 `사람` 이라는 언급이 없어야 합니다.
*/
class Main {
    public static void main(String[] args) {
        Button button = new Button();
        button.setListener(new 사람()); // 사람 리모컨을 setListener에 담기
        button.click();
    }
}

class 사람 {
    public void 안녕() {
        System.out.println("Main::안녕!");
    }
}
class Button{
    Object person;
    public void setListener(Object person) { // person == new 사람()
        this.person = person;
    }

    void click(){ //person은 사람이므로 person으로 안녕을 조작한다.
        ((사람)person).안녕();  // 사람이 object로 변환되면서 버튼이 제거되었으니,
                              // 다시 안녕 버튼을 추가해주려면 사람으로 변환해주어야 된다.
    }


}