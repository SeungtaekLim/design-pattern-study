class Manager implements TeamMember {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void participate() {
        System.out.println(name + "가 선수들을 감독합니다.");
    }
}