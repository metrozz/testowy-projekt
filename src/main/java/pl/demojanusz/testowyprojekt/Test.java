package pl.demojanusz.testowyprojekt;

public class Test {

    private String commit;

    public Test(String commit) {
        this.commit = commit;
    }

    public void printCommit(){
        System.out.println(commit);
    }
}
