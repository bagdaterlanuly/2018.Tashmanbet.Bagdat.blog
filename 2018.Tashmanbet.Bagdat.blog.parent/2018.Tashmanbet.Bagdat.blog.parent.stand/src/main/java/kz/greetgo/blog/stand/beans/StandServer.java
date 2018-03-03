package kz.greetgo.blog.stand.beans;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.HasAfterInject;
import org.eclipse.jetty.server.Server;

import static java.lang.System.out;

@Bean
public class StandServer implements HasAfterInject {
    public final Server server=new Server(13_14);

    public final StandServer start() throws Exception {
        server.start();
        out.println("Server started");
        return this;
    }
    @Override
    public void afterInject() throws Exception {

    }
}

