package ar.com.insonet.dao;

import java.util.List;

import ar.com.insonet.model.Friend;

public interface FriendDAO {
	
	public void addFriend(Friend friend);
	public void updateFriend(Friend friend);
	public Friend getFriend(int id);
	public void deleteFriend(int id);
	public List<Friend> getFriends();

}
