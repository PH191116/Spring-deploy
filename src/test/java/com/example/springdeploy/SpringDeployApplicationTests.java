package com.example.springdeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class SpringDeployApplicationTests {

    @Test
    void contextLoads() {
        //imprimiendo variables de entorno del archivo properties del perfil activo
        System.getenv().forEach(
                (key, value)-> System.out.println(key+" "+value)
        );
    }

}
