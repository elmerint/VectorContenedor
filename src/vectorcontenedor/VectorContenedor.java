package vectorcontenedor;

import javax.swing.JOptionPane;

public class VectorContenedor {

    public static void main(String[] args) {
        boolean contenedores[];
        int indice, posicion, opciones;
        String salida;

        contenedores = new boolean[5];

        opciones = Integer.parseInt(JOptionPane.showInputDialog("Opciones:\n1.Ver contenedores\n2.Asignar contenedor\n3.Desasignar contenedor\nCualquier otro numero para salir"));
        while (opciones >= 1 && opciones <= 3) {
            if (opciones == 1) {
                salida = "Mostrando el estado de los contenedores:\n";
                for (indice = 0; indice < 5; indice += 1) {
                    if (!contenedores[indice]) {
                        salida += (indice + 1) + " Vacio\n";
                    } else {
                        salida += (indice + 1) + " Ocupado\n";
                    }
                }
                JOptionPane.showMessageDialog(null, salida);
            } else if (opciones == 2) {
                do {
                    posicion = Integer.parseInt(JOptionPane.showInputDialog("Que contenedor quiere (Entre 1 y 5)"));
                    if(posicion<1 || posicion >5){
                        JOptionPane.showMessageDialog(null, "El numero de contenedor no existe");
                    }
                } while (posicion<1 || posicion >5);
                
                if(contenedores[posicion-1]){
                    JOptionPane.showMessageDialog(null, "La posicion que ha ingresado ya esta asignada");
                }else{
                    contenedores[posicion-1] = true;
                    JOptionPane.showMessageDialog(null, "Se asigno el contenedor "+posicion+" fue asignado correctamente");
                }
            }else if(opciones ==3){
                 do {
                    posicion = Integer.parseInt(JOptionPane.showInputDialog("Que contenedor quiere desasignar (Entre 1 y 5)"));
                    if(posicion<1 || posicion >5){
                        JOptionPane.showMessageDialog(null, "El numero de contenedor no existe");
                    }
                } while (posicion<1 || posicion >5);
                
                if(!contenedores[posicion-1]){
                    JOptionPane.showMessageDialog(null, "La posicion que ha ingresado no esta asignada");
                }else{
                    contenedores[posicion-1] = false;
                    JOptionPane.showMessageDialog(null, "Se desasigno el contenedor "+posicion+" fue desasignado correctamente");
                }
            }

            opciones = Integer.parseInt(JOptionPane.showInputDialog("Opciones:\n1.Ver contenedores\n2.Asignar contenedor\n3.Desasignar contenedor\nCualquier otro numero para salir"));
        }

    }

}
