/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

public class StringHandling {
    public static void main(String[] args) {
        
        //String Extraction
        String str = "Hello";
        char c1 = str.charAt(2);
        char [] c2 = new char[2];
        str.getChars(1,3,c2,0);
        char [] arr = str.toCharArray();
        
        System.out.println("Character Extraction using charAt(): "+c1);
        for(int i=0;i<c2.length;i++)
            System.out.println("Character Extranction using getChar(): "+c2[i]);
        for(int i=0;i<arr.length;i++)
            System.out.println("Character Extraction using toCharArray(): "+arr[i]);
        
        //String Comparison
        String str1 = "Java"; 
        String str2 = "java";
        
        System.out.println("COmparison using equals(): "+str1.equals(str2));
        System.out.println("COmparison using equalsIgnoreCase(): "+str1.equalsIgnoreCase(str2));
        System.out.println("Comparison using CompareTo(): "+str1.compareTo(str2));
        
        //String Modification
        String st1 = "This is a java class";
        String st2 = " currently running.";
        String subst = st1.substring(2);
        System.out.println("Using substring(): "+subst);
        System.out.println("Concatenated String: "+st1.concat(st2));
        System.out.println("Replaced String: "+st1.replace("java", "web"));
    }
}
