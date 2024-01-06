package ProjectOOPs;

class RegistrationTester extends Registration {
    public static void main(String[] args) {
        Registration r = new Registration();
        r.setEmail("kat123@yahoo.com");
        r.setUserName("kateryna123");
        r.setPassword("password777");
        r.printInfo();
    }
}
