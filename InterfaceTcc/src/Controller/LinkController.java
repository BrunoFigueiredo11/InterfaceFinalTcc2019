/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author bruno
 */
public class LinkController {
    public static void main(){
        try {
            URI link = new URI("http://localhost/rodrigo/");
            Desktop.getDesktop().browse(link);
        } catch (Exception Error) {
            System.out.println(Error);
        }
    }
}
