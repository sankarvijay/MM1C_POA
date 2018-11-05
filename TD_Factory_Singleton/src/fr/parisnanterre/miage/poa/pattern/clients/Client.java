package fr.parisnanterre.miage.poa.pattern.clients;

import fr.parisnanterre.miage.poa.pattern.products.ProductA;
import fr.parisnanterre.miage.poa.pattern.products.ProductB;
import fr.parisnanterre.miage.poa.pattern.products.ProductC;

public class Client {

    public Client() {
        prodA = new ProductA();
    }
        public void foo () {
            prodA.doYourStuff();
            ProductB myProdB = new ProductB();
            myProdB.doIt();
            ProductC myProdC = new ProductC();
            myProdC.perform();

        }
        ProductA prodA;
        ProductB prodB;
    }
