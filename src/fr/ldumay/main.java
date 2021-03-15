/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import ldumay.lib.essentials.DatasInput;
import ldumay.lib.tipical.Person;

/**
 *
 * @author mtl
 */
public class main {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start program
        System.out.println("Hello World ! This program has been start.\n---");
        
        // Test - Class - DatasInput
        /*
        String test;
        DatasInput datas = new DatasInput();
        datas.getDatasUser("Please, enter a string : ");
        System.out.println("Yan have entered : "+datas.enteredData);
        */
        
        // Test - Class - Person with Java API Collections
        int compteur_a = 1;
        int compteur_b = 1;
        int compteur_c = 1;
        int compteur_d = 1;
        int compteur_e = 1;
        // => It has been defined that each person object cannot have the same mail.
        int fourRealDatas = 4;
        boolean duplicatesValid = false;
        //--
        Person person1 = new Person("Du Pont","George","1993-06-22",null,"du_pont.george@gmail.com");
        Person person2 = new Person("De Puis","Sylain","2002-10-18",null,"de_puis.sylvain@gmail.com");
        Person person3 = new Person("Deville","Marie","1980-12-14",null,"deville.marie@gmail.com");
        Person person4 = new Person("De La Maisonnette","Pierre","1988-09-30",null,"delamaisonnette.pierre@gmail.com");
        Person person5 = new Person("De Puis","Sylain","2002-10-18",null,"de_puis.sylvain@gmail.com");//duplicates test => person2
        
        //--Création de liste de test
        ArrayList<Person> personArrayList = new ArrayList<>();
        Set<Person> personSet = new HashSet<>();
        HashSet<Person> personHashSet = new HashSet<>();
        Stack<Person> personStack = new Stack<>();
        
        //--ArrayList
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person1);//duplicates test
        personArrayList.add(person4);
        personArrayList.add(person5);//duplicates test person5 = person2
        personArrayList.add(person2);//duplicates test
        //--
        System.out.println("---\nTest ArrayList :\n---");
        for(Person p : personArrayList){
            System.out.println("Person : #"+compteur_a);
            System.out.println("-> Nom : "+p.getFirstName()+" - Prénom : "+p.getLastName()+" - FullName : "+p.getFullName());
            System.out.println("-> Birdthday : "+p.getBirthday()+" - Age : "+p.getAge());
            System.out.println("-> Login : "+p.getLogin()+" - Mail : "+p.getMail());
            compteur_a++;
        }
        if( personArrayList.size() > fourRealDatas ){ duplicatesValid = true; }else{ duplicatesValid = false; }
        System.out.println("=> Datas in ArrayList : "+personArrayList.size()+" - Real datas : "+fourRealDatas+" - Duplicates valid : "+duplicatesValid);
        
        //--Set & HashSet
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person1);//duplicates test
        personSet.add(person4);
        personSet.add(person5);//duplicates test person5 = person2
        personSet.add(person2);//duplicates test
        //--
        System.out.println("---\nTest Set & HashSet :\n---");
        for(Person p : personSet){
            System.out.println("Person : #"+compteur_b);
            System.out.println("-> Nom : "+p.getFirstName()+" - Prénom : "+p.getLastName()+" - FullName : "+p.getFullName());
            System.out.println("-> Birdthday : "+p.getBirthday()+" - Age : "+p.getAge());
            System.out.println("-> Login : "+p.getLogin()+" - Mail : "+p.getMail());
            compteur_b++;
        }
        if( personSet.size() > fourRealDatas ){ duplicatesValid = true; }else{ duplicatesValid = false; }
        System.out.println("=> Datas in ArrayList : "+personSet.size()+" - Real datas : "+fourRealDatas+" - Duplicates valid : "+duplicatesValid);
        
        //-- HashSet
        personHashSet.add(person1);
        personHashSet.add(person2);
        personHashSet.add(person3);
        personHashSet.add(person1);//duplicates test
        personHashSet.add(person4);
        personHashSet.add(person5);//duplicates test person5 = person2
        personHashSet.add(person2);//duplicates test
        //--
        System.out.println("---\nTest HashSet :\n---");
        for(Person p : personHashSet){
            System.out.println("Person : #"+compteur_c);
            System.out.println("-> Nom : "+p.getFirstName()+" - Prénom : "+p.getLastName()+" - FullName : "+p.getFullName());
            System.out.println("-> Birdthday : "+p.getBirthday()+" - Age : "+p.getAge());
            System.out.println("-> Login : "+p.getLogin()+" - Mail : "+p.getMail());
            compteur_c++;
        }
        if( personHashSet.size() > fourRealDatas ){ duplicatesValid = true; }else{ duplicatesValid = false; }
        System.out.println("=> Datas in ArrayList : "+personHashSet.size()+" - Real datas : "+fourRealDatas+" - Duplicates valid : "+duplicatesValid);
        
        //--Stack
        personStack.add(person1);
        personStack.add(person2);
        personStack.add(person3);
        personStack.add(person1);//duplicates test
        personStack.add(person4);
        personStack.add(person5);//duplicates test person5 = person2
        personStack.add(person2);//duplicates test
        //--
        System.out.println("---\nTest Stack :\n---");
        for(Person p : personStack){
            System.out.println("Person : #"+compteur_d);
            System.out.println("-> Nom : "+p.getFirstName()+" - Prénom : "+p.getLastName()+" - FullName : "+p.getFullName());
            System.out.println("-> Birdthday : "+p.getBirthday()+" - Age : "+p.getAge());
            System.out.println("-> Login : "+p.getLogin()+" - Mail : "+p.getMail());
            compteur_d++;
        }
        if( personStack.size() > fourRealDatas ){ duplicatesValid = true; }else{ duplicatesValid = false; }
        System.out.println("=> Datas in ArrayList : "+personStack.size()+" - Real datas : "+fourRealDatas+" - Duplicates valid : "+duplicatesValid);
        
        //--Iterator
        System.out.println("---\nTest Iterator :\n---");
        Iterator<Person> iterator = personSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        //--TreeSet
        TreeSet<Person> personTreeSet = new TreeSet<Person>(personHashSet);
        //--
        /*
        System.out.println("---\nTest TreeSet :\n---");
        for(Person p : personTreeSet){
            System.out.println("Person : #"+compteur_e);
            System.out.println("-> Nom : "+p.getFirstName()+" - Prénom : "+p.getLastName()+" - FullName : "+p.getFullName());
            System.out.println("-> Birdthday : "+p.getBirthday()+" - Age : "+p.getAge());
            System.out.println("-> Login : "+p.getLogin()+" - Mail : "+p.getMail());
            compteur_e++;
        }
        if( personTreeSet.size() > fourRealDatas ){ duplicatesValid = true; }else{ duplicatesValid = false; }
        System.out.println("=> Datas in ArrayList : "+personTreeSet.size()+" - Real datas : "+fourRealDatas+" - Duplicates valid : "+duplicatesValid);
        */
        
        // End Program
        System.out.println("\nThis program is finished !");
        System.exit(0);
    }
    
}
