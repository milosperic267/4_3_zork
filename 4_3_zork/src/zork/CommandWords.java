package zork;/* * Author:  Michael Kolling. * Version: 1.0 * Date:    July 1999 *  * This class holds an enumeration of all command words known to the game. * It is used to recognise commands as they are typed in. * * This class is part of the "Zork" game. */public class CommandWords {		// a constant array that holds all valid command words	private static final String validCommands[] = { "go", "quit", "help", "back", "map" };	/**	 * Constructor - initialise the command words.	 */	public CommandWords() {	}	/**	 * Check whether a given String is a valid command word. 	 * Return true if it is, false if it isn't.	 **/	public boolean isCommand(String aString) {		for (int i=0; i < validCommands.length; i++) {			if (validCommands[i].equals(aString))				return true;		}		// if we get here, the string was not found in the commands		return false;	}	/**	 * returns an output String.	 */	public String showAll() {		String outputStr="";		for (int i=0; i < validCommands.length; i++) {			outputStr  += validCommands[i] + "  ";		}		return outputStr;	}}