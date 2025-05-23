package level1.application;

import level1.entities.InPersonWorker;
import level1.entities.OnlineWorker;
import level1.entities.Worker;

public class ApplicationLauncher {

    @SuppressWarnings("deprecation")
    public static void run() {

        Worker justWorker = new Worker("Salvador", "Deallí", 20);
        InPersonWorker onSiteWorker = new InPersonWorker("Donpi", "Topocho", 20);
        OnlineWorker remoteWorker = new OnlineWorker("Aitor", "Menta", 20);

        System.out.println(justWorker + ":\n\t" + justWorker.calculateSalary(160));
        System.out.println(onSiteWorker + ":\n\t" + onSiteWorker.calculateSalary(160)
                           + " " + onSiteWorker.happyWithSalary(true));
        System.out.println(remoteWorker + ":\n\t" + remoteWorker.calculateSalary(160)
                           + " " + onSiteWorker.happyWithSalary(false));

    }

}
