
package Fichier_Ex2;
import java.io.*;
import java.util.Scanner;
public class autentification {
public static void main(String[] args) throws IOException {
	 String l;
	 BufferedReader f;
	 boolean test = false;

	 f= new BufferedReader(new FileReader("E:\\login\\in.txt"));
Scanner myObj = new Scanner(System.in);
String Login;
String Password;
System.out.println("Entrer Login"); 
Login = myObj.nextLine();
System.out.println("Entrer password"); 
Password = myObj.nextLine();

l = f.readLine();
//System.out.println(l);
while (l != null) {
	 String[] mot = l.split("/");
	 if (mot[0].equals(Login) && mot[1].equals(Password)) { 
		 test = true;
		 }
	 l = f.readLine();
	 }
	 f.close();
	 if (test == true) {
	 System.out.println("Authentification réussi");
	 } 
	 else {
	 System.out.println("Erreur");
	 }
}
}
