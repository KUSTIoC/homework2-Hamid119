public  class Rectangle {
   
       private int length=1;
       private int wigth=1;

    Rectangle(int length, int wigth) {
        this.length = length;
        this.wigth = wigth;
    }

    

    public int getLength() {
        return length;
    }

    public int getWigth() {
        return wigth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWigth(int wigth) {
        this.wigth = wigth;
    }
    public int  getprimeter()
	{
		
		return   (getLength()* getWigth())*2; 
	}
	public int  getArea()
	{
		return length*wigth;
	}
	
@Override
    public String toString() {
        return "Rectangle" + "\nlength =" + length + "\nwigth =" + wigth + "\n The pirameter of the Rectangle is ="+getprimeter()+"\nThe area of Rectangle is ="+getArea();
    }
   
   
   
}
