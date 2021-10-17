package baseline;

import java.util.Scanner;



public class IO {

    private static final Scanner scan = new Scanner(System.in);
    private boolean jssFolder = false;
    private boolean cssFolder = false;
    private String siteIn;
    private String authIn;

    void takeInput()
    {
        System.out.print("Site name: ");
        //Take input for name of site
        siteIn = scan.nextLine();

        System.out.print("Author: ");
        //Take input for author
        authIn = scan.nextLine();

        System.out.print("Do you want a folder for JavaScript? ");
        //y or n for javascript files
        String jssChoice = scan.nextLine();
        if(jssChoice.equals("y") || jssChoice.equals("Y"))
            jssFolder = true;
        //y or n for css files

        System.out.print("Do you want a folder for CSS? ");
        String cssChoice = scan.nextLine();

        if(cssChoice.equals("y") || cssChoice.equals("Y"))
            cssFolder = true;
    }


    String getSiteIn()
    {
        return siteIn;
    }
    String getAuthIn()
    {
        return authIn;
    }
    boolean getJss()
    {
        return jssFolder;
    }
    boolean getCSS()
    {
        return cssFolder;
    }

}
