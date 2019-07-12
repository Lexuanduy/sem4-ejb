/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

/**
 *
 * @author LG
 */
@Stateless
public class AsyncMethods {
    @Asynchronous
    public Future<String> sayHello(String name){
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AsyncResult<String>("Hello " + name);
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public static void Main(String args[]) throws InterruptedException, ExecutionException {
        AsyncMethods AS = new AsyncMethods();
        Future<String> S = AS.sayHello("Duyle");
        System.out.println("In main method: " + S.get());
    }
}
