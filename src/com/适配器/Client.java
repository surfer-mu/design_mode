package com.适配器;

/**
 * Created by mu on 2017/10/2.
 */
public class Client {
    public static void main(String[] args) {
        Player player1=new Forwards("上路");
        Player player2=new Forwards("中路");
        Player player3=new Adapter("姚明");

        player1.Attack();
        player1.Defense();
        player2.Attack();
        player2.Defense();
        player3.Attack();
        player3.Defense();
    }
}
