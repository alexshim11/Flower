package runner;

import bean.Flower;
import logic.BotanicEncyclopedia;
import logic.FortuneTeller;
import logic.FortuneTellerVersionTwo;

public class Main {

	public static void main(String[] args) {

		BotanicEncyclopedia enc = new BotanicEncyclopedia();

		Flower flower = new Flower("Cammomile", 10, 1);
		enc.printFlowerInfo(flower);

		System.out.println("--------------------");
		System.out.println("Flower grow");
		flower.grow(25, 3, 5);
		enc.printFlowerInfo(flower);

		System.out.println("--------------------");
		System.out.println("Flower bloom");
		flower.bloom(3, 5, "yellow");
		enc.printFlowerInfo(flower);

		System.out.println("--------------------");
		System.out.println("Flower wither");
		flower.wither(13, "gray", 12, 2);
		enc.printFlowerInfo(flower);

		System.out.println("--------------------");
		System.out.print("Your prediction is: ");
		FortuneTeller fortuneteller = new FortuneTeller();
		fortuneteller.readFortune(flower);

		System.out.println("--------------------");
		FortuneTellerVersionTwo two = new FortuneTellerVersionTwo();
		two.readFortune(flower);

	}

}
