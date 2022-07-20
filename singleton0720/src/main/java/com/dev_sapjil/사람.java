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

class 사람 {
    static private int 사람수;
    //힙에 먼저 올라간다.
    private int 번호;
    //지역변수


    // static 요소 전용 생성자
    // 따로 뭔가를 호출하지 않아도 프로그램이 실행되면 가장먼저 실행된다.
    static {
        사람수 = 0;
    }
    //힙에 올라갈 때 초기화
    private 사람(int 번호) {
        this.번호 = 번호;
    }
    //이건 일반적인 생성자: 매개변수 있음!
    static 사람 get사람() {
        사람 a사람 = new 사람(사람수 + 1);
        //new 사람하면서, ()안에 스태틱변수를 1씩 추가-> 이게 번호로 저장
        사람수++;
        //후입 선입은 크게 상관없는듯.
        return a사람;
    }
    //생성자를 리턴하는 메서드.

    public void 자기소개() {
        System.out.println("저는 " + 번호 + "번째 사람입니다.");
    }
}