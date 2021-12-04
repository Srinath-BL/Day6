package autoshop;

public class Truck extends Car {
private int weight;

public Truck (int Speed,double regularPrice,String color, int weight) {
super(Speed,regularPrice,color);
this.weight = weight;
}

public double getSalePrice() {
if (weight > 2000){
	return super.getSalePrice() * (weight > 2000 ? 0.85 : 0.75);
}
else {
return super.getSalePrice();
}
}
}