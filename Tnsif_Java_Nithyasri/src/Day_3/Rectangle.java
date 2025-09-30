package Day_3;

public class Rectangle extends shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private float width, height;

		public Rectangle() {
			this.width = 5.0f;
			this.height = 2.0f;
		}

		public Rectangle(float width, float height) {
			this.width = width;
			this.height = height;
		}

		@Override
		void calArea() {
			area=width*height;

	}

}
