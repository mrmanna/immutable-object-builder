package org.example;

public class App {
    public static void main(String[] args) {
        House house = new House.Builder()
                .mainDoor(md -> md.doorType("Wooden Door"))
                .terrace(t -> t.view("Garden View").size(300).hasGarden(true))
                .lobby(l -> l.style("Modern").area(500).hasFurniture(true))
                .mainBedroom(mb -> mb.wallColor("White").bedType("King Size").hasAirConditioner(true))
                .guestRoom(gr -> gr.wallColor("Cream").bedType("Queen Size").hasAirConditioner(false))
                .build();
        System.out.println(house.toString());
        // You can print the attributes of the house here.
    }
}

