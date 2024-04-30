package org.example;

public class ZooEcoSystem {

        interface AnimalBehavior {
            void eat();
            void sleep();
            void makeSound();
        }


        abstract class Animal implements AnimalBehavior {
            String name;
            int age;

            // Constructor
            public Animal(String name, int age) {
                this.name = name;
                this.age = age;
            }



            public void sleep() {
                System.out.println(name + " the animal is sleeping.");
            }


            abstract void displayInformation();
        }

        // Part 2: Creating Specific Animal Classes
        class Mammal extends Animal {

            public Mammal(String name, int age) {
                super(name, age);
            }



            public void eat() {
                System.out.println( " the mammal is eating.");
            }


            public  void makeSound() {
                System.out.println( " the mammal makes a sound.");
            }


            void displayInformation() {
                System.out.println("Mammal Name:" + name +" ,Age:" + age);

            }
        }


        class Bird extends Animal {
            public Bird(String name, int age) {
                super(name, age);
            }

            public void eat() {
                System.out.println(name + " the Bird is eating.");
            }

            public void makeSound() {
                System.out.println(name + " the Bird chirps.");
            }

            void displayInformation() {
                System.out.println("Bird Name: " + name + ", Age: " + age);
            }
        }


    }


