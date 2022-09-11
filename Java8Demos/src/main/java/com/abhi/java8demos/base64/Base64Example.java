package com.abhi.java8demos.base64;

import java.util.Base64;

public class Base64Example {

    public static void main(String[] args){

        //Getting encoder
        Base64.Encoder encoder=Base64.getEncoder();

        //Creating byte array
        byte[] byteArray={1,2};
        //Encoder byte array
       byte[] byteArray2= encoder.encode(byteArray);
       System.out.println("Encoded byte array : "+byteArray2);
       //Create new byte array with enough size
        byte[] byteArray3=new byte[5];
        int intx=encoder.encode(byteArray,byteArray3); //Return no of byte written
        System.out.println("Encoded byte array written in other byte array : "+byteArray3);
        System.out.println("Number of byte written : "+intx);


        //Encoding string
        String str=encoder.encodeToString("Abhijeet Kharat".getBytes());
        System.out.println("Encoded string  : "+str);

        //Getting decoded
        Base64.Decoder decoder=Base64.getDecoder();
        //Decoding string
        String str2=new String(decoder.decode(str));
        System.out.println("Decoded String : "+str2);


        //Url Encoding decoding
        //Getting encoder
        Base64.Encoder urlEncoder=Base64.getUrlEncoder();
        String strEncoder=urlEncoder.encodeToString("https://www.facebook.com/".getBytes());
        System.out.println("Encoded Url : "+strEncoder);
        //Getting decoder
        Base64.Decoder urlDecoder=Base64.getUrlDecoder();
        String strDecoder=new String(urlDecoder.decode(strEncoder));
        System.out.println("Decoded url : "+strDecoder);

        // Getting MIME encoder
        Base64.Encoder encoder3 = Base64.getMimeEncoder();
        String message = "Hello, \nYou are informed regarding your inconsistency of work";
        String eStr = encoder3.encodeToString(message.getBytes());
        System.out.println("Encoded MIME message: "+eStr);

        // Getting MIME decoder
        Base64.Decoder decoder3 = Base64.getMimeDecoder();
        // Decoding MIME encoded message
        String dStr = new String(decoder3.decode(eStr));
        System.out.println("Decoded message: "+dStr);

    }
}
