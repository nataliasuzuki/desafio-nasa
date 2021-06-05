import javax.swing.*;    

public class TableModel
{    
    JFrame f;    
    TableModel(String infos[][])
    {    
    	f=new JFrame(); 
	    String column[]={"Decisão de grupo","Diferença grupo","Solução correta"};         
	    JTable jt=new JTable(infos,column);    
	    jt.setBounds(30,40,200,300);          
	    JScrollPane sp=new JScrollPane(jt);    
	    f.add(sp);          
	    f.setSize(300,400);    
	    f.setVisible(true);    
    }
    
//	public static void main(String[] args) 
//	{    
//	    new TableTest();    
//	}    
}