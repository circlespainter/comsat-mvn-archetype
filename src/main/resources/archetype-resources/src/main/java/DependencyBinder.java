package ${groupId};

import org.glassfish.hk2.utilities.binding.AbstractBinder;

/**
 * Jersey's DI injection configuration (AKA "module")
 *
 * @author circlespainter
 */
public class DependencyBinder extends AbstractBinder {
    @Override
    protected void configure() {
        // Replace with your favourite persistence engine impl
        bind(FiberJDBCPersistenceServiceImpl.class).to(PersistenceService.class);
    }
}
