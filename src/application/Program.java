package application;

import entities.*;
import entities.enums.Ordem;
import entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Ordem order = new Ordem(1080,new Date(), OrderStatus.PENDYNG_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
