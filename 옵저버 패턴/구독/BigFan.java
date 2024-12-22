public class BigFan implements Observer{
    private String fanID;
    public BigFan(String fanID) {
        this.fanID = fanID;
    }

    @Override
    public void update() {
        System.out.println(fanID + "님, 채널에 새로운 영상이 업로드 되었습니다.");
    }
}
