package oopp;

public class Company {
	private String name;
	private Section [] sections;
	private String boss;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Section[] sections() {
		return sections;
	}

	public String getBoss() {
		return boss;
	}

	public void setBoss(String boss) {
		this.boss = boss;
	}

	public Company(String name, Section[] sections) {
		this.name = name;
		this.sections = sections;
	}
}
