class Dog extends Animal {
    Dog(String breed, int age) {
        super(breed, age);
    }

    void bark() {
        System.out.println("Dog is barking");
    }

    void fetch() {
        System.out.println("Dog is fetching");
    }
}

