class Point {
	String id
	double x,y;
	String color;

	//TODO add new variable

	//TODO constructor

	public Point(String id, double x, double y, String color) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public String getId() {
		return id;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String getColor() {
		return color;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//TODO setters and getters

	public void move (char xDirection, char yDirection) {
		int x = (int)xDirection;
		int y = (int)xDirection;

		if(x < 1){
			System.out.println("move left");
		}else{
			System.out.println("move right");
		}
		if(y < 1){
			System.out.println("move down");
		}else{
			System.out.println("move up");
		}
	}

	public void draw () {
		if(x>0){
			if (y>0){
				System.out.println("I kvadrant");
			}
			else if(y<0){
				System.out.println("IV kvadrant");
			}
			else{
				System.out.println("Pozitivna x-oska");
			}
		}
		else if(x<0){
			if(y>0){
				System.out.println("II kvadrant");
			}
			else if(y<0){
				System.out.println("III kvadrant");
			}
			else{
				System.out.println("Negativna x-oska");
			}
		}
		if (x==0 && y>0){
			System.out.println("Pozitivna y-oska");
		}
		else if(x==0 && y<0){
			System.out.println("Negativna y-oska");
		}
		else{
			System.out.println("Koordinaten pocetok");
		}
	}



}