public class Main {
    public static void main(String[] args) {
        Study study = new Study();
        study.StudySubject();

        study.setStudyStrategy(new DesignPattern());
        study.StudySubject();

        study.setStudyStrategy(new DatabaseDesign());
        study.StudySubject();

        study.setStudyStrategy(new NetworkProgramming());
        study.StudySubject();
    }
}