package com.dev_sapjil;

//public class 사람 {
//    private static int num;
//    static {
//        num = 0;
//    }
//    public 사람(){
//
//    }
//    public static 사람 get사람() {
//        ++num;
//        return new 사람();
//    }
//
//    public void 자기소개() {
//        System.out.println("저는 " + num + "번째 사람입니다.");
//    }
//}

import java.util.ArrayList;
//
//1. 최대 사람수 x  -> 3
//2. a사람x -> arraylist 저장소
class 사람 {
    static private int 사람수;
    //힙에 먼저 올라간다.
    private int 번호;
    //지역변수
    static ArrayList<사람> arr;

    // static 요소 전용 생성자
    // 따로 뭔가를 호출하지 않아도 프로그램이 실행되면 가장먼저 실행된다.
    static {
        사람수 = 0;
        arr = new ArrayList<>();
    }
    //힙에 올라갈 때 초기화
    private 사람(int 번호) {
        this.번호 = 번호;

    }
    //이건 일반적인 생성자: 매개변수 있음!
    static 사람 get사람() {//스태틱메서드 안에 인스턴스 변수를 못씀.
            사람 a사람 = new 사람(사람수 + 1); //a사람=지역변수, static?
        //a사람은 지역변수
        //a사람은 지금 new 사람(index번호) 객체가 생성될때마다, 그 주소값을 저장한다.
            arr.add(사람수, a사람);
            //추가, 삭제, 수정 add, remove, set
            //new 사람하면서, ()안에 스태틱변수를 1씩 추가-> 이게 번호로 저장

        //안없어지는 저장소? -> static선언한 arraylist라는 거죠!!!!
        //arraylist는 배열, 배열 각각에다가 저는 객체의 주소를 넣었어요!!
        ++사람수;
        if( 사람수  > 3){  ///if문
                return arr.get(2);//이게 지금 제일 마음에 안듦?? ->>>>>>>> 2가 들어가야대!!
           }

        //후입 선입은 크게 상관없는듯.
        return a사람;
    }
    //생성자를 리턴하는 메서드.

    public void 자기소개() {
        System.out.println("저는 " + 번호 + "번째 사람입니다.");
    }
}