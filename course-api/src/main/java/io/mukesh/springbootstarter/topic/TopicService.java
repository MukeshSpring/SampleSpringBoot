package io.mukesh.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topics> topics=new CopyOnWriteArrayList<Topics>(Arrays.asList(		
			new Topics("Spring", "SpringName", "SpringDescription"),
			new Topics("JAVA", "JAVAName", "JAVADescription"),
			new Topics("Hibernate", "HibernateName", "HibernateDescription")));
			
	public List<Topics> getAllTopics()
	{
		return topics;
	}

	public Topics getTopicFromID(String id) {
		for(Topics topic :topics)
		{
			if(topic.getTopicID().equalsIgnoreCase(id))
			{
				return topic;
			}
		}
		return null;
	}

	public void addTopics(Topics topic) {
		topics.add(topic);
	}

	public void deleteTopics(String id) {
		
		for(Topics topic :topics)
		{
			if(topic.getTopicID().equalsIgnoreCase(id))
			{
				topics.remove(topic);
			}
		}
	}

	public void updateTopics(Topics topic, String id) {
		
		for(int i=0; i<topics.size();i++)
		{
			Topics topicVa=topics.get(i);
			if(topicVa.getTopicID().equalsIgnoreCase(id))
			{
				topics.add(i, topic);
				return;
			}
		}
		
	}
	
	
}
