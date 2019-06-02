package FactoryDesignPattern;

public class MainFactoryMethod {

	public static void main(String[] args) {

		DecodedImage decodedImage;
		ImageReader imageReader = null;

		String image = "image.jpeg";
		String format = image.substring(image.indexOf('.') + 1, (image.length()));

		if (format.equals("gif")) {
			imageReader = new GifReader(image);
		}

		if (format.equals("jpeg")) {
			imageReader = new JpegReader(image);
		}

		decodedImage = imageReader.getDecodedImage();

		System.out.println(decodedImage);

	}

}
