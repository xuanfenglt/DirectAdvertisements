/**
 * Created by mat - 2016
 */

package it.unitn.android.directadvertisements.log;

import android.content.Context;

import it.unitn.android.directadvertisements.app.ServiceConnector;
import it.unitn.android.directadvertisements.log.local.LocalLogService;

public class LogServiceFactory {

//    private static LogService _logger;
//
//
//    public static synchronized LogService getLogger(Context context) {
//        if (_logger == null) {
//            _logger = new LocalLogService(context);
//        }
//        return _logger;
//    }
//
//    public static synchronized LogService getLogger() {
//        return _logger;
//    }

    public static LogService getLogger(Context context) {
        return new LocalLogService(context, new ServiceConnector(context));
    }

    /*
    * Methods
     */

}
