/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.appgitprimera;

/**
 * Funcion
 * @author acer
 * @version 
 * @see 
 */
public class Panel {
    /**
     * Variable que
     */
    private int x;
    
    private int y;
    
    private int z;
    
    private int calcular;
    
    private int calcular2;
    
    /**
     * 
     */
    public Panel(int calcular) {
        this.calcular = calcular;
    }  

    /**
     * @return the x
     */
    public int getX() {
        int x = 5;
        int z = 21; //En local
        float calculo = 3.3f;
        double resultado = 3.0;
        int i = 8;
        System.out.println("");
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the z
     */
    public int getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(int z) {
        this.z = z;
    }
    
    public void calcular(){
    }
}
