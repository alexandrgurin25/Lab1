package ru.mirea.taskList1.Library.task2;

public class Stock {

    private String name;

    private int numRoom;
    private int numRack;
    private int numBox;

    public Stock(String name, int numRoom, int numRack, int numBox) {
        this.name = name;
        this.numRoom = numRoom;
        this.numRack = numRack;
        this.numBox = numBox;
    }

    public int getNumRoom() {
        return numRoom;
    }

    public int getNumRack() {
        return numRack;
    }

    public int getNumBox() {
        return numBox;
    }

    public void setNumRoom(int numRoom) {
        this.numRoom = numRoom;
    }

    public void setNumRack(int numRack) {
        this.numRack = numRack;
    }

    public void setNumBox(int numBox) {
        this.numBox = numBox;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", numRoom=" + numRoom +
                ", numRack=" + numRack +
                ", numBox=" + numBox +
                '}';
    }
}
