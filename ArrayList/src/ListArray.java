import javax.swing.JOptionPane;
public class ListArray {

	String nombres[];
	int edades[];
	public void LlenarDatos () {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(
                "ingresa la cantidad de estudiantes"
                ));
        nombres = new String[cantidad];
        edades = new int[cantidad];
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = JOptionPane.showInputDialog(
                    "ingrese el nombre del estudiante numero "+(i+1)
                    );
            edades[i] = Integer.parseInt(JOptionPane.showInputDialog(
                    "ingrese la edad de " + nombres[i])
                    );
        }
    }

    public boolean verificar (String[] a) {

        if (a==null) {
            System.out.println("debe ingresar primero los estudiantes");
            return false;
        } else {
            return true;
        }
}


    public void mayorDeEdad (String[] a) {
        for(int i = 0; i<edades.length; i++) {
            if(edades[i] >= 18)
            System.out.print(a[i] + " - ");
        }
        System.out.println("son los estudiantes mayores de edad");
        for(int i = 0; i<edades.length; i++) {
            if(edades[i] < 18)
            System.out.print(a[i] + " - ");
        }
        System.out.println("son los estudiantes menores de edad");
    }

public void promedioEdades () {
        int suma = 0;
        for(int obj: edades) {
            suma+=obj;
        }
        System.out.println("el promedio de edades es de " + suma/edades.length);
    }

    public void Mostrar (String[] a) {
    
        for (int i = 0; i < a.length; i++) {
            System.out.print('('+a[i] + " | y su edad es " +edades[i] + ") --- ");
         
        }
        System.out.println();
    }

    public void BuscarEdad (String[] a) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad por la cual desea buscar los estudiantes"));
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if(edades[i] == edad) {
                System.out.println("encontre un estudiante con la edad de " + edad + " llamado " + a[i] + " en la posicion " + i);
                counter++;
            }
        }
            if (counter == 0)
                System.out.println("no habia nadie con " + edad + " años");
            else {
                System.out.println("en total habian " + counter + " estudiantes con la edad de " + edad);
            }
    }

public void Buscar(String[] a) {
        String buscar = JOptionPane.showInputDialog("ingrese el nombre a buscar");
        int counter = -1;
        int timesCounter = 0;
        for (String string : a) {
            counter++;
            if (string.equalsIgnoreCase(buscar)) {
                timesCounter++;
                System.out.print("encontre un " + buscar + " en la posicion " + counter + 
                        " - edad: " + edades[counter]);
                System.out.println();
            }
        }
        if (timesCounter == 0)
        System.out.println("no habia nadie llamado " + buscar);
        else {
            System.out.println("en total habian " + timesCounter + " estudiantes llamados " + buscar);
        }
    }

    public void mayorYMenor(int[] a) {
        int menor = a[0];
        int mayor = a[0];
        String menorNames = "";
        String mayorNames = "";
        for(int el: a) {
            if(el>mayor) {
                mayor=el;
            }
            if (el<menor) {
                menor=el;
            }
        }
        for(int el = 0; el<a.length; el++) {
            if (a[el] == menor) {
                menorNames += nombres[el] + " ";
            } else if (a[el] == mayor) {
                mayorNames += nombres[el] + " ";
            }
        }
    System.out.println("los estudiantes mayores son " + mayorNames + " y los menores son " + menorNames);
    }


}
