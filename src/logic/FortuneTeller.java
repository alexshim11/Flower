package logic;

import bean.Flower;
import bean.Leaf;

public class FortuneTeller {

	private static final String DEFAULT_EVENT_ONE = "Love";
	private static final String DEFAULT_EVENT_TWO = "Money";
	private static final String DEFAULT_EVENT_THREE = "Happines";

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
		if (realNumberOfLeaves == 1) {
			System.out.println(DEFAULT_EVENT_ONE);
			return;
		}
		if (realNumberOfLeaves == 2) {
			System.out.println(DEFAULT_EVENT_TWO);
			return;
		}

		switch (realNumberOfLeaves % 3) {
		case 0:
			System.out.println(DEFAULT_EVENT_ONE);
			break;
		case 1:
			System.out.println(DEFAULT_EVENT_TWO);
			break;
		case 2:
			System.out.println(DEFAULT_EVENT_THREE);
			break;
		}

	}
}
