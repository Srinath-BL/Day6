package autoshop;

public class Sedan extends Car {
private int length;

public Sedan (int Speed,double regularPrice,String color, int length) {
super (Speed,regularPrice,color);
this.length = length;
}

public double getSalePrice() {
	return super.getSalePrice() * (length < 20 ? 0.9 : 0.85);
}
}


