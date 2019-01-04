package totaldaysinyear;

import java.io.*;

public class TotalDaysInYear {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sTotalDays = br.readLine();
        int nTotalDays = Integer.parseInt(sTotalDays);
        int x = 0;

        if (nTotalDays % 400 == 0) {
            // Високосный год
            x = 366;
            System.out.println("количество дней в году: " + x);
        } else if (nTotalDays % 100 == 0) {
            //обычный год
            x = 365;
            System.out.println("количество дней в году: " + x);
        } else if (nTotalDays % 4 == 0) {
            // Високосный год
            x = 366;
            System.out.println("количество дней в году: " + x);
        } else {
            // оставшиеся год являются обычными
            x = 365;
            System.out.println("количество дней в году: " + x);
        }
    }
}
