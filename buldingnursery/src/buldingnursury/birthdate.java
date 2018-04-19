
package buldingnursury;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class birthdate implements Serializable{
    public int day;
    public int month;
    public int year;
    
    public int setage(int d2,int m2,int y2)
    {
    Calendar c=new GregorianCalendar();
    String date1;
    int y1=c.get(Calendar.YEAR);
    int m1=(c.get(Calendar.MONTH))+1;
    int d1=c.get(Calendar.DAY_OF_MONTH);
    int y3;
    int m3;
    int d3;
    
    if(d2>d1){d1+=30;m1-=1;}
    d3=d1-d2;
    if(m2>m1){m1+=12;y1-=1;}
    m3=m1-m2;
    y3=y1-y2;
       
        return y3 ;
           
    
    }
        public String setbirthdate(int d2,int m2,int y2)
    {
    Calendar c=new GregorianCalendar();
    String date1;
    int y1=c.get(Calendar.YEAR);
    int m1=(c.get(Calendar.MONTH))+1;
    int d1=c.get(Calendar.DAY_OF_MONTH);
    int y3;
    int m3;
    int d3;
    
    if(d2>d1){d1+=30;m1-=1;}
    d3=d1-d2;
    if(m2>m1){m1+=12;y1-=1;}
    m3=m1-m2;
    y3=y1-y2;
       String b=d3+" "+m3+""+y3;
        return b ;
           
    
    }
         public birthdate currentdate()
    {
    Calendar c=new GregorianCalendar();
    String date1;
    int y1=c.get(Calendar.YEAR);
    int m1=(c.get(Calendar.MONTH))+1;
    int d1=c.get(Calendar.DAY_OF_MONTH);
    birthdate b=new birthdate();
    b.day=d1;
    b.month=m1;
    b.year=y1;

        return b ;
           
    
    }


    @Override
    public String toString() {
        return "birthdate{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }
    
    
}
