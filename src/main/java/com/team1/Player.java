package com.team1;

public class Player {

    private char token;
    private String name;

    public Player(char token,String name){
        this.token=token;
        this.name=name;
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
