import java.awt.*;



public class Pumpkin
{

int shape;
int height, width, closeness;
Color color;
int vrejHeight, vrejWidth;
Color vrejColor;

//********************
//
//  constructors
//
//********************

public Pumpkin()
{

shape=0;
height=60;			
width=60;
closeness=20;
color=Color.orange;

vrejHeight=15;
vrejWidth=4;
vrejColor=Color.green;

}// end default constructor



public Pumpkin(int s, int h, int w, int c, Color clr)
{
	shape=s;
	height=h;
	width=w;
	closeness=c;
	color=clr;
}

public void setShape(int s)
{
	shape = s;
} // end setShape

public void setHeight(int h)
{
	height = h;
} // end setHeight

public void setWidth(int w)
{
	width = w;
} // end setWidth

public void setCloseness(int c)
{
	closeness = c;
} // end setCloseness

public void setColor(Color clr)
{
	Color c;
}


public int getShape()
{
	return shape;
} // end getShape

public int getHeight()
{
	return height;
} // end getHeight

public int getWidth()
{
	return width;
} // end getWidth

public int getCloseness()
{
	return closeness;
} // end getCloseness

public Color getColor()
{
	return color;
} 
public void increaseHeight()
{
	height++;
} // end increaseHeight

public void increaseWidth()
{
	width++;
} // end increaseWidth

public void increaseCloseness()
{
	closeness++;
} 
public void Print()
{

System.out.println
("Pumpkin= (shape= " + shape +
", height= " + height +
", width= " + width +
" ,closeness= " + closeness +
", color= " + color + " )");

}
public void Draw(Graphics g, Point pos)
{
int ex, ey;

ex=(int)pos.getX()-width/2;
ey=(int)pos.getY()-height/2;

g.setColor(color);
g.fillOval(ex,ey,width, height);
g.fillOval(ex+closeness,ey, width, height);


ex=(int)pos.getX()+ vrejWidth;
ey=(int)pos.getY()-height/2-vrejHeight;
g.setColor(vrejColor);
g.fillRect(ex,ey,vrejWidth, vrejHeight);

}
	
}



	


	
	

