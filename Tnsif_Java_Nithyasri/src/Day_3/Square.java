package Day_3;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private float side;
		public Square()
		{
			side=2.0f;
		}
		public Square(float side)
		{
			this.side=side;
		}
		
		@Override
		void calArea() {
			super.area=side*side;		
		}

	}

}
