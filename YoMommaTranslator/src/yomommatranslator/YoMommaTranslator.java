package yomommatranslator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class YoMommaTranslator {
    
  public static void main(String[] args) throws FileNotFoundException
  { TreeMap<String, String> acrDict = new TreeMap<>();
    
    // read file acronyms
    File input = new File("acronyms.txt");
    Scanner in = new Scanner(input);
    
    // put file contents into map 
    String line = "";
    while(in.hasNextLine())
    {   line = in.nextLine();
       String[] splitted = line.split("\\t");
       
       for(int i = 0; i < splitted.length-1 ; i++)
          acrDict.put(splitted[i].toLowerCase(), splitted[i+1].toLowerCase());
    }
    
    //System.out.print(acrDict.get("LOL"));
    //acronyms are keys, expanded form are values 
    //System.out.print(acrDict.keySet().toArray()[0].toString());
    
    //print map 
    //for(String acronym: acrDict.keySet())
    //   System.out.println(acronym + " = " + acrDict.get(acronym));
    
    // ask user for sentence 
   Scanner userIn = new Scanner(System.in).useDelimiter("\\n");
   System.out.print("Enter a sentence: "); //LOL WTH mom srsly I will be there tmrw
   String userInput = userIn.next();
   String[] split = userInput.toLowerCase().split("\\s+"); 
   //[LOL, WTH, MOM, SRSLY, I, WILL, BE, THERE, TMRW] or [TGIF, DUDE, DON�T, 4GET, TO, BYOC, 2NITE]
   //System.out.println(Arrays.toString(split));
   for(int i = 0; i < split.length; i++)
   {    if(acrDict.containsKey(split[i]))
           split[i] = acrDict.get(split[i]);
   }
   
   //join splitted string back together 
   String expanded = String.join(" ", split);
   
   //make sure first letter is capitalized
   expanded = expanded.substring(0,1).toUpperCase() + expanded.substring(1);
   
   
   // BETTER WAY TO DO THIS?
   //omit weird characters/capitalize solitary I's 
   if(expanded.contains("?")) expanded = expanded.replace("?", "");
   if(expanded.contains(" i ")) expanded = expanded.replace(" i ", " I ");
   // what if I is at end of sentence 
   
   System.out.println(expanded);      
  }   
}
