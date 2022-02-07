package com.oracle.java8;

/**
 * @Author Sathiyaraj created on 07-02-2022
 * <p>
 * TODO
 */


public interface Vehicle {
    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
}
