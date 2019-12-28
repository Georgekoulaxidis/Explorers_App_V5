package com.example.explorersappv5;

import java.net.UnknownServiceException;
import java.util.jar.Attributes;

public class User {
    String Name, Username, Password;
    int System, email;

    public User (String name, int System, int email, String Username, String Password){
        this.System = System;
        this.email = email;
        this.Name = Name;
        this.Username = Username;
        this.Password = Password;

    }
    public User(String Username, String Password){
        this.Username = Username;
        this.Password = Password;
        this.Name = "";
        this.System = -1;

    }

}
