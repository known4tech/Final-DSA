package com.yatinkumar;

import java.util.*;

public class Day2Ques {
    static int[] values = new int[1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//Q1. Write a java program to find the numbers greater than the average of the numbers of a given array.
       int[] elements = new int[]{1,4,17,7,25,3,100};
       int sum = 0;
       System.out.print("Original Array: ");
       System.out.println(Arrays.toString(elements));
       for(int i = 0; i<elements.length; i++){
           sum = sum + elements[i];
       }
       double avg = sum / elements.length;
       System.out.println("The average of the said array is: " + avg);
       System.out.println("The numbers in the array greater than the average are: ");
       for (int i = 0; i < elements.length; i++) {
           if(elements[i] > avg){
               System.out.print(elements[i] + " ");
           }
       }
        

//Q2. Write a Java Program that takes a number as input adn print its multiplication table upto 10.
       System.out.print("Enter any number: ");
       int num = sc.nextInt();

       for (int i = 1; i <= 10; i++) {
           System.out.println(num + "*" + i + "=" + num * i);
       }
        

//Q3. Write a java program to sum values of an array.
       int[] elements = new int[]{1,4,17,7,25,3,100};
       int sum = 0;
       System.out.println("Given array: " + Arrays.toString(elements));
       for(int i = 0; i<elements.length; i++){
       sum = sum + elements[i];
       }
       System.out.println("Sum of values of given array is: " + sum);
        

//Q4. Write a Java Program to find the maximum and minimum value of an array.
       System.out.print("Enter the number of elements: ");
       int elements = sc.nextInt();
       int[] array = new int[elements];

       for (int i = 0; i < elements; i++) {
           System.out.print("Enter a number: ");
           array[i] = sc.nextInt();
       }
       int max = array[0];
       int min = array[0];
       for (int i = 0; i < elements; i++) {
           if (array[i] > max) {
               max = array[i];
           }
           if (array[i] < min) {
               min = array[i];
           }
       }
       System.out.println("The maximum number is: " + max);
       System.out.print("The minimum number is: " + min);
        

//Q5. Write a Java Program to separate 0s on left side and 1s on right side of an array of 0s and 1s in random order.
       int arr[] = new int[] { 0, 1, 0, 1, 1, 1 };
       int n = arr.length;
       segregate0and1(arr, n);
       print(arr, n);
   } -> this closed parenthesis is for main functions #psvm.
   static void segregate0and1(int arr[], int n)
   {
       int count = 0;
       for (int i = 0; i < n; i++) {
           if (arr[i] == 0)
               count++;
       }
       for (int i = 0; i < count; i++)
           arr[i] = 0;

       for (int i = count; i < n; i++)
           arr[i] = 1;
   }
   static void print(int arr[], int n)
   {
       System.out.print("Array after segregation is ");
       for (int i = 0; i < n; i++)
           System.out.print(arr[i] + " ");
   }
}


//Q6. Write a Java Method to find the smallest number among three numbers.
       System.out.print("Enter num1: ");
       int num1 = sc.nextInt();
       System.out.print("Enter num2: ");
       int num2 = sc.nextInt();
       System.out.print("Enter num3: ");
       int num3 = sc.nextInt();

       findSmallest(num1, num2, num3);
   }

   public static void findSmallest(int num1, int num2, int num3) {
       if (num1 <= num2 && num1 <= num3) {
           System.out.println("Num 1 is smallest.");
       } else if (num2 <= num1 && num2 <= num3) {
           System.out.println("Num2 is smallest.");
       } else {
           System.out.println("Num 3 is smallest.");
       }

//Q7. Write a Java Method to print fibonacci series of n terms where n is argument passed by user.
       System.out.print("Enter value of n: ");
       int n = sc.nextInt();
       System.out.println("Fibonnaci Series of " + n + " numbers: ");
       for (int i = 0; i < n; i++) {
           System.out.print(fib(i) + " ");
       }
   }
   public static int fib(int n) {
       if (n <= 1) {
           return n;
       } else {
           return fib(n - 1) + fib(n - 2);
       }
   }
       

//Q8. Write a java program to find the factorial value of any number entered through the keyboard.
       int fact = 1;
       System.out.print("Enter any no. to get its factorial: ");
       int num = sc.nextInt();
       fact = factorial(num);
       System.out.println("Factorial of " + num + " is: " + fact);
   }

   public static int factorial(int num) {
       if (num == 0) {
           return 1;
       } else {
           return (num * factorial(num - 1));
       }
   }
    }
}
