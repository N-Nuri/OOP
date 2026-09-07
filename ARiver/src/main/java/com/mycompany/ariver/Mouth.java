/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ariver;

/**
 *
 * @author Nuri
 */
public class Mouth extends ARiver {
    private ARiver stream;

    public Mouth(Location location, ARiver stream) {
        super(location);
        this.stream = stream;
    }
}
