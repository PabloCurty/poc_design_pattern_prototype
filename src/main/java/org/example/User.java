package org.example;

import java.util.UUID;

public class User implements Prototype
{
    private UUID id;
    private String name;
    private int age;
    private String email;

    public User(final UUID id, final String name, final int age, final String email)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    private User(User user)
    {
        this.id = user.id;
        this.name = user.name;
        this.age = user.age;
        this.email = user.email;
    }

    public UUID getId()
    {
        return id;
    }

    public void setId(final UUID id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(final int age)
    {
        this.age = age;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(final String email)
    {
        this.email = email;
    }

    @Override
    public Prototype clone()
    {
        return new User(this);
    }

    public String toString()
    {
        return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", email='" + email + '\'' +
            '}';
    }
}
