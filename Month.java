import javax.swing.JOptionPane;
public class Month {
	 public enum MonthSelect {January,February, March, April, May, June,July,Auguest, September,October,November, December};
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MonthSelect choice []= {MonthSelect.January,MonthSelect.February,MonthSelect.March,MonthSelect.April,MonthSelect.May,
    		MonthSelect.June,MonthSelect.July,MonthSelect.Auguest,MonthSelect.September,MonthSelect.October,
    		MonthSelect.November,MonthSelect.December};
    boolean continues= true;
    while(continues){
    	
    	MonthSelect result= (MonthSelect)JOptionPane.showInputDialog(null,"Select a month","Month Select",JOptionPane.INFORMATION_MESSAGE,null,choice,choice[2]);
        switch(result){
        case December: case January: case February:
        JOptionPane.showMessageDialog(null,"Do you want to build a snow man?");
        break;
        case March: case April: case May:
        	JOptionPane.showMessageDialog(null,"Happy Spring days!");
        	break;
        case June: case July: case Auguest:
        	JOptionPane.showMessageDialog(null,"It’s a summer time.");
        	break;
        case September: case October: case November:
        	JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");
       
        	
        }
    
    
    }
    
}
}
