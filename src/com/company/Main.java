package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	//create a human
    	Human human_one = new Human();
		Human human_two = new Human("Michal");
		Human human_three = new Human("Michal", 30, 178);

		human_one.Speak();
		human_two.Speak();
		human_three.Speak();
//		System.out.println("Ustaw rozmiar tablicy: ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] tab = new int[n];
//
//
//		for (int i = 0; i < tab.length; i++) {
//			tab[i] = i + 1;
////			System.out.println(tab[i]);
//		}
//		for (int i = tab.length; i > 0; i--) {
//			System.out.println(tab[i-1]);
//		}

//    int i;
//	int[] a = new int[8];

//	System.out.println("Wprowadź numer array");
//	i = scanner.nextInt();
//
//	int[] b = new int[i];
//
//
//		System.out.println(b[i]);


//	a[0] = 10;
//	a[1] = 3;
//
//        for (int i = 0; i < c.length; i++) {
//			c[i] = 100 + i;
////			System.out.println(c[i]);
//        }
//        for (int i = c.length; i > 0; i--) {
//			System.out.println(c[i-1]);
//		}
//		for (int j = 1; j < c.length; j++) {
//			if (c[j] < c[j-1]) {
//				int tmp = c[j];
//				c[j] = c[j-1];
//				c[j-1] = tmp;
//			}
//			System.out.println(c[j]);
//		}
//		System.out.println(c);
    }

}
