import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Boost Java");
        mentoria.setDescricao("Descrição Boost Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp spreadJava = new Bootcamp();
        spreadJava.setNome("Spread Java Developer");
        spreadJava.setDescricao("Aprendendo desenvolvimento Java");
        spreadJava.getConteudos().add(curso1);
        spreadJava.getConteudos().add(curso2);
        spreadJava.getConteudos().add(mentoria);

        Dev devPrando = new Dev();
        devPrando.setNome("Lucas Prando");
        devPrando.inscreverBootcamp(spreadJava);
        System.out.println("Conteudos inscritos de " + devPrando.getNome() + ": " + devPrando.getConteudosInscritos());
        devPrando.progredir();
        devPrando.progredir();
        System.out.println("PÓS PROGRESSÂO\nConteudos inscritos de " + devPrando.getNome() + ": " + devPrando.getConteudosInscritos());
        System.out.println("Conteudos concluidos de " + devPrando.getNome() + ": " + devPrando.getConteudosConcluidos());
        System.out.println("Total de XP: " + devPrando.calcularTotalXP());

        Dev devBill = new Dev();
        devBill.setNome("Bill Gates");
        devBill.inscreverBootcamp(spreadJava);
        System.out.println("\nConteudos inscritos de " + devBill.getNome() + ": " + devBill.getConteudosInscritos());
        devBill.progredir();
        devBill.progredir();
        devBill.progredir();
        System.out.println("PÓS PROGRESSÂO\nConteudos inscritos de " + devBill.getNome() + ": " + devBill.getConteudosInscritos());
        System.out.println("Conteudos concluidos de " + devBill.getNome() + ": " + devBill.getConteudosConcluidos());
        System.out.println("Total de XP: " + devBill.calcularTotalXP());


    }
}
