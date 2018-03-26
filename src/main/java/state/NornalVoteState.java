package state;

public class NornalVoteState implements VoteState {

	public void vote(String user, String voteItem, VoteManager voteManager) {
		// TODO Auto-generated method stub
		voteManager.getMapVote().put(user, voteItem);
		System.out.println("¹§Ï²Í¶Æ±³É¹¦");

}
}
