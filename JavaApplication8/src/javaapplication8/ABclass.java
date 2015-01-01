/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Will Shackleford<wshackle@gmail.com>
 */
public class ABclass extends ABParentClass {
        
        public double input;
        public ABclass(double _input) {
            this.input = _input;
        }
        
        public double getA() {
            return Math.sin(input);
        }
        
        public double getB() {
            return Math.cos(input);
        }
    }
