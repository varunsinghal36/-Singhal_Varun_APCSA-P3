/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
	  	beach.explore();
	    beach.keepOnlyBlue();
	    beach.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testNegate() {
	  Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
	    beach.explore();
	    beach.negate();
	    beach.explore();
  }
  public static void testGrayscale() {
	  Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
	    beach.explore();
	    beach.grayscale();
	    beach.explore();
  }
  public static void testFixUnderwater() {
	  Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\water.jpg");
	    beach.explore();
	    beach.fixUnderwater();
	    beach.explore();
  }
  public static void testMirrorVerticalRightToLeft() {
	  Picture motor = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\redMotorcycle.jpg");
	  motor.explore();
	  motor.mirrorVerticalRightToLeft();
	  motor.explore();
  }
  public static void testMirrorHorizontal() {
	  Picture motor = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\redMotorcycle.jpg");
	  motor.explore();
	  motor.mirrorHorizontal();
	  motor.explore();
  }
  public static void testMirrorHorizontalBotToTop() {
	  Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\redMotorcycle.jpg");
	    beach.explore();
	    beach.mirrorHorizontalBotToTop();
	    beach.explore();
  }
  public static void testMirrorDiagonal() {
	  Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
	    beach.explore();
	    beach.mirrorDiagonal();
	    beach.explore();
  }
  public static void testMirrorArms() {
	  Picture snow = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\snowman.jpg");
	  snow.explore();
	    snow.mirrorArms();
	    snow.explore();
  }
  public static void testMirrorGull() {
	  Picture snow = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\seagull.jpg");
	  snow.explore();
	    snow.mirrorGull();
	    snow.explore();
  }
  public static void testCopy() {
	  Picture flower = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\flower1.jpg");
      flower.explore();
      flower.copy(flower, 0, 10, 0, 10);
      flower.explore();
  }
  public static void testMyCollage() {
	  	Picture canvas = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\640x480.jpg");
	    canvas.myCollage();
	    canvas.explore();
  }
  public static void testKeepOnlyRed() {
	  Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
	  	beach.explore();
	    beach.keepOnlyRed();
	    beach.explore();
  }
  public static void testKeepOnlyGreen() {
	  Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
	  	beach.explore();
	    beach.keepOnlyGreen();
	    beach.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    //uncomment a call here to run a test
    //and comment out the ones you don't want
    //to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorDiagonal();
    //testMirrorHorizontalBotToTop();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testMyCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}