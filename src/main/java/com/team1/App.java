package com.team1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Board board = new Board();
        

        // WELCOME
        System.out.println("Juguemos tic tac toe");
        System.out.println("Objetivo: en un tablero de 3x3, debes completar con 3 símbolos (X o O) una fila, columna o diagonal para ganar el juego.");
        
        System.out.print("Introduce un nombre para la primera jugadora: ");
        String name = scanner.nextLine();
        Player player1 = new Player('X', name);
        
        System.out.print("Introduce un nombre para la segunda jugadora: ");
        name = scanner.nextLine();
        Player player2 = new Player('O', name);
        
        System.out.println("Jugadora " + player1.getName() + " eres " + player1.getToken());
        System.out.println("Jugadora " + player2.getName() + " eres " + player2.getToken());


        // GAME
        boolean game = true;
        player1.setTurn(true);
        String field;

        do {
            if(player1.getTurn()==true){
                System.out.println("Turno de: " + player1.getName());
                System.out.print("Selecciona una fila y columna: ");
                field=scanner.nextLine();
                player1.setTurn(false);
            }else{
                System.out.println("Turno de: " + player2.getName());
                System.out.print("Selecciona una fila y columna: ");
                field=scanner.nextLine();
                player1.setTurn(true);
            }
            board.printBoard();
            
        } while(game);
        
        
        // END

        scanner.close();
        
    }
}
