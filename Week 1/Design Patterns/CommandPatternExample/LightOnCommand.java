/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPatternExample;
public class LightOnCommand implements Command{
    Light l;
    
    LightOnCommand(Light l){
        this.l=l;
    }
    public void execute(){
        l.turnOn();
    }
}