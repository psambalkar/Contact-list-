package com.Parth;

public class contact {
    private String name;
    private String phoneno;

    public contact(String name, String phoneno) {
        this.name = name;
        this.phoneno = phoneno;
    }

    public String getName() {
        return name;
    }

    public String getPhoneno() {
        return phoneno;
    }
    public static contact createcontact(String name,String phoneno)
    {
        return new contact(name,phoneno);
    }

}
