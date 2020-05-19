/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Tuan Pc
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ShapeFactory factory= ShapeFactory.createInstance();
        
        Shape rectangle= factory.createShape(ShapeType.rectangle);
        rectangle.setBrush("Tủ lạnh Sony SV");
        rectangle.setFrame("40cm chiều dài");
        rectangle.setPaper("123×90cm cao & rộng");
        
        Shape triangle= factory.createShape(ShapeType.triangle);
        triangle.setBrush("Tủ lạnh Bingoe DS");
        triangle.setFrame("130cm chiều dài");
        triangle.setPaper("134×85cm cao & rộng");
        
        Shape circle= factory.createShape(ShapeType.circle);
        circle.setBrush("Tủ lạnh Saba FG");
        circle.setFrame("125cm chiều dài");
        circle.setPaper("168×70cm cao & rộng");
        
        System.out.println("Loại tủ 1:\n"+rectangle.draw()+"\n");
        System.out.println("Loại tủ 2:\n"+triangle.draw()+"\n");
        System.out.println("Loại tủ 3:\n"+circle.draw()+"\n");
    
    }
    
}
