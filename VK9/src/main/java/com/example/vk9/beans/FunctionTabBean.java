package com.example.vk9.beans;

import com.example.vk9.services.MathService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Named
@RequestScoped
public class FunctionTabBean {
    @Setter
    private double a;
    @Setter
    private double b;
    @Setter
    private double h;
    private List<Double> results;

    public void tabulateFunction() {
        results = MathService.tabulateFunction(a, b, h);
    }

}
