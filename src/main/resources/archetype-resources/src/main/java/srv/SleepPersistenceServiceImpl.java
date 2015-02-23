package ${groupId}.srv;

import java.io.IOException;

/**
 * Thread-blocking sleep + NOP implementation of the {@link PersistenceService}
 *
 * @author circlespainter
 */
public class SleepPersistenceServiceImpl implements PersistenceService {

    @Override
    public void store(Data pb) throws IOException, InterruptedException {
        Thread.sleep(1000);
    }

    @Override
    public boolean checkRO() throws IOException, InterruptedException {
        Thread.sleep(100);
        return false;
    }
}