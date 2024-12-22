class Coach implements TeamMember {
    private String name;

    public Coach(String name) {
        this.name = name;
    }

    @Override
    public void participate() {
        System.out.println(name + "가 선수들을 코칭합니다.");
    }
}