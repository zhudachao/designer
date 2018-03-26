package bridge;

public class GIFImage extends Image {

	@Override
	public void parseFile(String fileName) {
		// TODO Auto-generated method stub
		Matrix m=new Matrix();
		imp.doPaint(m);
		System.out.println(fileName+",¸ñÊ½ÎªGIF");

	}

}
