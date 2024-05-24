/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.havelsan.uav.util;

import com.havelsan.uav.data.Uav;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 *
 * @author emre.koptaget
 */
public class UavUtil {

    public String actualTimeFormatted() {

        LocalDateTime actualTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        return actualTime.format(format);

    }

    public String calculateTotalFlightTime(LocalDateTime flightStartTime) {

        LocalDateTime actualTime = LocalDateTime.now();
        Duration diff = Duration.between(flightStartTime, actualTime);
        String totalFlightTime = String.format("%d:%02d:%02d",
                diff.toHours(),
                diff.toMinutesPart(),
                diff.toSecondsPart());

        return totalFlightTime;
    }

    public Float calculateRemainBatteryPercantage(Uav uav) {
        Float batteryPercantage = 0.0F;

        LocalDateTime actualTime = LocalDateTime.now();
        Duration diff = Duration.between(uav.getUavFlightStartTime(), actualTime);

        if (diff.toSeconds() % 60 == 0 && diff.toSeconds() > 0) {
            uav.setUavBatteryPerctange(uav.getUavBatteryPerctange() - uav.getUavBatteryPerctange() * 0.2F);
            batteryPercantage = uav.getUavBatteryPerctange() - uav.getUavBatteryPerctange() * 0.2F;
        } else {
            batteryPercantage = uav.getUavBatteryPerctange();
        }
        return batteryPercantage;
    }

    public float createRondomValue(Integer min, Integer max) {
        Random r = new Random();
        float random = min + r.nextFloat() * (max - min);
        return random;
    }

    public Integer createRandomIntegerValue() {
        Random r = new Random();
        int random_integer = r.nextInt(2000);
        return random_integer;
    }

}
