/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OMEN
 */
class User {
    private int age;
    private String name, address,phone;
    public User(String name, int age , String address , String phone)
    {
        this.age = age;
        this.name = name;
        this.address = address;
        this.phone = phone;
        
    }
    
    public int getage()
    {
        return age;
    }
    
    public String getname ()
    {
        return name;
    }
    
public String getaddress()
{
    return address;
}

public String getphone()
{
    return phone;
}
        }