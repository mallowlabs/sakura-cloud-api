package org.codefirst.sakura.consts;

/**
 * EDiskConnection (ディスク接続形式).
 */
public class DiskConnection {
    /**
     * コンストラクタは不可視.
     */
    private DiskConnection() {
    }

    /* Virtio. */
    public static final String VIRTIO = "virtio ";
    /* IDE/SATA. */
    public static final String IDE = "ide ";
}
