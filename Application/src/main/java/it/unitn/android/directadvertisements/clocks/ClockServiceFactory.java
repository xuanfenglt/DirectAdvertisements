/**
 * Created by mat - 2016
 */

package it.unitn.android.directadvertisements.clocks;

import android.content.Context;
import android.os.IBinder;

import it.unitn.android.directadvertisements.app.ServiceConnector;
import it.unitn.android.directadvertisements.clocks.local.LocalClockService;

public class ClockServiceFactory {

    //    private static ClockService _service;
//
//
    public static ClockService getService(Context context) {
        return new LocalClockService(context, new ServiceConnector(context));
    }
//
//    public static ClockService getService() {
//
//        return _service;
//    }
    /*
    * Clock
     */


//    public static int getLocalClock() {
//        return _getService().getLocalClock();
//    }
//
//    public static void setLocalClock(int c) {
//        _getService().setLocalClock(c);
//    }
//    public static int incrementLocalClock() {
//        return _getService().incrementLocalClock();
//    }


//    public static int getNodeClock(int id) {
//        return _getService().getNodeClock(id);
//    }
//
//    public static void setNodeClock(int id, int c) {
//        _getService().setNodeClock(id, c);
//    }


}
