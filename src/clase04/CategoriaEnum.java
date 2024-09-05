package clase04;

public enum CategoriaEnum {
	
	BEBIDAS(1),
	LACTEOS(2);
	
	private int num;

	CategoriaEnum(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
