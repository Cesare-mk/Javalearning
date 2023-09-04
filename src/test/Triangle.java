package test;

import org.junit.Test;

public class Triangle {
    public String triangle(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c) {
                if (a == b || b == c || a == c) {
                    if (a == b && b == c) {
                        return "equilateral";
                        //等边
                    }
                    return "isosceles";
                    //等腰
                } else {
                    return "scalene";
                    //不等边
                }
            } else {
                return "Not Triangle";
                //两边和不大于第三边
            }
        } else {
            return "Not Triangle";
            //输入小于0 的
        }
    }

    public int a;
    public int b;
    public int c;


    @Test
    public void testCase1(){
        Triangle t1 =  new Triangle();
        System.out.println(t1.triangle(5,4,9));

    }
    @Test
    public void testCase2(){
        Triangle t2 =  new Triangle();
        System.out.println(t2.triangle(-10,8,12));
        //System.out.println(t2.triangle(10,-8,12));
        //System.out.println(t2.triangle(10,8,-12));

    }
    @Test
    public void testCase3(){
        Triangle t3 =  new Triangle();
        System.out.println(t3.triangle(3,4,7));

    }
    @Test
    public void testCase4(){
        Triangle t4 =  new Triangle();
        System.out.println(t4.triangle(4,4,6));

    }
    @Test
    public void testCase5(){
        Triangle t5 =  new Triangle();
        System.out.println(t5.triangle(10,10,10));

    }
}

