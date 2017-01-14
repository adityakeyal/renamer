 package com.aditya;
 
 
 
 
 public class StringHelper
 {
   public static String replaceCaseInsensitive(String original, String toReplace, String replaceWith)
   {
     String originalLowerCase = original.toLowerCase();
     String substring = original;
     int idx = originalLowerCase.indexOf(toReplace.toLowerCase());
     if ((toReplace.equals("6 1")) || (toReplace.equals("7 1")) || (toReplace.equals("8 1")) || (toReplace.equals("9 1")) || (toReplace.equals("5 1"))) {
       char charAt = originalLowerCase.charAt(idx - 1);
       if ((charAt >= '0') && (charAt <= '9')) {
         return substring;
       }
     }
     
     while (idx > -1) {
       substring = substring.substring(0, idx);
       substring = substring + replaceWith;
       substring = substring + original.substring(idx + toReplace.length());
       originalLowerCase = substring.toLowerCase();
       original = substring;
       idx = originalLowerCase.indexOf(toReplace.toLowerCase(), idx + toReplace.length());
     }
     
     return substring;
   }
   
 
   public static String convertCamel(String string)
   {
     return string.toUpperCase().substring(0, 1) + string.toLowerCase().substring(1);
   }
 }

