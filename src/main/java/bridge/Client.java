package bridge;

public class Client {
	public static void main(String[] args) {
		Image image;
		ImageImp imp;
		
		image=(Image)XMLUtil.getBean("image");
		System.out.println(image);
		imp=(ImageImp)XMLUtil.getBean("os");
		
		image.setImp(imp);
		image.parseFile("Ğ¡ÁúÅ®");
	}

}
