package facade;


/**
 * Date: 2019/3/4
 * Created by LiuJian
 *
 * @author LiuJian
 */

class Computer {
    Cpu cpu;
    Memory memory;
    Disk disk;
    Monitor monitor;

    Computer(Cpu cpu, Memory memory, Disk disk, Monitor monitor) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
        this.monitor = monitor;
    }

    void computeData() {
        memory.loadData();
        cpu.compute();
        disk.dumpData();
        monitor.display();
    }
}
