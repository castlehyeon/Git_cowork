package com.dev_chaehwa;

public class sol {
    //code.oa.gg/java8/1073
// 문제 : 사람객체를 생성한 후 나이를 22살로 만들어주세요.
// 조건 : 사람 생성자는 수정/추가할 수 없습니다.
// 조건 : 아래와 같이 출력 되어야 합니다.
        public static void main(String[] args) {
            사람 a사람;

            a사람 = 사람.사람생성();
            a사람.set나이(22);

            System.out.println("사람의 나이는 " + a사람.get나이() + "살 입니다.");
            // 출력 : 사람의 나이는 22살 입니다.
        }
    }

class 사람 {
    private int 나이;

    private 사람() {
    }
    void set나이(int age){
        this.나이 = age;
    }
    public int get나이(){
        return 나이;
    }
     static 사람 사람생성(){ //static은 생성할 때만
        return new 사람();
    }
    // 힌트 : 여기에 메서드 3개 추가해야 합니다.
}

