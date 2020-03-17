/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dataclass;

/**
 *
 * @author HP
 */
class Data
{
    private int month;
    private int day;
    private int year;
    Data(int month, int day, int year)
    {
        this.month=month;
        this.day=day;
        this.year=year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
    public String toString()
    {
        return "Date "+day+"/"+month+"/"+year;
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Data d1= new Data(0,0,0);
        d1.setDay(3);
        d1.setMonth(7);
        d1.setYear(1999);
        System.out.println(d1.toString());
        
    }
    
}
