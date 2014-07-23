package web;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

    

    //constructor

    public VentanaPrincipal(){

           this.setLayout(null);                    //disposicion interna: sin layout

           this.setTitle("Título de la ventana");   //titulo

           this.setResizable(false);                //el usuario no le puede cambiar el tamaño

           this.setBounds(50, 50, 300, 400);        //definimos x, y, ancho y alto de la ventana

    }



    public static void main(String[] args){

   

           VentanaPrincipal ventana = new VentanaPrincipal();     //instanciamos

           ventana.setVisible(true);                //la hacemos visible

    }



}