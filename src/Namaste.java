
public class Namaste {

	public static void main(String[] args) {
		
		System.out.print("Finally 1+1=");
		
		System.out.println(1+2);
		
		System.out.println("Hence proved");
		
		String owner = "Jash Ikon";
		
		String artist = "PsychedBoyy";
		
		String who = owner + " aka " + artist;
		
		System.out.println(who );
		
		System.out.println(artist.charAt(7));
		
		System.out.println(owner.length());
		
		String up = artist.replace('P', 'S' ); //replace
		
		System.out.println(up);
		
		System.out.println(owner.substring(5, 9)); //substring
		
		double b = 6.9;
		int a = (int) b;
		System.out.println(a); //narrow casting (manual)
		
	}

}