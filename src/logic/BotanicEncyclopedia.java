package logic;

import bean.Bud;
import bean.Flower;
import bean.Leaf;

public class BotanicEncyclopedia {

	public void printFlowerInfo(Flower flower) {

		if (flower != null) {
			System.out.println("Title:" + flower.getTitle());
			System.out
					.println("bud size, color" + ", " + flower.getBud().getSize() + ", " + flower.getBud().getColor());
			System.out.println(
					"stem heigth, weith" + ", " + flower.getStem().getHeigth() + ", " + flower.getStem().getWidth());
			printLeaves(flower.getBud());

		}
	}

	private void printLeaves(Bud bud) {
		Leaf[] leaves = bud.getLeaves();
		if (bud != null && leaves != null) {
			for (Leaf leaf : leaves) {
				if (leaf != null) {
					System.out.println("Leaf color, shape:" + " " + leaf.getColor() + ", " + leaf.getShape());
				} else
					System.out.println("leaf fall");
			}
		} else if (bud != null) {
			System.out.println("No leaves");

		}
	}
}
