/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc321hw;

import java.util.ArrayList;

/**
 *
 * @author nicka
 */
public class LexemAnalyzer {
    
    private String snippet;
    
    private ArrayList<Character> keywords;
    
    private ArrayList<Character> programSnip;
    
    
    
    
    
    
    private String delimeter = ";";
    
    
    
    
    
    public LexemAnalyzer(){
        snippet = "default";
        programSnip = new ArrayList<Character>();
        char current;
         for(int i = 0; i < snippet.length(); i++){
           current = snippet.charAt(i);
          programSnip.add(current);
          
       }
        
        
        
    }
    public LexemAnalyzer(String str){
        this.snippet = str;
        programSnip = new ArrayList<Character>();
        char current;
         for(int i = 0; i < snippet.length(); i++){
           current = snippet.charAt(i);
          programSnip.add(current);
          
       }
        
        
    }
    
    
    public void analyze(){
        
       keywords = new ArrayList<Character>();//initialize arrayList

       for(int i = 0; i < snippet.length(); i++){//for loop for going through string to pick it apart
           if(programSnip.get(i).equals(';')){//if the programSnip (array list from constructors) at index i is equal to a semicolon, then
               keywords.add(';');//the keywords arrayList has the semicolon character added to it 
           }
       }
        
        
        
        
        
        
    }
    
    public ArrayList<Character> getKeyword(){
        return this.keywords;
    }
    
    
    
    
    
    
    
    
    
}
