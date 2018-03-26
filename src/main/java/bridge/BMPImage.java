package bridge;


public class BMPImage extends Image{

	@Override
	public void parseFile(String fileName) {
		Matrix m=new Matrix();
		imp.doPaint(m);
		System.out.println(fileName+",¸ñÊ½ÎªBMP");
		
	}

}
