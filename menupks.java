package oscurilandia;
import java.util.Scanner;
public class menupks {
	
	public static void main(String[] args) {
	
		
		
		
		
		
		
	
	Scanner leer = new Scanner(System.in);
	
	
	// **ASIGNACION DE VALORES**
	
	int cont=0;
	int cant=0;
	int i, j, x = 0, y = 0, a;
	String huevo="H";
	int puntos=225;
	int opcion = 0;
	
	String[][] A = new String[15][15];
		
	
	System.out.println("Bienvenidos al simulador del equipo de FirstLine");
	
	
	do {
	
		// **CREADOR DE ESPACIOS EN EL TABLERO**

	for (i=0; i<15; i++) {
		for (j=0; j<15; j++) {
			
			A[i][j]=" ";
			
		}
		}

	//MENU DEL SIMULADOR
	
	System.out.println("Bienvenidos al simulador del equipo de FirstLine");
	
	
	try {
 
	System.out.println("Elija una opcion:");
	System.out.println(" ");
	System.out.println("1- Iniciar la simulacion");
	System.out.println("2- Instrucciones");
	System.out.println("3- Salir del juego");
	System.out.println(" ");
	opcion = leer.nextInt();
		
	} catch (Exception e) {
	
	System.out.println("Ingrese solo numeros!!!");	
	System.out.println(" ");
	   leer.next();
	}
	
	
	switch (opcion) {
	
	case 1: 
	
	
	
	// **CREACION DEL TABLERO** 
	
	System.out.println("X | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |10 |11 |12 |13 |14");
	System.out.println("---------------------------------------------------------------");

	for (a=0; a<10; a++) {
		
		System.out.println(a +" | " +A[a][0]+" | " + A[a][1] + " | " + A[a][2]+ " | " +A[a][3]+ " | " +A[a][4]+ " | " +A[a][5]+ " | " +A[a][6]+ " | " +A[a][7]+ " | " +A[a][8]+ " | " +A[a][9]+ " | " +A[a][10]+ " | " +A[a][11]+ " | " +A[a][12]+ " | " +A[a][13]+ " | " +A[a][14]);
		System.out.println("---------------------------------------------------------------");
		}
	for (a=10; a<15; a++) {
		System.out.println(a +"| " +A[a][0]+" | " + A[a][1] + " | " + A[a][2]+ " | " +A[a][3]+ " | " +A[a][4]+ " | " +A[a][5]+ " | " +A[a][6]+ " | " +A[a][7]+ " | " +A[a][8]+ " | " +A[a][9]+ " | " +A[a][10]+ " | " +A[a][11]+ " | " +A[a][12]+ " | " +A[a][13]+ " | " +A[a][14]);
		System.out.println("---------------------------------------------------------------");
		
	}
	
	//**CREACION DE LOS CARROS EN EL TABLERO**
	
	//TRUPALLA

		
		
		
		do {
		
			int trupallax=(int)Math.floor(Math.random()*15);
		    int trupallay=(int)Math.floor(Math.random()*15);
		
		if (A[trupallax][trupallay]==" ") {    
		
			A[trupallax][trupallay]="T";
			cant=cant+1;
			
		} else {
			cant=cant+0;
		}
	
		}while (cant<10);
	
	cant=cant*0;
	
	
	
	//KROMI
	do {
		int kromix=(int)Math.floor(Math.random()*13);
		int kromiy=(int)Math.floor(Math.random()*15);
		
		
		if (A[kromix][kromiy]==" " && A[kromix+1][kromiy]==" " && A[kromix+2][kromiy]==" ") {
			
		
	A[kromix][kromiy]="K";
	A[kromix+1][kromiy]="K";
	A[kromix+2][kromiy]="K";
	cant=cant+1;
	
		} else {
			cant=cant+0;
		}
	
	} while (cant<3);
	
	cant=cant*0;
	
	
	
	
	//CAGUANO
	do {
		int caguanox=(int)Math.floor(Math.random()*15);
		int caguanoy=(int)Math.floor(Math.random()*14);
		
		
		
	if (A[caguanox][caguanoy]==" " && A[caguanox][caguanoy+1]== " ") {	
	A[caguanox][caguanoy]="C";
	A[caguanox][caguanoy+1]="C";	
	cant=cant+1;
	} else {
		cant=cant+0;
	}
	
	
	
	} while (cant<5);
	
	
	//**PEDIR EN CONSOLA LAS CORDENADAS DEL TIRO DE UN HUEVO**
cont=cont*0;
	do {	
	
		
		
	System.out.println("Introduzca una nueva cordenada{.");
	
	try {
	do {
	System.out.println("Casilla i");
	y = leer.nextInt();
	} while (y>14 || y<0);
	
	} catch(Exception f) {
		
		System.out.println("Introduzca solo numeros de 0 a 14");
		System.out.println(" ");
		leer.next();
		
	}
	
	try {
	do {
	System.out.println("Casilla j");
	x = leer.nextInt();
	} while (x>14 || x<0);
	} catch(Exception g) {
		System.out.println("Introduzca solo numeros (de 0 a 14");
	    System.out.println(" ");
	    leer.next();
	}

	//**CASO EN QUE EL HUEVO CAE EN UN CARRO**
	
	if (A[x][y] == "T" || A[x][y] == "K" || A[x][y] == "C") {
	A[x][y]= "D";	
	cont=cont+1;
	puntos=puntos-1;
	} else {
		
	A[x][y]=huevo;
	puntos=puntos-1;
	}
	
	
	
	
	
	
	//MOSTRAR NUEVAMENTE EL TABLERO ACTUALIZADO Y MOSTRANDO LOS CARROS QUE EXISTEN
	//SE MOSTRARA ADEMAS LA CASILLA EN QUE CAYO UN HUEVO O SI EL HUEVO DESTRUYO UN CARRO
	
	System.out.println("X | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |10 |11 |12 |13 |14");
	System.out.println("---------------------------------------------------------------");
	
	for (a=0; a<10; a++) {
		
		System.out.println(a +" | " +A[a][0]+" | " + A[a][1] + " | " + A[a][2]+ " | " +A[a][3]+ " | " +A[a][4]+ " | " +A[a][5]+ " | " +A[a][6]+ " | " +A[a][7]+ " | " +A[a][8]+ " | " +A[a][9]+ " | " +A[a][10]+ " | " +A[a][11]+ " | " +A[a][12]+ " | " +A[a][13]+ " | " +A[a][14]);
		System.out.println("---------------------------------------------------------------");
		}
	for (a=10; a<15; a++) {
		System.out.println(a +"| " +A[a][0]+" | " + A[a][1] + " | " + A[a][2]+ " | " +A[a][3]+ " | " +A[a][4]+ " | " +A[a][5]+ " | " +A[a][6]+ " | " +A[a][7]+ " | " +A[a][8]+ " | " +A[a][9]+ " | " +A[a][10]+ " | " +A[a][11]+ " | " +A[a][12]+ " | " +A[a][13]+ " | " +A[a][14]);
		System.out.println("---------------------------------------------------------------");
		
	}
	
	
	
	//EN CASO DE DESTRUIR TODOS LOS CARROS, SE FINALIZARA EL JUEGO
} while (cont<29);
	
	
	
	
	
	System.out.println("Has destruido a los pks");
	System.out.println("El puntaje obtenido es de: " +puntos);
	
	
	for (i=0; i<15; i++) {
		System.out.println(" ");
	}

	break;

	case 2: 
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("El objetivo de este simulador es aventar huevos a los carros presentados ");
		System.out.println("en el tablero. Se pedira ingresar las cordenadas en la que se dirigira el");
        System.out.println("huevo (Cordenadas de 0 a 14. Cuando se alcance un carro, su letra sera ");
	    System.out.println("marcado con una D. En caso de no alcanzarlo, se marcara con una H. ");
	    System.out.println("El juego finaliza cuando se alcancen todos los carros");
        System.out.println("-La cantidad de lanzamientos de huevos es ilimitado, pero por cada huevo que");	
	    System.out.println("se lance, se descontara un punto, asique has la menor cantidad de lanzamientos");
	    System.out.println("que puedas. Suerte!!!");
	    for (i=0; i<20; i++) {
	    	System.out.println(" ");
	    }
	
	break;
	
	
	
	
	}
	} while (opcion!=3);
	
	System.out.println("Gracias por probar nuestro simulador, vuelva pronto!");
	leer.close();
	}
}