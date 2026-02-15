public class Programmer {
    int ID;
    String name;
    String ppf; //Preferred Programing Language
    int problemsSolved;

    Programmer(int ID, String name, String ppf, int problemsSolved){
        this.ID = ID;
        this.name = name;
        this.ppf = ppf;
        this.problemsSolved = problemsSolved;

    }

    void UpdateSolvedProblems(int newProblemsSolved){
        this.problemsSolved += newProblemsSolved;
    }

    void displayInfo(){
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Preferred Programming Language: " + ppf);
        System.out.println("Problems Solved: " + problemsSolved);
        System.out.println("---------------------");

    }

    public static void main(String[] args){
        Programmer p1 = new Programmer(1001, "Hamza", "JAVA", 150);
        Programmer p2 = new Programmer(1002, "Zain", "c++", 190);

        p1.displayInfo();
        p2.displayInfo();

        p1.UpdateSolvedProblems(50);
        p2.UpdateSolvedProblems(60);

        p1.displayInfo();
        p2.displayInfo();
    }
}
