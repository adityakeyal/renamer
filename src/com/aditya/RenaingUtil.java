package com.aditya;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RenaingUtil {
	
	public  static StringBuilder convertOldFileTONew(Map<String, String> replacementStr, 
			String oldFileName, boolean isDir) {
		//replace . with space
	     String newFileName = StringHelper.replaceCaseInsensitive(oldFileName, ".", " ");
	     
	     
	     
	     
	      
	     
	     
	     //replacementStr is the map of to=from3,from2,from1
	     
	     Set<Entry<String, String>> replacementEntrySet = replacementStr.entrySet();
	     for (Entry<String, String> entry : replacementEntrySet) {
			String toBeReplaced = entry.getKey();
			String[] fromValues = entry.getValue().split(",");
			
			for (String from : fromValues) {
				newFileName = StringHelper.replaceCaseInsensitive(newFileName, from, toBeReplaced);	
			}
			
		}
	     
	     	 
	     //replace double space with single space 3 times
	     newFileName = StringHelper.replaceCaseInsensitive(newFileName, "  ", " ");
	     newFileName = StringHelper.replaceCaseInsensitive(newFileName, "  ", " ");
	     newFileName = StringHelper.replaceCaseInsensitive(newFileName, "  ", " ");
	     
	     
	     
	     //convert last space to . to make it a file with extension
	     StringBuilder oldFN = new StringBuilder(newFileName);
	     int lastIndexOf = oldFN.lastIndexOf(" ");
	     if (!isDir) {
	       oldFN.setCharAt(lastIndexOf, '.');
	     }
	     
	 
	 
	 
	     String[] split = oldFN.toString().split(" ");
	     StringBuilder sb = new StringBuilder();
	     
	     boolean convertCamel = true;
	     String[] arrayOfString2; int k = (arrayOfString2 = split).length; for (int j = 0; j < k; j++) { String string = arrayOfString2[j];
	       
	       if ((string.startsWith("720")) || (string.startsWith("1080")) || (string.matches("\\d{4}"))) {
	         convertCamel = false;
	       }
	       
	       if (convertCamel) {
	         sb.append(StringHelper.convertCamel(string)).append(" ");
	       } else {
	         sb.append(string).append(" ");
	       }
	     }
	     
	 
	 
	     return sb;
	   }

}
