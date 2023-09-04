package CSP;

import java.util.Scanner;

/**
 * @author 马蒙
 * @date 2023/8/31 11:01
 */
public class Repetition {
    public static void main(String[] args) {

        Scanner as = new Scanner(System.in);

        int n = as.nextInt();
        String[] p = new String[n];

        for (int i = 0; i < n; i++) {

            for (int v = 0; v < 8; v++) {

                if (p[i] != null){
                    p[i] = p[i]+(as.nextLine());
                } else if (p[i] == null) {
                    p[i] = (as.nextLine());
                }

            }
        }
        //遍历数组
        for (int j = 0; j < n; j++) {
            int ci = 1;
            for (int k = 0; k < j; k++) {
                if (p[j].equals(p[k])) {
                    ci = ci + 1;
                }
            }
            System.out.println(ci);
        }

    }
}

