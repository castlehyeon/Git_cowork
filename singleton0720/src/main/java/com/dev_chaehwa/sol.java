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

            for ( int i = 0; i < 사람들.length; i++ ) {
                사람들[i].자기소개();
            }
        }
    }

    class 사람{

        private int 번호;
        static int 사람수;

        사람(int 번호){
            this.번호 = 번호;
        }
        static 사람 get사람(){
            사람 a사람 = new 사람(사람수 +1);
            사람수++;
            return a사람;
        }
        void 자기소개(){
            System.out.printf("저는 %d번째 사람입니다.\n", 번호);
        }
    }