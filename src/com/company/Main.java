package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int dates[][] = new int[t][3];
        String date;
        String[] day_month_year;
        int constant_of_month[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        int results[] = new int[t];
        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i = 0; i < t; i++) {

            date = br.readLine();

            day_month_year = date.trim().split(" ");

            dates[i][0] = Integer.parseInt(day_month_year[0]);

            dates[i][1] = Integer.parseInt(day_month_year[1]);

            dates[i][2] = Integer.parseInt(day_month_year[2]);


            if (dates[i][1] < 2) {
                dates[i][2] -= 1;
            }

            results[i] = (dates[i][2] + dates[i][2] / 4 - dates[i][2] / 100 + dates[i][2] / 400 + constant_of_month[(dates[i][1]) - 1] + dates[i][0]) % 7;
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println(days[results[i]]);

        }


    }
}





