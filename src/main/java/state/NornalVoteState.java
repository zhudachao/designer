package state;

public class NornalVoteState implements VoteState {

	public void vote(String user, String voteItem, VoteManager voteManager) {
		// TODO Auto-generated method stub
		voteManager.getMapVote().put(user, voteItem);
		System.out.println("��ϲͶƱ�ɹ�");

}
}
