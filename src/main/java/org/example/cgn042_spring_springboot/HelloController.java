package org.example.cgn042_spring_springboot;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    // path variable
    // http://localhost:8080/api/hello

    @GetMapping("/hello")
    public String sayHello(){
      return "Hello, World!";
    }

    // path variable
    // http://localhost:8080/api/hello/john

    @GetMapping("/hello/{name}")
    public String sayHelloJohn(@PathVariable String name){
       return "Hello" + name;
   }


   //request param
   // http://localhost:8080/api/greet?name=peter
   @PostMapping("/greet")
    public String greet(@RequestParam String name){
        return "Hello " + name;
    }
}
