class Player implements TeamMember {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void participate() {
        System.out.println(name + "가 경기합니다.");
    }
}