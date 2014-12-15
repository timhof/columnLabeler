package com.timothyimhof;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColumnLabelerTest {

	/**
	 * Test {@link ColumnLabeler#getColumnName(int)}
	 */
	@Test
	public void testColumnLabels(){
		
		ColumnLabeler labeler = new ColumnLabeler();
		
		
		for(int i = 1;i < 1000;i++){
			String columnName = labeler.getColumnName(i);
			
			System.out.format("%d --> %s\n",  i, columnName);
			int value = labeler.getColumn(columnName);
			assertEquals(i, value); 
		}
		
		
		//Additional explicit comparison tests
		assertEquals(1, labeler.getColumn("A"));
		assertEquals(26, labeler.getColumn("Z"));
		assertEquals(27, labeler.getColumn("AA"));
		
		assertEquals("A", labeler.getColumnName(1));
		assertEquals("B", labeler.getColumnName(2));
		assertEquals("J", labeler.getColumnName(10));
		assertEquals("Z", labeler.getColumnName(26));
		assertEquals("AA", labeler.getColumnName(26 + 1));

		assertEquals("BA", labeler.getColumnName(2*26 + 1));

		assertEquals("BB", labeler.getColumnName(2*26 + + 2));
		
		assertEquals("CA", labeler.getColumnName(3*26 + 1));
		
		assertEquals("ZA", labeler.getColumnName(26*26 + 1));
	
		assertEquals("ZZ", labeler.getColumnName((26*26) + 26));
		
		assertEquals("AAA", labeler.getColumnName((26*26) + 26 + 1));
		assertEquals("AAB", labeler.getColumnName((26*26) + 26 + 2));
		

		assertEquals("AAAA", labeler.getColumnName((int)(Math.pow(26, 3) + Math.pow(26, 2) + Math.pow(26, 1) + Math.pow(26, 0))));
		assertEquals("BAAA", labeler.getColumnName((int)(2*Math.pow(26, 3) + Math.pow(26, 2) + Math.pow(26, 1) + Math.pow(26, 0))));
		
	}
}
