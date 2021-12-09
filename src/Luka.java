import javax.swing.ImageIcon;
import java.util.Random;
import javax.swing.JOptionPane;

public class Luka {
	
	ImageIcon[] Cards;
	Music Muse = new Music();
	ImageIcon CardBack = new ImageIcon(Luka.class.getResource("BackCard.png"));
	ImageIcon Stand = new ImageIcon(Luka.class.getResource("Stand.png"));
	ImageIcon QUIT = new ImageIcon(Luka.class.getResource("QUIT.png"));
	Random gene = new Random();
	public Luka(){
	ImageIcon CardAS = new ImageIcon(Luka.class.getResource("CardAS.png"));
	ImageIcon CardAH = new ImageIcon(Luka.class.getResource("CardAH.png"));
	ImageIcon CardAD = new ImageIcon(Luka.class.getResource("CardAD.png"));
	ImageIcon CardAC = new ImageIcon(Luka.class.getResource("CardAC.png"));
	
	ImageIcon Card2S = new ImageIcon(Luka.class.getResource("Card2S.png"));
	ImageIcon Card2H = new ImageIcon(Luka.class.getResource("Card2H.png"));
	ImageIcon Card2D = new ImageIcon(Luka.class.getResource("Card2D.png"));
	ImageIcon Card2C = new ImageIcon(Luka.class.getResource("Card2C.png"));
	
	ImageIcon Card3S = new ImageIcon(Luka.class.getResource("Card3S.png"));
	ImageIcon Card3H = new ImageIcon(Luka.class.getResource("Card3H.png"));
	ImageIcon Card3D = new ImageIcon(Luka.class.getResource("Card3D.png"));
	ImageIcon Card3C = new ImageIcon(Luka.class.getResource("Card3C.png"));
	
	ImageIcon Card4S = new ImageIcon(Luka.class.getResource("Card4S.png"));
	ImageIcon Card4H = new ImageIcon(Luka.class.getResource("Card4H.png"));
	ImageIcon Card4D = new ImageIcon(Luka.class.getResource("Card4D.png"));
	ImageIcon Card4C = new ImageIcon(Luka.class.getResource("Card3C.png"));
	
	ImageIcon Card5S = new ImageIcon(Luka.class.getResource("Card5S.png"));
	ImageIcon Card5H = new ImageIcon(Luka.class.getResource("Card5H.png"));
	ImageIcon Card5D = new ImageIcon(Luka.class.getResource("Card5D.png"));
	ImageIcon Card5C = new ImageIcon(Luka.class.getResource("Card5C.png"));
	
	ImageIcon Card6S = new ImageIcon(Luka.class.getResource("Card6S.png"));
	ImageIcon Card6H = new ImageIcon(Luka.class.getResource("Card6H.png"));
	ImageIcon Card6D = new ImageIcon(Luka.class.getResource("Card6D.png"));
	ImageIcon Card6C = new ImageIcon(Luka.class.getResource("Card6C.png"));
	
	ImageIcon Card7S = new ImageIcon(Luka.class.getResource("Card7S.png"));
	ImageIcon Card7H = new ImageIcon(Luka.class.getResource("Card7H.png"));
	ImageIcon Card7D = new ImageIcon(Luka.class.getResource("Card7D.png"));
	ImageIcon Card7C = new ImageIcon(Luka.class.getResource("Card7C.png"));
	
	ImageIcon Card8S = new ImageIcon(Luka.class.getResource("Card8S.png"));
	ImageIcon Card8H = new ImageIcon(Luka.class.getResource("Card8H.png"));
	ImageIcon Card8D = new ImageIcon(Luka.class.getResource("Card8D.png"));
	ImageIcon Card8C = new ImageIcon(Luka.class.getResource("Card8C.png"));
	
	ImageIcon Card9S = new ImageIcon(Luka.class.getResource("Card9S.png"));
	ImageIcon Card9H = new ImageIcon(Luka.class.getResource("Card9H.png"));
	ImageIcon Card9D = new ImageIcon(Luka.class.getResource("Card9D.png"));
	ImageIcon Card9C = new ImageIcon(Luka.class.getResource("Card9C.png"));
	
	ImageIcon Card10S = new ImageIcon(Luka.class.getResource("Card10S.png"));
	ImageIcon Card10H = new ImageIcon(Luka.class.getResource("Card10H.png"));
	ImageIcon Card10D = new ImageIcon(Luka.class.getResource("Card10D.png"));
	ImageIcon Card10C = new ImageIcon(Luka.class.getResource("Card10C.png"));
	
	ImageIcon CardJS = new ImageIcon(Luka.class.getResource("CardJS.png"));
	ImageIcon CardJH = new ImageIcon(Luka.class.getResource("CardJH.png"));
	ImageIcon CardJD = new ImageIcon(Luka.class.getResource("CardJD.png"));
	ImageIcon CardJC = new ImageIcon(Luka.class.getResource("CardJC.png"));
	
	ImageIcon CardQS = new ImageIcon(Luka.class.getResource("CardQS.png"));
	ImageIcon CardQH = new ImageIcon(Luka.class.getResource("CardQH.png"));
	ImageIcon CardQD = new ImageIcon(Luka.class.getResource("CardQD.png"));
	ImageIcon CardQC = new ImageIcon(Luka.class.getResource("CardQC.png"));
	
	ImageIcon CardKS = new ImageIcon(Luka.class.getResource("CardKS.png"));
	ImageIcon CardKH = new ImageIcon(Luka.class.getResource("CardKH.png"));
	ImageIcon CardKD = new ImageIcon(Luka.class.getResource("CardKD.png"));
	ImageIcon CardKC = new ImageIcon(Luka.class.getResource("CardKC.png"));
	
	Cards = new ImageIcon[] 
		   {CardAS,CardAH,CardAD,CardAC,
			Card2S,Card2H,Card2D,Card2C,
			Card3S,Card3H,Card3D,Card3C,
			Card4S,Card4H,Card4D,Card4C,
			Card5S,Card5H,Card5D,Card5C,
			Card6S,Card6H,Card6D,Card6C,
			Card7S,Card7H,Card7D,Card7C,
			Card8S,Card8H,Card8D,Card8C,
			Card9S,Card9H,Card9D,Card9C,
			Card10S,Card10H,Card10D,Card10C,
			CardJS,CardJH,CardJD,CardJC,
			CardQS,CardQH,CardQD,CardQC,
			CardKS,CardKH,CardKD,CardKC};
	}
	public String in(String s) {
		return JOptionPane.showInputDialog(s);
	}
	public void msg(String s) {
		JOptionPane.showMessageDialog(null, s);
	}
	public double number() {
		String s = JOptionPane.showInputDialog("Place your bet. Your Money : " + money);
		double d = Double.parseDouble(s);
		return d;
	}
	public void start(){
		msg("BlackJack, The game most gambled for around the world.\n" +
				"You will be able to gamble fake money in this game \n" +
				"The Rules! \n" +
				"1. You are allowed up to 6 cards to be held in your hand, or until you past the value '21' \n" +
				"2. Before each time you get your hand you will be asked to bet money, as long as you have enough money to bet \n" +
				"3. You play against the house, if the house achieves '21' first you lose, you past '21' you lose, the house is closer to '21' but both of you are lower than '21' you lose. \n" +
				"4. To win: Acheive '21', have a higher score than the dealer but lower than '21', or let the dealer have a score higher than '21' \n" +
				"5. If you get 1 million dollars, you become a millionaire and you beat the game. \n" +
				"6. How bidding works, you start off with $50, every time you win the money you bid is given back doubled. If you lose, you that money\n" +
				"7. The song 'BlackJack' from 'Luka' will play in the backgorund to match the theme of the program \n" +
				"8. IMPORTANT How the 'Ace' Card works The program will automatcially select the value of the Ace. If your card value plus an '11' ace is less than or equal to '21' the Ace is an '11' otherwise it is a '1'\n " +
				"9. The House does NOT need to reach a card value of '17'\n" +
				"10. When the player hits(you); the dealer also hits.\n" +
				"11. There are NO Card specific rules. Such as the King of Hearts rule or other crazy stuff that I don't know about\n" +
				"12. YOU CAN ONLY QUIT THE PROGRAM WHERE THE QUIT IS AVAILABLE \n" +
				"13. If two of the same cards appear on screen that was because this BlackJack game uses two whole decks of cards not one deck.\n" +
				"14. Good Luck!");
		Muse.play();
	}
	double money = 50;
	double bid = 0;
	int wins = 0;
	int loses = 0;
	int xx = 0;
	int yy = 0;
	int zz = 0;
	ImageIcon[] DATA = {Stand, CardBack,CardBack,CardBack,CardBack,CardBack,CardBack,QUIT};
	boolean a = false;
	boolean b = false;
	boolean c = false;
	boolean d = false;
	boolean e = false;
	int i = 0;
	int jj = 0;
	int k = 0;
	int l = 0;
	int m = 0;
	int n = 0;
	public void home(){
		if (a == false){
			xx = 0;
			zz = 0;
			b = false;
			c = false;
			d = false;
			e = false;
			int yyy = gene.nextInt(9)+1;
			yy = yyy;
			bet();
			a = true;
		}
		if ((zz > 21) || (xx + yy == 21)){
			lose();
		}
		if (xx + yy > 21){
			win();
		}
		int x = JOptionPane.showOptionDialog(null, "House card value shown : " + xx + " + Hidden card value \n"+
				"\n Money in wallet : " + money +
				"\n Wins : " + wins + "  " + "Losses : " + loses + 
				"\n You have Access to 6 cards, the ones that are shown, are in you hand, the ones that are face down are cards to be dealt \n " +
				"To stand, select Stand, to hit, click on a faced down card \n" +
				"Your Card Value : " + zz, "BlackJack", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if(x == 0){
			stand();
		}if(x == 1){
			msg("No, You can't change this card");
			home();
		}if(x == 2){
			msg("No, You can't change this card");
			home();
		}if(x == 3){
			if(b == false){
					k = gene.nextInt(Cards.length);
				b = true;
				while(k == i || k == jj || k == l || k == m || k == n){
					k = gene.nextInt(51);
				}
				DATA[3] = Cards[k];
				int z = gene.nextInt(Cards.length);		
				calc(k,z);
			}
			else{
				msg("No, You can't change this card");
				home();
			}
		}if(x == 4){
			if(c == false){
				l = gene.nextInt(Cards.length);
				c = true;
				while(l == i || l == jj || k == l || l == m || l == n){
					l = gene.nextInt(51);
				}
				DATA[4] = Cards[l];
				int z = gene.nextInt(Cards.length);		
				calc(l,z);
			}
			else{
				msg("No, You can't change this card");
				home();
			}
		}if(x == 5){
			if(d == false){
				m = gene.nextInt(Cards.length);
				while(m == i || m == jj || m == l || k == m || m == n){
					m = gene.nextInt(51);
				}
				DATA[5] = Cards[m];
				d = true;
				int z = gene.nextInt(Cards.length);		
				calc(m,z);
			}
			else{
				msg("No, You can't change this card");
				home();
			}
		}if(x == 6){
			if(e == false){
				n = gene.nextInt(Cards.length);
				while(n == i || n == jj || n == l || n == m || k == n){
					n = gene.nextInt(51);
				}
				DATA[6] = Cards[n];
				e = true;
				int z = gene.nextInt(Cards.length);		
				calc(n,z);
			}else{
				msg("No, You can't change this card");
				home();
			}
		}else{
			System.exit(0);
		}
	}
	public void startup(){
		i = gene.nextInt(51);
		DATA[1] = Cards[i];
		jj = gene.nextInt(51);
		DATA[2] = Cards[jj];
		while(i == jj){
			jj = gene.nextInt(51);
		}
		calc2(i,jj);
		int z = gene.nextInt(9)+1;
		int zzz = gene.nextInt(9)+1;
		calcHouse2(z,zzz);
		home();
	}	
	public void stand(){
		if((zz == 21)||((zz > xx + yy) && zz <= 21)||(xx + yy > 21) ){
			win();
		}else{
			lose();
		}
	}	
	boolean j = false;
	public void win(){
		int xxx = (xx + yy);
		if(j == false){
			if(money >= 1000000){
				msg("You are a millionaire, what ever will you do with that kind of money. \n" +
						"Anything you want! B)\n" +
						"You can keep playing the game, but at least you have plenty of cash");
				j = true;
			}
		}
		bid *= 2;
		money += bid;
		wins++;
		msg("You won! You beat the House. \n" +
				"Money gained " + bid + 
				"\n House value was :  " + xxx + "  Your value was : " + zz + 
				"\n Wins :  " + wins + "  Losts :  " + loses +
				"\n Click OK to play again");
		bid = 0;
		
		DATA[3] = CardBack;
		DATA[4] = CardBack;
		DATA[5] = CardBack;
		DATA[6] = CardBack;
		a = false;
		home();
	}	
	public void lose (){
		int xxx = (xx + yy);
		if(money == 0 || money < 0){
			msg("You have gone broke and bankrupt, you lost everything you had, Sorry. \n" +
					"Play better next time thats all there is to it. \n" +
					"The game will now reset to starting money amount, Good Luck");
			bid = 0;
			DATA[3] = CardBack;
			DATA[4] = CardBack;
			DATA[5] = CardBack;
			DATA[6] = CardBack;
			wins = 0;
			loses = 0;
			a = false;
			money = 50;
			home();
		}else{
			loses++;
			msg("You lost! You lost to the House. \n" +
				"\n House value was :  " + xxx + "  Your value was : " + zz + 
				"\n Wins :  " + wins + "  Losts :  " + loses +
				"\n Click OK to play again");
			bid = 0;
			
			DATA[3] = CardBack;
			DATA[4] = CardBack;
			DATA[5] = CardBack;
			DATA[6] = CardBack;
			a = false;
			home();
		}
	}
	public void calc(int x, int y){
		if(x == 0 || x == 1 || x == 2 || x == 3){
			if(zz + 11 <= 21){
				zz+= 11;
			}else{
				zz++;
			}
			calcHouse(y);
		}else if(x == 4 || x == 5 || x == 6 || x == 7){
			zz += 2;
			calcHouse(y);
		}else if(x == 8 || x == 9 || x == 10 || x == 11){
			zz += 3;
			calcHouse(y);
		}else if(x == 12 || x == 13 || x == 14 || x == 15){
			zz += 4;
			calcHouse(y);
		}else if(x == 16 || x == 17 || x == 18 || x == 19){
			zz += 5;
			calcHouse(y);
		}else if(x == 20 || x == 21 || x == 22 || x == 23){
			zz += 6;
			calcHouse(y);
		}else if(x == 24 || x == 25 || x == 26 || x == 27){
			zz += 7;
			calcHouse(y);
		}else if(x == 28 || x == 29 || x == 30 || x == 31){
			zz += 8;
			calcHouse(y);
		}else if(x == 32 || x == 33 || x == 34 || x == 35){
			zz += 9;
			calcHouse(y);
		}else{
			zz += 10;
			calcHouse(y);
		}
	}
	public void calcHouse(int x){
		if(x == 0 || x == 1 || x == 2 || x == 3){
			xx++;
			home();
		}else if(x == 4 || x == 5 || x == 6 || x == 7){
			xx += 2;
			home();
		}else if(x == 8 || x == 9 || x == 10 || x == 11){
			xx += 3;
			home();
		}else if(x == 12 || x == 13 || x == 14 || x == 15){
			xx += 4;
			home();
		}else if(x == 16 || x == 17 || x == 18 || x == 19){
			xx += 5;
			home();
		}else if(x == 20 || x == 21 || x == 22 || x == 23){
			xx += 6;
			home();
		}else if(x == 24 || x == 25 || x == 26 || x == 27){
			xx += 7;
			home();
		}else if(x == 28 || x == 29 || x == 30 || x == 31){
			xx += 8;
			home();
		}else if(x == 32 || x == 33 || x == 34 || x == 35){
			xx += 9;
			home();
		}else{
			xx += 10;
			home();
		}
	}
	public void calc2(int x, int y){
		if(x == 0 || x == 1 || x == 2 || x == 3){
			if(zz + 11 <= 21){
				zz+= 11;
			}else{
				zz++;
			}
		}else if(x == 4 || x == 5 || x == 6 || x == 7){
			zz += 2;
		}else if(x == 8 || x == 9 || x == 10 || x == 11){
			zz += 3;
		}else if(x == 12 || x == 13 || x == 14 || x == 15){
			zz += 4;
		}else if(x == 16 || x == 17 || x == 18 || x == 19){
			zz += 5;
		}else if(x == 20 || x == 21 || x == 22 || x == 23){
			zz += 6;
		}else if(x == 24 || x == 25 || x == 26 || x == 27){
			zz += 7;
		}else if(x == 28 || x == 29 || x == 30 || x == 31){
			zz += 8;
		}else if(x == 32 || x == 33 || x == 34 || x == 35){
			zz += 9;
		}else{
			zz += 10;
		}
		if(y == 0 || y == 1 || y == 2 || y == 3){
			if(zz + 11 <= 21){
				zz+= 11;
			}else{
				zz++;
			}
		}else if(y == 4 || y == 5 || y == 6 || y == 7){
			zz += 2;
		}else if(y == 8 || y == 9 || y == 10 || y == 11){
			zz += 3;
		}else if(y == 12 || y == 13 || y == 14 || y == 15){
			zz += 4;
		}else if(y == 16 || y == 17 || y == 18 || y == 19){
			zz += 5;
		}else if(y == 20 || y == 21 || y == 22 || y == 23){
			zz += 6;
		}else if(y == 24 || y == 25 || y == 26 || y == 27){
			zz += 7;
		}else if(y == 28 || y == 29 || y == 30 || y == 31){
			zz += 8;
		}else if(y == 32 || y == 33 || y == 34 || y == 35){
			zz += 9;
		}else{
			zz += 10;
		}
	}
	public void calcHouse2(int x, int y){
		if(x == 0 || x == 1 || x == 2 || x == 3){
			xx++;
		}else if(x == 4 || x == 5 || x == 6 || x == 7){
			xx += 2;
		}else if(x == 8 || x == 9 || x == 10 || x == 11){
			xx += 3;
		}else if(x == 12 || x == 13 || x == 14 || x == 15){
			xx += 4;
		}else if(x == 16 || x == 17 || x == 18 || x == 19){
			xx += 5;
		}else if(x == 20 || x == 21 || x == 22 || x == 23){
			xx += 6;
		}else if(x == 24 || x == 25 || x == 26 || x == 27){
			xx += 7;
		}else if(x == 28 || x == 29 || x == 30 || x == 31){
			xx += 8;
		}else if(x == 32 || x == 33 || x == 34 || x == 35){
			xx += 9;
		}else{
			xx += 10;
		}
		if(y == 0 || y == 1 || y == 2 || y == 3){
			xx++;
		}else if(y == 4 || y == 5 || y == 6 || y == 7){
			xx += 2;
		}else if(y == 8 || y == 9 || y == 10 || y == 11){
			xx += 3;
		}else if(y == 12 || y == 13 || y == 14 || y == 15){
			xx += 4;
		}else if(y == 16 || y == 17 || y == 18 || y == 19){
			xx += 5;
		}else if(y == 20 || y == 21 || y == 22 || y == 23){
			xx += 6;
		}else if(y == 24 || y == 25 || y == 26 || y == 27){
			xx += 7;
		}else if(y == 28 || y == 29 || y == 30 || y == 31){
			xx += 8;
		}else if(y == 32 || y == 33 || y == 34 || y == 35){
			xx += 9;
		}else{
			x += 10;
		}
	}
	public void bet(){
		a = true;
		try{
		bid = (int)number();
		 if(0 > bid){
			msg("You cannot place a negative amount of money");
			bet();
		}else if(money < bid){
			msg("You do not have the money to make that bet");
			bet();
		}else if(money >= bid){
			money -= bid;
			startup();
		}else{
			System.exit(0);
		}
		}catch(Exception e){
			msg("Enter a real number.");
			bet();
		}
	}
}
