package com.dev_sapjil;

/*
문제 : Main 객체의 안녕이 Main클래스가 아닌 다른 클래스 객체에 의해 실행되도록 해주세요.
*/
class Main {
    public static void main(String[] args) {
        Main aMain = new Main();
        //Main안에 메서드가 있다.
        실행자 a실행자 = new 실행자();
        //실행자 클래스 안에는 Main 클래스에 접근할 수 있는 리모콘이 필요하다.
        a실행자.set리모콘(aMain);
        //set리모콘의 매개변수에 Main의 객체(리모콘)가 들어간다.
        a실행자.리모콘_작동();
    }

    public void 안녕() {
        System.out.println("Main::안녕!");
    }
}

class 실행자 {
    private Object a리모콘;

    public void set리모콘(Object a리모콘) {
        this.a리모콘 = a리모콘;
    }

    public void 리모콘_작동() {
        // 수정가능지역 시작

        //(Main)a리모콘.안녕();
        //안녕()이 먼저 실행된다.

        if( a리모콘 instanceof Main)
        ((Main)a리모콘).안녕();
        //추가적으로 범용성을 위해 instanceof를 사용해 main객체를 포함하는지 여부를 묻는다.





        // 수정가능지역 끝
        //리모콘을 작동할 수 있게 메서드를 끌어와야함?
    }
}
