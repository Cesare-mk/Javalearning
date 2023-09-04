package CSP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 创建一个字符数组，因为每个局面是8x8的字符数组，所以第二个参数为64
 *
 * @author
 */
public class RepetitionSituation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Map<String, Integer> chess = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < 8; j++) {

                temp.append(scanner.nextLine());
            }

            String tempStr = temp.toString();
            if (chess.containsKey(tempStr)) {

                chess.put(tempStr, chess.get(tempStr) + 1);
            } else {

                chess.put(tempStr, 1);
            }
            System.out.println(chess.get(tempStr));
        }
    }
}
