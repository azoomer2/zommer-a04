package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Solution43 {




    public void createWebsite(String name, String auth, boolean js, boolean css)
    {


        String currentPath = "website//";
        currentPath += "\\" +name;
        //create website folder
        File website = new File(currentPath);
        boolean websiteCreated = website.mkdir();
        if(websiteCreated) {
            System.out.println("Created " + "./website/"+name);
            try{
                //create .html file
                FileWriter folderWrite = new FileWriter((currentPath+"\\index.html"));
                folderWrite.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                folderWrite.write("\t<meta author=\""+auth+"\">\n");
                folderWrite.write("\t<title>"+name+"</title>\n");
                folderWrite.write("</head>\n<body>\n\n</body>\n</html>");
                folderWrite.close();

                System.out.println("Created " + "./website/"+name+"/index.html");
                //if javascript
                //create js folder
                if(js)
                {
                    File jsFolder = new File(currentPath+"\\js");
                    boolean jsCreated = jsFolder.mkdir();
                    if(jsCreated)
                    {
                        System.out.println("Created " + "./website/js/");
                    }
                    else
                        System.out.println("Error, JSS folder not created!");
                }
                //if css
                //create css folder
                if(css)
                {
                    File cssFolder = new File(currentPath+"\\css");
                    boolean cssCreated = cssFolder.mkdir();
                    if(cssCreated)
                        System.out.println("Created " + "./website/css/");
                    else
                        System.out.println("Error creating css folder!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }


    public static void main(String[] args) {
        Solution43 s43 = new Solution43();
        IO io = new IO();
        io.takeInput();
        s43.createWebsite(io.getSiteIn(),io.getAuthIn(),io.getJss(),io.getCSS());


    }

}
