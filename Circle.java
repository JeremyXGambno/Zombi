//===============================================
// AUTHOR:<Jeremy Quero>
// COURSE:CS 112Intro to CSII-Java
// SECTION:<02/ 09/ 2020>
// ASSIGNMENT:<Assignment2>
//===============================================

//===============================================
// <Circle and sphere>
// <1-2 sentences describing the overall program>
//===============================================

//===============================================
// IMPORTS
//===============================================
import java.text.DecimalFormat;


public class Circle {

protected double mXcord;

protected double mYcord;

protected double mRadius;


public Circle(double xcord, double ycord, double radius)
{
	mXcord = xcord;
	mYcord = ycord;
	mRadius = radius;
}

public double getRadius()
{
	return mRadius;
}
		public void setRadius(double radius)
		{
			mRadius = radius;
		}
public boolean equals(Circle other)
{
	return mXcord == other.mXcord && mYcord == other.mYcord 
			&& mRadius == other. mRadius;
}

public double getArea()
{
	return Math.PI * Math.pow(mRadius, 2);
}
public String toString()
{
	DecimalFormat df = new DecimalFormat("0.00");
		return "This circle has center (" + mXcord + "," + mYcord + ") with radius of " 
				+ mRadius + " and Area: " +  df.format(getArea()); 
}

	
	
}
