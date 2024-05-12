package com.devsupeior.desafio.injecao.dependencias.desafio.injecao;

import com.devsupeior.desafio.injecao.dependencias.desafio.injecao.entities.Order;
import com.devsupeior.desafio.injecao.dependencias.desafio.injecao.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import java.util.Locale;

public class Desafio01Application {

    //Injecao de dependencia
    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(Desafio01Application.class, args);
    }




    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);

        Order order =  new Order(1034,150.00,20.0);
        System.out.println("Order code : " + order.getCode());
        System.out.printf("Total value: %.2f%n ", orderService.total(order) );
    }
}
