package com.softserveinc;

/*
    Write a program that calculates the average annual temperature.
    Also, you need to find months with the lowest and highest temperature in a year.

    Month          |  I   | II   | III |  IV  |  V   |  VI  | VII  | VIII | IX   |  X   | XI  | XII
    ---------------|------|------|-----|------|------|------|------|------|------|------|-----|------
    Temperature    | -1.7 | -1,0 | 2,6 |  9,0 | 15,1 | 19,4 | 21,4 | 21,2 | 17,1 | 11,1 | 5,9 |  1,4

    The example below shows how your output might look:

    Average annual temperature: 10.125
    Month with the lowest temperature in a year: I
    The month with the highest temperatures in a year: VII
 */
public class Task01 {
    public static void main(String[] args) {
                              //  I  | II | III | IV |  V  |  VI | VII | VIII | IX  |  X  | XI |  XII
        double[] temperature = { -1.7, -1.0, 2.6,  9.0, 15.1, 19.4, 21.4, 21.2, 17.1, 11.1, 5.9,  1.4 };
        // TODO: Write your code here
        double average = temperature[0];
        for (int i = 1; i < temperature.length; i++)
            average += temperature[i];
        average = average / temperature.length;
        System.out.println("Average annual temperature: " + average);

        String[] romanMonth = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII"};
        int minCounter = 0, maxCounter = 0;
        for (int i = 1; i < temperature.length; i++) {
            if (temperature[minCounter] > temperature[i])
                minCounter = i;
            if(temperature[maxCounter] < temperature[i])
                maxCounter = i;
        }

        System.out.println("Month with the lowest temperature in a year: " + romanMonth[minCounter]);
        System.out.println("The month with the highest temperatures in a year: " + romanMonth[maxCounter]);
    }
}