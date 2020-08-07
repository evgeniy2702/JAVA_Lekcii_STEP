package CreationPattern.Singleton;

public class Logger {
    String data;
    static Logger instance;

    public Logger() {
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }
}
