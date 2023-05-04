import javax.swing.JOptionPane;

public class Proceds {
	String nombres[];
	int edades[];
	public void procedimiento() {
		String menu = "Estas son las diferentes opciones que tiene \n";
		menu+="1. Llenar estudiantes \n";
		menu+="2. ver promedio de edades \n";
		menu+="3. ver estudiantes con mayor y menor edad \n";
		menu+="4. ver estudiantes mayores de edad y menores de edad \n";
		menu+="5. Mostrar estudiantes \n";
		menu+="6. Buscar Estudiante\n";
		menu+="7. Salir \n";
		menu+="seleccione alguna opcion";
		int select;
		String nombreOEdad;
		do {
			select = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (select) {
			case 1:
				Llenar();
				break;
			case 2:
				if (verificar(nombres))
					promedioEdades();
				break;
			case 3:
				if (verificar(nombres))
					mayorYMenor(edades);
				break;
			case 4:
				if (verificar(nombres))
				mayorDeEdad(nombres);
				break;
			case 5:
				if (verificar(nombres))
				Mostrar(nombres);
				break;
			
			case 6:
				if (verificar(nombres)) {
					nombreOEdad = JOptionPane.showInputDialog("Â¿desea buscar por nombre o por edad?");
							if (nombreOEdad.equalsIgnoreCase("edad")) 
								BuscarEdad(nombres);
							else if (nombreOEdad.equalsIgnoreCase("nombre"))						
								BuscarNombre(nombres);
							else 
								System.out.println("ingrese algo valido");
					}
				break;
			case 7: 
				System.out.println("Gracias por usarme");
				break;
			default:
				System.out.println("ingrese una opcion de menu valida");
				break;
			}
		} while (select!=7);
		
	}
	
	
	
/*------------------------------------------------------------LLENAR DATOS------------------------------------------------------------------*/
	public void Llenar () {
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
/*-----------------------------------------------------------------------------------------------------------------------------------------*/	
	
	
/*--------------------------------------------------------------VERIFICAR DATOS------------------------------------------------------------*/
	public boolean verificar (String[] a) {
		
		if (a==null) {
			System.out.println("debe ingresar primero los estudiantes");
			return false;
		} else {
			return true;
		}
	}
/*-----------------------------------------------------------------------------------------------------------------------------------------*/