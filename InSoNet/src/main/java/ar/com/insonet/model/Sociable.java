package ar.com.insonet.model;

public interface Sociable {
	
	public boolean login();
	public boolean logout();
	public boolean requestFriendship();
	public boolean acceptFriendship();
	public boolean removeFrienship();
	public boolean searchProfile();
	public boolean checkStatus();
	public boolean sendMessage();
	public boolean receiveMessage();
	public boolean deleteMessage();
	public boolean markingPublication();
	
}