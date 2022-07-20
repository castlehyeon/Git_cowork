package com.dev_chaehwa;

public class sol {
    //code.oa.gg/java8/1073
// 문제 : 사람객체를 생성한 후 나이를 22살로 만들어주세요.
// 조건 : 사람 생성자는 수정/추가할 수 없습니다.
// 조건 : 아래와 같이 출력 되어야 합니다.
        public static void main(String[] args) {
            사람[] 사람들 = new 사람[5];
            사람들[0] = 사람.get사람();
            사람들[1] = 사람.get사람();
            사람들[2] = 사람.get사람();
            사람들[3] = 사람.get사람();
            사람들[4] = 사람.get사람();

            System.out.println("실행완료");
        }
    }

    class 사람{
        static 사람 get사람(){
           return new 사람();
        }
    }