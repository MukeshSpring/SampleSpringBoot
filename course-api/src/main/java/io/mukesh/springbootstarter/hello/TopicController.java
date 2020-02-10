package io.mukesh.springbootstarter.hello;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.mukesh.springbootstarter.topic.TopicService;
import io.mukesh.springbootstarter.topic.Topics;

@RestController
public class TopicController {


	@Autowired
	TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topics> topics()
	{
			return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topics getTopic(@PathVariable("id") String id)
	{
		return topicService.getTopicFromID(id);
	}
	
	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	public void addTopics(@RequestBody Topics topic)
	{
		topicService.addTopics(topic);
	}
	
	@RequestMapping(value ="/topics/{delete}", method = RequestMethod.DELETE)
	public void deleteTopics(@PathVariable("delete") String id)
	{
		topicService.deleteTopics(id);
	}
	@RequestMapping(value="/topics/{id}", method = RequestMethod.PUT)
	public void updateTopics(@PathVariable("id") String id, @RequestBody Topics topic)
	{
		topicService.updateTopics(topic,id);
	}
}
