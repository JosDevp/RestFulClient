/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.json.simple;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author Zeus
 */
public class JerseyClientPost {
    
    public static void main(String[] args) {
        try{
        Client cliente=Client.create();
        WebResource webResource=cliente.resource("http://localhost:8080/ApplicationWebServices/webresources/generic/post");
        String input ="{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
        
        ClientResponse response=webResource.type("application/json").post(ClientResponse.class,input);
        
        if(response.getStatus()!=201){
            throw new RuntimeException("Failed : HTTP error code : "
			     + response.getStatus());
        }
        
        System.out.println("Salida del servidor....\n");
        String output=response.getEntity(String.class);
        System.out.println(output);
        
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}
