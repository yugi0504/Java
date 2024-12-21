import java.awt.color.*;

public class Player {

    private int posX,posY;
	private int speed;
	private int width;
	private int height;
	
 	public Player(int InitX,int InitY)
	{
		this.posX = InitX;
		this.posY = InitY;
	}
	
	public void moveUp()
	{
		posY -= speed;
	}

	public void moveDown()
	{
		posY += speed;
	}

	public void moveLeft()
	{
		posX -= speed;
	}

	public void moveRight()
	{
		posX += speed;
	}

	public void draw(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillRect(posX, posY, width, height);
	}
	
	public int getX() { return posX; }
	public int getY() { return posY; }
}
