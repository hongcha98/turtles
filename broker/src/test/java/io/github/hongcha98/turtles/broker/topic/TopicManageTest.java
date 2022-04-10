package io.github.hongcha98.turtles.broker.topic;

import io.github.hongcha98.turtles.broker.config.TurtlesConfig;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class TopicManageTest {
    TopicManage topicManage;

    String topic;

    @Before
    public void init() {
        topicManage = new DefaultTopicManage(new TurtlesConfig());
        topicManage.start();
        topic = "test-topic";
    }

    @Test
    public void getAllTopic() {
        Map<String, Topic> allTopic = topicManage.getAllTopic();
        System.out.println("allTopic = " + allTopic);
    }

    @Test
    public void addTopic() {
        topicManage.addTopic(topic, 8);
    }


    @Test
    public void deleteTopic() {
        topicManage.deleteTopic(topic);
    }


}
