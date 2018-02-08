//Jack Hosier, Java Object Data 
package play_with_substring;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String ("Albuquerque, New Mexico has great sauerkraut! So far I've flown first class and survvied a crash-landing there, got my lucky lucky autographed, glow-in-the-dark snorkel stolen by a one-nostrauled man, got mauled by a box of rabid weasels, dismembered Marty when he asked me to 'cut off his arms and legs' when he was only being sarcastic, and...I forgot the rest.");
		
		//I'm referencing Weird Al Yankovic's song "Albuquerque", you should listen to it, it's really funny. 
		String sub = str.substring(0, 29);
		System.out.println(sub);
		//When ever I try to use str.length(); the program crashes.
		//I also get an error when the first parameter is negative.  
	}

}
