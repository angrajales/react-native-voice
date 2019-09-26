package com.wenkesj.voice;

import android.app.Activity;

public interface PermissionListener {
    boolean onRequestPermissionsResult(int rq, String[] ps, int[] gr);
}
