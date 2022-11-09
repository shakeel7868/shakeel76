package Tutorial3;

public class Q3_VotingMachine {
    private static int _labourVoteCount;
    private static int _conservativeVoteCount;

    public static int get_labourVoteCount() {
        return _labourVoteCount;
    }

    public static void set_labourVoteCount(int _labourVoteCount) {
        Q3_VotingMachine._labourVoteCount = _labourVoteCount;
    }

    public static int get_conservativeVoteCount(){
        return _conservativeVoteCount;
    }

    public static void set_conservativeVoteCount(int _conservativeVoteCount){
        Q3_VotingMachine._conservativeVoteCount = _conservativeVoteCount;
    }

    public void voteLabour(){
        set_labourVoteCount(get_labourVoteCount() + 1);
        // set_labourVoterCount(1)
        // get_labourVoterCount = 1
    }

    public void voteConservative(){
        set_conservativeVoteCount(get_conservativeVoteCount()+1);
    }
}
