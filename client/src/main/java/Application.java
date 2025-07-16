import net.runelite.client.RuneLite;

public class Application {

    public static void main(String[] args) {
        //Sentry.init(options -> {
          //  options.setDsn("https://8ac06499a2f5357b91340f53b74464d2@o4507283867303936.ingest.de.sentry.io/4507283870449744");
          //  options.setRelease("1.0");
        //});

        try {
            RuneLite.main(args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
