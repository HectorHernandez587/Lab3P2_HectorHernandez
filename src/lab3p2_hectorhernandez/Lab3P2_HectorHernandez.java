package lab3p2_hectorhernandez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3P2_HectorHernandez {

    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {

        ArrayList<Personaje> personajes = new ArrayList();
        //Personajes Predeterminados
        personajes.add(new Clerigo("Odin", "Directa", "Superman", "Humano", "Gran rey de Asgard ", "Norfair", "Lead", 1.79, 1.42, 18, 50, 97, 40));
        personajes.add(new Barbaro("Pesada", 500, "Kratos", "Elfo", "Solitario", "Crateria", "Offensive", 1.89, 1.90, 30, 65, 93, 65));
        personajes.add(new Mago("Mago Blanco", "Link", "Enano", "Espadachin", "Zebes", "Tank", 1.99, 1.72, 34, 90, 0, 20));
        personajes.add(new Picaro("Amuleto", 7, "Mario", "Mediano", "Ladron", "Brinstar", "Spammer", 1.75, 1.90, 25, 50, 80, 50));

        boolean bandera = true;
        while (bandera == true) {
            System.out.println("-----Menu-----");
            System.out.println("1) Creacion de personajes");
            System.out.println("2) Modificar personajes");
            System.out.println("3) Ver atributos de un personaje");
            System.out.println("4) Eliminar personajes");
            System.out.println("5) Combate");
            System.out.println("6) Salir");
            System.out.print("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Que clase desea usar? ");
                    System.out.println("1) Clerigo");
                    System.out.println("2) Barbaro");
                    System.out.println("3) Mago");
                    System.out.println("4) Picaro");
                    System.out.print("Ingresa el numero que deseas: ");
                    int clase = lea.nextInt();

                    System.out.println("Ingrese el nombre: ");
                    String nombre = lea.nextLine();

                    System.out.println("Ingrese la Raza: ");
                    System.out.println("1) Mediano");
                    System.out.println("2) Enano");
                    System.out.println("3) Elfo");
                    System.out.println("4) Humano");
                    System.out.print("Ingresa el numero que deseas: ");
                    int iraza = lea.nextInt();

                    String raza = "";
                    int HP = 0;

                    switch (iraza) {
                        case 1: {
                            //Mediano
                            raza = "Mediano";
                            HP = 50 + r.nextInt(10);
                        }
                        break;
                        case 2: {
                            //Enano
                            raza = "Enano";
                            HP = 80 + r.nextInt(20);
                        }
                        break;
                        case 3: {
                            //Elfo
                            raza = "Elfo";
                            HP = 50 + r.nextInt(20);

                        }
                        break;
                        case 4: {
                            //Humano
                            raza = "Humano";
                            HP = 40 + r.nextInt(35);
                        }
                        break;
                        default: {
                            System.out.println("Esa raza no existe man");
                        }
                    }//Fin Switch Raza

                    System.out.println("Ingrese la estatura en cm: ");
                    double estatura = lea.nextDouble();

                    System.out.println("Ingrese el peso: ");
                    double peso = lea.nextDouble();

                    System.out.println("Ingrese la edad: ");
                    int edad = lea.nextInt();

                    System.out.println("Ingrese la descripcion: ");
                    String descripcion = lea.nextLine();

                    System.out.println("Ingrese la nacionalidad: ");
                    System.out.println("1) Norfair");
                    System.out.println("2) Brinstar");
                    System.out.println("3) Maridia");
                    System.out.println("4) Zebes ");
                    System.out.println("5) Crateria");
                    System.out.println("Ingresa el numero que deseas");
                    int inacionalidad = lea.nextInt();
                    String nacionalidad = "";
                    switch (inacionalidad) {
                        case 1: {
                            //Norfair
                            nacionalidad = "Norfair";
                        }
                        break;
                        case 2: {
                            //Brinstar
                            nacionalidad = "Brinstar";
                        }
                        break;
                        case 3: {
                            //Maridia
                            nacionalidad = "Maridia";
                        }
                        break;
                        case 4: {
                            //Zebes
                            nacionalidad = "Zebes";
                        }
                        break;
                        case 5: {
                            //Crateria
                            nacionalidad = "Crateria";
                        }
                        break;
                        default: {
                            System.out.println("Esa nacionalidad no existe man");
                        }
                    }

                    switch (clase) {
                        case 1: {
                            //Clerigo
                            int CS = 97;
                            int AC = 40;
                            System.out.println("Ingrese el tipo de jugador: ");
                            System.out.println("1) Lead");
                            System.out.println("Ingresa el numero: ");
                            int itipo = lea.nextInt();
                            String tipo = "";
                            switch (itipo) {
                                case 1: {
                                    tipo = "Lead";
                                }
                                default: {
                                    System.out.println("Ese tipo no esta disponible para Clerigo");
                                }
                            }

                            System.out.println("Ingrese el Dios / Demonio del que es creyente: ");
                            String dios_demonio = lea.nextLine();

                            System.out.println("Ingrese el tipo de invocacion: ");
                            String tipo_invocacion = lea.nextLine();

                            Clerigo c = new Clerigo(dios_demonio, tipo_invocacion, nombre, raza, descripcion, nacionalidad, tipo, estatura, peso, edad, HP, CS, AC);

                            personajes.add(new Clerigo());
                            ((Personaje) c).toString();

                        }
                        break;
                        case 2: {
                            //Barbaro
                            int CS = 93;
                            int AC = 65;
                            System.out.println("Ingrese el tipo de jugador: ");
                            System.out.println("1) Lead");
                            System.out.println("2) Support");
                            System.out.println("3) Offensive");
                            System.out.println("Ingresa el numero: ");
                            int itipo = lea.nextInt();
                            String tipo = "";
                            switch (itipo) {
                                case 1: {
                                    tipo = "Lead";
                                }
                                break;
                                case 2: {
                                    tipo = "Support";
                                }
                                break;
                                case 3: {
                                    tipo = "Offensive";
                                }
                                break;
                                default: {
                                    System.out.println("Ese tipo no esta disponible para Barbaros man");
                                }
                            }

                            System.out.println("Ingresa el tipo de arma: ");
                            System.out.println("1) Pesada");
                            System.out.println("2) Ligera");
                            System.out.println("3) Escudo");
                            System.out.print("Ingresa el numero: ");
                            int arma = lea.nextInt();
                            String tipo_arma = "";
                            switch (arma) {
                                case 1: {
                                    tipo_arma = "Pesada";
                                }
                                break;
                                case 2: {
                                    tipo_arma = "Ligera";
                                }
                                break;
                                case 3: {
                                    tipo_arma = "Escudo";
                                }
                                break;
                                default: {
                                    System.out.println("Ese tipo de arma no existe man");
                                }
                            }

                            System.out.println("Ingresa el nivel de experiencia: ");
                            int nivelxp = lea.nextInt();

                            Barbaro b = new Barbaro(tipo_arma, nivelxp, nombre, raza, descripcion, nacionalidad, tipo, estatura, peso, edad, HP, CS, AC);
                            personajes.add(b);
                            ((Personaje) b).toString();

                        }
                        break;
                        case 3: {
                            //Mago
                            int CS = 0;
                            int AC = 20;
                            System.out.println("Ingrese el tipo de jugador: ");
                            System.out.println("1) Support");
                            System.out.println("2) Tank");
                            System.out.println("Ingresa el numero: ");
                            int itipo = lea.nextInt();
                            String tipo = "";
                            switch (itipo) {
                                case 1: {
                                    tipo = "Support";
                                }
                                break;
                                case 2: {
                                    tipo = "Tank";
                                }
                                break;
                                default: {
                                    System.out.println("Ese tipo no esta disponible para Magos man");
                                }
                            }

                            System.out.println("Ingrese el tipo de Magia: ");
                            System.out.println("1) Mago Blanco");
                            System.out.println("2) Mago Negro");
                            System.out.println("3) Sanador");
                            System.out.print("Ingresa el numero: ");
                            int magia = lea.nextInt();
                            String tipo_magia = "";
                            switch (magia) {
                                case 1: {
                                    tipo_magia = "Mago Blanco";
                                }
                                break;
                                case 2: {
                                    tipo_magia = "Mago Negro";
                                }
                                break;
                                case 3: {
                                    tipo_magia = "Sanador";
                                }
                                break;
                                default: {
                                    System.out.println("Ese tipo de magia no existe man");
                                }
                            }
                            Mago m = new Mago(tipo_magia, nombre, raza, descripcion, nacionalidad, tipo, estatura, peso, edad, HP, CS, AC);

                            personajes.add(m);
                            ((Personaje) m).toString();
                        }
                        break;
                        case 4: {
                            //Picaro
                            int CS = 80;
                            int AC = 50;
                            System.out.println("Ingrese el tipo de jugador: ");
                            System.out.println("1) Spammer");
                            System.out.println("2) Tank");
                            System.out.println("Ingresa el numero: ");
                            int itipo = lea.nextInt();
                            String tipo = "";
                            switch (itipo) {
                                case 1: {
                                    tipo = "Spammer";
                                }
                                break;
                                case 2: {
                                    tipo = "Tank";
                                }
                                break;
                                default: {
                                    System.out.println("Ese tipo no esta disponible para Picaros man");
                                }
                            }
                            System.out.println("Ingrese el tipo de instrumento: ");
                            System.out.println("1) Amuleto");
                            System.out.println("2) Arma");
                            System.out.println("3) Piedra Antigua");
                            System.out.print("Ingresa el numero: ");
                            int instrumento = lea.nextInt();
                            String tipo_instrumento = "";
                            switch (instrumento) {
                                case 1: {
                                    tipo_instrumento = "Amuleto";
                                }
                                break;
                                case 2: {
                                    tipo_instrumento = "Arma";
                                }
                                break;
                                case 3: {
                                    tipo_instrumento = "Piedra Antigua";
                                }
                                break;
                                default: {
                                    System.out.println("Ese tipo de instrumento no existe man");
                                }
                            }

                            System.out.println("Ingrese la cantidad de robos exitosos realizados: ");
                            int cant_robos = lea.nextInt();

                            Picaro p = new Picaro(tipo_instrumento, cant_robos, nombre, raza, descripcion, nacionalidad, tipo, estatura, peso, edad, HP, CS, AC);

                            personajes.add(p);
                            ((Personaje) p).toString();

                        }
                        break;
                        default: {
                            System.out.println("Clase no existe");
                        }
                    }//Fin Swicth 2
                }//Fin Case 1
                break;
                case 2: {
                    System.out.println("Ingrese la posicion del personaje que desea modificar");
                    int pos = lea.nextInt();
                    if (pos >= 0 && pos <= personajes.size() - 1) {
                        System.out.println("Que es lo que desea modificar? ");
                        System.out.println("1) Nombre");
                        System.out.println("2) Raza");
                        System.out.println("3) Estatura");
                        System.out.println("4) Peso");
                        System.out.println("5) Edad");
                        System.out.println("6) Descripcion");
                        System.out.println("7) Nacionalidad");
                        System.out.println("8) Tipo de Jugador");
                        System.out.println("9) Elementos especificos");
                        System.out.print("Ingrese el numero: ");
                        int modif = lea.nextInt();

                        switch (modif) {
                            case 1: {
                                System.out.println("Ingrese el nuevo nombre: ");
                                String nombre = lea.nextLine();
                                personajes.get(pos).setNombre(nombre);
                            }
                            break;
                            case 2: {
                                System.out.println("Ingrese la nueva Raza: ");
                                System.out.println("1) Mediano");
                                System.out.println("2) Enano");
                                System.out.println("3) Elfo");
                                System.out.println("4) Humano");
                                System.out.print("Ingresa el numero que deseas: ");
                                int iraza = lea.nextInt();

                                String raza = "";
                                int HP = 0;

                                switch (iraza) {
                                    case 1: {
                                        //Mediano
                                        raza = "Mediano";
                                        personajes.get(pos).setRaza(raza);
                                        HP = 50 + r.nextInt(10);
                                        personajes.get(pos).setHP(HP);
                                    }
                                    break;
                                    case 2: {
                                        //Enano
                                        raza = "Enano";
                                        HP = 80 + r.nextInt(20);
                                        personajes.get(pos).setRaza(raza);
                                        personajes.get(pos).setHP(HP);
                                    }
                                    break;
                                    case 3: {
                                        //Elfo
                                        raza = "Elfo";
                                        HP = 50 + r.nextInt(20);
                                        personajes.get(pos).setRaza(raza);
                                        personajes.get(pos).setHP(HP);

                                    }
                                    break;
                                    case 4: {
                                        //Humano
                                        raza = "Humano";
                                        HP = 40 + r.nextInt(35);
                                        personajes.get(pos).setRaza(raza);
                                        personajes.get(pos).setHP(HP);
                                    }
                                    break;
                                    default: {
                                        System.out.println("Esa raza no existe man");
                                    }
                                }//Fin Switch Raza
                            }
                            break;
                            case 3: {
                                System.out.println("Ingrese la nueva estatura en cm o m: ");
                                double estatura = lea.nextDouble();
                                personajes.get(pos).setEstatura(estatura);
                            }
                            break;
                            case 4: {
                                System.out.println("Ingrese el nuevo peso: ");
                                double peso = lea.nextDouble();
                                personajes.get(pos).setPeso(peso);
                            }
                            break;
                            case 5: {
                                System.out.println("Ingrese la nueva edad: ");
                                int edad = lea.nextInt();
                                personajes.get(pos).setEdad(edad);
                            }
                            break;
                            case 6: {
                                System.out.println("Ingrese la descripcion: ");
                                String descripcion = lea.nextLine();
                                personajes.get(pos).setDescrpcion(descripcion);
                            }
                            break;
                            case 7: {
                                System.out.println("Ingrese la nueva nacionalidad: ");
                                System.out.println("1) Norfair");
                                System.out.println("2) Brinstar");
                                System.out.println("3) Maridia");
                                System.out.println("4) Zebes ");
                                System.out.println("5) Crateria");
                                System.out.println("Ingresa el numero que deseas");
                                int inacionalidad = lea.nextInt();
                                String nacionalidad = "";
                                switch (inacionalidad) {
                                    case 1: {
                                        //Norfair
                                        nacionalidad = "Norfair";
                                        personajes.get(pos).setNacionalidad(nacionalidad);
                                    }
                                    break;
                                    case 2: {
                                        //Brinstar
                                        nacionalidad = "Brinstar";
                                        personajes.get(pos).setNacionalidad(nacionalidad);
                                    }
                                    break;
                                    case 3: {
                                        //Maridia
                                        nacionalidad = "Maridia";
                                        personajes.get(pos).setNacionalidad(nacionalidad);
                                    }
                                    break;
                                    case 4: {
                                        //Zebes
                                        nacionalidad = "Zebes";
                                        personajes.get(pos).setNacionalidad(nacionalidad);
                                    }
                                    break;
                                    case 5: {
                                        //Crateria
                                        nacionalidad = "Crateria";
                                        personajes.get(pos).setNacionalidad(nacionalidad);
                                    }
                                    break;
                                    default: {
                                        System.out.println("Esa nacionalidad no existe man");
                                    }
                                }//Fin switch nacionalidad
                            }//Fin Case 7
                            break;
                            case 8: {

                                if (personajes.get(pos) instanceof Clerigo) {
                                    int CS = 97;
                                    int AC = 40;
                                    System.out.println("Ingrese el nuevo tipo de jugador: ");
                                    System.out.println("1) Lead");
                                    System.out.println("Ingresa el numero: ");
                                    int itipo = lea.nextInt();
                                    String tipo = "";
                                    switch (itipo) {
                                        case 1: {
                                            tipo = "Lead";
                                            personajes.get(pos).setTipo_personaje(tipo);
                                        }
                                        default: {
                                            System.out.println("Ese tipo no esta disponible para Clerigo");
                                        }
                                    }
                                } else if (personajes.get(pos) instanceof Barbaro) {
                                    int CS = 93;
                                    int AC = 65;
                                    System.out.println("Ingrese el nuevo tipo de jugador: ");
                                    System.out.println("1) Lead");
                                    System.out.println("2) Support");
                                    System.out.println("3) Offensive");
                                    System.out.println("Ingresa el numero: ");
                                    int itipo = lea.nextInt();
                                    String tipo = "";
                                    switch (itipo) {
                                        case 1: {
                                            tipo = "Lead";
                                            personajes.get(pos).setTipo_personaje(tipo);
                                        }
                                        break;
                                        case 2: {
                                            tipo = "Support";
                                            personajes.get(pos).setTipo_personaje(tipo);
                                        }
                                        break;
                                        case 3: {
                                            tipo = "Offensive";
                                            personajes.get(pos).setTipo_personaje(tipo);
                                        }
                                        break;
                                        default: {
                                            System.out.println("Ese tipo no esta disponible para Barbaros man");
                                        }
                                    }
                                } else if (personajes.get(pos) instanceof Mago) {
                                    int CS = 0;
                                    int AC = 20;
                                    System.out.println("Ingrese el nuevo tipo de jugador: ");
                                    System.out.println("1) Support");
                                    System.out.println("2) Tank");
                                    System.out.println("Ingresa el numero: ");
                                    int itipo = lea.nextInt();
                                    String tipo = "";
                                    switch (itipo) {
                                        case 1: {
                                            tipo = "Support";
                                            personajes.get(pos).setTipo_personaje(tipo);
                                        }
                                        break;
                                        case 2: {
                                            tipo = "Tank";
                                            personajes.get(pos).setTipo_personaje(tipo);
                                        }
                                        break;
                                        default: {
                                            System.out.println("Ese tipo no esta disponible para Magos man");
                                        }
                                    }
                                } else if (personajes.get(pos) instanceof Picaro) {
                                    int CS = 80;
                                    int AC = 50;
                                    System.out.println("Ingrese el nuevo tipo de jugador: ");
                                    System.out.println("1) Spammer");
                                    System.out.println("2) Tank");
                                    System.out.println("Ingresa el numero: ");
                                    int itipo = lea.nextInt();
                                    String tipo = "";
                                    switch (itipo) {
                                        case 1: {
                                            tipo = "Spammer";
                                            personajes.get(pos).setTipo_personaje(tipo);
                                        }
                                        break;
                                        case 2: {
                                            tipo = "Tank";
                                            personajes.get(pos).setTipo_personaje(tipo);
                                        }
                                        break;
                                        default: {
                                            System.out.println("Ese tipo no esta disponible para Picaros man");
                                        }
                                    }
                                }
                            }
                            break;
                            case 9: {
                                if (personajes.get(pos) instanceof Clerigo) {
                                    System.out.println("Ingrese el nuevo Dios / Demonio del que es creyente: ");
                                    String dios_demonio = lea.nextLine();
                                    ((Clerigo) personajes.get(pos)).setDios_demonio(dios_demonio);

                                    System.out.println("Ingrese el nuevo tipo de invocacion: ");
                                    String tipo_invocacion = lea.nextLine();
                                    ((Clerigo) personajes.get(pos)).setTipo_invocacion(tipo_invocacion);

                                } else if (personajes.get(pos) instanceof Barbaro) {
                                    System.out.println("Ingresa el nuevo tipo de arma: ");
                                    System.out.println("1) Pesada");
                                    System.out.println("2) Ligera");
                                    System.out.println("3) Escudo");
                                    System.out.print("Ingresa el numero: ");
                                    int arma = lea.nextInt();
                                    String tipo_arma = "";
                                    switch (arma) {
                                        case 1: {
                                            tipo_arma = "Pesada";
                                            ((Barbaro) personajes.get(pos)).setTipo_arma(tipo_arma);
                                        }
                                        break;
                                        case 2: {
                                            tipo_arma = "Ligera";
                                            ((Barbaro) personajes.get(pos)).setTipo_arma(tipo_arma);
                                        }
                                        break;
                                        case 3: {
                                            tipo_arma = "Escudo";
                                            ((Barbaro) personajes.get(pos)).setTipo_arma(tipo_arma);
                                        }
                                        break;
                                        default: {
                                            System.out.println("Ese tipo de arma no existe man");
                                        }
                                    }

                                    System.out.println("Ingresa el nivel de experiencia: ");
                                    int nivelxp = lea.nextInt();
                                    ((Barbaro) personajes.get(pos)).setNivelxp(nivelxp);
                                } else if (personajes.get(pos) instanceof Mago) {

                                    System.out.println("Ingrese el tipo de Magia: ");
                                    System.out.println("1) Mago Blanco");
                                    System.out.println("2) Mago Negro");
                                    System.out.println("3) Sanador");
                                    System.out.print("Ingresa el numero: ");
                                    int magia = lea.nextInt();
                                    String tipo_magia = "";
                                    switch (magia) {
                                        case 1: {
                                            tipo_magia = "Mago Blanco";
                                            ((Mago) personajes.get(pos)).setTipo_magia(tipo_magia);
                                        }
                                        break;
                                        case 2: {
                                            tipo_magia = "Mago Negro";
                                            ((Mago) personajes.get(pos)).setTipo_magia(tipo_magia);
                                        }
                                        break;
                                        case 3: {
                                            tipo_magia = "Sanador";
                                            ((Mago) personajes.get(pos)).setTipo_magia(tipo_magia);
                                        }
                                        break;
                                        default: {
                                            System.out.println("Ese tipo de magia no existe man");
                                        }
                                    }

                                } else if (personajes.get(pos) instanceof Picaro) {
                                    System.out.println("Ingrese el nuevo tipo de instrumento: ");
                                    System.out.println("1) Amuleto");
                                    System.out.println("2) Arma");
                                    System.out.println("3) Piedra Antigua");
                                    System.out.print("Ingresa el numero: ");
                                    int instrumento = lea.nextInt();
                                    String tipo_instrumento = "";
                                    switch (instrumento) {
                                        case 1: {
                                            tipo_instrumento = "Amuleto";
                                            ((Picaro) personajes.get(pos)).setTipo_instrumento(tipo_instrumento);
                                        }
                                        break;
                                        case 2: {
                                            tipo_instrumento = "Arma";
                                            ((Picaro) personajes.get(pos)).setTipo_instrumento(tipo_instrumento);
                                        }
                                        break;
                                        case 3: {
                                            tipo_instrumento = "Piedra Antigua";
                                            ((Picaro) personajes.get(pos)).setTipo_instrumento(tipo_instrumento);
                                        }
                                        break;
                                        default: {
                                            System.out.println("Ese tipo de instrumento no existe man");
                                        }
                                    }

                                    System.out.println("Ingrese la cantidad de robos exitosos realizados: ");
                                    int cant_robos = lea.nextInt();
                                    ((Picaro) personajes.get(pos)).setCant_robos(cant_robos);

                                }

                            }
                            break;
                            default: {
                                System.out.println("Ese atributo no se puede modificar man");
                            }
                        }
                    }
                }
                break;
                case 3: {
                    System.out.println("Ingrese la posicion del personaje que desea ver: ");
                    int pos = lea.nextInt();
                    if (pos >= 0 && pos <= personajes.size() - 1) {
                        System.out.println(((Personaje) personajes.get(pos)).toString());
                    }
                }
                break;
                case 4: {
                    System.out.println("Ingrese la posicion del personaje que desea eliminar: ");
                    int pos = lea.nextInt();
                    if (pos >= 0 && pos <= personajes.size() - 1) {
                        personajes.remove(pos);
                    }
                }
                break;
                case 5: {
                    //Combate
                    //Ya no me fui man, esta largo :(

                }
                break;
                case 6: {
                    System.out.println("Has salido del programa");
                    bandera = false;
                }
                break;
                default: {
                    System.out.println("Opcion Inexistente");
                }
            }//Fin Switch 
        }//Fin While
    }//Fin Main 
}//Fin Class
