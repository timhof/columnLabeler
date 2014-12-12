package com.timothyimhof;

public class ColumnLabeler {

	/**
	 * Derive column name for given column number
	 * Column numbers start from 1
	 * 
	 * @param column
	 * @return
	 */
	public String getColumnName(int column){
		
		int columnIndex = column - 1;
		
		//Invalid input. First column has value 1, not 0
		if(columnIndex < 0){
			return "Invalid input. First column has value 1, not 0";
		}
		//get zero-based index
		if((columnIndex / 26) > 0){
			return getColumnName((columnIndex/26)) + getLetter(columnIndex%26);
		}
		else {
			return getLetter(columnIndex%26);
		}
	}
	
	/**
	 * Calculate the column number for given column name
	 * Column numbers start from 1
	 * 
	 * @param columnName
	 * @return
	 */
	public int getColumn(String columnName){
		
		int value = 0;
		for(int i = columnName.length();i > 0;i--){
			value += (columnName.toUpperCase().charAt(i-1) - 'A' + 1) * Math.pow(26,  columnName.length()-i);
		}
		return value;
	}

	private String getLetter(int letterIndex){
		return String.valueOf((char)(letterIndex + 'A'));
	}
}
