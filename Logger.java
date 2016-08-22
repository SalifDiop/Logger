package Constants;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by salif on 22/08/2016.
 */
public class Logger {

    public static final int VERBOSE = 0;
    public static final int MESSAGE = 1;
    public static final int INFO    = 2;
    public static final int WARNING = 3;
    public static final int ERROR   = 5;


    public static final String TAG  = "Logger";


    /**
     * Allow to display log on terminal
     * @param title of your log. It might be the class name where your use this routine
     * @param message to expalin a bit your think
     * @param tr maybe be an exception rised in try-catch for example
     * @param type of logger (VERBOSE, MESSAGE, INFO, WARNING or ERROR)
     */
    public static void show(@NonNull String title, @NonNull String message , @Nullable Throwable tr, int type) {

        switch (type)  {
            case VERBOSE :
                if (tr != null) Log.v(title, message, tr);
                else Log.v(title, message);
                break;
            case MESSAGE :
                if (tr != null) Log.d(title, message, tr);
                else Log.d(title, message);
                break;
            case INFO :
                if (tr != null) Log.i(title, message, tr);
                else Log.i(title, message);
                break;
            case WARNING :
                if (tr != null) Log.w(title, message, tr);
                else Log.w(title, message);
                break;
            case ERROR :
                if (tr != null) Log.e(title, message, tr);
                else Log.e(title, message);
                break;
            default :
                if (tr != null) Log.d(title, message, tr);
                else Log.d(title, message);
                break;
        }
    }
}
