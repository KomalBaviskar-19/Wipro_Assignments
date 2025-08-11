package com.wipro.komal.solid_principal;

interface Cooking {
    void cook();
}

interface Cleaning {
    void clean();
}


class Chef implements Cooking {
    public void cook() {
        System.out.println("Chef is cooking");
    }
}

class Cleaner implements Cleaning {
    public void clean() {
        System.out.println("Cleaner is cleaning");
    }
}

public class ISPExample {
    public static void main(String[] args) {
        Cooking chef = new Chef();
        chef.cook();

        Cleaning cleaner = new Cleaner();
        cleaner.clean();
    }
}