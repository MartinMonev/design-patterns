package game;

public class ObserverMain 
{

	public static void main(String[] args) 
	{
		Topic topic = new Topic();
		Observer obs1 = new TopicSubscriber("Top Supporter 1");
		Observer obs2 = new TopicSubscriber("Top Supporter 2");
		
		topic.subscribe(obs1);
		topic.subscribe(obs2);
		
		topic.setName("Topic 1");
		topic.setName("Topic 2");
	}

}
