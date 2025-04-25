package com.anais.soap;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(name = "HelloService", serviceName = "HelloService")
public interface HelloService {

    @WebMethod
    String hello(String text);
}