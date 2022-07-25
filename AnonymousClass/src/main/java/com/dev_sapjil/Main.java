package com.dev_sapjil;

class Main {
    public static void main(String[] args) {
        View.OnClickListener aOnClickListener;

        // 수정가능지역 시작

        //방법 1. 익명클래스는 아니다.
        class 방법1 implements View.OnClickListener{
            public void onClick(){
                System.out.println("클릭되었다는 사실을 전달받았습니다.");
            }
        }

        aOnClickListener = new 방법1();
        // 수정가능지역 끝

        aOnClickListener.onClick();
        // 출력 => 클릭되었다는 사실을 전달받았습니다.
    }
}

class View {
    static interface OnClickListener {
        public void onClick();
    }
}
