/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.util.UUID;

/**
 *
 * @author FZVercetti
 */
public class RANDOM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // UUID (Unique Universal Identifier)
        
        System.out.println(UUID.randomUUID().toString().toUpperCase().substring(0,5));
    }
    
}
