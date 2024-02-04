/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statelessftocclient;

import java.util.Scanner;
import javax.ejb.EJB;
import mybeans.FtoCBeanRemote;

/**
 *
 * @author Admin
 */
public class Main {

    @EJB
    private static FtoCBeanRemote ftoCBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter degree in Fahrenheit: ");
        double input = sc.nextDouble();
        System.out.println(input + " Fahrenheit = " + ftoCBean.ftoc(input) + " Celsius");
    }
    
}
