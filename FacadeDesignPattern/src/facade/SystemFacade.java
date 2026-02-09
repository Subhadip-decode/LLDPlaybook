package facade;

import subsystem.*;

public class SystemFacade {
    private CPU cpu;
    private GPU gpu;
    private FanGroup fanGroup;
    private OS os;
    private RAM ram;

    public void execute(){
        cpu.execute();
        gpu.execute();
        fanGroup.execute();
        os.execute();
        ram.execute();
    }
}
