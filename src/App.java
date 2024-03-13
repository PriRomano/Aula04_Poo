public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        aluno Priscila = new aluno("Priscila", "380.411.598-50", 2321014, "13/10/1989", "feminino");
        Priscila.setNome("Priscila");

        System.out.println(Priscila.getNome());
        System.out.println(Priscila.getRA());


        aluno a = new aluno();
        a.setNome("Zezinho");
        a.setRA(2321014);
        System.out.println(a.getNome());

    }
}
