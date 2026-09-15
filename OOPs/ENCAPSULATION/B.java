class B {

    public static void main(String[] args) {

        A obj = new A();

        // Public → Directly accessible
        System.out.println("Public: " + obj.publicNumber);

        // Protected → Accessible because both classes
        // are in the same package
        System.out.println("Protected: " + obj.protectedNumber);

        // Private → Cannot access directly
        // System.out.println(obj.privateNumber);

        // Private → Access using Getter
        System.out.println("Private: " + obj.getPrivateNumber());

        // Changing private variable using Setter
        obj.setPrivateNumber(50);

        // Getting updated value using Getter
        System.out.println("Updated Private: " + obj.getPrivateNumber());
    }
}