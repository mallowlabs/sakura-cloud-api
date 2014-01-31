package org.codefirst.sakura.consts;

/**
 * EAvailability (有効状態).
 */
public class Availability {
    /**
     * コンストラクタは不可視.
     */
    private Availability() {
    }

    /* 有効. */
    public static final String AVAILABLE = "available ";
    /* アップロード中. */
    public static final String UPLOADING = "uploading ";
    /* 失敗. */
    public static final String FAILED = "failed ";
    /* レプリケーション中. */
    public static final String REPLICATING = "replicating ";
}
