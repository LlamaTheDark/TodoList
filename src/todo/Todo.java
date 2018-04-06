/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

//import java.util.Date;

public class Todo {

    public static void main(String[] args) {
        Model model = new Model();
        ViewController viewController = new ViewController(model);
        viewController.setVisible(true);
    }
}
