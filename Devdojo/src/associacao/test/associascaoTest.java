package associacao.test;

import associacao.classes.aluno;
import associacao.classes.local;
import associacao.classes.professor;
import associacao.classes.seminario;

public class associascaoTest {
    public static void main(String[] args) {
        aluno aluno = new aluno("João", 19);
        aluno aluno2 = new aluno("Rayane", 16);

        seminario sem = new seminario("Programação");
        professor prof = new professor("Deku", "Usar o One For All");
        local local = new local("Rua das araras", "Mato");

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);

        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAlunos(new aluno[] { aluno, aluno2 });
    }
}
