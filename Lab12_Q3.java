import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(String news);
}

// Subject Class
class NewsAgency {
    private String news;
    private List<Observer> channels = new ArrayList<>();

    public void addObserver(Observer channel) {
        channels.add(channel);
    }

    public void setNews(String news) {
        this.news = news;
        notifyAllChannels();
    }

    private void notifyAllChannels() {
        for (Observer channel : channels) {
            channel.update(news);
        }
    }
}

// Concrete Observer
class NewsChannel implements Observer {
    private String channelName;

    public NewsChannel(String name) {
        this.channelName = name;
    }

    @Override
    public void update(String news) {
        System.out.println(channelName + " received breaking news: " + news);
    }
}

public class Lab12_Q3 {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        NewsChannel bbc = new NewsChannel("BBC");
        NewsChannel cnn = new NewsChannel("CNN");

        agency.addObserver(bbc);
        agency.addObserver(cnn);

        agency.setNews("Java 21 LTS Released Worldwide!");
    }
}