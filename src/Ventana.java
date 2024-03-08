import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Ventana extends JFrame{

	public Ventana()
	{
		
		this.setSize(1000, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mi ventana");
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,750));
		this.setResizable(false);
		this.setLocation(200, 200);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setVisible(true);
		
		
	}
	public void paint(Graphics create)
	{
		
		this.setSize(935, 700);
		Graphics2D g2d= (Graphics2D)create;
		
		g2d.setColor(new Color(45, 132, 225  ));
		g2d.fillRect(0,0,this.getWidth(),this.getHeight());
		
		//nubes del fondo
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(255,470,210,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(250,465,215,45,90,90);
		
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(155,523,210,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(150,518,215,45,90,90);
		
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(255,575,210,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(250,570,215,45,90,90);
		
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(645,263,210,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(640,258,215,45,90,90);
		
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(785,458,210,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(790,455,215,45,90,90);
		//Cosos del fondo
		//1
		g2d.setColor(new Color(134, 208, 192 ));
		g2d.fillRoundRect(19,205,190,570,200,200);
		
		g2d.setColor(new Color(189, 231, 222 ));
		g2d.fillRoundRect(15,210,175,560,200,200);
		
		//2
		g2d.setColor(new Color(134, 208, 192 ));
		g2d.fillRoundRect(369,205,190,470,200,200);
		
		g2d.setColor(new Color(189, 231, 222 ));
		g2d.fillRoundRect(365,210,175,460,200,200);
		//3
		g2d.setColor(new Color(134, 208, 192 ));
		g2d.fillRoundRect(565,85,190,570,200,200);
		
		g2d.setColor(new Color(189, 231, 222 ));
		g2d.fillRoundRect(559,90,175,560,200,200);
		
		//Coso de enfrente azul fuerte} 
		//1
		g2d.setColor(new Color(40, 136, 178));
		g2d.fillRoundRect(-70,460,230,290,225,225);
		
		g2d.setColor(new Color(117, 185, 199 ));
		g2d.fillRoundRect(-75,465,220,320,225,225);
		
		//2
		g2d.setColor(new Color(40, 136, 178));
		g2d.fillRoundRect(369,460,230,290,225,225);
		
		g2d.setColor(new Color(117, 185, 199));
		g2d.fillRoundRect(365,465,220,320,225,225);
		
		//3
		g2d.setColor(new Color(40, 136, 178));
		g2d.fillRoundRect(603,305,230,390,225,225);
		
		g2d.setColor(new Color(117, 185, 199 ));
		g2d.fillRoundRect(599,300,220,420,225,225);
		
		//4g2d.setColor(new Color(40, 136, 178));
		g2d.setColor(new Color(40, 136, 178));
		g2d.fillRoundRect(880,400,230,290,200,200);
		
		g2d.setColor(new Color(117, 185, 199));
		g2d.fillRoundRect(885,405,220,320,200,200);
		
		//blanco
		g2d.setColor(Color.white);
		g2d.fillRoundRect(730,560,180,120,170,170);
		
		//Tubos
		//1
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(450,485,105,175,10,10);
		
		g2d.setColor(new Color(46, 86, 134));
		g2d.fillRoundRect(455,480,95,165,10,10);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(445,455,115,50,10,10);
		
		g2d.setColor(new Color(46, 86, 134));
		g2d.fillRoundRect(450,457,105,46,10,10);
		
		g2d.setColor(new Color(71, 116, 171));
		g2d.fillRect(455,457,3,175);
		g2d.fillRect(460,457,2,175);
		g2d.setColor(Color.white);
		g2d.fillRect(463,457,11,175);
		g2d.setColor(new Color(155, 184, 218));
		g2d.fillRect(475,457,5,175);
		
		g2d.setColor(new Color(102, 135, 173));
		g2d.fillRect(480,457,3,175);
		g2d.setColor(new Color(87, 117, 153));
		g2d.fillRect(483,457,15,175);
		
		g2d.setColor(new Color(93, 118, 147));
		g2d.fillRect(500,457,5,175);
		g2d.setColor(new Color(65, 92, 124));
		g2d.fillRect(505,457,3,175);
		g2d.setColor(new Color(40, 74, 115));

		g2d.fillRect(508,457,17,175);
		g2d.setColor(new Color(24, 48, 76));
		g2d.fillRect(525,457,8,175);
		g2d.setColor(new Color(24, 48, 76));
		g2d.fillRect(533,457,8,175);
		g2d.setColor(new Color(16, 38, 65));
		g2d.fillRect(541,457,7,175);
		g2d.setColor(new Color(5, 26, 51));
		g2d.fillRect(548,457,3,175);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(551,457,3,175);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawRoundRect(445,457,111,48,10,10);
		//2
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(850,535,105,175,10,10);
		
		g2d.setColor(new Color(46, 86, 134));
		g2d.fillRoundRect(855,530,95,165,10,10);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(845,505,115,50,10,10);
		
		g2d.setColor(new Color(46, 86, 134));
		g2d.fillRoundRect(850,507,105,46,10,10);
		
		g2d.setColor(new Color(71, 116, 171));
		g2d.fillRect(855,507,3,175);
		g2d.fillRect(860,507,2,175);
		g2d.setColor(Color.white);
		g2d.fillRect(863,507,11,175);
		g2d.setColor(new Color(155, 184, 218));
		g2d.fillRect(875,507,5,175);
		
		g2d.setColor(new Color(102, 135, 173));
		g2d.fillRect(880,507,3,175);
		g2d.setColor(new Color(87, 117, 153));
		g2d.fillRect(883,507,15,175);
		
		g2d.setColor(new Color(93, 118, 147));
		g2d.fillRect(900,507,5,175);
		g2d.setColor(new Color(65, 92, 124));
		g2d.fillRect(905,507,3,175);
		g2d.setColor(new Color(40, 74, 115));

		g2d.fillRect(908,507,17,175);
		g2d.setColor(new Color(24, 48, 76));
		g2d.fillRect(925,507,8,175);
		g2d.setColor(new Color(24, 48, 76));
		g2d.fillRect(933,507,8,175);
		g2d.setColor(new Color(16, 38, 65));
		g2d.fillRect(941,507,7,175);
		g2d.setColor(new Color(5, 26, 51));
		g2d.fillRect(948,507,3,175);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(951,507,3,175);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(5));
		g2d.drawRoundRect(845,507,111,48,10,10);
		//ovalos
		//1
		g2d.setColor(Color.white);
		g2d.fillOval(125, 258, 23, 35);
		
		g2d.setColor(Color.white);
		g2d.fillOval(125, 368, 23, 35);
		
		g2d.setColor(Color.white);
		g2d.fillOval(45, 418, 23, 35);
		//2
		g2d.setColor(Color.white);
		g2d.fillOval(395, 308, 23, 35);
		
		g2d.setColor(Color.white);
		g2d.fillOval(395, 418, 23, 35);
		
		g2d.setColor(Color.white);
		g2d.fillOval(475, 258, 23, 35);
		//3
		g2d.setColor(Color.white);
		g2d.fillOval(665, 138, 23, 35);
		
		g2d.setColor(Color.white);
		g2d.fillOval(595, 258, 23, 35);
		
		//4
		g2d.setColor(Color.white);
		g2d.fillOval(649, 355, 23, 35);
		
		g2d.setColor(Color.white);
		g2d.fillOval(755, 518, 23, 35);
		
		//nube 1
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(-50,310,200,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(-55,305,205,45,90,90);
		
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(215,360,210,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(210,355,215,45,90,90);
		
		g2d.setColor(new Color(187, 187, 187));
		g2d.fillRoundRect(760,210,140,48,90,90);
		g2d.setColor(Color.white);
		g2d.fillRoundRect(755,205,145,45,90,90);

		//planta
		g2d.setColor(Color.black);
		g2d.fillArc(180,560,110, 110, 90, 90);
		g2d.fillOval(205,550, 65, 75);
		g2d.fillArc(225,550,90, 100, 0, 180);
		g2d.fillArc(255,570,90, 90, 0, 180);
		
		g2d.setColor(new Color(43, 192, 25));
		g2d.fillArc(185,565,110, 110, 90, 90);
		g2d.fillOval(210,555, 55, 85);
		g2d.fillArc(230,555,80, 100, 0, 180);
		g2d.fillArc(260,575,80, 90, 0, 180);
		
		g2d.setStroke(new BasicStroke(7));
		g2d.setColor(new Color(19, 72, 1));
		g2d.drawArc(262,577,74, 70, -5,85);
		
		g2d.setColor(new Color(19, 72, 1));
		g2d.drawArc(247,560,60, 70, 35,48);
		
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(new Color(86, 239, 68));
		g2d.drawArc(211,558,60, 60, 100, 52);
		
		g2d.drawArc(188,570,70, 82, 107, 72);
		
		g2d.setColor(new Color(159, 0, 18));
		g2d.fillOval(220, 570, 15, 15);
		g2d.fillOval(200, 600, 15, 15);
		g2d.fillOval(250, 590, 15, 15);
		g2d.fillOval(290, 580, 15, 15);
		
		g2d.setColor(new Color(255, 138, 152));
		g2d.fillOval(222, 570, 5, 5);
		g2d.fillOval(202, 600, 5, 5);
		g2d.fillOval(252, 590, 5, 5);
		g2d.fillOval(292, 580, 5, 5);
		//Cubos
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(785,560,64,55,15,15);
		
		g2d.setColor(new Color(105, 105, 105));
		g2d.fillRoundRect(789,565,55,48,15,15);
		
		g2d.setColor(new Color(177, 176, 173));
		g2d.fillRoundRect(789,565,50,43,15,15);
		
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(785,505,64,55,15,15);
		
		g2d.setColor(new Color(105, 105, 105));
		g2d.fillRoundRect(789,510,55,48,15,15);
		
		g2d.setColor(new Color(177, 176, 173));
		g2d.fillRoundRect(789,510,50,43,15,15);
		
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(785,450,64,55,20,20);
		
		g2d.setColor(new Color(105, 105, 105));
		g2d.fillRoundRect(789,455,55,48,20,20);
		
		g2d.setColor(new Color(177, 176, 173));
		g2d.fillRoundRect(789,455,50,43,20,20);
		
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(785,395,64,55,20,20);
		
		g2d.setColor(new Color(105, 105, 105));
		g2d.fillRoundRect(789,400,55,48,20,20);
		
		g2d.setColor(new Color(177, 176, 173));
		g2d.fillRoundRect(789,400,50,43,20,20);
		
		int y=0;
		g2d.setColor(new Color(230, 227, 227));
		for(int i=0;i<4;i++)
		{
			
			g2d.fillOval(790, 405+y, 10, 10);
			g2d.fillOval(810, 412+y, 17, 13);
			g2d.fillOval(828, 422+y, 10, 16);
			g2d.fillOval(795, 430+y, 18, 10);
			
			y+=55;
		}
		
		//cubos amarillos
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(845,395,64,57,20,20);
		
		g2d.setColor(new Color(226, 182, 0));
		g2d.fillRoundRect(850,400,55,48,20,20);
		
		g2d.setColor(new Color(245, 221, 94));
		g2d.fillRoundRect(850,400,50,43,20,20);
		
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(905,395,64,57,20,20);
		
		g2d.setColor(new Color(226, 182, 0));
		g2d.fillRoundRect(910,400,55,48,20,20);
		
		g2d.setColor(new Color(245, 221, 94));
		g2d.fillRoundRect(910,400,50,43,20,20);
		
		g2d.setColor(Color.BLACK);
		g2d.drawLine(865, 417, 865, 427);	
		g2d.drawLine(890, 417, 890, 427);	
		//Las bases
		g2d.setColor(new Color(216, 163, 76));
		g2d.fillRect(0,635,1000,65);
		g2d.setColor(new Color(175, 97, 52 ));
		g2d.fillRect(0,630,1000,5);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0,615,1000,15);//615 es el numero en y donde topa
		g2d.setColor(new Color(3, 165, 10));
		g2d.fillRect(0,618,1000,9);
		
		int x=0;
		g2d.setColor(new Color(218, 181, 120));
		for(int i=0;i<32;i++)
		{
			
			g2d.fillOval(10+x, 640, 7, 7);
			g2d.fillOval(30+x, 655, 7, 7);
			g2d.fillOval(15+x, 668, 7, 7);
			g2d.fillOval(22+x, 680, 7, 7);
			
			x+=30;
		}
		try {
			BufferedImage image= ImageIO.read(new File("src/mario2.png"));
			g2d.drawImage(image,370,508,null);
			BufferedImage image2= ImageIO.read(new File("src/planta.png"));
			g2d.drawImage(image2,470,340,null);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
