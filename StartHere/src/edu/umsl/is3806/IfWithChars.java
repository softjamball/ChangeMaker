/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl.is3806;

/**
 *
 * @author Jamie
 */
public class IfWithChars 
{
    public static void main(String[] args)
            throws java.io.IOException  //needed because we want an input for the output to happen
    {
        char ch, answer = 'K';
        
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.println("Can you guess it: ");
        
        ch = (char) System.in.read();  //read char from keyboard
        
        if(ch == answer) System.out.println("**RIGHT**");
        
        else System.out.println("Incorrect");
        
    }
    
}
