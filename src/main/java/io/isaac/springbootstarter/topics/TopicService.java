package io.isaac.springbootstarter.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){

        List<Topic> topics = new ArrayList<>();

        topicRepository.findAll().forEach(topics::add);

        return topics;
    }

    public Topic getTopic(String id){
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic){
        topicRepository.save(topic);
    }

    public void deleteTopic(String id){
         topicRepository.delete(id);
    }
}
