sakura-cloud-api
========================

A Java binding for Sakura Cloud API 1.1.

Example
------------------------

```java
private static void createServer() throws InterruptedException {
    SakuraCloud service = new SakuraCloud(ACESS_TOKEN, ACCESS_TOKEN_SECRET);
    Disk disk = new Disk();
    disk.name = "test from API";
    disk.plan = new Plan(4);
    disk.sourceArchive = new Archive(ARCHIVE_ID);
    disk.sizeMB = 20480;
    disk.connection = "virtio";
    Disk newDisk = service.disk().post(disk).disk;

    String newDiskId = newDisk.id;

    while (newDisk.sizeMB > newDisk.migratedMB) {
        newDisk = service.disk().get(newDiskId).disk;
        System.out.println(newDisk.migratedMB + " / " + newDisk.sizeMB);
        Thread.sleep(3000);
    }

    Server server = new Server();
    server.name = "test from API";
    server.serverPlan = new ServerPlan(1001);
    server.connectedSwitches = Arrays.asList(new ConnectedSwitch[] { new ConnectedSwitch() });
    server = service.server().post(server).server;
    String newServerId = server.id;

    service.disk().putToServer(newDiskId, newServerId);

    service.disk().putConfig(newDiskId);

    service.server().putPower(newServerId);
}
```
