package com.Parth;

import java.util.ArrayList;

public class mobilephone {
    private String mynumber;
    private ArrayList<contact> contacts;

    public mobilephone(String mynumber) {
        this.mynumber = mynumber;
        this.contacts=new ArrayList<>();
    }
    public boolean addnewcontact (contact c)
    {
        if(findcontact(c.getName())>=0)
        {   System.out.println("contact is already present in arraylisy\n");
            return true;
        }
        contacts.add(c);
        return false;

    }
    public boolean updatecontact(contact oldcontact,contact newcontact)
    {
        int i =findcontact(oldcontact);
        if(i>=0)
        {
            contacts.set(i,newcontact);
            return true;

        }
        else
            System.out.println(oldcontact.getName()+ "is not found");
        return false;
    }
    public boolean removecontact (contact c)
    {
        if(findcontact(c)>=0)
        {
            this.contacts.remove(c);
            return true;
        }
        else
            System.out.println("contact not found in list");
        return false;
    }

    private int  findcontact(contact c)
    {
       return this.contacts.indexOf(c);
    }
    private int findcontact(String contactname)
    {
       for (int i=0;i<this.contacts.size();i++)
       {
                   contact c=this.contacts.get(i);
                   if(c.getName().equals(contactname));
           {
               return i;
           }

       }
       return -1;
    }
    public String querycontact(contact c)
    {
        if(findcontact(c)>=0)
            return c.getName();
        else
            return null;
    }
    public contact querycontact(String name )
    {        int pos=findcontact(name);
             if(pos>=0)
             {
                 return this.contacts.get(pos);
             }
             return null;
    }
    public  void printcontacts()
    {
        for(int i=0;i<this.contacts.size();i++)
        {
            System.out.println((i+1) +" . "+ this.contacts.get(i).getName()+"->"+this.contacts.get(i).getPhoneno());
        }
    }


}
