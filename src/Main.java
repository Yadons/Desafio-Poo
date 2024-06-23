import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devYago = new Dev();
        devYago.setNome("Yago");
        devYago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devYago.getConteudosInscritos());
        devYago.progredir();
        System.out.println("----------");
        System.out.println("Conteúdos inscritos: " + devYago.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devYago.getConteudosConcluidos());
        System.out.println("XP: " + devYago.calcularTotalXp() );

    }
}