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

    private ArrayList<String> seperator;//arraylist for holding seperators 
    private ArrayList<String> operator;//arrayList for holding operators 
    private ArrayList<String> keyword;//arrayList for holding keywords 
    private ArrayList<String> constants;//arrayList for holding constants 
    private ArrayList<String> delimeters;
    private ArrayList<String> integerLit;

    private ArrayList<Character> programSnip;

    private String delimeter = ";";

    public LexemAnalyzer() {
        snippet = "default";
        programSnip = new ArrayList<Character>();
        char current;
        for (int i = 0; i < snippet.length(); i++) {
            current = snippet.charAt(i);
            programSnip.add(current);

        }

    }

    public LexemAnalyzer(String str) {
        this.snippet = str;
        programSnip = new ArrayList<Character>();
        char current;
        for (int i = 0; i < snippet.length(); i++) {
            current = snippet.charAt(i);
            programSnip.add(current);

        }

    }

    public void analyze() {

        /*
       seperator analyzer 
         */
        seperator = new ArrayList<String>();//initialize arrayList

        for (int i = 0; i < snippet.length(); i++) {//for loop for going through string to pick it apart
            if (programSnip.get(i).equals(';')) {//if the programSnip (array list from constructors) at index i is equal to a semicolon, then
                seperator.add(";");//the keywords arrayList has the semicolon character added to it 
            }
        }

        /*
        operator analyzer
         */
        char operator1 = '<';
        char operator2 = ':';

        operator = new ArrayList<String>();

        for (int i = 0; i < snippet.length(); i++) {
            if (programSnip.get(i).equals(operator2) && programSnip.get(i + 1).equals(operator2)) {
                operator.add("::");
            }
            if (programSnip.get(i).equals(operator1) && programSnip.get(i + 1).equals(operator1)) {
                operator.add("<<");
            }
        }

        /*
       keyword analyzer
         */
        String keyword1 = "int";
        String keyword2 = "return";

        keyword = new ArrayList<String>();

        for (int i = 0; i < snippet.length(); i++) {

        }

        /*
       constants analyzer 
         */
        constants = new ArrayList<String>();
        char add;
        String finalStr = "";
        for (int i = 0; i < snippet.length(); i++) {

            if (programSnip.get(i).equals('\"')) {
                int position = programSnip.get(i);
                for (int j = position; j < snippet.length(); j++) {
                    if (!programSnip.get(j).equals('\"')) {
                        finalStr += programSnip.get(j);
                    }

                }

            }

            constants.add(finalStr);
        }

        /*
       delimeter analyzer
         */
        delimeters = new ArrayList<String>();

        char deli1 = '(';
        char deli2 = ')';
        char deli3 = '{';
        char deli4 = '}';

        for (int i = 0; i < snippet.length(); i++) {
            if (programSnip.get(i).equals(deli1)) {
                delimeters.add("(");
            }
            if (programSnip.get(i).equals(deli2)) {
                delimeters.add(")");
            }
            if (programSnip.get(i).equals(deli3)) {
                delimeters.add("{");
            }
            if (programSnip.get(i).equals(deli4)) {
                delimeters.add("}");
            }

        }

        /*
        integer literal analyzer
        */
        
        integerLit = new ArrayList<String>();
        
        String str = "";
        
        
        for(int i = 0; i < snippet.length(); i++){
            
            if(Character.isDigit(programSnip.get(i))){
                System.out.println("TEST");
                str += programSnip.get(i);
            }
            
            
        }
        
        integerLit.add(str);
    }
    
    

    public ArrayList<Character> getSnippet() {
        return this.programSnip;
    }

    public ArrayList<String> getSeperators() {
        return this.seperator;
    }

    public ArrayList<String> getOperators() {
        return this.operator;
    }

    public ArrayList<String> getConstants() {
        return this.constants;
    }

    public ArrayList<String> getDelimeters() {
        return this.delimeters;
    }
    
    public ArrayList<String> getIntLits(){
        return this.integerLit;
    }

}
