package com.example.courseapi.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private final List<Topic> topics = Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring framework description"),
                new Topic("Java", "Java Framework", "Java description"),
                new Topic("Python", "Python Framework", "Python framework description")
        );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
