package paintWizard;

import java.lang.reflect.Array;

public class PaintWizard {

	
	public PaintWizard(){
	Paint paintArray[] = new Paint[2];
	
	Paint paint1 = new Paint("CheapoMax", 20, 19.99, 10.2);
	Paint paint2 = new Paint("AverageJoes", 15, 17.99, 11.1);
	Paint paint3 = new Paint("DuluxourousPaints",10,25,20.2);
	

	paintArray[0]=paint1;
	paintArray[1]=paint2;
	paintArray[2]=paint3;
	}


	public void arrayPrint(Array[] paintArray) {
		for (int i =0;i<paintArray.length;i++) {
		
		System.out.println(paintArray[i].toString());
	}

}
	
}