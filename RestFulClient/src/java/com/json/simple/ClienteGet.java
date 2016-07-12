/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.json.simple;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author Zeus
 */
public class ClienteGet {
    
    public static void main(String[] args) {
        
       ClienteGet a=new ClienteGet();
       a.test();
       
            
    }
    void test(){
         try {
            Client cliente =Client.create();
            
            //WebResource webResource =cliente.resource("http://www3.inegi.org.mx//sistemas/api/indicadores/v1//Indicador/6200240321/00000/es/true/json/ed691407-9122-1026-b213-9e4c80c18987");
             //WebResource webResource =cliente.resource("http://localhost:8080/ApplicationWebServices/webresources/generic/obtener");
             WebResource webResource =cliente.resource("http://localhost:8000/api/posts/?format=json");
             ClientResponse response = webResource.accept("application/json")
                   .get(ClientResponse.class);
            
            if(response.getStatus()!=200){
                throw new RuntimeException("Failed:HTTP error code:"+response.getStatus());
                
            }
            
             String salida=response.getEntity(String.class);
             
              System.out.println("Salida del servidor.....\n");
              System.out.println(salida);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void saludo(){
         String name ="Pepe";
         int n1 = 2;
         int n2 = 4;
         try {
            Client cliente =Client.create();
            
            //WebResource webResource =cliente.resource("http://www3.inegi.org.mx//sistemas/api/indicadores/v1//Indicador/6200240321/00000/es/true/json/ed691407-9122-1026-b213-9e4c80c18987");
             WebResource webResource =cliente.resource("http://localhost:8080/ApplicationWebServices/webresources/generic/saludo/name="+name);
             //WebResource webResource =cliente.resource("http://jsonplaceholder.typicode.com/posts/1");
             ClientResponse response = webResource.accept("application/json")
                   .get(ClientResponse.class);
            
            if(response.getStatus()!=200){
                throw new RuntimeException("Failed:HTTP error code:"+response.getStatus());
                
            }
            
             String salida=response.getEntity(String.class);
             
              System.out.println("Salida del servidor.....\n");
              System.out.println(salida);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
   void suma(){
       int n1 = 2;
         int n2 = 4;
         try {
            Client cliente =Client.create();
            
            //WebResource webResource =cliente.resource("http://www3.inegi.org.mx//sistemas/api/indicadores/v1//Indicador/6200240321/00000/es/true/json/ed691407-9122-1026-b213-9e4c80c18987");
             WebResource webResource =cliente.resource("http://localhost:8080/ApplicationWebServices/webresources/generic/suma/"+"n1="+n1+"&n2="+n2);
             //WebResource webResource =cliente.resource("http://jsonplaceholder.typicode.com/posts/1");
             ClientResponse response = webResource.accept("application/json")
                   .get(ClientResponse.class);
            
            if(response.getStatus()!=200){
                throw new RuntimeException("Failed:HTTP error code:"+response.getStatus());
                
            }
            
             String salida=response.getEntity(String.class);
             
              System.out.println("Salida del servidor.....\n");
              System.out.println(salida);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
   }
}
