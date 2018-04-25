package com.campusnum.reseausocialobject;

import java.util.Scanner;

public class App {
	
	private String nom, prenom, ville, age ;
	private User[] utilisateurs = new User[3];
	private String[][] messages = new String [3][3];
	private String[][] friends = new String [3][3];
	private int nbUser, nbMessage, nbFriend;
	
	Scanner sc = new Scanner(System.in);
	
	public App() {
		
		nbUser = 0;
		nbMessage = 0;
		nbFriend = 0;
		
		System.out.println("======BIENVENUE SUR SEECRETSPOT======");
		
		addUser();
		
		int exit = 0;
		
		while (exit == 0) {
		
		System.out.println("Faite votre choix :\n");
		System.out.println("1-Afficher son profil");
		System.out.println("2-Modifier son profil");
		System.out.println("3-Ecrire un message");
		System.out.println("4-Afficher les messages");
		System.out.println("5-Ajouter un amis");
		System.out.println("6-Liste de amis");
		System.out.println("7-Ajouter un utilisateur");
		System.out.println("8-Quitter le programme\n");
		
		int choix;
		
		choix = sc.nextInt();
		sc.nextLine();
		
		switch(choix) {
		
		case 1:
			showProfil();
			break;
		case 2:
			updateProfil();
			break;
		case 3:
			addMessage();
			nbMessage++;
			break;
		case 4:
			showMessages();
			break;
		case 5:
			addFriend();
			nbFriend++;
			break;
		case 6:
			showFriends();
			break;
		case 7:
			nbUser++;
			nbMessage = 0;
			nbFriend = 0;
			addUser();
			break;
		case 8:
			exit = 1;
			break;
			default:
				System.out.println("Choisissez entre 1 et 7");
		}
		
		}
		
		System.out.println("Merci et au revoir");
	}
	
	public void showProfil() {
		System.out.println("Profil utilisateur : ");
		System.out.println("Nom : " + utilisateurs[nbUser].getPrenom());
		System.out.println("Prenom : " + utilisateurs[nbUser].getNom());
		System.out.println("Ville : " + utilisateurs[nbUser].getVille());
		System.out.println("Age : " + utilisateurs[nbUser].getAge());
		System.out.println(" ");
	}
	
	public void updateProfil() {
		if (nbUser < 3) {
			
			System.out.println("Modification d'un utilisateur\n");
			System.out.println("Prénom : " + prenom);
			prenom = sc.nextLine();
			System.out.println("\nNom : " + nom);
			nom = sc.nextLine();
			System.out.println("\nVille : " + ville);
			ville = sc.nextLine();
			System.out.println("\nAge : " + age);
			age = sc.nextLine();
			
			utilisateurs[nbUser].setPrenom(prenom);
			utilisateurs[nbUser].setNom(nom);
			utilisateurs[nbUser].setVille(ville);
			utilisateurs[nbUser].setAge(age);
			
			}
			else {
				System.out.println("Plus de place");
			}
	}
	
	public void addMessage() {
		
		if (nbMessage < 3) {
		
		String message;
		
		System.out.println("Ajouter votre message :");
		message = sc.nextLine();
		
		messages[nbUser][nbMessage] = message;
		}
		else {
			System.out.println("Boite de messages pleine");
		}
	}
	
	public void showMessages() {
		System.out.println("\nVoici les messages :\n");
		for(int j=0; j<=2; j++) {
			System.out.println(messages[nbUser][j]);
		}
		System.out.println("");
	}
	
	public void addFriend() {
		if (nbFriend < 3) {
			
			String friend;
			
			System.out.println("Ajouter un amis :");
			friend = sc.nextLine();
			
			friends[nbUser][nbFriend] = friend;
			}
			else {
				System.out.println("Beaucoup trop d'amis");
			}
	}
	
	public void showFriends() {
		System.out.println("\nVoici mes amis :\n");
		for(int k=0; k<=2; k++) {
			System.out.println(friends[nbUser][k]);
		}
		System.out.println("");
	}
	
	public void addUser() {
		
		if (nbUser < 2) {
		
		System.out.println("Création d'un utilisateur\n");
		System.out.println("Prénom :");
		prenom = sc.nextLine();
		System.out.println("\nNom :");
		nom = sc.nextLine();
		System.out.println("\nVille :");
		ville = sc.nextLine();
		System.out.println("\nAge :");
		age = sc.nextLine();
		
		User utilisateur = new User(nom,prenom,ville,age);
		utilisateurs[nbUser] = utilisateur;
		
		}
		else {
			System.out.println("Plus de place");
		}
	}

	public static void main(String[] args) {
		App app = new App();
	}
}