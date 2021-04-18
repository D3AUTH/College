public class Rectangle {

    private double length;//value for the length of the rectangle
    private double width;//value for the width of the rectangle

    public Rectangle()//constructor
    {
        this.setLength(1);//assigns default value for length
        this.setWidth(1);//assigns default value for width
    }

    public void setLength(double length) {//set method for length
        if (length < 0.0 || length > 20.0) //determines if the inputted value is within parameters of testing
            throw new IllegalArgumentException("The inputted length should be between 0.0 and 20.0");//returns this message if the input is outside test parameters
        this.length = length;//assigns value to length
    }

    public double getLength() {//get call returns value of length
        return length;
    }

    public void setWidth(double width) {//set method for width
        if (width < 0.0 || width > 20.0)//determines if the inputted value is within parameters of testing
            throw new IllegalArgumentException("The inputted width should be between 0.0 and 20.0");//returns this message if the input is outside test parameters
        this.width = width;//assigns value to width
    }

    public double getWidth() {//get call returns value of width
        return width;
    }

    public double getArea() {//get call returns the answer for area
        return length * width;//equation for area
    }

    public double getPerimeter() {//get call returns the answer for perimeter
        return 2 * (length + width);//equation for perimeter
    }

}