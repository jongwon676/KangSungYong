
public class StarbuzzCoffee {
public static void main(String ar[]){
	Beverage beverage1=new CaramelMacchiato();
    beverage1=new Caramel(beverage1);
    System.out.println(beverage1.getDescription());
    System.out.println(beverage1.Cost());
}
}
