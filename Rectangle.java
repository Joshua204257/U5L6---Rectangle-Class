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

  /**
  * Method that takes the scaleLengthValue for the multiplication
  * Preconditions: The scaleLengthValue has to be set to a number greater than 0.
  * Postconditions: Length is set to the new value after the multiplication.
  *@param scaleLenghtValue is the value at which you want to scale the length.
  */
  public void scaleLength(double scaleLengthValue){
    length *= scaleLengthValue;
  }

  /**
  * Method that takes the scaleWidthValue for the multiplication
  * Preconditions: The scaleWidthValue has to be set to a number greater than 0.
  * Postconditions: Width is set to the new value after the multiplication.
  *@param scaleWidthValue is the value at which you want to scale the width.
  */
  public void scaleWidth(double scaleWidthValue){
    width *= scaleWidthValue;
  }

  /**
  * Method thqat takes both parameters to scale either side.
  * Preconditions: Both values have to be set to a number greater than 0.
  * Postconditions: Length and width are set to new values.
  * @param scaleWidth takes the value at which length is multiplied to.
  * @param scaleLength takes the value at which length is multiplied to.
  */
  public void scaleBoth(double scaleWidth, double scaleLength){
    length *= scaleLength;
    width *= scaleWidth;
  }
}
