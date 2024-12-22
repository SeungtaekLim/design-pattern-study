public class Study  {
    private StudyStrategy studyStrategy;

    public void setStudyStrategy(StudyStrategy studyStrategy) {
        this.studyStrategy = studyStrategy;
    }

    public void StudySubject () {
        if (studyStrategy == null) {
            System.out.println("강의를 들을 과목을 선택하자");
        } else {
            studyStrategy.study();
        }
    }
}
