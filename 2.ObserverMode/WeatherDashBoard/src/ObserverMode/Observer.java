package ObserverMode;

public interface Observer {
    void update(double temperature, double humidity, double pressure);

    void unsubscribe();
}
