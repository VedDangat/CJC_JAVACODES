interface Animals {

    default void isAnimal() {
        System.out.println("yes it is an animal");
    }

    public void Sound();

    public void Eat();
}