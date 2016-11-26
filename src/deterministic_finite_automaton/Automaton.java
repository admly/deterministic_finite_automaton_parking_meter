package deterministic_finite_automaton;
public class Automaton {
	private static String status = "Current state (coins thrown): ";
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
	public static int state = 0;
	StringBuilder string = new StringBuilder();
	Automaton(){};
	
	public String define_state(int coin_enum){
		state=states[state][coin_enum];
		string.append(String.valueOf(state) + " ");
		if(state == 7){
			String message = "State achieved.\n" + "States during run: " + string + "\nActual state: " + state;
    		return message  		
    		;}
    	
    	else if(state == 0){
    		string.setLength(0);
    		return "Too much money, returning your coins.\nTry again.";}
		
		return String.valueOf(status + state);
	}}





