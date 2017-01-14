 package com.aditya;
 
 import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
 
 public class Main
 {
   public static void main(String[] args) throws Exception
   {
     if (args.length == 0) {
       return;
     }
     
     File file = new File(args[0]);
     
     Map mapOfReplacers = loadMap(new FileInputStream(file));
     
     for (int i = 1; i < args.length; i++) {
       File torename = new File(args[i]);
       
       String oldFileName = torename.getName();
       
       StringBuilder oldFN = RenaingUtil.convertOldFileTONew(mapOfReplacers, oldFileName, torename.isDirectory());
       
 
       File newFile = new File(torename.getParent(), oldFN.toString());
       torename.renameTo(newFile);
     }
   }
   
   private static Map<String, String> loadMap(FileInputStream fileInputStream)
   {
     Map map = new LinkedHashMap();
     BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
     String s = null;
     try {
       while ((s = br.readLine()) != null) {
         String[] split = s.split("=");
         map.put(split[0], split[1]);
       }
     } catch (IOException e) {
       e.printStackTrace();
     }
     
     return map;
   }
   
   
 }

