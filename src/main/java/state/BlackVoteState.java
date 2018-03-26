package state;

public class BlackVoteState implements VoteState {

	public void vote(String user, String voteItem, VoteManager voteManager) {
		// TODO Auto-generated method stub
		System.out.println("走进黑名单，将禁止登陆和使用本系统");
	}

}
