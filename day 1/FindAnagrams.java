package com.practice;
import java.util.*;



/*
 * 
 * ****leetcode daily challenge*****
 * ****problem number 438 *****
 * 
 */



public class FindAnagrams {
	
	
	 boolean isequal( int arr1 [] , int arr2 [] ) {
	        
	        for(int i =0 ; i < arr1. length; i++){
	            if(arr1[i] != arr2[i])
	                return false;
	            
	        }
	        return true;
	           
	    }
	   public ArrayList<Integer> findanagrams (String s, String p) {
	        
	        ArrayList < Integer > res = new ArrayList<Integer>();
	        
	        if(s.length()<p.length())
	            return res;
	        int p_freq[] = new int [26];
	        int temp[] = new int [26];
	        int i;
	        
	        
	        for ( i=0; i<p.length(); i++){
	            p_freq[ p.charAt(i) - 'a']++;
	             temp[s.charAt(i) - 'a']++;
	        }
	        
	        
	        if ( isequal( p_freq,temp))
	            res.add(0);
	        
	        
	        
	        for(; i <  s.length(); i++){            
	            temp [s.charAt(i) - 'a']++;            
	            temp[s.charAt(i-p.length()) - 'a']--;     
	            
	            if ( isequal ( p_freq , temp ))
	                res.add(i+1-p.length());
	        }
	        
	        
	       return res;
	        
	        
	        
	    }
	

	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		
		String s = scan.next();
		String p = scan.next();
		
		FindAnagrams obj = new FindAnagrams();
		
		
    ArrayList<Integer>res =obj. findanagrams ( s , p );
    
    for(int x : res )
    	System.out.print(x+" ");
    
		
		
	}
	
}
