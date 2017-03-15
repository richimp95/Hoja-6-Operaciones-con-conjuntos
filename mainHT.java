import java.util.*;

import java.lang.Math;





public class mainHT {



    public static void main(String[] args) {

        boolean error = true;

        Scanner scan = new Scanner(System.in);

        while(error){

            try{

                System.out.println("Por favor ingrese de lista que quiere usar ('HashSet', 'TreeSet', 'LinkedHashSet')");

                String type = scan.next();

                System.out.println(" ");

                boolean addnew=true;



                factory ListFactory = new factory();



                AbstractSet web = ListFactory.getList(type);

                AbstractSet java = ListFactory.getList(type);

                AbstractSet cel = ListFactory.getList(type);

                AbstractSet todos = ListFactory.getList(type);

                int webc=0;

                int javac=0;

                int celc=0;

                int todosc=0;



                while(addnew){

                    System.out.println("Desea agregar otro desarrollador? '1/0'");

                    int ynn = scan.nextInt();

                    if(ynn==1){

                        System.out.println(" ");

                        System.out.println("Ingrese el nombre del desarrollador");

                        String dev = scan.next();

                        System.out.println("Ingrese el tipo de desarrollador (puede ingresar más de un número, todo junto):");

                        System.out.println("1) dessarrollador web");

                        System.out.println("2) dessarrollador java");

                        System.out.println("3) dessarrollador celulares");

                        String tipo = scan.next();

                        if(tipo.contains("1")){  web.add(dev);webc++;}

                        if(tipo.contains("2")){java.add(dev);javac++;}

                        if(tipo.contains("3")){cel.add(dev);celc++;}

                        todos.add(dev);

                        todosc++;

                    }else{addnew=false;}

                }





                Iterator iterator1 = todos.iterator();

                Iterator iterator2 = todos.iterator();

                Iterator iterator3 = todos.iterator();

                Iterator iterator4 = todos.iterator();

                System.out.println(" ");

                System.out.println("Desarrolladores con experiencia en web, java y celulares: ");

                while(iterator1.hasNext()){

                    Object persona = iterator1.next();

                    if(java.contains(persona) && web.contains(persona) && cel.contains(persona) ){

                        System.out.println(persona);

                    }

                }

                System.out.println(" ");

                System.out.println("Desarrolladores con experiencia en java pero no web: ");

                while(iterator2.hasNext()){

                    Object persona = iterator2.next();

                    if(java.contains(persona) && !web.contains(persona)){

                        System.out.println(persona);

                    }

                }

                System.out.println(" ");

                System.out.println("Desarrolladores con experiencia en web y celulares pero no java: ");

                while(iterator3.hasNext()){

                    Object persona = iterator3.next();

                    if(!java.contains(persona) && web.contains(persona) && cel.contains(persona) ){

                        System.out.println(persona);

                    }

                }



                System.out.println(" ");

                System.out.println("Desarrolladores con experiencia web o celulares pero no java: ");

                while(iterator4.hasNext()){

                    Object persona = iterator4.next();

                    if(!java.contains(persona) || web.contains(persona) && !cel.contains(persona) ){

                        System.out.println(persona);

                    }

                }



                System.out.println(" ");







                int max = Math.max(Math.max(java.size(),web.size()),cel.size());

                if(web.size() == max){

                    System.out.println("El grupo con más miembros es: web");

                    System.out.println("Desarrolladores web: "+web);

                }

                System.out.println(" ");

                if(java.size() == max){

                    System.out.println("El grupo con más miembros es: java");

                    System.out.println("Desarrolladores web: "+java);

                }

                System.out.println(" ");

                if(cel.size() == max){

                    System.out.println("El grupo con más miembros es: celulares");

                    System.out.println("Desarrolladores web: "+cel);

                }







                error=false;









            }catch (Exception E){

                System.out.println("usted ingresó algo arroneo");

                error=true;

            }

        }







    }

}