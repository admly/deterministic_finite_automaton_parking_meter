package deterministic_finite_automaton;
import java.util.*;
public class Automaton {
	private static final  Integer[][] states = new Integer[][]{
		{1,2,5},
		{2,3,6},
		{3,4,7},
		{4,5,0},
		{5,6,0},
		{6,7,0},
		{7,0,0},
		{0,0,0},
	};
	
	private final static List<Integer> coins_list = Arrays.asList(1, 2, 5);
	private final static int sum = 0;
	private final static int my_coin =0;
	public static int state = 0;
	Automaton(){};
	
	private static boolean coin_check(int coin){
		if(coins_list.contains(coin)){
			return true;		}
		else{return false;}		
		}
	
	private static int define_state(int coin){
		if(coin == 1){
			int coin_enum = 0;
			state=states[state][coin_enum];
		}
		else if (coin == 2){
			int coin_enum = 1;
			state=states[state][coin_enum];
		}else{
			int coin_enum = 2;
			state=states[state][coin_enum];
		}
		if(state == 0){System.out.println("You inserted too much ! Returning coins.");}
		return state;
		};
		
	public static int get_coin(){
		 Scanner reader = new Scanner(System.in);
		 System.out.println("Enter a coin. Accepted coins: 1, 2, 5. : ");
	     int n = reader.nextInt(); 
	     while(coin_check(n) == false){
			 System.out.println("Wrong coin, try 1, 2 or 5, not " + n);
		     n = reader.nextInt();
		     
	     }
	     
		return(define_state(n));
	};
		
	

}
