package Strategy;

public class HMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human sumi = new Human("masa", 172, 60, 30);
		Human tenninn = new Human("akira", 170, 65, 29);
		Comparator Hcomparator = new HeightComparator();

		int hikaku = new MyClass(Hcomparator).compare(sumi, tenninn);
		switch (hikaku){
		case 1:
		System.out.println(sumi.name + "‚Ì‚Ù‚¤‚ª”w‚ª‚‚¢‚Å‚·B");
		break;
		 
		case 0:
			System.out.println("”w‚Ì‚‚³‚Í‚¨‚È‚¶‚Å‚·B");
			break;
		case -1:
			System.out.println(tenninn.name + "‚Ì‚Ù‚¤‚ª”w‚ª‚‚¢‚Å‚·B");
			break;
		}
	}

}
