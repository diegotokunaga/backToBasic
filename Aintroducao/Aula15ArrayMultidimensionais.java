package maratona.dojo.java.Aintroducao;

//array dentro de outro array
public class Aula15ArrayMultidimensionais {
    public static void main(String[] args) {
//        1,2,3 meses
//        31,28,30 dias
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("----------------------------------");
        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
        System.out.println("------------------------------------");

        int[] array2 = {10, 11, 13};
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array2;
        arrayInt[2] = new int[]{50, 35, 86, 47, 69, 25, 75, 65};

        int[][] arrayInt2 = {{12, 44}, {99, 68, 32}, {46, 35, 8, 466, 484, 2315}};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.println(num + " ");
            }
        }

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.println(num + " ");
            }
        }
    }
}
