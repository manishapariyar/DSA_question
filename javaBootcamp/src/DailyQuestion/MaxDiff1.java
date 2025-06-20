package DailyQuestion;

public class MaxDiff1 {
    public static void main(String[] args) {
        int num = 555;
        String str = String.valueOf(num);

        int max = num;
        int min = num;

        for (char x = '0'; x <= '9'; x++) {
            for (char y = '0'; y <= '9'; y++) {
                if (x == y) continue;

                String replaced = str.replace(x, y);

                // Skip if it leads to leading zero or entire number becomes zero
                if (replaced.charAt(0) == '0') continue;

                int val = Integer.parseInt(replaced);
                max = Math.max(max, val);
                min = Math.min(min, val);
            }
        }


        System.out.println(max-min);

    }

}
