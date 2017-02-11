package com.example.asususer.srunasatlogger1;

import android.widget.Button;
import android.widget.EditText;

/**
 * Created by asus user on 2/11/2017.
 */

public class RegisterDatabase {
    private int id;
    private String UserName;
    private String Password;
    private String ConfirmPassword;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Gender;
    private String Kantoor;
    private String Adres;
    private String Phone;

    public int getId() {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getUserName(){
        return UserName;
    }
    public void setUserName(String Username)  {
        this.UserName = Username;
    }
    public String getPassword(){
        return Password;
    }
    public void setPassword(String Password)  {
        this.Password = Password;
    }
    public String getConfirmPassword(){
        return ConfirmPassword;
    }
    public void setConfirmPassword(String ConfirmPassword)  {
        this.ConfirmPassword = ConfirmPassword;
    }
    public String getFirstName(){
        return FirstName;
    }
    public void setFirstName(String FirstName)  {
        this.FirstName = FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public void setLastName(String LastName)  {
        this.LastName = LastName;
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email)  {
        this.Email = Email;
    }
    public String getGender(){
        return Gender;
    }
    public void setGender(String Gender)  {
        this.Gender = Gender;
    }
    public String getKantoor(){
        return Kantoor;
    }
    public void setKantoor(String Kantoor)  {
        this.Kantoor = Kantoor;
    }
    public String getAdres(){
        return Adres;
    }
    public void setAdres(String Adres)  {
        this.Adres = Adres;
    }
    public String getPhone(){
        return Phone;
    }
    public void setPhone(String Phone)  {
        this.Phone = Phone;
    }
}
