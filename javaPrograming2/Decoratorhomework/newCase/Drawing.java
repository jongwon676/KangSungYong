
public class Drawing {
public static void main(String ar[]){
	Display d=new StringDisplay("Sangmyung");
	d=new CharBorder(d,'*');
	d=new CharBorder(d,' ');
	d=new CharBorder(d,'%');
	d=new CharBorder(d,'o');
	d.show();
}
}
