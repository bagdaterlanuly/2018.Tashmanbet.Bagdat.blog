<<<<<<< HEAD
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

=======
package kz.greetgo.blog.stand.beans;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.depinject.core.HasAfterInject;
import kz.greetgo.blog.stand.utils.Modules;
import kz.greetgo.blog.stand.utils.WebAppContextRegistration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.util.Comparator;
import java.util.List;

@Bean
public class StandServer  implements HasAfterInject{

    public final Server server = new Server(8000);

    public StandServer start() throws Exception {
        server.start();
        System.out.println("_______Server started");
        return this;
    }

    public BeanGetter<List<WebAppContextRegistration>> webAppContextRegistration;

    @Override
    public void afterInject() throws Exception {
        WebAppContext webAppServlet = new WebAppContext(
                Modules.clientDir().toPath().resolve(".").toString(),"/blog");


        webAppContextRegistration.get().stream()
                .sorted(Comparator.comparingDouble(WebAppContextRegistration::priority))
                .forEachOrdered(r -> r.registerTo(webAppServlet));
        server.setHandler(webAppServlet);
    }

}
>>>>>>> origin/master
