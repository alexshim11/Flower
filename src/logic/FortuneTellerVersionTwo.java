package logic;

import java.util.Scanner;

import bean.Flower;
import bean.Leaf;

public class FortuneTellerVersionTwo {

	private String events[][] = { { "Love", "Do not love", "Hate" },
			{ "Have money", "Have a lot of money", "Do not have money" },
			{ "Happiness", "Big happiness", "Unhappiness" } };

	public int choiseEvent() {
		System.out.println("Please input your choise");
		System.out.println("Variants: \n" + "1 - Love \n2 - Money \n3 - Happiness");
		Scanner scan = new Scanner(System.in);
		int numb = scan.nextInt();
		return numb;
	}

	public void readFortune(Flower flower) {

		int realNumberOfLeaves = 0;

		Leaf[] leaves = flower.getBud().getLeaves();
		for (Leaf leaf : leaves) {
			if (leaf != null) {
				realNumberOfLeaves++;
			}
		}

		if (realNumberOfLeaves == 0) {
			System.out.println("Take new flower");
			return;
		}

		switch (choiseEvent()) {
		case 1:
			
			if (realNumberOfLeaves < 3) {
				if(realNumberOfLeaves == 1) {
				System.out.println(events[0][0]);}
				if(realNumberOfLeaves == 2) {
					System.out.println(events[0][1]);}
			} else {
				
				if (realNumberOfLeaves % 3 == 0) {
					System.out.println(events[0][0]);
				} else if (realNumberOfLeaves % 3 == 1) {
					System.out.println(events[0][1]);
				} else if (realNumberOfLeaves % 3 == 2) {
					System.out.println(events[0][2]);
				}
			}
			break;

		case 2:
			if (realNumberOfLeaves < 3) {
				if(realNumberOfLeaves == 1) {
				System.out.println(events[1][0]);}
				if(realNumberOfLeaves == 2) {
					System.out.println(events[1][1]);}
			} else {

				if (realNumberOfLeaves % 3 == 0) {
					System.out.println(events[1][0]);
				} else if (realNumberOfLeaves % 3 == 1) {
					System.out.println(events[1][1]);
				} else if (realNumberOfLeaves % 3 == 2) {
					System.out.println(events[1][2]);
				}
			}
			break;
		case 3:
			if (realNumberOfLeaves < 3) {
				if(realNumberOfLeaves == 1) {
				System.out.println(events[2][0]);}
				if(realNumberOfLeaves == 2) {
					System.out.println(events[2][1]);}
			} else {

				if (realNumberOfLeaves % 3 == 0) {
					System.out.println(events[2][0]);
				} else if (realNumberOfLeaves % 3 == 1) {
					System.out.println(events[2][1]);
				} else if (realNumberOfLeaves % 3 == 2) {
					System.out.println(events[2][2]);
				}
			}
			break;
		}

	}
}
