package Fichier;

import java.io.File;
import java.io.FilenameFilter;

class Filtre implements FilenameFilter {
	 private char lettre;
	 
	 public Filtre(char lettreDebut) {
	 lettre = lettreDebut;
	 }
	 public boolean accept(File repFiltre, String nom) {
	 return(nom.charAt(0)==lettre);
	 }
	}