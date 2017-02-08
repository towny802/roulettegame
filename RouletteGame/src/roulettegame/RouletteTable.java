/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roulettegame;

/**
 *
 * @author zacharybechhoefer
 */

public class RouletteTable {
    private int pos_count;
    private int pos;
    
    public int getPos(){
        return this.pos;
    }
    
    RouletteTable(int pos_count){
        this.pos_count = pos_count;
        this.pos = (int) Math.floor(Math.random()*(pos_count)) + 1;
    }
    
    public void RouletteSpin(){
        this.pos = (((this.pos) + (int) Math.floor(Math.random()*100)) % pos_count)+1;
    }
    
    public void TestRun(){
        for(int i = 1; i<=this.pos_count; i++){
            this.pos = ((this.pos) % pos_count)+1;
            System.out.println(getPos());
        }
    }
}
