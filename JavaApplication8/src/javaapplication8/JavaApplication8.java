/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.*;
/**
 *
 * @author Will Shackleford<wshackle@gmail.com>
 */
public class JavaApplication8 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dasin[] = new double[200];
        for (int i = 0; i < dasin.length; i++) {
            dasin[i] = sin((2 * PI * i) / dasin.length);
        }
        
        System.out.println("BreakPoint 0");
        
        List<Double> lsin = new ArrayList<>();
        for (double d : dasin) {
            lsin.add(d);
        }
        System.out.println("BreakPoint 1");
        
        double dacos[] = new double[200];
        for (int i = 0; i < dacos.length; i++) {
            dacos[i] = cos((2 * PI * i) / dacos.length);
            if(i == 50) {
                dacos[i] += 0.3;
                System.out.println("BreakPoint 2");
            }
        }
        List<Double> lcos = new ArrayList<Double>();
        for (double d : dacos) {
            lcos.add(d);
        }
        System.out.println("BreakPoint 3");
        
        List<ABCDEF> abdefl = new LinkedList<>();
        for (int i = 0; i < 200; i++) {
            abdefl.add( new ABCDEF());
        }
        System.out.println("BreakPoint 4");
    }

}
