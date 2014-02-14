package ar.com.insonet.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import ar.com.insonet.model.Friend;

@Repository
public class FriendDAOImpl implements FriendDAO {
	
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void addFriend(Friend friend) {
		getCurrentSession().save(friend);
	}
	
	public void updateFriend(Friend friend) {
		Friend friendToUpdate = getFriend(friend.getId());
		friendToUpdate.setUserId(friend.getUserId());
		friendToUpdate.setSocialNetworkId(friend.getSocialNetworkId());
		getCurrentSession().update(friendToUpdate);
	}
	public Friend getFriend(int id) {
		Friend friend = (Friend) getCurrentSession().get(Friend.class, id);
		return friend;
	}
	public void deleteFriend(int id) {
		Friend friend = getFriend(id);
		if (friend != null)
			getCurrentSession().delete(friend);
	}
	
	@SuppressWarnings("unchecked")
	public List<Friend> getFriends() {
		return getCurrentSession().createQuery("from friend").list();
	}

}