//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks { 	
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
	String MattsPower = "talking to cats"; 
	String TiernansPower = "Flying"; 
	String FernandasPower = "turn into a dabasaurus-rex";
	String AndrewsPower = "Turn into an asian panda"; 
	String RyansPower = "Mind controlling";
	String NathanPower = "hacking free roblox and the pentagon"; 
	String EnterNamePower = "person that has nothing better to do than to do this... it is my great honor... to grant you the power of..... reading this!!!!!! :) GOODBYE!(You just wasted your time)HA!";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String a=JOptionPane.showInputDialog("Enter name");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
JOptionPane.showMessageDialog(null,"Hello..."+ EnterNamePower); 
if(a.equals("EnterNamePower")); 
if(a.equals("MattsPower")); 
if(a.equals("TiernansPower")); 
if(a.equals("FernandasPower")); 
if(a.equals("AndrewsPower")); 
if(a.equals("RyansPower")); 
if(a.equals("NathanPower")); 



	}
}

