package com.schedul.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.ZoneId;

/*
 - fixedRate: Ejecuta a intervalos fijos desde el inicio de cada ejecución.
 - fixedDelay: Ejecuta a intervalos fijos desde el final de cada ejecución.
 - initialDelay: Retrasa la primera ejecución.
 - cron: Ejecuta según una expresión CRON.
 - zone: Especifica la zona horaria para una expresión CRON.
 */

@Component
public class ScheduleTask {

//    @Scheduled(fixedRate = 10000, initialDelay = 5000, zone = "America/Bogota")
//    public void scheduleMessage() {
//        System.out.println("Hola Mundo!!");
//    }

//    @Scheduled(cron = "*/10 * * * * *", zone = "America/Bogota")
//    public void scheduleMessage() {
//        System.out.println("Hola Mundo!!");
//    }

    @Scheduled(cron = "0 0 7 ? * MON,WED,FRI", zone = "America/Bogota")
    public void scheduleMessage() {
        System.out.println("Hola Mundo!!");
    }


/*     public static void main(String[] args) {
          ZoneId.getAvailableZoneIds().forEach(System.out::println);
     }
*/
}
