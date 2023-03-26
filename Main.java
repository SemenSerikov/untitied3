public class Main {
    public static void main(String[] args) {
        Division division=new Division();
        try {
            System.out.println(division.divide());
        }catch (LoginValidationException e){
            System.out.println(e);
        }
        System.out.println("Test");
    }
}


