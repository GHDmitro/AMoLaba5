package sample;

import java.util.Arrays;

/**
 * Created by Alexander Serbin on 25.04.2016.
 */
public class Gauss {
    public static double[][] a =
            {{1,-1,3,1,5},
            {4,-1,5,4,4},
            {2,-2,4,1,6},
            {1,-4,5,-1,3}};

//                    {{2,1,4,7},
//                    {2,-1,-3,-5},
//                    {3,4,5,-14}};

           /* {{1, -4, 0, -1, 6},
                    {1, 1, 2, 3, -1},
                    {2, 3, -1, -1, -1},
                    {1, 2, 3, -1, 3}};*/
    //    public static double []b={7,-5,-14};
    public static double[] x = new double[a.length];//          array of X
    public static double[][] q = new double[a.length][a[1].length];
    public static int l = a.length;//                   row amount
    public static int ls = a[1].length;//               columns amount


    public static void main(String[] args) {


//        for (int i=0;i<a.length;i++){
//            for (int j=0;j<a[i].length;j++){
//                q[i][j]=a[i][j];                    //filling q Array
//            }
//        }

        q = Arrays.copyOf(a, a.length);

//        for (int i=0;i<q.length;i++){
//            for (int j=0;j<q[i].length;j++){
//                System.out.print(q[i][j]+"       ");
//            }
//            System.out.println();
//        }

        /*for (int i=0;i<q.length-1;i++){
            for (int j=i+1;j<q.length;j++){
                System.out.println(i+" "+j);
                changeRows(i+1,j+1);
            }
        }*/
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (i == j) continue;
                changeRows(i, j);
            }
        }
        System.out.println("My Matrix");
        for (int i=0;i<q.length;i++){
            for (int j=0;j<q[i].length;j++){
                System.out.print(q[i][j]+"       ");
            }
            System.out.println();
        }
        getEachX();

        for (int i=0;i<x.length;i++){
            System.out.println("x"+(i+1)+" = "+x[i]);
        }


    }

    /**
     * Метод для приведения к верхнему треугольному виду
     * отнимает s2 ряд от s1
     *
     * @param s1 рядок первый
     * @param s2 рядок второй
     */
    public static void changeRows(int s1, int s2) {
        System.out.println("TOSS FOR " + s1 + " " + s2);
//        double [][]temp=q.clone();
        double[][] temp = new double[q.length][q[1].length];
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q[i].length; j++) {
                temp[i][j] = q[i][j];
            }
//            System.out.println();
        }
//        s2=s2-1;
//        s1=s1-1;
        if (s2 > a[0].length) {
            throw new IndexOutOfBoundsException("what");
        }
        for (int i = 0; i < s1; i++) {
            if (q[s2][i] != 0) throw new IndexOutOfBoundsException(q[s2][i] + " is bad((((");
        }

        double m2 = temp[s2][s1] / temp[s1][s1];
        System.out.println("m2 = " + m2);
        for (int i = s1; i < temp[0].length; i++) {        //умножение на М
            temp[s1][i] = temp[s1][i] * m2;
        }
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q[i].length; j++) {
                System.out.print(q[i][j] + "       ");
            }
            System.out.println();
        }
        System.out.println("behold");
        for (int i = s1; i < temp[0].length; i++) {                        //вычитание
            q[s2][i] = q[s2][i] - temp[s1][i];
            System.out.println("q[" + (s2) + "][" + i + "] = " + q[s2][i]);
        }
    }

    public static void getEachX() {
        //массив этот Х является самый нижный
        x[l - 1] = q[l - 1][ls - 1] / q[l - 1][ls - 2];
        System.out.println(x[l - 1]);
        double temp = 0;
        for (int i = l - 2; i >= 0; i--) {
            temp = 0;
            for (int j = i; j < (l - 1); j++) {
                temp += x[j + 1] * q[i][j + 1];
//                System.out.println("x[j-1] = " + x[j ]);
//                System.out.println("q[i][j] = " + q[i][j]);
            }
//            System.out.println(q[i][i]);
//            System.out.println(q[i][q.length-1]);
//            System.out.println(temp);
            x[i] = (q[i][ls - 1] - temp) / q[i][i];
//            System.out.println("x[i] = " + x[i]);
        }

    }
}
