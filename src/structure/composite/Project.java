package structure.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstJava = new JavaDeveloper();
        Developer secondJava = new JavaDeveloper();
        Developer cpp = new CPPDeveloper();

        team.addDeveloper(firstJava);
        team.addDeveloper(secondJava);
        team.addDeveloper(cpp);

        team.createProject();
    }
}
