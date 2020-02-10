package io.mukesh.springbootstarter.topic;

public class Topics {

	private String topicID;
	private String topicName;
	private String topicDescription;
	
	public Topics() {
	}
	
	public Topics(String topicID, String topicName, String topicDescription) {
		super();
		this.topicID = topicID;
		this.topicName = topicName;
		this.topicDescription = topicDescription;
	}
	public String getTopicID() {
		return topicID;
	}
	public void setTopicID(String topicID) {
		this.topicID = topicID;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicDescription() {
		return topicDescription;
	}
	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}
	
	
	
}
