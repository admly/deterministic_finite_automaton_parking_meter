package deterministic_finite_automaton;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 int state = Automaton.get_coin();
		 System.out.println(state);
		 while(state != 7){
		 state = Automaton.get_coin();
		 System.out.println(state);}
		 

	}}

