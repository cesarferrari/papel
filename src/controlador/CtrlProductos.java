/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.ConsultasSQL;
import modelo.Productos;
import modelo.Modelo;
import vista.FrmProducto;


public class CtrlProductos implements ActionListener{
    private Productos pr;
    private FrmProducto fPr;
    private Modelo mod;
    ConsultasSQL sql;
public CtrlProductos(Productos pro,FrmProducto fPr,Modelo mod,ConsultasSQL sql){
    this.pr=pr;
    this.fPr=fPr;
    this.mod=mod;
    this.sql=sql;
   fPr.btn_insertar.addActionListener(this);
   fPr.btn_actualizar.addActionListener(this);
   fPr.btn_mostrar.addActionListener(this);
  
}
 public void iniciar(){
        fPr.setVisible(true);
        fPr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 public static void pruebamela(){
     
 }
public void enviaDatos(){
        
            
          
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==fPr.btn_insertar) {
            JOptionPane.showMessageDialog(null, "boton isertar");
            pr.setId(Integer.parseInt(fPr.txt_id.getText()));
            pr.setCodigo(fPr.txt_codigo.getText());
            pr.setNombre(fPr.txt_nombre.getText());
            pr.setDescripcion(fPr.txt_descripcion.getText());
            pr.setProveedor(fPr.txt_proveedor.getText());
            pr.setStock(Integer.parseInt(fPr.txt_stock.getText()));
            pr.setPrecio(Double.parseDouble(fPr.txt_precio.getText()));
            pr.setPrecioVenta(Double.parseDouble(fPr.txt_precioVenta.getText()));
            
            
            
            
            mod.insertar(pr);
        }else if (e.getSource()==fPr.btn_actualizar) {
            
        }else if (e.getSource()==fPr.btn_mostrar) {
            
        }
    
       
    }
    
    
}
