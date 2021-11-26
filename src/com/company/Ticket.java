package com.company;

public class Ticket {
    //  info about ticket
    private int numOfSit;
    private int numOfCarriage;
    private int numOfTrain;

    public Ticket (int x, int y, int z) { // constructor
        setNumOfSit(x);
        setNumOfCarriage(y);
        setNumOfTrain(z);
    }

    //setter of info
    public void setTicket(int numOfSit, int numOfCarriage, int numOfTrain) {
        setNumOfSit(numOfSit);
        setNumOfCarriage(numOfCarriage);
        setNumOfTrain(numOfTrain);
    }

    public void setNumOfSit(int numOfSit) {
        this.numOfSit = numOfSit;
    }

    public void setNumOfCarriage(int numOfCarriage) {
        this.numOfCarriage = numOfCarriage;
    }

    public void setNumOfTrain(int numOfTrain) {
        this.numOfTrain = numOfTrain;
    }

    //printer for info
    public void printTicket() {
        System.out.println("~~~~~");
        System.out.println("Number Of Your Sit: " + numOfSit + ". ");
        System.out.println("Number Of Your Carriage: " + numOfCarriage + ". ");
        System.out.println("Number Of Your Train: " + numOfTrain + ". ");
        System.out.println("~~~~~");
    }

    @Override //annotation
   public String toString() {
        return "Ticket{" +
                "numOfSit=" + numOfSit +
                ", numOfCarriage=" + numOfCarriage +
                ", numOfTrain=" + numOfTrain +
                '}';
    }
}
