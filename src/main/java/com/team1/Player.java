package com.team1;

public class Player {

    private char token;
    private String name;
    private Boolean turn;

    
    public Player(char token,String name){
        this.token=token;
        this.name=name;
        this.turn=false;
    }

    public Boolean getTurn() {
        return this.turn;
    }

    public void setTurn(Boolean turn) {
        this.turn = turn;
    }

    public char getToken() {
        return this.token;
    }

    public void setToken(char token) {
        this.token = token;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }   

}
