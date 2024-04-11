package org.example;

public class Familia {

    Animal papa=new Animal("Dinosaurin");
    Animal mama=new Animal("Tiburosin");
    Animal hijo=new Animal();

    public Familia() {
    }

    public Familia(Animal papa, Animal mama) {
        this.papa = papa;
        this.mama = mama;
    }

    public  void imprimirFamilia(){

        //Este metodo muestra los nombres de los integrantes de la familia
        System.out.println(
                "El papá es: "+papa.getNombre()+
                        "\nLa mamá es: "+mama.getNombre()+
                        "\nEl hijo es: "+hijo.getNombre()
        );

    }


    public void tenerHijo(String nombre){

        if(this.papa!=null && this.mama!=null){

            Animal hijo= new Animal();

            hijo.setNombre(nombre);
            hijo.setPeso(1);
            double random = Math.random();
            if(random<0.5){
                hijo.setGenero("F");
            }else{
                hijo.setGenero("M");
            }
            this.hijo=hijo;

        }else{
            System.out.println("Aun no puedes tener hijos");
        }


    }




}
