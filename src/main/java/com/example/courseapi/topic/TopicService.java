package com.example.courseapi.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class TopicService {

    private final List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring framework description"),
                new Topic("Java", "Java Framework", "Java description"),
                new Topic("Python", "Python Framework", "Python framework description")
        ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
//        if(topics.stream().anyMatch(t -> t.getId().equals(id))) {
//
//        }
        for(int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if(t.getId().equals(id)) {
                topics.set(i, topic);
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(topic -> topic.getId().equals(id));
    }
}
