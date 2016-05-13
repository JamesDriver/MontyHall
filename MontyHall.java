package practice;
import java.util.Random;
public class MontyHall {
static Random rand = new Random();
static int selected;
static int open;
static int right;
static int win;
static int lose;
	public static void main(String[] args) {
		for(int i = 0; i < 10000; i++) {
			right = rand.nextInt(3);
			selected = rand.nextInt(3);
			for(int j = 0; j<3;j++){
				if (right != j && j != selected) {
					open = j;break;
				}
			}
			for(int j = 0; j<3;j++){
				if (j!= selected && j!=open){
					selected = j;
					break;
				}	
			}		
			if (selected == right) win++;
			else lose++;
		}
		System.out.println("Switching won " + win+ " times.");
		System.out.println("Switching lost "+ lose+" times.");

	}
}