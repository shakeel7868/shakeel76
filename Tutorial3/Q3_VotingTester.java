package Tutorial3;

import java.util.*;

public class Q3_VotingTester {
    public static void main(String[] args){
        int voteParty = 0;
        Random r = new Random();

        Q3_VotingMachine machine1 = new Q3_VotingMachine();

        for(int i = 0; i < 10; i++){

            int result = r.nextInt(2 - 0); // 1 - 0
//            System.out.println(result);
            if (result == 1)
                machine1.voteLabour();
            else
                machine1.voteConservative();
        }

        System.out.println(machine1.get_labourVoteCount());
        System.out.println(machine1.get_conservativeVoteCount());
    }
}
