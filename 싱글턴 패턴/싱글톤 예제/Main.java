public class Main {
    public static void main(String[] args) {
        LiveLecture lecture1 = LiveLecture.getInstance("설계 패턴");
        lecture1.LectureButton();
        lecture1.LectureButton();

        LiveLecture lecture2 = LiveLecture.getInstance("설계 패턴");
        lecture2.LectureButton();
        lecture2.LectureButton();
    }
}