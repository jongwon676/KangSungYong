
public class CharBorder extends Border{
char ch;
	CharBorder(Display display,char c){
	this.display=display;
	this.ch=c;
}

public int getCols(){
	return display.getCols()+2;
}
public int getRows(){
	return display.getRows()+2;
}
public  String getRowText(int row)
{
	
	if(row ==0 || row==getRows()-1 ){
		StringBuffer buf=new StringBuffer();
		for(int i=0;i<getCols();i++){
			buf.append(ch);
		}
		return buf.toString();
	}
	else
		return ch+display.getRowText(row-1)+ch;
	

}
}