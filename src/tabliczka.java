public class tabliczka {
    public static void main(String[] args) {

        String[][] imiona = {
                //  0          1        2
                {"test1", "test2", "test3",},//0
                {"test4", "test5", "test6",},//1
                {"test7", "test8", "test9",},//2
        };
        System.out.println(imiona[2][2]);
        System.out.println(imiona[1][1]);
        System.out.println(imiona[0][0]);

//        imiona[0][0] = "x";
//        imiona[1][1] = "x";
//        imiona[2][2] = "x";

        System.out.println("******");

        for (int i = 0; i < imiona.length; i++) {
            for (int j = 0; j < imiona.length; j++) {
                System.out.print(imiona[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("*****");

        for (int i = imiona.length-1 ; i >-1; i--) {
            for (int j =imiona.length-1  ; j >-1 ; j--) {
                //imiona[i][j]=imiona[imiona.length-i][imiona.length-j];
                System.out.print(imiona[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("*****");

        for (int i = 0; i < imiona.length; i++) {
            for (int j = 0; j < imiona.length; j++) {
                System.out.print(imiona[imiona.length-i-1][imiona.length-j-1] + " ");
            }
            System.out.println();
        }

    }

}
