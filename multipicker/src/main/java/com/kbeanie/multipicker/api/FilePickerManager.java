package com.kbeanie.multipicker.api;

import android.app.Activity;
import android.support.v4.app.Fragment;

/**
 * Created by kbibek on 2/18/16.
 */
public class FilePickerManager extends PickerManager {
    public FilePickerManager(Activity activity, int pickerType) {
        super(activity, pickerType);
    }

    public FilePickerManager(Fragment fragment, int pickerType) {
        super(fragment, pickerType);
    }

    public FilePickerManager(android.app.Fragment appFragment, int pickerType) {
        super(appFragment, pickerType);
    }

    @Override
    public String pick() {
        return null;
    }
}
