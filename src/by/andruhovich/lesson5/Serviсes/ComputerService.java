package by.andruhovich.lesson5.Serviсes;

import by.andruhovich.lesson5.Entity.Computer;
import by.andruhovich.lesson5.Entity.HDD;
import by.andruhovich.lesson5.Entity.Processor;
import by.andruhovich.lesson5.Entity.RAM;


public class ComputerService {

    public static Computer initialization(){
        Computer computer = new Computer();
        computer.setProcessor(new Processor());
        computer.getProcessor().setQuantityCores(2);
        computer.getProcessor().setClockRate(2.0);
        computer.getProcessor().setVolumeCache(2);
        computer.setHdd(new HDD());
        computer.getHdd().setType("hdd");
        computer.getHdd().setVolume(2.0);
        computer.setRam(new RAM());
        computer.getRam().setMemoryType("DDR3");
        computer.getRam().setVolumeMemory(4);
        computer.setResource(100);
        return computer;
    }

    public static Computer turnOn(Computer computer) {
        if (computer.isItWork()) {
            computer.setResource(computer.getResource() - 1);
            if (computer.getResource() < 0) {
                System.out.println("computer hana pincet");
                computer.setIsItWork(false);
            }
            return computer;
        } else {
            System.out.println("");
            return null;
        }
    }

    public static void writeDiscription(Computer computer){
        String discription = computer.toString();
        System.out.print(discription);
    }

}
