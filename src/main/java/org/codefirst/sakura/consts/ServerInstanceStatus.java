package org.codefirst.sakura.consts;

/**
 * EServerInstanceStatus (サーバインスタンス状態).
 */
public class ServerInstanceStatus {
    /**
     * コンストラクタは不可視.
     */
    private ServerInstanceStatus() {
    }

    /* 起動中. */
    public static final String UP = "up ";
    /* migrating. */
    public static final String MIGRATING = "migrating ";
    /* 停止中. */
    public static final String DOWN = "down ";
}
