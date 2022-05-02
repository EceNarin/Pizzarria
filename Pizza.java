
public class Pizza {
double _price;
IShape _shape;//2 sekil rectangle ve circle
public Pizza(double p,IShape s) {
	this._price=p;
	this._shape=s;
}
double getPrice() {
	//bulunan alanın 10'a bolunmesi
	return _price;
}
IShape getShape() {
	return _shape;
}
@Override
public String toString() {
	return "Pizza price=" + _price +"$" + ", Shape" + _shape ;
}



}
