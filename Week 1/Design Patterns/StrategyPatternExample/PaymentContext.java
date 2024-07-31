/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPatternExample;
public class PaymentContext {
    PaymentStrategy p;
    public PaymentContext(PaymentStrategy p) {
        this.p = p;
    }
    public void execute(int amount) {
        p.pay(amount);
    }
}
