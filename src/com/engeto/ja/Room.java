package com.engeto.ja;

public class Room {/*Hosty vždy ubytováváme na pokojích (room).
Pokoj je identifikován svým číslem.
O každém pokoji chceme evidovat:
-kolik lůžek tam je (neřeš přistýlky apod.),
-zda má pokoj balkón a
-zda má výhled na moře a
-jaká je cena pokoje za jednu noc (předpokládej, že je cena pevně daná)*/
    private int roomNo;
    private int bedcount;
    private boolean hasBalcony;
    private boolean hasSeaview;
    private double pricePerNight;

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getBedcount() {
        return bedcount;
    }

    public void setBedcount(int bedcount) {
        this.bedcount = bedcount;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasSeaview() {
        return hasSeaview;
    }

    public void setHasSeaview(boolean hasSeaview) {
        this.hasSeaview = hasSeaview;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public Room(int roomNo, int bedcount, boolean hasBalcony, boolean hasSeaview, double pricePerNight) {
        this.roomNo = roomNo;
        this.bedcount = bedcount;
        this.hasBalcony = hasBalcony;
        this.hasSeaview = hasSeaview;
        this.pricePerNight = pricePerNight;
    }
}
