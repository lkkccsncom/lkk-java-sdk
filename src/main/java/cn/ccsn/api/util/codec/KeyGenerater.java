package cn.ccsn.api.util.codec;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom; 
public class KeyGenerater {
	    private byte[] priKey;  
	    private byte[] pubKey;  
	  
	    public byte[] getPriKey() {  
	        return priKey;  
	    }  
	  
	    public void setPriKey(byte[] priKey) {  
	        this.priKey = priKey;  
	    }  
	  
	    public byte[] getPubKey() {  
	        return pubKey;  
	    }  
	  
	    public void setPubKey(byte[] pubKey) {  
	        this.pubKey = pubKey;  
	    }  
	  
	    public void generater() {  
	        try {  
	            java.security.KeyPairGenerator keygen = java.security.KeyPairGenerator.getInstance("RSA");  
	            SecureRandom secrand = new SecureRandom();  
//	          secrand.setSeed(seed.getBytes()); // 初始化随机产生器,不要调用这个，不安全//seed相同的情况下，每次产生的密钥都一样  
	            keygen.initialize(1024, secrand);  
	            KeyPair keys = keygen.genKeyPair();  
	  
	            PublicKey pubkey = keys.getPublic();  
	            PrivateKey prikey = keys.getPrivate();  
	  
	            pubKey = Base64.encodeBase64(pubkey.getEncoded());  
	            priKey = Base64.encodeBase64(prikey.getEncoded());  
	  
	        } catch (java.lang.Exception e) {  
	            System.out.println("生成密钥对失败");  
	            e.printStackTrace();  
	        }  
	    }  
	    
	    
	  
}
