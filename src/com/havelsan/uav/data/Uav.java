/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.havelsan.uav.data;

import java.time.LocalDateTime;

/**
 *
 * @author emre.koptaget
 */
public class Uav {

    public Uav() {
    }

   

    public Uav(Integer id, String uavCode, String geoPosition, float uavSpeed, String uavTotalFlightTime, LocalDateTime uavFlightStartTime, float uavBatteryPerctange) {
        this.id = id;
        this.uavCode = uavCode;
        this.geoPosition = geoPosition;
        this.uavSpeed = uavSpeed;
        this.uavTotalFlightTime = uavTotalFlightTime;
        this.uavFlightStartTime = uavFlightStartTime;
        this.uavBatteryPerctange = uavBatteryPerctange;
    }
    
    private Integer id;
    private String uavCode;
    private String geoPosition;
    private float uavSpeed;
    private String uavTotalFlightTime;
    private LocalDateTime uavFlightStartTime;
    private float uavBatteryPerctange;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUavCode() {
        return uavCode;
    }

    public void setUavCode(String uavCode) {
        this.uavCode = uavCode;
    }

    public String getGeoPosition() {
        return geoPosition;
    }

    public void setGeoPosition(String geoPosition) {
        this.geoPosition = geoPosition;
    }

    public float getUavSpeed() {
        return uavSpeed;
    }

    public void setUavSpeed(float uavSpeed) {
        this.uavSpeed = uavSpeed;
    }

    

    public LocalDateTime getUavFlightStartTime() {
        return uavFlightStartTime;
    }

    public void setUavFlightStartTime(LocalDateTime uavFlightStartTime) {
        this.uavFlightStartTime = uavFlightStartTime;
    }

    public float getUavBatteryPerctange() {
        return uavBatteryPerctange;
    }

    public void setUavBatteryPerctange(float uavBatteryPerctange) {
        this.uavBatteryPerctange = uavBatteryPerctange;
    }
     public String getUavTotalFlightTime() {
        return uavTotalFlightTime;
    }

    public void setUavTotalFlightTime(String uavTotalFlightTime) {
        this.uavTotalFlightTime = uavTotalFlightTime;
    }
   
    
    
}
