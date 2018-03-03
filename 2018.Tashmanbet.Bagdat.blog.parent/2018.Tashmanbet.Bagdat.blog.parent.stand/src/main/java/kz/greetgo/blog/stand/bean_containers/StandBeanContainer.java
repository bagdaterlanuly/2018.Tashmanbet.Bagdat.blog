package kz.greetgo.blog.stand.bean_containers;

import kz.greetgo.depinject.core.BeanConfig;
import kz.greetgo.depinject.core.BeanContainer;
import kz.greetgo.depinject.core.Include;
import kz.greetgo.blog.stand.beans.StandServer;

@Include(ConfigForStandContainer.class)
public interface StandBeanContainer extends BeanContainer {
    StandServer standServer();

}
