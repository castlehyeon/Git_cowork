package com.dev_chae_hwa;

class Main {
    public static void main(String[] args) {
        View.OnClickListener aOnClickListener;

        aOnClickListener = new View.OnClickListener(){
            public void onClick(){
                System.out.println("클릭되었다는 사실을 전달받았습니다.");
            }
        }; // 내부 클래스는 중괄호 뒤에 세미콜론이 필수(문법)

          /* 람다식
          aOnClickListener = () -> {
             System.out.println("클릭되었다는 사실을 전달받았습니다.");
        };
        */

        aOnClickListener.onClick();
        // 출력 => 클릭되었다는 사실을 전달받았습니다.
    }
}
class View {
    static interface OnClickListener {
        public void onClick();
    }
}