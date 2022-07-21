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
    private Object animals;

    public void setClickEventListener(Object animals) {
        this.animals = animals;
    }

    public void fireClick() { //object로 받아온 건 리모컨 버튼을 제거하는 것.
        if(animals instanceof 고양이){ //animals은 고양이, 개, 부엉이 중 무엇이냐 물은 후,
            ((고양이)animals).고양이응답(); //그에 맞는 동물로 형변환 및 메서드 호출
        }
        if(animals instanceof 개){
            ((개)animals).개응답();
        }
        if(animals instanceof 부엉이){
            ((부엉이)animals).부엉이응답();
        }
    }
}
class 고양이{
    void 고양이응답(){
        System.out.println("나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달받았습니다.");
    }
}
class 개{
    void 개응답(){
        System.out.println("나(개)는 방금 버튼이 클릭되었다는 사실을 전달받았습니다.");
    }
}
class 부엉이{
    void 부엉이응답(){
        System.out.println("나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달받았습니다.");
    }
}