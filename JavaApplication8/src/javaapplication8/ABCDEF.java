/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Random;

/**
 *
 * @author Will Shackleford<wshackle@gmail.com>
 */
public class ABCDEF {
    public float a,b,c,d,e,f;
    
    private static Random randi = new Random();
    
    ABCDEF() {
        a = randi.nextFloat();
        b = randi.nextFloat();
        c = randi.nextFloat();
        d = randi.nextFloat();
        e = randi.nextFloat();
        f = randi.nextFloat();
    }
}
