package cn.ccsn;

import cn.ccsn.api.util.codec.KeyGenerater;
/**
 * 
 *@Title: KeyGeneraterTest.java  
 *@Package cn.ccsn  
 *@Description: 公钥 私钥 生成器
 *@author gaodaojiang@hotmail.com 
 *@date 2019年10月29日 下午8:14:57  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
public class KeyGeneraterTest {
	  public static void main(String[] args) { 
		 KeyGenerater kgA = new KeyGenerater();  
	     kgA.generater();  
	
	    /* KeyGenerater kgB = new KeyGenerater();  
	     kgB.generater();  */
	     System.out.println("pubKeyA = " + new String(kgA.getPubKey()));  
	     System.out.println("priKeyA = " + new String(kgA.getPriKey()));  
	    // System.out.println("PubKeyB = " + new String(kgB.getPubKey()));  
	    // System.out.println("PriKeyB = " + new String(kgB.getPriKey()));  
	     

 }  

 private static boolean equals(byte[] b, byte[] m2) {  
     try{  
     for (int i = 0; i < m2.length; i++) {  
         if(b[i]!=m2[i]){  
             return false;  
         }  
     }  
     return true;  
     }catch (Exception e) {  
         return false;  
     }  
 }  

 private static void print(String s,byte[] m) {  
     System.out.print(s);  
     for (int i = 0; i < m.length; i++) {  
         System.out.print(Byte.valueOf(m[i]).intValue());  
         System.out.print(",");  
     }  
     System.out.println();  
       
 }  

}
