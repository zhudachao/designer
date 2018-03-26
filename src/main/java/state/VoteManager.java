package state;

import java.util.HashMap;
import java.util.Map;


public class VoteManager {
	
	private VoteState state=null;
	//��¼�û�ͶƱ���
	private Map<String,String>  mapVote=new HashMap<String, String>();
	//��¼�û�ͶƱ����
	private Map<String,Integer>  mapVoteCount=new HashMap<String, Integer>();
 
	public Map<String, String> getMapVote(){
		return mapVote;
	}
	
	public void vote(String user,String voteItem){
		Integer oldVoteCount=mapVoteCount.get(user);
		if(oldVoteCount==null){
			oldVoteCount=0;
		}
		oldVoteCount++;
		mapVoteCount.put(user, oldVoteCount);
		
		if(oldVoteCount==1){
			state=new NornalVoteState();
		}
		if(oldVoteCount>=2&&oldVoteCount<8){
			state=new RepeatVoteState();
		}
		
		if(oldVoteCount>=5&&oldVoteCount<8){
			state=new SpiteVoteState();
		}
		if(oldVoteCount>8){
			state=new BlackVoteState();
		}
		
		state.vote(user, voteItem, this);
		
	}
	
	

}
