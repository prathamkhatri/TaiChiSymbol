import edu.princeton.cs.introcs.StdDraw;

public class TaiChiSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StdDraw.setXscale(0,200);
		StdDraw.setYscale(0,200);
		
		
		//Draw black filled circle with radius of 50 at point (100, 100)
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(100, 100, 50);
		
		
		// Draw white filled circle and rectangle to complete the TaiChi because the TaiChi also needs white filled circle to be completed.
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(75, 100, 25, 50);
		StdDraw.filledCircle(100, 125, 25);
		
		// Draw two solid circle with black color at point (100, 75) and (100, 125) with radius of 25 and 8 because there is a small circle in TaiChi and need big one circle to complete the TaiChi.
	 StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(100, 75, 25);
		StdDraw.filledCircle(100, 125, 8);
		
		// Draw circle with white color at point (100, 75) with radius of 8 to change small part of black ink to white ink with use of white circle. 
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(100, 75, 8);
		
		// Draw Circumference with black color at point (100,100) with radius=50. 
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.circle(100, 100, 50);


		//Run to see the result
		
	

}}
