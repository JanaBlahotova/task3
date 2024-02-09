package com.engeto.ja;

import java.math.BigDecimal;

public class Room {
    private int roomNo;
    private int bedcount;
    private boolean hasBalcony;
    private boolean hasSeaview;
    private BigDecimal pricePerNight;

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

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public Room(int roomNo, int bedcount, boolean hasBalcony, boolean hasSeaview, BigDecimal pricePerNight) {
        this.roomNo = roomNo;
        this.bedcount = bedcount;
        this.hasBalcony = hasBalcony;
        this.hasSeaview = hasSeaview;
        this.pricePerNight = pricePerNight;
    }
}
