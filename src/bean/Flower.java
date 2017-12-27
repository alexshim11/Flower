package bean;

public class Flower {

	private String title;
	private Bud bud;
	private Stem stem;

	public Flower(String title, int stemH, int stemW) {
		this.title = title;
		stem = new Stem(stemH, stemW);
		bud = new Bud();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Bud getBud() {
		return bud;
	}

	public void setBud(Bud bud) {
		this.bud = bud;
	}

	public Stem getStem() {
		return stem;
	}

	public void setStem(Stem stem) {
		this.stem = stem;
	}

	public void grow(int newStemH, int newStemW, int newBudSize) {
		this.stem.setHeigth(newStemH);
		this.stem.setWidth(newStemW);
		bud.setSize(newBudSize);
	}

	public void bloom(int amountOfLeaves, int newBudSize, String newBudColor) {
		bud.setSize(newBudSize);
		bud.setColor(newBudColor);
		bud.addLeaves(amountOfLeaves, "white", "ellipse");
	}

	public void wither(int newBudSize, String newBudColor, int newStemH, int newStemW) {
		bud.setSize(newBudSize);
		bud.setColor(newBudColor);
		this.stem.setHeigth(newStemH);
		this.stem.setWidth(newStemW);
		bud.fallLeaves();

	}
}
