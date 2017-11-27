package com.wgl.b;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {

    private IMyAidlInterface.Stub iMyAidlInterface = new IMyAidlInterface.Stub() {
        @Override
        public MyData getData() throws RemoteException {
            return new MyData("这是B程序给的数据");
        }
    };

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return iMyAidlInterface;
    }
}
