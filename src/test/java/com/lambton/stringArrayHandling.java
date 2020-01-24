package com.lambton;

public class stringArrayHandling {
    public static void stringArrayHandling() {
        String str[];
        str = new String[10];
        str[0] = "Canada";
        str[1] = "India";
        str[2] = "Nepal";
        str[3] = "Toronto";
        str[4] = "New York";
        str[5] = "Sandhu";
        str[6] = "Nikita";
        str[7] = "Mississauga";
        str[8] = "Scarborough";
        str[9] = "North York";

        System.out.println("Countries and Names : "+str[0]+", "+str[1]+", "+str[2]+", "+str[3]+", "+str[4]+", "+str[5]+", "+str[6]+", "+str[7]+", "+str[8]+", "+str[9]);
        System.out.println(" ");
        System.out.println("Countries and Names  : ");
        for(int i=0; i<str.length;i++) {
            System.out.println(str[i]);
        }
    }

    public static String revString(String str)
    {
        char c [] = str.toCharArray();
        String rev="";
        for (int i = c.length-1; i>=0; i--)
        {
            rev= rev+c[i];
        }
        return rev;
    }
}

