package com.timothyimhof;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	
    	ColumnLabeler labeler = new ColumnLabeler();
    	
    		System.out.println(labeler.getColumnName(0));
    		System.out.println(labeler.getColumnName(1));
    		System.out.println(labeler.getColumnName(26));
    		System.out.println(labeler.getColumnName(27));
    }
}
