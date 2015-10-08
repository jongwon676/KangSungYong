
public class Caramel extends CondimentDecorator {
Beverage beverage;
	Caramel(Beverage beverage){
		this.beverage=beverage;
	}
	public String getDescription(){
		return beverage.getDescription()+",caramel";
	}
	public double Cost(){
		return 0.50+beverage.Cost();
	}
}
