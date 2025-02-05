package com.example.vk9.services;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class MathService {
    @Getter
    private static int filteredCount;

    public static double calculateLogSeries(double x, int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum -= Math.pow(x, i) / i;
        }
        return sum;
    }

    public static double calculateFilteredLogSeries(double x, int n, double e) {
        filteredCount = 0;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double term = -Math.pow(x, i) / i;
            if (Math.abs(term) > e) {
                sum += term;
                filteredCount++;
            }
        }
        return sum;
    }

    public static List<Double> tabulateFunction(double a, double b, double h) {
        List<Double> values = new ArrayList<>();
        for (double x = a; x <= b; x += h) {
            if (Math.abs(x) < 1) {
                values.add(Math.exp(2) / Math.sqrt(1 - x * x));
            } else {
                values.add(Double.NaN);
            }
        }
        return values;
    }
}
