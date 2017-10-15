package com.csed2020.z_thesmartcar.models.bluetooth;

import com.csed2020.z_thesmartcar.models.TransmissionData;

/**
 * Created by Mario on 10/15/2017.
 */

public interface Observer {
    void recieveData(TransmissionData data);
}
