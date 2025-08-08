package controle;

public class Programa {
    public static void main(String[] args) {
        modelo.Professor thiago = new modelo.Professor("Thiago", "123456789", "Mestrado");
        modelo.Aluno arthur = new modelo.Aluno("Arthur", "31999614643", "202402851756");

        System.out.println(thiago.getNome());
        System.out.println(thiago.getTitulacao());
        System.out.println(thiago.getTelefone());
        System.out.println("------------------");
        System.out.println(arthur.getNome());
        System.out.println(arthur.getMatricula());
        System.out.println(arthur.getTelefone());
        System.out.println("------------------");
    }
}
