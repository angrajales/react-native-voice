package com.wenkesj.voice;

public interface PermissionAwareActivity {
    int checkPermission(String permission, int pid, int uid);
    int checkSelfPermission(String permission);
    boolean shouldShowRequestPermissionRationale(String permission);
    void requestPermissions(String[] permission, int requestCode, PermissionListener listener);
}
