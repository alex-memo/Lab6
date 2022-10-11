import java.util.*;
public class Snail {
	public static char icon = '@';
	private int position;
	private int raceLength = 50;
	private Queue<Integer> movePattern;
	public Snail(int[] pattern) {
		position = 0;
		movePattern = (Queue<Integer>) new LinkedList<Integer>();
		for (int i: pattern)
			movePattern.add(i);
	}
	public void move(){
		int i=movePattern.peek();
		movePattern.remove();
		position = Math.min(position+i, raceLength);
		movePattern.add(i);
	}
	public int getPosition(){
		return position;
	}
	public void display(){
		int x = position;
		int y = raceLength - position;
		for(int i = 0 ; i < x ; i++)
			System.out.print("-");
		System.out.print(icon);
		for(int i = 0 ; i < y ; i++)
			System.out.print("-");
		System.out.println();
	}
}