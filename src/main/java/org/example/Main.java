package org.example;

import java.util.UUID;

public class Main
{
    public static void main(String[] args)
    {
        var user1 = new User(UUID.randomUUID(), "Pablo", 48, "pablofcurty@gmail");
        var userClone = user1.clone();

        System.out.println(user1);
        System.out.println(userClone);
    }
}