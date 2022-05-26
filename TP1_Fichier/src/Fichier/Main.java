package Fichier;
import java.io.*;
import static java.lang.System.*;
import java.util.Date;
public class Main {
public static void main(String[] args) throws IOException {
out.println("Répertoire courant : "+System.getProperty("user.dir"));
File rep = new File(".");
out.println("Chemin relatif : "+ rep.getPath());
		out.println("Chemin absolu : "+rep.getAbsolutePath()); 
for (File element:rep.listFiles())
	out.println("Racine : "+element);
 
for (File element:rep.listFiles(new Filtre('b')))
 if (element.isDirectory()) {
		 out.print(element.getName()+"\t");
 if (element.getName().length()<8) 
	out.print("\t");
 out.println("<REP>");
 }
for (File element:rep.listFiles(new Filtre('b')))
if (element.isFile()){
	out.print(element.getName()+"\t");
if (element.getName().length()<8)
	out.print("\t");
out.printf("%tc", new Date(element.lastModified()));
out.printf("\t%10d octets\n", element.length());
 }
 }
}
