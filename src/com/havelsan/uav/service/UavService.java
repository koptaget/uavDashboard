/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.havelsan.uav.service;

import com.havelsan.uav.data.Uav;
import com.havelsan.uav.util.UavUtil;
import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emre.koptaget
 */
public class UavService {

    private List<Uav> uavList = new ArrayList<>();
    final UavUtil uavUtil = new UavUtil();

    public List<Uav> getUavList() {

        return uavList;
    }

    public List<Uav> createUavForInit() {

        Integer i;
        for (i = 1; i <= 25; i++) {
            LocalDateTime now = LocalDateTime.now();
            Uav uav = new Uav(i, "TC00" + i, "12/13/00" + i, uavUtil.createRondomValue(0, 5), uavUtil.calculateTotalFlightTime(now), now, uavUtil.createRondomValue(20, 100));
            uavList.add(uav);
        }
        return uavList;
    }

    public Uav addUavToList(String uavCode, String geoPosition, float uavSpeed, float uavBatteryPercantage) {
        LocalDateTime now = LocalDateTime.now();
        Uav uav = new Uav(uavUtil.createRandomIntegerValue(), uavCode, geoPosition, uavSpeed, "00:00:00", now, uavUtil.createRondomValue(20, 100));
        uavList.add(uav);
        return uav;
    }

}
