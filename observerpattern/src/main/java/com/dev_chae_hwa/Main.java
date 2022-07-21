package com.dev_chae_hwa;
/*
main 클래스 내에 있는 안녕 메서드를 실행하고 싶으면 aMain.안녕();하면 되지만
Main 클래스가 아닌 다른 클래스 객체에 의해 실행되로혹 해보자.
 */
class Main {
    public static void main(String[] args) {
        Main aMain = new Main(); // main 클래스로 호출을 못하니 새로은 클래스로

        실행자 a실행자 = new 실행자(); //생성된 실행자 클래스에 안녕 메서드 호출이 목표
        a실행자.set리모콘(aMain); // aMain 리모컨을 실행자에게 쥐어주고
        a실행자.리모콘_작동();    //쥐어줘야 작동 버튼을 누를 수 있다.
    }

    public void 안녕() {
        System.out.println("Main::안녕!");
    }
}

class 실행자 {
    private Object a리모콘;   //호환 가능한 Object

    public void set리모콘(Object a리모콘) { // aMain리모컨을 범용적인 Object로 변경
        this.a리모콘 = a리모콘;   // 변경하게 되면 버튼 수가 1 -> 0로 제거
    }

    public void 리모콘_작동() {
        if(a리모콘 instanceof Main){ // 너가 갖고 있는 a리모콘이 main 객체야?
            ((Main)a리모콘).안녕(); // 버튼이 0개인 a리모컨에 다시 안녕 버튼을 주가하려
        }                         // 다시 main으로 형변환 해줘야 안녕 버튼이 작동 가능
    }
}