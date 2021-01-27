class Main {
	public static void main(String[] args) {
		int a = 10;
		int b = 24;

		swap(a, b);
		System.out.println("a = " + a + ", b = " + b);
	}

	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;

		System.out.println("x = " + x + ", y = " + y);
	}

  

}