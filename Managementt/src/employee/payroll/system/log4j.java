/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll.system;

import java.util.logging.Logger;

/**
 *
 * @author Bogdan
 */
public class log4j {
     static Logger log = Logger.getLogger(log4j.class.getName());
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         log.info("This is an Info");
 log.warning("This is a Warn");

    }
    
}
