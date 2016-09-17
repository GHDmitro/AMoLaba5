package sample;

import java.util.Arrays;
public class Algorithm {
    private static Algorithm ourInstance = new Algorithm();
    public static Algorithm getInstance() {
        return ourInstance;
    }
    private Algorithm() {
    }
    private double[][] a ;
    private Double[] x ;//          array of X
    private double[][] q;
    private int l ;//                   row amount
    private int ls;//               columns amount
    private int count;

    private void changeRows(int s1, int s2) {
        System.out.println("TOSS FOR " + s1 + " " + s2);
//        double [][]temp=q.clone();
        double[][] temp = new double[q.length][q[1].length];
        for (int i = 0; i < q.length; i++) {
            System.arraycopy(q[i], 0, temp[i], 0, q[i].length);
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
        for (double[] aQ : q) {
            for (double anAQ : aQ) {
                System.out.print(anAQ + "       ");
            }
            System.out.println();
        }
        System.out.println("behold");
        for (int i = s1; i < temp[0].length; i++) {                        //вычитание
            q[s2][i] = q[s2][i] - temp[s1][i];
            System.out.println("q[" + (s2) + "][" + i + "] = " + q[s2][i]);
        }
    }
    private void getEachX() {
        //массив этот Х является самый нижный
        x[l - 1] = q[l - 1][ls - 1] / q[l - 1][ls - 2];
        System.out.println(x[l - 1]);
        double temp = 0;
        for (int i = l - 2; i >= 0; i--) {
            temp = 0;
            for (int j = i; j < (l - 1); j++) {
                temp += x[j + 1] * q[i][j + 1];
            }
            try {
                x[i] = (q[i][ls - 1] - temp) / q[i][i];
            }catch (ArithmeticException e){
                e.printStackTrace();
                x[i] = null;
            }
        }
    }

    public void getXarray(double[][] a){
        this.a = a;
        x = new Double[a.length];
        q = new double[a.length][a[0].length];
        l = a.length;
        ls = a[1].length;
        q = Arrays.copyOf(a, a.length);
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (i == j) continue;
                changeRows(i, j);
            }
        }
        getEachX();
        for (int i=0;i<x.length;i++){

            System.out.println("x"+(i+1)+" = "+x[i]);
        }
    }
    public String round(double x) {
        String d = String.valueOf(x);
        String as = null;
        String g;
        if (d.contains("E")) {
            as = d.substring(d.indexOf("E"));
            d = d.substring(0, 6) + as;
        } else if (d.substring(d.indexOf(".") + 1).length() > 3) {
            if (d.substring(0, 1).equalsIgnoreCase("-")) {
                d = d.substring(0, 8);
            }else {
                d = d.substring(0, 7);
            }
        }
        return d;
    }
    public double[][] getA() {
        return a;
    }
    public double[][] getQ() {
        return q;
    }
    public int getCount() {
        return count;
    }
    public Double[] getX() {
        return x;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
