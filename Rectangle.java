class Rectangle {
	double length;
	double width;

	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double newLength) {
		length = newLength;
	}

	public void setWidth(double newWidth) {
		width = newWidth;
	}

	public String toString() {
		return "Rectangle with length" + length + "and width " + width;
	}

  public void scaleLength(double scaleLengthValue){
    length *= scaleLengthValue;
  }

  public void scaleWidth(double scaleWidthValue){
    width *= scaleWidthValue;
  }

  public void scaleBoth(double scaleWidth, double scaleLength){
    length *= scaleLength;
    width *= scaleWidth;
  }
}
