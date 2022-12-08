package com.example.macnssapp.sercurity;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
    public String hashingPassword(String password){
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(password.getBytes());
            byte[] result = messageDigest.digest();
            StringBuilder stringBuilder = new StringBuilder();

            for(byte b : result){
                stringBuilder.append(String.format("%02x", b));
            }
            return stringBuilder.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
