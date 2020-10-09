package TemplateMethod;

public class TemplateMain {
	
	public static void main(String[] args) {


		Cuttable hanzai = new Wood();

	TanakasWoodCutPrint wood = new TanakasWoodCutPrint();
	
	wood.draw(hanzai);

	wood.cut(hanzai);

	wood.print(hanzai);
	
	ImagawasCutPrint imagawa = new ImagawasCutPrint();
	
	imagawa.draw(hanzai);

	imagawa.cut(hanzai);

	imagawa.print(hanzai);
	
	}
}
