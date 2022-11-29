import java.util.Scanner;

//Question 1: Calculate Average Temperature and find number of days average temperature

import java.util.*;

class Avg_Temp {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.print("How many days' temperatures? ");

int numDays = sc.nextInt();
int[] temp = new int[numDays];
    // record temperatures and find average
int sum = 0;
for (int i=0; i<numDays; i++) {
System.out.print("Day " + (i+1) + "'s high temp: ");

temp[i] = sc.nextInt();
sum += temp[i];
    }
double average = sum / numDays;
    // count days above average
int above = 0;
for (int i=0; i<temp.length; i++) {
if (temp[i]>average) {
above++;
      }
    }
System.out.println();
System.out.println("Average Temp = " + average);
System.out.println(above + " days above average");
  }
}
