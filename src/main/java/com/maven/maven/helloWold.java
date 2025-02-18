/************
 * @author: pcastesa
 * @date: 18/02/2025
 *****/


package com.maven.maven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWold {

    @GetMapping("/pepito")
    public String hola(){
        return "Hello World MAVEN";
    }
}
