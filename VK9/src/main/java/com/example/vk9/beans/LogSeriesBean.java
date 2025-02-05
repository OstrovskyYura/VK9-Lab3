package com.example.vk9.beans;

import com.example.vk9.services.MathService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Getter
@Named
@RequestScoped
public class LogSeriesBean {
    // Гетери та сетери
    @Setter
    private double x;
    @Setter
    private int n;
    @Setter
    private double e;
    @Setter
    private double e2;
    private double sumN;
    private double sumFilteredE;
    private double sumFilteredE2;
    private double exactValue;
    private int countE;
    private int countE2;

    public void calculateSeries() {
        sumN = MathService.calculateLogSeries(x, n);
        sumFilteredE = MathService.calculateFilteredLogSeries(x, n, e);
        countE = MathService.getFilteredCount();
        sumFilteredE2 = MathService.calculateFilteredLogSeries(x, n, e2);
        countE2 = MathService.getFilteredCount();
        exactValue = Math.log(1 - x);
    }

}
