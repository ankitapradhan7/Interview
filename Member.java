
class Member {
    private String name;
    private int memberId;
    private int superCoin;
    public Member(String name, int memberId, int superCoin)
    {
        this.name = name;
        this.memberId = memberId;
        this.superCoin = superCoin;
    }
    public String getName(){
        return name;
    }     
    public int getMemberId(){
        return memberId;
    }
    public int getSuperCoin(){
        return superCoin;
    }
}
