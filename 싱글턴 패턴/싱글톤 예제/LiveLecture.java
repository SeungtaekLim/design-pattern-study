public class LiveLecture {

    private static LiveLecture instance;
    private String lectureName;
    private boolean isLive;

    private LiveLecture(String lectureName) {
        this.lectureName = lectureName;
        this.isLive = false;
        System.out.println(lectureName + "라이브 강의 개설");
    }

    public synchronized static LiveLecture getInstance(String lectureName) {
        if (instance == null) {
            instance = new LiveLecture(lectureName);
        }
        return instance;
    }

    public void LectureButton() {
        if (!isLive) {
            isLive = true;
            System.out.println(lectureName + " 강의가 시작되었습니다!");
        } else {
            isLive = false;
            System.out.println(lectureName + " 강의를 종료합니다.");
        }
    }
}