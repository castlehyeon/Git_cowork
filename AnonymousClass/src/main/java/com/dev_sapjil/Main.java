package com.dev_sapjil;

class Main {
    public static void main(String[] args) {
        View.OnClickListener aOnClickListener;

        // 수정가능지역 시작

        //방법 2. 익명클래스
        aOnClickListener = new View.OnClickListener(){
                public void onClick(){
                    System.out.println("클릭되었다는 사실을 전달받았습니다.");
                }
            };
        aOnClickListener.onClick();
        // 출력 => 클릭되었다는 사실을 전달받았습니다.
    }
    // 수정가능지역 끝

    }

class View {
    static interface OnClickListener {
        public void onClick();
    }
}
